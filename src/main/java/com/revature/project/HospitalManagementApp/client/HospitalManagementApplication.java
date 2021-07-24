package com.revature.project.HospitalManagementApp.client;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import com.revature.project.HospitalManagementApp.controller.HospitalManagementDoctorController;
import com.revature.project.HospitalManagementApp.exception.InvalidChoiceException;
import com.revature.project.HospitalManagementApp.model.HospitalManagementDoctorCenter;

public class HospitalManagementApplication {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the doctor details:");
		System.out.println("Enter the doctor id:");
		Integer id=Integer.parseInt(br.readLine());
		System.out.println("Enter the doctor name:");
		String name=br.readLine();
		System.out.println("Enter the age:");
		Integer age=Integer.parseInt(br.readLine());
		System.out.println("Enter the qualification:");
		String qualification=br.readLine();
		System.out.println("Enter the specialization:");
		String specialist=br.readLine();
		System.out.println("Enter the check in timing:");
		Integer timingFrom=Integer.parseInt(br.readLine());
		System.out.println("Enter the check out timing:");
		Integer timingTo=Integer.parseInt(br.readLine());
		HospitalManagementDoctorCenter hosDoctorCenter=new HospitalManagementDoctorCenter();
		hosDoctorCenter.setDoctorId(id);
		hosDoctorCenter.setDoctorName(name);
		hosDoctorCenter.setDoctorAge(age);
		hosDoctorCenter.setDoctorQualification(qualification);
		hosDoctorCenter.setDoctorSpecialization(specialist);
		hosDoctorCenter.setFromTiming(timingFrom);
		hosDoctorCenter.setToTiming(timingTo);
		/*System.out.println(hosDoctorCenter.getDoctorId());
		System.out.println(hosDoctorCenter.getDoctorName());
		System.out.println(hosDoctorCenter.getDoctorAge());
		System.out.println(hosDoctorCenter.getDoctorQualification());
		System.out.println(hosDoctorCenter.getDoctorSpecialization());
		System.out.println(hosDoctorCenter.getFromTiming());
		System.out.println(hosDoctorCenter.getToTiming());*/
		HospitalManagementDoctorController hosDocController=new HospitalManagementDoctorController();
		System.out.println("------Insertion--------------");
		hosDocController.addDoctorDetails(hosDoctorCenter);
		System.out.println("------Updation--------------");
		//hosDocController.updateDoctorDetails(hosDoctorCenter);
	}
}
