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
	
	

	public DBHelper(){
		try{
//			Class.forName("com.mysql.jdbc.Driver");
//			System.out.println("Instantiated MySQL driver");
//			Connection conn = DriverManager.getConnection("jdbc:mysql://128.192.130.24/Stackoverflow", 
//					"root", "password123");
//			System.out.println("Connected to MySql");
			//		meetingsForCourse = conn.prepareStatement("select * from classScheduler.course course, classScheduler.courseRequirement creq, " +
	//				"(Select req.reqId from classScheduler.requirement req where req.reqCourseNumber = ? AND req.reqCoursePrefix = ?) AS reqOut " +

	
			
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}
	
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
			String preparedQuery = "SELECT Body,ParentId FROM Stackoverflow.Answers WHERE Answers.ParentId =  (SELECT Id "+
			"FROM Stackoverflow.Questions WHERE Id=" + parentId + ")";
			PreparedStatement query = conn.prepareStatement(preparedQuery);
			ResultSet rs = query.executeQuery();
			while(rs.next()){
				String body = rs.getString("Body");
				list.add(new Listing(body));
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
			String preparedQuery = "SELECT Id,Title,Body FROM Stackoverflow.Questions WHERE Questions.Title REGEXP '(";
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
				list.add(new Listing(title,body,id));
			}
			close();
		}
		catch(Exception e){
			e.printStackTrace();
		}
		return list;
		
	}

}
