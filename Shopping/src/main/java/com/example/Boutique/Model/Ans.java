package com.example.Boutique.Model;

import jakarta.persistence.Id;

public class Ans {
	
	
	@Id
	private int qid;
	private String pro1;
	private String pro2;
	private String pro3;
	private String pro4;
	private String pro5;
	public int getQid() {
		return qid;
	}
	public void setQid(int qid) {
		this.qid = qid;
	}
	public String getPro1() {
		return pro1;
	}
	public void setPro1(String pro1) {
		this.pro1 = pro1;
	}
	public String getPro2() {
		return pro2;
	}
	public void setPro2(String pro2) {
		this.pro2 = pro2;
	}
	public String getPro3() {
		return pro3;
	}
	public void setPro3(String pro3) {
		this.pro3 = pro3;
	}
	public String getPro4() {
		return pro4;
	}
	public void setPro4(String pro4) {
		this.pro4 = pro4;
	}
	public String getPro5() {
		return pro5;
	}
	public void setPro5(String pro5) {
		this.pro5 = pro5;
	}
   
}
