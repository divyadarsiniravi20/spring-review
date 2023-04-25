package com.example.Boutique.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Boutique {
    @Id
	private int itemNo;
	private String name;
	private int price;
	private int dprice;
	private int sizes;
	private int sizem;
	private int sizel;
	private String colour;
	private String material;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getDprice() {
		return dprice;
	}
	public void setDprice(int dprice) {
		this.dprice = dprice;
	}
	public int getSizes() {
		return sizes;
	}
	public void setSizes(int sizes) {
		this.sizes = sizes;
	}
	public int getSizem() {
		return sizem;
	}
	public void setSizem(int sizem) {
		this.sizem = sizem;
	}
	public String getColour() {
		return colour;
	}
	public void setColour(String colour) {
		this.colour = colour;
	}
	public int getSizel() {
		return sizel;
	}
	public void setSizel(int sizel) {
		this.sizel = sizel;
	}
	public String getMaterial() {
		return material;
	}
	public void setMaterial(String material) {
		this.material = material;
	}
	public int getItemNo() {
		return itemNo;
	}
	public void setItemNo(int itemNo) {
		this.itemNo = itemNo;
	}
	
}
