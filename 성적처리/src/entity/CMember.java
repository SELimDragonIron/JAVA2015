package entity;

import java.io.Serializable;

//Entity class or Value Class 
public class CMember implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	//attribute 
	private String userID;
	private String password;

	public CMember(String ID, String password) {
		this.userID = ID ;
		this.password = password;
	}
	public CMember() {
		
	}
	public String getUserID() {return userID;}
	public void setUserID(String userID) {this.userID = userID;}
	public String getPassword() {return password;}
	public void setPassword(String password) {this.password = password;}
	
	
	
}
