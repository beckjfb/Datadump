package helper;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class DBHelper {

	final String driver = "com.mysql.jdbc.Driver";
	final String path = "jdbc:mysql://128.192.130.24/Stackoverflow";
	Connection conn = null;
	
	

	public DBHelper(){}
	
	public void open(){
		try{
			Class.forName(driver);
			conn = DriverManager.getConnection(path, "root", "password123");
		} catch(Exception e){
			e.printStackTrace();
		}
	}
	
	public void close(){
		try{
			conn.close();
		} catch(Exception e){
			e.printStackTrace();
		}
	}
	
	public ArrayList<Listing> getAnswers(int parentId){
		ArrayList<Listing> list = new ArrayList<Listing>();
		try{
			open();
			String preparedQuery = "SELECT Body,Score,LastEditDate FROM Stackoverflow.Answers WHERE Answers.ParentId =  (SELECT Id "+
			"FROM Stackoverflow.Questions WHERE Id=" + parentId + ")";
			PreparedStatement query = conn.prepareStatement(preparedQuery);
			ResultSet rs = query.executeQuery();
			while(rs.next()){
				String body = rs.getString("Body");
				int score = rs.getInt("Score");
				String date = rs.getString("LastEditDate");
				list.add(new Listing(body,score,date));
			}
			close();
		} catch(Exception e){
			e.printStackTrace();
		}
		return list;
	}
	
	
	public ArrayList<Listing> search(String input){
		ArrayList<Listing> list = new ArrayList<Listing>();
		try{
			open();
			String[] query = input.split(" ");
			String preparedQuery = "SELECT Id,Title,Body,Tags,LastEditDate,Score FROM Stackoverflow.Questions WHERE Questions.Title REGEXP '(";
			for(String temp: query){
				preparedQuery += temp + ")|(";
			}
			preparedQuery = preparedQuery.substring(0,preparedQuery.length()-2);
			preparedQuery += "' ORDER BY Score desc LIMIT 0,20";
			PreparedStatement pointQuery = conn.prepareStatement(preparedQuery);
			ResultSet rs = pointQuery.executeQuery();
			while(rs.next()){
				String title = rs.getString("Title");
				String body = rs.getString("Body");
				int id = rs.getInt("Id");
				String date = rs.getString("LastEditDate");
				String allTags = rs.getString("Tags");
				int score = rs.getInt("Score");
				list.add(new Listing(title,body,id,allTags,date,score));
			}
			close();
		}
		catch(Exception e){
			e.printStackTrace();
		}
		return list;
		
	}

}
