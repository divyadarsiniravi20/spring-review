package com.example.Destination.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
@Entity
public class Answer {
	@Id
	private int qno;
	private String product1;
	private String product2;
	private String product3;
	private String product4;
	private String product5;
	public int getQno() {
		return qno;
	}
	public void setQno(int qno) {
		this.qno = qno;
	}
	public String getProduct1() {
		return product1;
	}
	public void setProduct1(String product1) {
		this.product1 = product1;
	}
	public String getProduct2() {
		return product2;
	}
	public void setProduct2(String product2) {
		this.product2 = product2;
	}
	public String getProduct3() {
		return product3;
	}
	public void setProduct3(String product3) {
		this.product3 = product3;
	}
	public String getProduct4() {
		return product4;
	}
	public void setProduct4(String product4) {
		this.product4 = product4;
	}
	public String getProduct5() {
		return product5;
	}
	public void setProduct5(String product5) {
		this.product5 = product5;
	}
	
	

}
