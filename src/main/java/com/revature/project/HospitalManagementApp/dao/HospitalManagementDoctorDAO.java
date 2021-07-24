package com.revature.project.HospitalManagementApp.dao;

import com.revature.project.HospitalManagementApp.model.HospitalManagementDoctorCenter;

public interface HospitalManagementDoctorDAO {
	void addDoctorDetails(HospitalManagementDoctorCenter hosDocCenter);

	void updateDoctorDetails(HospitalManagementDoctorCenter hosDocCenter);

	void deleteDoctorDetails(HospitalManagementDoctorCenter hosDocCenter);

	void getDoctorDetails(HospitalManagementDoctorCenter hosDocCenter);
}
