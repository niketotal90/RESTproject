package prg.nikhil.javabrains.messenger.model;

import java.util.Date;

public class Profile {
	
	private long id;
	private String message;	//all message contents
	private Date created;
	private String author;
	
	public Profile(){	//Empty Constructor
		
	}
	public Profile(long id,String message,String author){	
		this.id=id;
		this.message=message;
		this.author=author;
		this.created=new Date();
	}
	public long getId() {		//getters and setters
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public Date getCreated() {
		return created;
	}
	public void setCreated(Date created) {
		this.created = created;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	


}
