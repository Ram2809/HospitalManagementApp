package com.revature.project.HospitalManagementApp.dao;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.PreparedStatement;

import com.revature.project.HospitalManagementApp.exception.InvalidChoiceException;
import com.revature.project.HospitalManagementApp.model.HospitalManagementDoctorCenter;
import com.revature.project.HospitalManagementApp.model.HospitalManagementPatientCenter;
import com.revature.project.HospitalManagementApp.util.DBUtil;

public class HospitalManagementPatientDAOImpl implements HospitalManagementPatientDAO{
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	public void addPatientDetails(HospitalManagementPatientCenter hosPatientCenter) {
		try (Connection con = DBUtil.getConnection();) {
			String query = "INSERT INTO patient VALUES(?,?,?,?,?,?,?,?);";
			PreparedStatement pst = con.prepareStatement(query);
			pst.setInt(1, hosPatientCenter.getPatientId());
			pst.setString(2, hosPatientCenter.getPatientName());
			pst.setString(3, hosPatientCenter.getPatientGender());
			pst.setInt(4, hosPatientCenter.getPatientAge());
			pst.setString(5, hosPatientCenter.getDisease());
			pst.setString(6, hosPatientCenter.getAdmitStatus());
			pst.setLong(7, hosPatientCenter.getPatientPhoneNo());
			pst.setInt(8,hosPatientCenter.getConsultantId());
			long count = pst.executeUpdate();
			System.out.println(count + " " + "rows inserted!");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public void updatePatientDetails(HospitalManagementPatientCenter hosPatientCenter) {
		try (Connection con = DBUtil.getConnection();) {
			PreparedStatement pst = null;
			// long count=pst.executeUpdate();
			// System.out.println(count+" "+"rows inserted!");
			System.out.println("Enter the patient id:");
			Integer updateId = Integer.parseInt(br.readLine());
			System.out.println("1.Update patient name");
			System.out.println("2.Update patient gender");
			System.out.println("3.Update patient age");
			System.out.println("4.Update patient disease");
			System.out.println("5.Update patient admit status");
			System.out.println("6.Update patient contact no");
			System.out.println("7.Update patient consultant id");
			System.out.println("Enter your choice:");
			Integer updateChoice = Integer.parseInt(br.readLine());
			switch (updateChoice) {
			case 1:
				System.out.println("Enter the new name:");
				String updateName = br.readLine();
				pst = con.prepareStatement("UPDATE patient Set PName=? where PId=?");
				pst.setString(1, updateName);
				pst.setInt(2, updateId);
				pst.executeUpdate();
				System.out.println("Rows updated");
				break;
			case 2:
				System.out.println("Enter the new gender:");
				String updateGender = br.readLine();
				pst = con.prepareStatement("UPDATE patient Set PGender=? where PId=?");
				pst.setString(1, updateGender);
				pst.setInt(2, updateId);
				pst.executeUpdate();
				System.out.println("Rows updated");
				break;
			case 3:
				System.out.println("Enter the new age:");
				int updateAge = Integer.parseInt(br.readLine());
				pst = con.prepareStatement("UPDATE patient Set PAge=? where PId=?");
				pst.setInt(1, updateAge);
				pst.setInt(2, updateId);
				pst.executeUpdate();
				System.out.println("Rows updated");
				break;
			case 4:
				System.out.println("Enter the new disease:");
				String updateDisease = br.readLine();
				pst = con.prepareStatement("UPDATE patient Set PDisease=? where PId=?");
				pst.setString(1, updateDisease);
				pst.setInt(2, updateId);
				pst.executeUpdate();
				System.out.println("Rows updated");
				break;
			case 5:
				System.out.println("Enter the new admit status:");
				String updateAdmitStatus = br.readLine();
				pst = con.prepareStatement("UPDATE patient Set PAdmitStatus=? where PId=?");
				pst.setString(1, updateAdmitStatus);
				pst.setInt(2, updateId);
				pst.executeUpdate();
				System.out.println("Rows updated");
				break;
			case 6:
				System.out.println("Enter the new contactNo.:");
				Long updateContactNo = Long.parseLong(br.readLine());
				pst = con.prepareStatement("UPDATE patient Set PContactNo=? where PId=?");
				pst.setLong(1, updateContactNo);
				pst.setInt(2, updateId);
				pst.executeUpdate();
				System.out.println("Rows updated");
				break;
			case 7:
				System.out.println("Enter the new consultant id:");
				Integer updateConsultantId =Integer.parseInt(br.readLine());
				pst = con.prepareStatement("UPDATE patient Set PConsultantId=? where PId=?");
				pst.setDouble(1,updateConsultantId);
				pst.setInt(2, updateId);
				pst.executeUpdate();
				System.out.println("Rows updated");
				break;
			default:
				throw new InvalidChoiceException("Enter the valid choice!");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

}
}
