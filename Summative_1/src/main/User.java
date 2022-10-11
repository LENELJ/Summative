package main;


// By Clever Monteros: User class to save user data.


public class User {
	
	private int userID;
	private String fname;
	private String lname;
	private String username;
	private String userpass;

	
	
	public int getuserID(){
		return userID;
	}
	
	public String getFname() {
		return fname;
	}
	
	public String getLname() {
		return lname;
	}
	
	public String getUserName() {
		return username;
	}
	
	public String getUserPass() {
		return userpass;
	}
	
	public void setFname(String fname) {
		this.fname = fname;
	}
	
	public void setLname(String lname) {
		this.lname = lname;
	}
	
	public void setUserName(String username) {
		this.username = username;
	}
	
	public void setUserPass(String userpass) {
		this.userpass = userpass;
	}
	
	public void setUserID(int userID){
		this.userID = userID;
	}
	
	@Override
    public String toString() {
        return "User{" +
                "userID='" + userID + '\'' +
                "fname='" + fname + '\'' +
                ", lname=" + lname +
                ", username=" + username +
                ", userpass=" + userpass +
                '}';
    }


	
	















}