package com.migi.model;

public class UserDTO {
	private int userID;
	private String userName;
	private String passWord;
	private String fullName;
	private int Status;
	private int roleID;

	public UserDTO() {
		super();
	}

	public UserDTO(int userID, String userName, String passWord, String fullName, int status, int roleID) {
		super();
		this.userID = userID;
		this.userName = userName;
		this.passWord = passWord;
		this.fullName = fullName;
		Status = status;
		this.roleID = roleID;
	}

	public int getUserID() {
		return userID;
	}

	public void setUserID(int userID) {
		this.userID = userID;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassWord() {
		return passWord;
	}

	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public int getStatus() {
		return Status;
	}

	public void setStatus(int status) {
		Status = status;
	}

	public int getRoleID() {
		return roleID;
	}

	public void setRoleID(int roleID) {
		this.roleID = roleID;
	}

}
