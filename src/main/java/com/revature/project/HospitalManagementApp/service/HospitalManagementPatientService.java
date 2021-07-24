package com.revature.project.HospitalManagementApp.service;

import java.util.ArrayList;
import java.util.List;

import com.revature.project.HospitalManagementApp.model.HospitalManagementPatientCenter;

public interface HospitalManagementPatientService {
	void addPatientDetails(HospitalManagementPatientCenter hosPatientCenter);

	void updatePatientDetails(HospitalManagementPatientCenter hosPatientCenter);

	void deletePatientDetails(HospitalManagementPatientCenter hosPatientCenter);

	List<HospitalManagementPatientCenter> getPatientDetails(HospitalManagementPatientCenter hosPatientCenter);

	void getPatientReport(HospitalManagementPatientCenter hosPatientCenter);
}
