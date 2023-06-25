package com.learn.microservices.coverageinformation.model;


public class EnrollmentCoverage {

	private int id;
	private String name;
	private CoverageComponent coverageComponent;
	private String status;
	
	public EnrollmentCoverage() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public EnrollmentCoverage(int id, String name, CoverageComponent coverageComponent) {
		super();
		this.id = id;
		this.name = name;
		this.coverageComponent = coverageComponent;
	}


	public CoverageComponent getCoverageComponent() {
		return coverageComponent;
	}




	public void setCoverageComponent(CoverageComponent coverageComponent) {
		this.coverageComponent = coverageComponent;
	}




	


	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}


	@Override
	public String toString() {
		return "EnrollmentCoverage [id=" + id + ", name=" + name + ", coverageComponent=" + coverageComponent  + "]";
	}
	
	
	
}
