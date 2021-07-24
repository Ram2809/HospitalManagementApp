package com.revature.project.HospitalManagementApp.service;

import com.revature.project.HospitalManagementApp.dao.HospitalManagementDoctorDAOImpl;
import com.revature.project.HospitalManagementApp.model.HospitalManagementDoctorCenter;

public class HospitalManagementDoctoServiceImpl implements HospitalManagementDoctorService {
	HospitalManagementDoctorDAOImpl hosDocDAOImpl=new HospitalManagementDoctorDAOImpl();
	public void addDoctorDetails(HospitalManagementDoctorCenter hosDocCenter)
	{
		hosDocDAOImpl.addDoctorDetails(hosDocCenter);
	}
	public void updateDoctorDetails(HospitalManagementDoctorCenter hosDocCenter)
	{
		hosDocDAOImpl.updateDoctorDetails(hosDocCenter);
	}
}
