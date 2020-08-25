package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="books1")

public class Order {
	
	
	
	@Id
	private int aid;
	private String  aname;
	
	public Order(int aid, String aname) {
		
		this.aid = aid;
		this.aname = aname;
	}
	public int getAid() {
		return aid;
	}
	public void setAid(int aid) {
		this.aid = aid;
	}
	public String getAname() {
		return aname;
	}
	public void setAname(String aname) {
		this.aname = aname;
	}
	


}
