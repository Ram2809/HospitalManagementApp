package com.revature.project.HospitalManagementApp.service;

import java.util.List;

import com.revature.project.HospitalManagementApp.dao.HospitalManagementPatientDAOImpl;
import com.revature.project.HospitalManagementApp.model.HospitalManagementPatientCenter;

public class HospitalManagementPatientServiceImpl implements HospitalManagementPatientService {
	HospitalManagementPatientDAOImpl hosPatientDAOImpl = new HospitalManagementPatientDAOImpl();

	public void addPatientDetails(HospitalManagementPatientCenter hosPatientCenter) {
		hosPatientDAOImpl.addPatientDetails(hosPatientCenter);
	}

	public void updatePatientDetails(HospitalManagementPatientCenter hosPatientCenter) {
		hosPatientDAOImpl.updatePatientDetails(hosPatientCenter);
	}

	public void deletePatientDetails(HospitalManagementPatientCenter hosPatientCenter) {
		hosPatientDAOImpl.deletePatientDetails(hosPatientCenter);
	}

	public List<HospitalManagementPatientCenter> getPatientDetails(HospitalManagementPatientCenter hosPatientCenter) {
		return hosPatientDAOImpl.getPatientDetails(hosPatientCenter);
	}

	public void getPatientReport(HospitalManagementPatientCenter hosPatientCenter) {
		hosPatientDAOImpl.getPatientReport(hosPatientCenter);
	}
}
