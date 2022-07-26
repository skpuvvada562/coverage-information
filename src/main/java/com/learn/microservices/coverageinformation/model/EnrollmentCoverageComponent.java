package com.learn.microservices.coverageinformation.model;

import java.util.List;

public class EnrollmentCoverageComponent {

	private int eccId;
	private String code;
	private List<EnrollmentCoveredPerson> ecpList;
	public EnrollmentCoverageComponent() {
		super();
		// TODO Auto-generated constructor stub
	}
	public EnrollmentCoverageComponent(int eccId, String code, List<EnrollmentCoveredPerson> ecpList) {
		super();
		this.eccId = eccId;
		this.code = code;
		this.ecpList = ecpList;
	}
	public int getEccId() {
		return eccId;
	}
	public void setEccId(int eccId) {
		this.eccId = eccId;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public List<EnrollmentCoveredPerson> getEcpList() {
		return ecpList;
	}
	public void setEcpList(List<EnrollmentCoveredPerson> ecpList) {
		this.ecpList = ecpList;
	}
	@Override
	public String toString() {
		return "EnrollmentCoverageComponent [eccId=" + eccId + ", code=" + code + ", ecpList=" + ecpList + "]";
	}
	
}
