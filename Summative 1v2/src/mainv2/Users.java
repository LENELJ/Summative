package mainv2;

public class Users {
	
	private int idNum = 0;
	private String name;
	private String uName;
	private String uPass;
	private int userType = 0;
	
	public Users(String name) {
		
		this.name = name;
	
	}
	
	public int getIDNum() {
		return idNum;
	}
	
	public void setIDNum(int idNum) {
		this.idNum = idNum;
	}
	
	public String getName() {
		
		return name;
	}
	
	public String getUsername() {
		return uName;
	}
	
	public void setUsername(String uName) {
		this.uName = uName;
	}
	
	public String getUserPass() {
		return uPass;
	}
	
	public void setUserPass(String uPass) {
		this.uPass = uPass;
	}
	
	public int getUserType() {
		return userType;
	}
	
	public void setUserType(int userType) {
		this.userType = userType;
	}
	
	

}
