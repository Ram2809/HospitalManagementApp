package com.revature.project.HospitalManagementApp.dao;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.revature.project.HospitalManagementApp.exception.InvalidChoiceException;
import com.revature.project.HospitalManagementApp.model.HospitalManagementDoctorCenter;
import com.revature.project.HospitalManagementApp.util.DBUtil;

public class HospitalManagementDoctorDAOImpl implements HospitalManagementDoctorDAO{
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	public void addDoctorDetails(HospitalManagementDoctorCenter hosDocCenter)
	{
		try(Connection con=DBUtil.getConnection();)
		{
			String query="INSERT INTO doctor(doc_id,doc_name,doc_age,doc_qualification,doc_specialist,doc_fromTime,doc_toTime) VALUES(?,?,?,?,?,?,?);";
			PreparedStatement pst=con.prepareStatement(query);
			pst.setInt(1,hosDocCenter.getDoctorId());
			pst.setString(2,hosDocCenter.getDoctorName());
			pst.setInt(3,hosDocCenter.getDoctorAge());
			pst.setString(4,hosDocCenter.getDoctorQualification());
			pst.setString(5,hosDocCenter.getDoctorSpecialization());
			pst.setInt(6,hosDocCenter.getFromTiming());
			pst.setInt(7,hosDocCenter.getToTiming());
			long count=pst.executeUpdate();
			System.out.println(count+" "+"rows inserted!");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	public void updateDoctorDetails(HospitalManagementDoctorCenter hosDocCenter)
	{
		try(Connection con=DBUtil.getConnection();)
		{
			PreparedStatement pst=null;
			//long count=pst.executeUpdate();
			//System.out.println(count+" "+"rows inserted!");
			System.out.println("Enter the doctor id:");
			Integer updateId=Integer.parseInt(br.readLine());
			System.out.println("Enter your choice:");
			System.out.println("1.Update name");
			System.out.println("2.Update age");
			System.out.println("3.Update qualification");
			System.out.println("4.Update specialization");
			System.out.println("5.Update fromTiming");
			System.out.println("6.Update toTiming");
			Integer updateChoice=Integer.parseInt(br.readLine());
			switch(updateChoice)
			{
				case 1:
					System.out.println("Enter the new name:");
					String updateName=br.readLine();
					pst=con.prepareStatement("UPDATE doctor Set doc_name=? where doc_id=?");
					pst.setString(1,updateName);
					pst.setInt(2,updateId);
					pst.executeUpdate();
					System.out.println("Rows updated");
					break;
				case 2:
					System.out.println("Enter the new age:");
					Integer updateAge=Integer.parseInt(br.readLine());
					pst=con.prepareStatement("UPDATE doctor Set doc_age=? where doc_id=?");
					pst.setInt(1,updateAge);
					pst.setInt(2,updateId);
					pst.executeUpdate();
					System.out.println("Rows updated");
					break;
				case 3:
					System.out.println("Enter the new qualification:");
					String updateQualification=br.readLine();
					pst=con.prepareStatement("UPDATE doctor Set doc_qualification=? where doc_id=?");
					pst.setString(1,updateQualification);
					pst.setInt(2,updateId);
					pst.executeUpdate();
					System.out.println("Rows updated");
					break;
				case 4:
					System.out.println("Enter the new specialization:");
					String updateSpecialist=br.readLine();
					pst=con.prepareStatement("UPDATE doctor Set doc_specialist=? where doc_id=?");
					pst.setString(1,updateSpecialist);
					pst.setInt(2,updateId);
					pst.executeUpdate();
					System.out.println("Rows updated");
					break;
				case 5:
					System.out.println("Enter the new fromTiming:");
					Integer updateFromTiming=Integer.parseInt(br.readLine());
					pst=con.prepareStatement("UPDATE doctor Set doc_fromTime=? where doc_id=?");
					pst.setInt(1,updateFromTiming);
					pst.setInt(2,updateId);
					pst.executeUpdate();
					System.out.println("Rows updated");
					break;
				case 6:
					System.out.println("Enter the new name:");
					Integer updateToTiming=Integer.parseInt(br.readLine());
					pst=con.prepareStatement("UPDATE doctor Set doc_toTime=? where doc_id=?");
					pst.setInt(1,updateToTiming);
					pst.setInt(2,updateId);
					pst.executeUpdate();
					System.out.println("Rows updated");
					break;
				default:
					throw new InvalidChoiceException("Enter the valid choice!");
		}
	}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		}
	}

