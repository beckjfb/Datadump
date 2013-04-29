package helper;

public class Listing {

	public Listing(String title, String body, int Id) {
		this.Title = title;
		this.Body = body;
		this.Id = Id;
	}	
	
	public Listing(String body) {
		this.Body = body;
	}
	private String Title;
	private String Body;
	private int Id;
	
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
	
	
	
}
