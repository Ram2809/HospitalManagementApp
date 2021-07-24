package com.revature.project.HospitalManagementApp.service;

import com.revature.project.HospitalManagementApp.dao.HospitalManagementPatientDAOImpl;
import com.revature.project.HospitalManagementApp.model.HospitalManagementPatientCenter;

public class HospitalManagementPatientServiceImpl implements HospitalManagementPatientService {
	HospitalManagementPatientDAOImpl hosPatientDAOImpl=new HospitalManagementPatientDAOImpl();
	public void addPatientDetails(HospitalManagementPatientCenter hosPatientCenter)
	{
		hosPatientDAOImpl.addPatientDetails(hosPatientCenter);
	}
	public void updatePatientDetails(HospitalManagementPatientCenter hosPatientCenter)
	{
		hosPatientDAOImpl.updatePatientDetails(hosPatientCenter);
	}
}
