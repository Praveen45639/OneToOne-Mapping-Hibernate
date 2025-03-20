package com.demo.hiber.controller;

import com.demo.hiber.dao.ChildDao;
import com.demo.hiber.dto.Aadhar;
import com.demo.hiber.dto.Child;

public class ChildController {
	
	public static void main(String[] args) {
		Child child = new Child();
		child.setName("raji");
		
		Aadhar aadhar = new Aadhar();
		aadhar.setAid(1003);
		aadhar.setAadhar_num(100230034003l);
		
		
		child.setAadhar(aadhar);
		
		ChildDao dao = new ChildDao();
		dao.saveChild(child);
	}

}
