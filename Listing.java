package helper;

import java.util.ArrayList;

public class Listing {

	public Listing(String title, String body, int id) {
		this.Title = title;
		this.Body = body;
		this.Id = id;
	}	
	
	public Listing(String title, String body, int id, String alltags, String date, int score){
		this.Title = title;
		this.Body = body;
		this.Id = id;
		this.allTags = alltags;
		this.Date = date;
		this.Score = score;
		Tags = new ArrayList<String>();
		
		String[] splits = alltags.split(">");		
		for(String temp:splits)
			Tags.add(temp.substring(1));
	}
	
	public Listing(String body, int score, String date) {
		this.Body = body;
		this.Score = score;
		this.Date = date;
	}
	
	private String Title;
	private String Body;
	private int Id;
	private String Date;
	private String allTags;
	private ArrayList<String> Tags;
	private int Score;

	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getTitle() {
		return Title;
	}
	public void setTitle(String title) {
		Title = title;
	}
	public String getBody() {
		return Body;
	}
	public void setBody(String body) {
		Body = body;
	}

	public String getDate() {
		if(Date != null)
			return Date.substring(0,Date.indexOf('T')) + " " + Date.substring(11,Date.lastIndexOf('.'));
		else
			return null;
	}

	public void setDate(String date) {
		Date = date;
	}

	public String getAllTags() {
		return allTags;
	}

	public void setAllTags(String allTags) {
		this.allTags = allTags;
	}

	public ArrayList<String> getTags() {
		return Tags;
	}

	public void setTags(ArrayList<String> tags) {
		Tags = tags;
	}

	public int getScore() {
		return Score;
	}

	public void setScore(int score) {
		Score = score;
	}
	
	
}
