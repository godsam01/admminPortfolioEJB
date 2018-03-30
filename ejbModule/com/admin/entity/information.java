package com.admin.entity;
import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class information implements Serializable{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long informationID;
	private String  text;
	private String  text2;
	private String  text3;
	private String  text4;
	private String  text5;
	private String  text6;
	
	public long getInformationID() {
		return informationID;
	}
	public void setInformationID(long informationID) {
		this.informationID = informationID;
	}
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	public String getText2() {
		return text2;
	}
	public void setText2(String text2) {
		this.text2 = text2;
	}
	public String getText3() {
		return text3;
	}
	public void setText3(String text3) {
		this.text3 = text3;
	}
	public String getText4() {
		return text4;
	}
	public void setText4(String text4) {
		this.text4 = text4;
	}
	public String getText5() {
		return text5;
	}
	public void setText5(String text5) {
		this.text5 = text5;
	}
	public String getText6() {
		return text6;
	}
	public void setText6(String text6) {
		this.text6 = text6;
	}

}
