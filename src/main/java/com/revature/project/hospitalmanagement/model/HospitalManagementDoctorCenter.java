package com.revature.project.hospitalmanagement.model;

public class HospitalManagementDoctorCenter {
	private Integer doctorId;
	private String doctorName;
	private Integer doctorAge;
	private String doctorQualification;
	private String doctorSpecialization;
	private Integer fromTiming;
	private Integer toTiming;

	public HospitalManagementDoctorCenter() {
		super();
	}

	public HospitalManagementDoctorCenter(Integer doctorId, String doctorName, Integer doctorAge,
			String doctorQualification, String doctorSpecialization, Integer fromTiming, Integer toTiming,
			Double doctorSalary) {
		super();
		this.doctorId = doctorId;
		this.doctorName = doctorName;
		this.doctorAge = doctorAge;
		this.doctorQualification = doctorQualification;
		this.doctorSpecialization = doctorSpecialization;
		this.fromTiming = fromTiming;
		this.toTiming = toTiming;
		this.doctorSalary = doctorSalary;
	}

	public Double getDoctorSalary() {
		return doctorSalary;
	}

	public void setDoctorSalary(Double doctorSalary) {
		this.doctorSalary = doctorSalary;
	}

	private Double doctorSalary;

	public Integer getDoctorId() {
		return doctorId;
	}

	public void setDoctorId(Integer doctorId) {
		this.doctorId = doctorId;
	}

	public String getDoctorName() {
		return doctorName;
	}

	public void setDoctorName(String doctorName) {
		this.doctorName = doctorName;
	}

	public Integer getDoctorAge() {
		return doctorAge;
	}

	public void setDoctorAge(Integer doctorAge) {
		this.doctorAge = doctorAge;
	}

	public String getDoctorQualification() {
		return doctorQualification;
	}

	public void setDoctorQualification(String doctorQualification) {
		this.doctorQualification = doctorQualification;
	}

	public String getDoctorSpecialization() {
		return doctorSpecialization;
	}

	public void setDoctorSpecialization(String doctorSpecialization) {
		this.doctorSpecialization = doctorSpecialization;
	}

	public Integer getFromTiming() {
		return fromTiming;
	}

	public void setFromTiming(Integer fromTiming) {
		this.fromTiming = fromTiming;
	}

	public Integer getToTiming() {
		return toTiming;
	}

	public void setToTiming(Integer toTiming) {
		this.toTiming = toTiming;
	}

	@Override
	public String toString() {
		return "HospitalManagementDoctorCenter [doctorId=" + doctorId + ", doctorName=" + doctorName + ", doctorAge="
				+ doctorAge + ", doctorQualification=" + doctorQualification + ", doctorSpecialization="
				+ doctorSpecialization + ", fromTiming=" + fromTiming + ", toTiming=" + toTiming + ", doctorSalary="
				+ doctorSalary + "]";
	}

}
