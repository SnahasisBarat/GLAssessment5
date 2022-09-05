package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class customer {
	
	@Id
	int customerid;
	String customername;
	long customerphone;
	String customeraddress;
	int customerloginid;
	String customerpassword;
	
	
	public customer() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public customer(int customerid, String customername, long customerphone, String customeraddress,
			int customerloginid, String customerpassword) {
		
		this.customerid = customerid;
		this.customername = customername;
		this.customerphone = customerphone;
		this.customeraddress = customeraddress;
		this.customerloginid = customerloginid;
		this.customerpassword = customerpassword;
	}


	


	public int getCustomerid() {
		return customerid;
	}
	public void setCustomerid(int customerid) {
		this.customerid = customerid;
	}
	public String getCustomername() {
		return customername;
	}
	public void setCustomername(String customername) {
		this.customername = customername;
	}
	public long getCustomerphone() {
		return customerphone;
	}
	public void setCustomerphone(long customerphone) {
		this.customerphone = customerphone;
	}
	public String getCustomeraddress() {
		return customeraddress;
	}
	public void setCustomeraddress(String customeraddress) {
		this.customeraddress = customeraddress;
	}
	public int getCustomerloginid() {
		return customerloginid;
	}
	public void setCustomerloginid(int customerloginid) {
		this.customerloginid = customerloginid;
	}
	public String getCustomerpassword() {
		return customerpassword;
	}
	public void setCustomerpassword(String customerpassword) {
		this.customerpassword = customerpassword;
	}
	
	@Override
	public String toString() {
		return "customer [customerid=" + customerid + ", customername=" + customername + ", customerphone="
				+ customerphone + ", customeraddress=" + customeraddress + ", customerloginid=" + customerloginid
				+ ", customerpassword=" + customerpassword + "]";
	}

}
