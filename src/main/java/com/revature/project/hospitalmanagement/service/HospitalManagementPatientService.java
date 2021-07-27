package com.revature.project.hospitalmanagement.service;

import java.util.ArrayList;
import java.util.List;

import com.revature.project.hospitalmanagement.model.HospitalManagementPatientCenter;

public interface HospitalManagementPatientService {
	void addPatientDetails(HospitalManagementPatientCenter hosPatientCenter);

	void updatePatientDetails(HospitalManagementPatientCenter hosPatientCenter);

	void deletePatientDetails(HospitalManagementPatientCenter hosPatientCenter);

	List<HospitalManagementPatientCenter> getPatientDetails(HospitalManagementPatientCenter hosPatientCenter);

	void getPatientReport(HospitalManagementPatientCenter hosPatientCenter);

	List<HospitalManagementPatientCenter> getParticularPatientDetails(HospitalManagementPatientCenter hosPatientCenter);
}
