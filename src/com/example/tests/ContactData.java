package com.example.tests;

public class ContactData {
	
	public String firstname;
	public String lastname;
	public String address;
	public String homephone;
	public String mobilephone;
	public String workphone;
	public String email1;
	public String email2;
	public String bday;
	public String bmonth;
	public String byear;
	public String group;
	public String address2;
	public String homephone2;

	public ContactData() {
	}
	
	public ContactData(String firstname, String lastname, String address,
			String homephone, String mobilephone, String workphone,
			String email1, String email2, String bday, String bmonth,
			String byear, String group, String address2, String homephone2) {
		this.firstname = firstname;
		this.lastname = lastname;
		this.address = address;
		this.homephone = homephone;
		this.mobilephone = mobilephone;
		this.workphone = workphone;
		this.email1 = email1;
		this.email2 = email2;
		this.bday = bday;
		this.bmonth = bmonth;
		this.byear = byear;
		this.group = group;
		this.address2 = address2;
		this.homephone2 = homephone2;
	}
}