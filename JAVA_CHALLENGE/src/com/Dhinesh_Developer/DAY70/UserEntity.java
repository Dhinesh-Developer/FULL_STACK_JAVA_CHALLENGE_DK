package com.DhineshDeveloper.DAY70;

public class UserEntity {
	private int id;
	private String name;
	private String email;
	private String passwd;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPasswd() {
		return passwd;
	}
	public void setPasswd(String passwd) {
		this.passwd = passwd;
	}
	public UserEntity(int id, String name, String email, String passwd) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.passwd = passwd;
	}
	public UserEntity(String name, String email, String passwd) {
		super();
		this.name = name;
		this.email = email;
		this.passwd = passwd;
	}
	@Override
	public String toString() {
		return "UserEntity [id=" + id + ", name=" + name + ", email=" + email + ", passwd=" + passwd + "]";
	}
	public UserEntity() {
		super();
	}
	
}
