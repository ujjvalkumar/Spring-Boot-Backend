package com.Project.SpringAngular.DTO;

public class CustomerSaveDTO {

	private String customername;
	private String customeraddress;
	private int mobile;
	
	
	public CustomerSaveDTO( String customername, String customeraddress, int mobile) {
		super();
		
		this.customername = customername;
		this.customeraddress = customeraddress;
		this.mobile = mobile;
	}


	public CustomerSaveDTO() {
		super();
		// TODO Auto-generated constructor stub
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
		return "CustomerDTO [" + ", customername=" + customername + ", customeraddress="
				+ customeraddress + ", mobile=" + mobile + "]";
	}
	

}
