package com.pet;

public class Pet {
	private String no;
	private String name;
	private String division;//종류
	private String kind;//품종
	private String desc;
	
	public Pet(String no, String name, String division, String kind, String desc) {
		this.no = no;
		this.name = name;
		this.division = division;
		this.kind = kind; 
		this.desc = desc;
	}
	
	public Pet() {
		
	}
	
	public String getNo() {
		return no;
	}
	
	public void setNo(String no) {
		this.no = no;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDivision() {
		return division;
	}

	public void setDivision(String division) {
		this.division = division;
	}

	public String getKind() {
		return kind;
	}

	public void setKind(String kind) {
		this.kind = kind;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}
}
