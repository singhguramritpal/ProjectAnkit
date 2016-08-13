package com.uber.members;

public class Admin extends Member {
	
	Admin instanceOfAdmin = new Admin();
	
	private Admin(){}
	
	public Admin getInstance(){
		return instanceOfAdmin;
	}

}
