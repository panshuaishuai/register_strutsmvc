package com.qingshixun.register.model;

public class User {

	private String username;
	private String password;
	private String affirmPassword;
	private String email;
	private String sex;
	private String profession;
	private String hobby;

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getAffirmPassword() {
		return affirmPassword;
	}

	public void setAffirmPassword(String affirmPassword) {
		this.affirmPassword = affirmPassword;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getProfession() {
		return profession;
	}

	public void setProfession(String profession) {
		this.profession = profession;
	}

	public String getHobby() {
		return hobby;
	}

	public void setHobby(String hobby) {
		this.hobby = hobby;
	}

	public boolean contrastPassword() {

		// 两次密码相同
		if (this.password.equals(this.affirmPassword)) {
			// 返回true
			return true;
		} else {
			// 密码不同，则返回false
			return false;
		}
	}
}
