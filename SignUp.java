package com.java.signup;

public class SignUp {
private String fname;
private String lname;
private String email;
private String password;
private String date;
private String gender;
public String getFname() {
	return fname;
}
public void setFname(String fname) {
	this.fname = fname;
}
public String getLname() {
	return lname;
}
public void setLname(String lname) {
	this.lname = lname;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
public String getDate() {
	return date;
}
public void setDate(String date) {
	this.date = date;
}
public String getGender() {
	return gender;
}
public void setGender(String gender) {
	this.gender = gender;
}
public SignUp(String fname, String lname, String email, String password, String date, String gender) {
	super();
	this.fname = fname;
	this.lname = lname;
	this.email = email;
	this.password = password;
	this.date = date;
	this.gender = gender;
}
@Override
public String toString() {
	return "SignUp [fname=" + fname + ", lname=" + lname + ", email=" + email + ", password=" + password + ", date="
			+ date + ", gender=" + gender + "]";
}

}
