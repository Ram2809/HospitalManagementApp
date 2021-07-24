package com.revature.project.HospitalManagementApp.controller;

import com.revature.project.HospitalManagementApp.model.HospitalManagementPatientCenter;
import com.revature.project.HospitalManagementApp.service.HospitalManagementPatientServiceImpl;

public class HospitalManagementPatientController {
	HospitalManagementPatientServiceImpl hosPatientSerImpl=new HospitalManagementPatientServiceImpl();
	public void addPatientDetails(HospitalManagementPatientCenter hosPatientCenter)
	{
		hosPatientSerImpl.addPatientDetails(hosPatientCenter);
	}
	public void updatePatientDetails(HospitalManagementPatientCenter hosPatientCenter)
	{
		hosPatientSerImpl.updatePatientDetails(hosPatientCenter);
	}
}
