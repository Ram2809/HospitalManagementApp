package com.revature.project.HospitalManagementApp.service;

import java.util.List;

import com.revature.project.HospitalManagementApp.model.HospitalManagementDoctorCenter;

public interface HospitalManagementDoctorService {
	void addDoctorDetails(HospitalManagementDoctorCenter hosDocCenter);

	void updateDoctorDetails(HospitalManagementDoctorCenter hosDocCenter);

	void deleteDoctorDetails(HospitalManagementDoctorCenter hosDocCenter);

	List<HospitalManagementDoctorCenter> getDoctorDetails(HospitalManagementDoctorCenter hosDocCenter);

	List<HospitalManagementDoctorCenter> getParticularDoctorDetails(HospitalManagementDoctorCenter hosDocCenter);
}
