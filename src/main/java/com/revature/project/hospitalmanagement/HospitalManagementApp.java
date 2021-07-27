package com.revature.project.hospitalmanagement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.logging.Logger;

import com.revature.project.hospitalmanagement.client.HospitalManagementDoctorApplication;
import com.revature.project.hospitalmanagement.client.HospitalManagementPatientApplication;
import com.revature.project.hospitalmanagement.exception.InvalidChoiceException;
import com.revature.project.hospitalmanagement.exception.NegativeNumberException;

public class HospitalManagementApp {
	public static void main(String[] args)
			throws NumberFormatException, IOException, InvalidChoiceException, NegativeNumberException {
		Logger logger = Logger.getLogger("HospitalManagementApp.class");
		HospitalManagementDoctorApplication hosDoctorApp = new HospitalManagementDoctorApplication();
		HospitalManagementPatientApplication hosPatientApp = new HospitalManagementPatientApplication();
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		logger.info("In HospitalManagement App");
		System.out.println("============HOSPITAL MANAGEMENT SYSTEM============\n");
		System.out.println("============1.DOCTOR MANAGEMENT SYSTEM=============");
		System.out.println("============2.PATIENT MANAGEMENT SYSTEM============");
		System.out.println("Enter your choice:");
		int userChoice = Integer.parseInt(bufferedReader.readLine());
		switch (userChoice) {
		case 1:
			logger.info("In doctor application");
			hosDoctorApp.main(args);
			break;
		case 2:
			logger.info("In patient application");
			hosPatientApp.main(args);
			break;
		default:
			throw new InvalidChoiceException("Enter the valid choice!");
		}
	}
}
