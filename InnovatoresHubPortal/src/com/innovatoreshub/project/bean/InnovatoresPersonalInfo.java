package com.innovatoreshub.project.bean;

import java.util.ArrayList;

import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.stereotype.Component;

@Component
@Document(collection="innovatores_information")
public class InnovatoresPersonalInfo
{		
	String date;
	String idadhar;
	String username;
	String password;
	String gender;
	String dob;
	String department;
	String collegename;
	String city;
	String contactno;
	String email;
	String address;
	ArrayList<InnovationsRecord> innovationsinfo;
	
	public InnovatoresPersonalInfo()
	{
		super();
	}
	public InnovatoresPersonalInfo(String date,String idadhar,String username,String password,	String gender,String dob,String department,String collegename,String city,String contactno,String email,String address,ArrayList<InnovationsRecord> innovationsinfo)
	{
		super();
		this.date=date;
		this.idadhar=idadhar;
		this.username=username;
		this.password=password;
		this.gender=gender;
		this.dob=dob;
		this.department=department;
		this.collegename=collegename;
		this.city=city;
		this.contactno=contactno;
		this.email=email;
		this.address=address;
		this.innovationsinfo=innovationsinfo;
		
	}

	public String getDate() {
		return date;
	}
	public String getIdadhar() {
		return idadhar;
	}
	public String getUsername() {
		return username;
	}
	public String getPassword() {
		return password;
	}
	public String getGender() {
		return gender;
	}
	public String getDob() {
		return dob;
	}
	public String getDepartment() {
		return department;
	}
	public String getCollegename() {
		return collegename;
	}
	public String getCity() {
		return city;
	}
	public String getContactno() {
		return contactno;
	}
	public String getEmail() {
		return email;
	}
	public String getAddress() {
		return address;
	}
	public ArrayList<InnovationsRecord> getInnovationsinfo() {
		return innovationsinfo;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public void setIdadhar(String idadhar) {
		this.idadhar = idadhar;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public void setCollegename(String collegename) {
		this.collegename = collegename;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public void setContactno(String contactno) {
		this.contactno = contactno;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public void setInnovationsinfo(ArrayList<InnovationsRecord> innovationsinfo) {
		this.innovationsinfo = innovationsinfo;
	}

	
		@Override
	public String toString() {
		return "InnovatoresPersonalInfo [date=" + date + ", idadhar=" + idadhar + ", username=" + username
				+ ", password=" + password + ", gender=" + gender + ", dob=" + dob + ", department=" + department
				+ ", collegename=" + collegename + ", city=" + city + ", contactno=" + contactno + ", email=" + email
				+ ", address=" + address + ", innovationsinfo=" + innovationsinfo + "]";
	}
	
	

}
