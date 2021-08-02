package com.revature.project.hospitalmanagement.service;

import java.util.List;

import com.revature.project.hospitalmanagement.model.HospitalManagementDoctorCenter;

public interface HospitalManagementDoctorService {
	public abstract void addDoctorDetails(HospitalManagementDoctorCenter hosDocCenter);

	void updateDoctorDetails(HospitalManagementDoctorCenter hosDocCenter);

	void deleteDoctorDetails(HospitalManagementDoctorCenter hosDocCenter);

	List<HospitalManagementDoctorCenter> getDoctorDetails(HospitalManagementDoctorCenter hosDocCenter);

	List<HospitalManagementDoctorCenter> getParticularDoctorDetails(HospitalManagementDoctorCenter hosDocCenter);
}
p