package com.revature.project.HospitalManagementApp.model;

public class HospitalManagementPatientCenter {
	private Integer patientId;
	private String patientName;
	private String patientGender;
	private Integer patientAge;
	private String disease;
	private String admitStatus;
	private long patientPhoneNo;
	private int consultantId;
	public Integer getPatientId() {
		return patientId;
	}
	public void setPatientId(Integer patientId) {
		this.patientId = patientId;
	}
	public String getPatientName() {
		return patientName;
	}
	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}
	public String getPatientGender() {
		return patientGender;
	}
	public void setPatientGender(String patientGender) {
		this.patientGender = patientGender;
	}
	public Integer getPatientAge() {
		return patientAge;
	}
	public void setPatientAge(Integer patientAge) {
		this.patientAge = patientAge;
	}
	public String getDisease() {
		return disease;
	}
	public void setDisease(String disease) {
		this.disease = disease;
	}
	public String getAdmitStatus() {
		return admitStatus;
	}
	public void setAdmitStatus(String admitStatus) {
		this.admitStatus = admitStatus;
	}
	public long getPatientPhoneNo() {
		return patientPhoneNo;
	}
	public void setPatientPhoneNo(long patientPhoneNo) {
		this.patientPhoneNo = patientPhoneNo;
	}
	public int getConsultantId() {
		return consultantId;
	}
	public void setConsultantId(int consultantId) {
		this.consultantId = consultantId;
	}

	
}
