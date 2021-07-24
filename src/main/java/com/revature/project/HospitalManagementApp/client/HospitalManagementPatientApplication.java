package com.revature.project.HospitalManagementApp.client;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.revature.project.HospitalManagementApp.controller.HospitalManagementPatientController;
import com.revature.project.HospitalManagementApp.exception.InvalidChoiceException;
import com.revature.project.HospitalManagementApp.exception.NegativeNumberException;
import com.revature.project.HospitalManagementApp.model.HospitalManagementPatientCenter;

public class HospitalManagementPatientApplication {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static HospitalManagementPatientController hosPatientController = new HospitalManagementPatientController();
	static HospitalManagementPatientCenter hosPatientCenter = new HospitalManagementPatientCenter();

	public static void insertPatient() throws NegativeNumberException, NumberFormatException, IOException {
		System.out.println("Enter the patient details:");
		System.out.println("Enter the patient id:");
		Integer id = Integer.parseInt(br.readLine());
		if (id <= 1) {
			throw new NegativeNumberException("Enter a positive number!");
		}
		System.out.println("Enter the patient name:");
		String name = br.readLine();
		System.out.println("Enter the gender:");
		String gender = br.readLine();
		System.out.println("Enter the age:");
		Integer age = Integer.parseInt(br.readLine());
		System.out.println("Enter the disease name:");
		String disease = br.readLine();
		System.out.println("Enter the patient admit status:");
		String admitStatus = br.readLine();
		System.out.println("Enter the contact no.:");
		Long contactNo = Long.parseLong(br.readLine());
		System.out.println("Enter the consultant id:");
		Integer consultantId = Integer.parseInt(br.readLine());
		hosPatientCenter.setPatientId(id);
		hosPatientCenter.setPatientName(name);
		hosPatientCenter.setPatientGender(gender);
		hosPatientCenter.setPatientAge(age);
		hosPatientCenter.setDisease(disease);
		hosPatientCenter.setAdmitStatus(admitStatus);
		hosPatientCenter.setPatientPhoneNo(contactNo);
		hosPatientCenter.setConsultantId(consultantId);
		System.out.println("------Insertion--------------");
		hosPatientController.addPatientDetails(hosPatientCenter);
	}

	public static void updatePatient() {
		System.out.println("------Updation--------------");
		hosPatientController.updatePatientDetails(hosPatientCenter);
	}

	public static void deletePatient() {
		System.out.println("------Deletion--------------");
		hosPatientController.deletePatientDetails(hosPatientCenter);
	}

	public static void getPatient() {
		List<HospitalManagementPatientCenter> patientList = new ArrayList<HospitalManagementPatientCenter>();
		System.out.println("------Retrieval--------------");
		patientList = hosPatientController.getPatientDetails(hosPatientCenter);
		Iterator<HospitalManagementPatientCenter> patientListIterator = patientList.iterator();
		while (patientListIterator.hasNext()) {
			System.out.println(patientListIterator.next());
		}
	}

	public static void getPatientReport() {
		hosPatientController.getPatientReport(hosPatientCenter);
	}

	public static void main(String[] args)
			throws InvalidChoiceException, NumberFormatException, IOException, NegativeNumberException {
		// TODO Auto-generated method stub
		System.out.println("----------PATIENT MANAGEMENT SYSTEM----------");
		System.out.println("----------1.Insertion----------");
		System.out.println("----------2.Updation----------");
		System.out.println("----------3.Deletion----------");
		System.out.println("----------4.Retrieval----------");
		System.out.println("----------5.Patient Report----------");
		System.out.println("Enter your choice:");
		Integer userChoice = Integer.parseInt(br.readLine());
		switch (userChoice) {
		case 1:
			insertPatient();
			break;
		case 2:
			updatePatient();
			break;
		case 3:
			deletePatient();
			break;
		case 4:
			getPatient();
			break;
		case 5:
			getPatientReport();
			break;
		default:
			throw new InvalidChoiceException("Enter the valid choice!");
		}
	}

}
