package com.Project.SpringAngular.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Customer")
public class Customer {
	@Id
	@Column(name="customer_id",length=50)
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int customerid;
	
	@Column(name="customer_name",length=50)
	private String customername;
	
	@Column(name="customer_address",length=50)
	private String customeraddress;
	
	@Column(name="customer_mobile",length=12)
	private int mobile;
	
	
	public Customer(int customerid, String customername, String customeraddress, int mobile) {
		super();
		this.customerid = customerid;
		this.customername = customername;
		this.customeraddress = customeraddress;
		this.mobile = mobile;
	}


	/*
	 * public Customer(String string, String string2, int i) { super(); // TODO
	 * Auto-generated constructor stub }
	 */
	
	
	public Customer(String customername, String customeraddress, int mobile) {
		super();
		this.customername = customername;
		this.customeraddress = customeraddress;
		this.mobile = mobile;
	}
	

	public Customer() {
		super();
		// TODO Auto-generated constructor stub
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


	public String getCustomeraddress() {
		return customeraddress;
	}


	public void setCustomeraddress(String customeraddress) {
		this.customeraddress = customeraddress;
	}


	public int getMobile() {
		return mobile;
	}


	public void setMobile(int mobile) {
		this.mobile = mobile;
	}


	@Override
	public String toString() {
		return "Customer [customerid=" + customerid + ", customername=" + customername + ", customeraddress="
				+ customeraddress + ", mobile=" + mobile + "]";
	}
	
	
	
	
	
	
	
	
	
	

}
