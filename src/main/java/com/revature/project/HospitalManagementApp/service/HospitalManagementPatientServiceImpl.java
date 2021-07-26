package com.revature.project.HospitalManagementApp.service;

import java.util.List;

import org.apache.log4j.Logger;

import com.revature.project.HospitalManagementApp.dao.HospitalManagementPatientDAOImpl;
import com.revature.project.HospitalManagementApp.model.HospitalManagementPatientCenter;

public class HospitalManagementPatientServiceImpl implements HospitalManagementPatientService {
	HospitalManagementPatientDAOImpl hosPatientDAOImpl = new HospitalManagementPatientDAOImpl();
	Logger logger=Logger.getLogger(" HospitalManagementPatientServiceImpl.class");
	public void addPatientDetails(HospitalManagementPatientCenter hosPatientCenter) {
		logger.info("In patient DAO -> add method");
		hosPatientDAOImpl.addPatientDetails(hosPatientCenter);
	}

	public void updatePatientDetails(HospitalManagementPatientCenter hosPatientCenter) {
		logger.info("In patient DAO -> update method");
		hosPatientDAOImpl.updatePatientDetails(hosPatientCenter);
	}

	public void deletePatientDetails(HospitalManagementPatientCenter hosPatientCenter) {
		logger.info("In patient DAO -> delete method");
		hosPatientDAOImpl.deletePatientDetails(hosPatientCenter);
	}

	public List<HospitalManagementPatientCenter> getPatientDetails(HospitalManagementPatientCenter hosPatientCenter) {
		logger.info("In patient DAO ->get method");
		return hosPatientDAOImpl.getPatientDetails(hosPatientCenter);
	}

	public void getPatientReport(HospitalManagementPatientCenter hosPatientCenter) {
		logger.info("In patient DAO -> get patient report method");
		hosPatientDAOImpl.getPatientReport(hosPatientCenter);
	}
	public List<HospitalManagementPatientCenter> getParticularPatientDetails(HospitalManagementPatientCenter hosPatientCenter) {
		logger.info("In patient DAO ->getParticularPatientDetails method");
		return hosPatientDAOImpl.getParticularPatientDetails(hosPatientCenter);
	}
}
