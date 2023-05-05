package com.example.Destination.Model;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
@Entity
public class Question {
	@Id
	private int qno;
	private String qname;
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn
	
	private List<Question> ans;
	public int getQno() {
		return qno;
	}
	public void setQno(int qno) {
		this.qno = qno;
	}
	public String getQname() {
		return qname;
	}
	public void setQname(String qname) {
		this.qname = qname;
	}
	public List<Question> getAns() {
		return ans;
	}
	public void setAns(List<Question> ans) {
		this.ans = ans;
	}
	

}
