package com.revature.project.hospitalmanagement.dao;

import java.util.List;

import com.revature.project.hospitalmanagement.model.HospitalManagementPatientCenter;

public interface HospitalManagementPatientDAO {
	void addPatientDetails(HospitalManagementPatientCenter hosPatientCenter);

	void updatePatientDetails(HospitalManagementPatientCenter hosPatientCenter);

	void deletePatientDetails(HospitalManagementPatientCenter hosPatientCenter);

	List<HospitalManagementPatientCenter> getPatientDetails(HospitalManagementPatientCenter hosPatientCenter);

	void getPatientReport(HospitalManagementPatientCenter hosPatientCenter);

	List<HospitalManagementPatientCenter> getParticularPatientDetails(HospitalManagementPatientCenter hosPatientCenter);
}
