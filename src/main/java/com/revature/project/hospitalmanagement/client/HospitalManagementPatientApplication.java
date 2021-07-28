package com.revature.project.hospitalmanagement.client;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.log4j.Logger;

import com.revature.project.hospitalmanagement.controller.HospitalManagementPatientController;
import com.revature.project.hospitalmanagement.exception.InvalidChoiceException;
import com.revature.project.hospitalmanagement.exception.NegativeNumberException;
import com.revature.project.hospitalmanagement.model.HospitalManagementPatientCenter;

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
		hosPatientController.addPatientDetails(hosPatientCenter);
	}

	public static void updatePatient() {
		hosPatientController.updatePatientDetails(hosPatientCenter);
	}

	public static void deletePatient() {
		hosPatientController.deletePatientDetails(hosPatientCenter);
	}

	public static void getPatient() {
		List<HospitalManagementPatientCenter> patientsList = new ArrayList<HospitalManagementPatientCenter>();
		patientsList = hosPatientController.getPatientDetails(hosPatientCenter);
		Iterator<HospitalManagementPatientCenter> patientsListIterator = patientsList.iterator();
		while (patientsListIterator.hasNext()) {
			System.out.println(patientsListIterator.next());
		}
	}

	public static void getPatientReport() {
		hosPatientController.getPatientReport(hosPatientCenter);
	}

	private static void getParticularDoctor() {
		List<HospitalManagementPatientCenter> patientList = new ArrayList<HospitalManagementPatientCenter>();
		patientList = hosPatientController.getParticularPatientDetails(hosPatientCenter);
		System.out.println("------------Patient Details---------------");
		Iterator<HospitalManagementPatientCenter> patientListIterator = patientList.iterator();
		while (patientListIterator.hasNext()) {
			System.out.println(patientListIterator.next());
		}
	}

	public static void main(String[] args)
			throws InvalidChoiceException, NumberFormatException, IOException, NegativeNumberException {
		// TODO Auto-generated method stub
		Logger logger = Logger.getLogger(HospitalManagementPatientApplication.class);
		while (true) {
			System.out.println("----------PATIENT MANAGEMENT SYSTEM----------");
			System.out.println("----------1.Insertion----------");
			System.out.println("----------2.Updation----------");
			System.out.println("----------3.Deletion----------");
			System.out.println("----------4.Retrieval----------");
			System.out.println("----------5.Patient Report----------");
			System.out.println("----------6.Fetch particular patient details---------");
			System.out.println("----------7.Exit---------------------");
			System.out.println("Enter your choice:");
			Integer userChoice = Integer.parseInt(br.readLine());
			switch (userChoice) {
			case 1:
				logger.info("In patient controller -> add method");
				insertPatient();
				break;
			case 2:
				logger.info("In patient controller -> update method");
				updatePatient();
				break;
			case 3:
				logger.info("In patient controller -> delete method");
				deletePatient();
				break;
			case 4:
				logger.info("In patient controller -> get method");
				getPatient();
				break;
			case 5:
				logger.info("In patient controller -> get patient report method");
				getPatientReport();
				break;
			case 6:
				logger.info("In patient controller -> getParticularPatientdetails method");
				getParticularDoctor();
				break;
			case 7:
				logger.info("Exits from patient application");
				System.exit(0);
				break;
			default:
				throw new InvalidChoiceException("Enter the valid choice!");
			}
		}
	}
}
