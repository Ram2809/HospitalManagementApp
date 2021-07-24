package com.revature.project.HospitalManagementApp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import com.revature.project.HospitalManagementApp.client.HospitalManagementDoctorApplication;
import com.revature.project.HospitalManagementApp.client.HospitalManagementPatientApplication;
import com.revature.project.HospitalManagementApp.exception.InvalidChoiceException;
import com.revature.project.HospitalManagementApp.exception.NegativeNumberException;

public class HospitalManagementApp {
	public static void main(String[] args)throws NumberFormatException, IOException, InvalidChoiceException, NegativeNumberException {
		HospitalManagementDoctorApplication hosDoctorApp = new HospitalManagementDoctorApplication();
		HospitalManagementPatientApplication hosPatientApp = new HospitalManagementPatientApplication();
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("============HOSPITAL MANAGEMENT SYSTEM============\n");
		System.out.println("============1.DOCTOR MANAGEMENT SYSTEM=============");
		System.out.println("============2.PATIENT MANAGEMENT SYSTEM============");
		System.out.println("Enter your choice:");
		int userChoice = Integer.parseInt(bufferedReader.readLine());
		switch (userChoice) {
		case 1:
			hosDoctorApp.main(args);
			break;
		case 2:
			hosPatientApp.main(args);
			break;
		default:
			throw new InvalidChoiceException("Enter the valid choice!");
		}
	}
}
