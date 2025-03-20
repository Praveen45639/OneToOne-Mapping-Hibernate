package com.demo.hiber.dto;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class Aadhar {
	@Id
	private int aid;
	private long aadhar_num;
	@OneToOne(mappedBy="aadhar",cascade=CascadeType.ALL)
	private Child child;
	public int getAid() {
		return aid;
	}
	public void setAid(int aid) {
		this.aid = aid;
	}
	public long getAadhar_num() {
		return aadhar_num;
	}
	public void setAadhar_num(long aadhar_num) {
		this.aadhar_num = aadhar_num;
	}
	public Child getChild() {
		return child;
	}
	public void setChild(Child child) {
		this.child = child;
	}
	

}
