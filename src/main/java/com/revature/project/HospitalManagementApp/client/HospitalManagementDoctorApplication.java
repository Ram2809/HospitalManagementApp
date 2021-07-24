package com.revature.project.HospitalManagementApp.client;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import com.revature.project.HospitalManagementApp.controller.HospitalManagementDoctorController;
import com.revature.project.HospitalManagementApp.exception.InvalidChoiceException;
import com.revature.project.HospitalManagementApp.exception.NegativeNumberException;
import com.revature.project.HospitalManagementApp.model.HospitalManagementDoctorCenter;

public class HospitalManagementDoctorApplication {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static HospitalManagementDoctorController hosDocController = new HospitalManagementDoctorController();
	static HospitalManagementDoctorCenter hosDoctorCenter = new HospitalManagementDoctorCenter();

	public static void insertDoctor() throws NumberFormatException, IOException, NegativeNumberException {
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
		System.out.println("------Insertion--------------");
		hosDocController.addDoctorDetails(hosDoctorCenter);
	}

	public static void updateDoctor() {
		System.out.println("------Updation--------------");
		hosDocController.updateDoctorDetails(hosDoctorCenter);
	}

	public static void deleteDoctor() {
		System.out.println("------Deletion--------------");
		hosDocController.deleteDoctorDetails(hosDoctorCenter);
	}

	public static void getDoctor() {
		System.out.println("------Retrieval--------------");
		hosDocController.getDoctorDetails(hosDoctorCenter);
	}

	public static void main(String[] args)
			throws NumberFormatException, IOException, InvalidChoiceException, NegativeNumberException {
		// TODO Auto-generated method stub
		System.out.println("----------DOCTOR MANAGEMENT SYSTEM----------");
		System.out.println("----------1.Insertion----------");
		System.out.println("----------2.Updation----------");
		System.out.println("----------3.Deletion----------");
		System.out.println("----------4.Retrieval----------");
		System.out.println("Enter your choice:");
		Integer userChoice = Integer.parseInt(br.readLine());
		switch (userChoice) {
		case 1:
			insertDoctor();
			break;
		case 2:
			updateDoctor();
			break;
		case 3:
			deleteDoctor();
			break;
		case 4:
			getDoctor();
			break;
		default:
			throw new InvalidChoiceException("Enter the valid choice!");
		}
	}
}
