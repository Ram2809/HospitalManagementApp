package com.revature.project.hospitalmanagement.controller;

import java.util.List;

import org.apache.log4j.Logger;

//import org.apache.log4j.Logger;

import com.revature.project.hospitalmanagement.model.HospitalManagementDoctorCenter;
import com.revature.project.hospitalmanagement.service.HospitalManagementDoctorServiceImpl;

public class HospitalManagementDoctorController {
	Logger logger = Logger.getLogger("HospitalManagementDoctorController.class");
	HospitalManagementDoctorServiceImpl hosDocSerImpl = new HospitalManagementDoctorServiceImpl();

	public void addDoctorDetails(HospitalManagementDoctorCenter hosDoctorCenter) {
		logger.info("In doctor service - add method");
		hosDocSerImpl.addDoctorDetails(hosDoctorCenter);
	}

	public void updateDoctorDetails(HospitalManagementDoctorCenter hosDoctorCenter) {
		logger.info("In doctor service - update method");
		hosDocSerImpl.updateDoctorDetails(hosDoctorCenter);
	}

	public void deleteDoctorDetails(HospitalManagementDoctorCenter hosDoctorCenter) {
		logger.info("In doctor service - delete method");
		hosDocSerImpl.deleteDoctorDetails(hosDoctorCenter);
	}

	public List<HospitalManagementDoctorCenter> getDoctorDetails(HospitalManagementDoctorCenter hosDoctorCenter) {
		logger.info("In doctor service - get method");
		return hosDocSerImpl.getDoctorDetails(hosDoctorCenter);
	}

	public List<HospitalManagementDoctorCenter> getParticularDoctorDetails(
			HospitalManagementDoctorCenter hosDoctorCenter) {
		logger.info("In doctor service - getParticularDoctorDetails method");
		return hosDocSerImpl.getParticularDoctorDetails(hosDoctorCenter);
	}
}
