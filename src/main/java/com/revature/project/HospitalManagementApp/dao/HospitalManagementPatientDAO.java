package com.revature.project.HospitalManagementApp.dao;

import java.util.List;

import com.revature.project.HospitalManagementApp.model.HospitalManagementPatientCenter;

public interface HospitalManagementPatientDAO {
	void addPatientDetails(HospitalManagementPatientCenter hosPatientCenter);

	void updatePatientDetails(HospitalManagementPatientCenter hosPatientCenter);

	void deletePatientDetails(HospitalManagementPatientCenter hosPatientCenter);

	List<HospitalManagementPatientCenter> getPatientDetails(HospitalManagementPatientCenter hosPatientCenter);

	void getPatientReport(HospitalManagementPatientCenter hosPatientCenter);
}
