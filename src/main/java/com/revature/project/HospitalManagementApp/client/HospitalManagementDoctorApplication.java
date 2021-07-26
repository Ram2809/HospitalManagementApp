package com.revature.project.HospitalManagementApp.client;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.log4j.Logger;

import com.revature.project.HospitalManagementApp.controller.HospitalManagementDoctorController;
import com.revature.project.HospitalManagementApp.exception.InvalidChoiceException;
import com.revature.project.HospitalManagementApp.exception.NegativeNumberException;
import com.revature.project.HospitalManagementApp.model.HospitalManagementDoctorCenter;
import com.revature.project.HospitalManagementApp.model.HospitalManagementPatientCenter;

public class HospitalManagementDoctorApplication {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static HospitalManagementDoctorController hosDocController = new HospitalManagementDoctorController();
	static HospitalManagementDoctorCenter hosDoctorCenter = new HospitalManagementDoctorCenter();

	public static void insertDoctor() throws NumberFormatException, IOException, NegativeNumberException {
		System.out.println("------Insertion--------------");
		System.out.println("Enter the doctor details:");
		System.out.println("Enter the doctor id:");
		Integer id = Integer.parseInt(br.readLine());
		if (id <= 1) {
			throw new NegativeNumberException("Enter a positive number!");
		}
		System.out.println("Enter the doctor name:");
		String name = br.readLine();
		System.out.println("Enter the age:");
		Integer age = Integer.parseInt(br.readLine());
		System.out.println("Enter the qualification:");
		String qualification = br.readLine();
		System.out.println("Enter the specialization:");
		String specialist = br.readLine();
		System.out.println("Enter the check in timing:");
		Integer timingFrom = Integer.parseInt(br.readLine());
		System.out.println("Enter the check out timing:");
		Integer timingTo = Integer.parseInt(br.readLine());
		System.out.println("Enter the salary:");
		Double salary = Double.parseDouble(br.readLine());
		hosDoctorCenter.setDoctorId(id);
		hosDoctorCenter.setDoctorName(name);
		hosDoctorCenter.setDoctorAge(age);
		hosDoctorCenter.setDoctorQualification(qualification);
		hosDoctorCenter.setDoctorSpecialization(specialist);
		hosDoctorCenter.setFromTiming(timingFrom);
		hosDoctorCenter.setToTiming(timingTo);
		hosDoctorCenter.setDoctorSalary(salary);
		hosDocController.addDoctorDetails(hosDoctorCenter);
	}

	public static void updateDoctor() {
		hosDocController.updateDoctorDetails(hosDoctorCenter);
	}

	public static void deleteDoctor() {
		hosDocController.deleteDoctorDetails(hosDoctorCenter);
	}
	public static void getParticularDoctor()
	{
		List<HospitalManagementDoctorCenter> doctorList=new ArrayList<HospitalManagementDoctorCenter>();
		doctorList=hosDocController.getParticularDoctorDetails(hosDoctorCenter);
		Iterator<HospitalManagementDoctorCenter> doctorListIterator =doctorList.iterator();
		while (doctorListIterator.hasNext()) {
			System.out.println(doctorListIterator.next());
		}
	}
	public static void getDoctor() {
		List<HospitalManagementDoctorCenter> doctorsList = new ArrayList<HospitalManagementDoctorCenter>();
		doctorsList = hosDocController.getDoctorDetails(hosDoctorCenter);
		Iterator<HospitalManagementDoctorCenter> doctorsListIterator =doctorsList.iterator();
		while (doctorsListIterator.hasNext()) {
			System.out.println(doctorsListIterator.next());
		}
	}

	public static void main(String[] args)
			throws NumberFormatException, IOException, InvalidChoiceException, NegativeNumberException {
		// TODO Auto-generated method stub
		Logger logger = Logger.getLogger(HospitalManagementDoctorApplication.class);
		System.out.println("----------DOCTOR MANAGEMENT SYSTEM----------");
		System.out.println("----------1.Insertion----------");
		System.out.println("----------2.Updation----------");
		System.out.println("----------3.Deletion----------");
		System.out.println("----------4.Retrieval----------");
		System.out.println("----------5.Fetch particular doctor details-----------");
		System.out.println("Enter your choice:");
		Integer userChoice = Integer.parseInt(br.readLine());
		//switch (userChoice) {
		do {
			switch (userChoice) {
		case 1:
			logger.info("In doctor controller -> add method");
			insertDoctor();
			break;
		case 2:
			logger.info("In doctor controller -> update method");
			updateDoctor();
			break;
		case 3:
			logger.info("In doctor controller -> delete method");
			deleteDoctor();
			break;
		case 4:
			logger.info("In doctor controller -> get method");
			getDoctor();
			break;
		case 5:
			logger.info("In doctor controller -> getParticularDoctordetails method");
			getParticularDoctor();
			break;
		default:
			throw new InvalidChoiceException("Enter the valid choice!");
		}
	}while(userChoice<=5);
	}
}
