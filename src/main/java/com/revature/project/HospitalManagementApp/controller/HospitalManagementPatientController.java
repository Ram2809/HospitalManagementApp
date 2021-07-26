package com.revature.project.HospitalManagementApp.controller;

import java.util.List;

import org.apache.log4j.Logger;import com.revature.project.HospitalManagementApp.model.HospitalManagementDoctorCenter;
import com.revature.project.HospitalManagementApp.model.HospitalManagementPatientCenter;
import com.revature.project.HospitalManagementApp.service.HospitalManagementPatientServiceImpl;

public class HospitalManagementPatientController {
	HospitalManagementPatientServiceImpl hosPatientSerImpl = new HospitalManagementPatientServiceImpl();
	Logger logger=Logger.getLogger("HospitalManagementPatientController.class");
	public void addPatientDetails(HospitalManagementPatientCenter hosPatientCenter) {
		logger.info("In patient service - add method");
		hosPatientSerImpl.addPatientDetails(hosPatientCenter);
	}

	public void updatePatientDetails(HospitalManagementPatientCenter hosPatientCenter) {
		logger.info("In patient service - update method");
		hosPatientSerImpl.updatePatientDetails(hosPatientCenter);
	}

	public void deletePatientDetails(HospitalManagementPatientCenter hosPatientCenter) {
		logger.info("In patient service - delete method");
		hosPatientSerImpl.deletePatientDetails(hosPatientCenter);
	}

	public List<HospitalManagementPatientCenter> getPatientDetails(HospitalManagementPatientCenter hosPatientCenter) {
		logger.info("In patient service - get method");
		return hosPatientSerImpl.getPatientDetails(hosPatientCenter);
	}

	public void getPatientReport(HospitalManagementPatientCenter hosPatientCenter) {
		logger.info("In patient service - get patient report method");
		hosPatientSerImpl.getPatientReport(hosPatientCenter);
	}
	public List<HospitalManagementPatientCenter> getParticularPatientDetails(HospitalManagementPatientCenter hosPatientCenter) {
		logger.info("In patient service - getParticularPatientDetails method");
		return hosPatientSerImpl.getParticularPatientDetails(hosPatientCenter);
	}
}
