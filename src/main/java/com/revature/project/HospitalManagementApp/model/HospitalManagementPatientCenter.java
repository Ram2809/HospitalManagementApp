package com.revature.project.HospitalManagementApp.model;

public class HospitalManagementPatientCenter {
	private Integer patientId;
	private String patientName;
	private String patientGender;
	private Integer patientAge;
	private String disease;
	private String admitStatus;
	private Long patientPhoneNo;
	private Integer consultantId;

	public HospitalManagementPatientCenter() {
		super();
	}

	public HospitalManagementPatientCenter(Integer patientId, String patientName, String patientGender,
			Integer patientAge, String disease, String admitStatus, Long patientPhoneNo, Integer consultantId) {
		super();
		this.patientId = patientId;
		this.patientName = patientName;
		this.patientGender = patientGender;
		this.patientAge = patientAge;
		this.disease = disease;
		this.admitStatus = admitStatus;
		this.patientPhoneNo = patientPhoneNo;
		this.consultantId = consultantId;
	}

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

	public Long getPatientPhoneNo() {
		return patientPhoneNo;
	}

	public void setPatientPhoneNo(Long patientPhoneNo) {
		this.patientPhoneNo = patientPhoneNo;
	}

	public Integer getConsultantId() {
		return consultantId;
	}

	public void setConsultantId(Integer consultantId) {
		this.consultantId = consultantId;
	}

	@Override
	public String toString() {
		return "HospitalManagementPatientCenter [patientId=" + patientId + ", patientName=" + patientName
				+ ", patientGender=" + patientGender + ", patientAge=" + patientAge + ", disease=" + disease
				+ ", admitStatus=" + admitStatus + ", patientPhoneNo=" + patientPhoneNo + ", consultantId="
				+ consultantId + "]";
	}

}
