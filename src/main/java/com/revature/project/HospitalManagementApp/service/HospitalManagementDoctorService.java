package com.revature.project.HospitalManagementApp.service;

import com.revature.project.HospitalManagementApp.model.HospitalManagementDoctorCenter;

public interface HospitalManagementDoctorService {
	void addDoctorDetails(HospitalManagementDoctorCenter hosDocCenter);

	void updateDoctorDetails(HospitalManagementDoctorCenter hosDocCenter);

	void deleteDoctorDetails(HospitalManagementDoctorCenter hosDocCenter);

	void getDoctorDetails(HospitalManagementDoctorCenter hosDocCenter);
}
