package com.example.Boutique.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Boutique")
public class Model {
	@Id
	private int itemNo;
	private String Dressname;
	private int price;
	private int dprice;
	private int SizeS;
	private int SizeM;
	private int SizeL;
	private String colour;
	private String material;
	public int getItemNo() {
		return itemNo;
	}
	public void setItemNo(int itemNo) {
		this.itemNo = itemNo;
	}
	public String getDressname() {
		return Dressname;
	}
	public void setDressname(String dressname) {
		Dressname = dressname;
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
	public int getSizeS() {
		return SizeS;
	}
	public void setSizeS(int sizeS) {
		SizeS = sizeS;
	}
	public int getSizeM() {
		return SizeM;
	}
	public void setSizeM(int sizeM) {
		SizeM = sizeM;
	}
	public int getSizeL() {
		return SizeL;
	}
	public void setSizeL(int sizeL) {
		SizeL = sizeL;
	}
	public String getColour() {
		return colour;
	}
	public void setColour(String colour) {
		this.colour = colour;
	}
	public String getMaterial() {
		return material;
	}
	public void setMaterial(String material) {
		this.material = material;
	}
	

	@Override
	public String toString() {
		return "Model [itemNo=" + itemNo + ", Dressname=" + Dressname + ", price=" + price + ", dprice=" + dprice
				+ ", SizeS=" + SizeS + ", SizeM=" + SizeM + ", SizeL=" + SizeL + ", colour=" + colour + ", material="
				+ material + "]";
	}
}
