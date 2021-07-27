package com.revature.project.hospitalmanagement.service;

import java.util.List;

import org.apache.log4j.Logger;

import com.revature.project.hospitalmanagement.HospitalManagementApp;
import com.revature.project.hospitalmanagement.dao.HospitalManagementDoctorDAO;
import com.revature.project.hospitalmanagement.dao.HospitalManagementDoctorDAOImpl;
import com.revature.project.hospitalmanagement.model.HospitalManagementDoctorCenter;

public class HospitalManagementDoctorServiceImpl implements HospitalManagementDoctorService {
	HospitalManagementDoctorDAOImpl hosDocDAOImpl = new HospitalManagementDoctorDAOImpl();
	Logger logger = Logger.getLogger("HospitalManagementDoctorServiceImpl.class");

	public void addDoctorDetails(HospitalManagementDoctorCenter hosDocCenter) {
		logger.info("In doctor DAO -> add method");
		hosDocDAOImpl.addDoctorDetails(hosDocCenter);
	}

	public void updateDoctorDetails(HospitalManagementDoctorCenter hosDocCenter) {
		logger.info("In doctor DAO -> update method");
		hosDocDAOImpl.updateDoctorDetails(hosDocCenter);
	}

	public void deleteDoctorDetails(HospitalManagementDoctorCenter hosDocCenter) {
		logger.info("In doctor DAO -> delete method");
		hosDocDAOImpl.deleteDoctorDetails(hosDocCenter);
	}

	public List<HospitalManagementDoctorCenter> getDoctorDetails(HospitalManagementDoctorCenter hosDocCenter) {
		logger.info("In doctor DAO -> get method");
		return hosDocDAOImpl.getDoctorDetails(hosDocCenter);
	}

	public List<HospitalManagementDoctorCenter> getParticularDoctorDetails(
			HospitalManagementDoctorCenter hosDocCenter) {
		logger.info("In doctor DAO -> getParticularDoctorDetails method");
		return hosDocDAOImpl.getParticularDoctorDetails(hosDocCenter);
	}
}
