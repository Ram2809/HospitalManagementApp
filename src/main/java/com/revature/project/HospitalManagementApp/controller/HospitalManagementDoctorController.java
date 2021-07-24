package com.revature.project.HospitalManagementApp.controller;


import com.revature.project.HospitalManagementApp.model.HospitalManagementDoctorCenter;
import com.revature.project.HospitalManagementApp.service.HospitalManagementDoctoServiceImpl;

public class HospitalManagementDoctorController {
	HospitalManagementDoctoServiceImpl hosDocSerImpl=new HospitalManagementDoctoServiceImpl();
	public void addDoctorDetails(HospitalManagementDoctorCenter hosDoctorCenter)
	{
		hosDocSerImpl.addDoctorDetails(hosDoctorCenter);
	}
	public void updateDoctorDetails(HospitalManagementDoctorCenter hosDoctorCenter)
	{
		hosDocSerImpl.updateDoctorDetails(hosDoctorCenter);
	}

}
