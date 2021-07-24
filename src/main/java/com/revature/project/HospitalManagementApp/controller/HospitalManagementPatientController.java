package com.revature.project.HospitalManagementApp.controller;

import java.util.List;

import com.revature.project.HospitalManagementApp.model.HospitalManagementPatientCenter;
import com.revature.project.HospitalManagementApp.service.HospitalManagementPatientServiceImpl;

public class HospitalManagementPatientController {
	HospitalManagementPatientServiceImpl hosPatientSerImpl = new HospitalManagementPatientServiceImpl();

	public void addPatientDetails(HospitalManagementPatientCenter hosPatientCenter) {
		hosPatientSerImpl.addPatientDetails(hosPatientCenter);
	}

	public void updatePatientDetails(HospitalManagementPatientCenter hosPatientCenter) {
		hosPatientSerImpl.updatePatientDetails(hosPatientCenter);
	}

	public void deletePatientDetails(HospitalManagementPatientCenter hosPatientCenter) {
		hosPatientSerImpl.deletePatientDetails(hosPatientCenter);
	}

	public List<HospitalManagementPatientCenter> getPatientDetails(HospitalManagementPatientCenter hosPatientCenter) {
		return hosPatientSerImpl.getPatientDetails(hosPatientCenter);
	}

	public void getPatientReport(HospitalManagementPatientCenter hosPatientCenter) {
		hosPatientSerImpl.getPatientReport(hosPatientCenter);
	}
}
