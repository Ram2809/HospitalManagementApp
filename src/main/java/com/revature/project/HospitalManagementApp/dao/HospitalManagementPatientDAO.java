package com.revature.project.HospitalManagementApp.dao;

import com.revature.project.HospitalManagementApp.model.HospitalManagementPatientCenter;

public interface HospitalManagementPatientDAO {
	void addPatientDetails(HospitalManagementPatientCenter hosPatientCenter);
	void updatePatientDetails(HospitalManagementPatientCenter hosPatientCenter);
}
