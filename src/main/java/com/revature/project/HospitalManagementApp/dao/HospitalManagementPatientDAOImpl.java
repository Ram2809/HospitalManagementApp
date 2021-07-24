package com.revature.project.HospitalManagementApp.dao;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.revature.project.HospitalManagementApp.exception.InvalidChoiceException;
import com.revature.project.HospitalManagementApp.exception.InvalidIdException;
import com.revature.project.HospitalManagementApp.model.HospitalManagementPatientCenter;
import com.revature.project.HospitalManagementApp.util.DBUtil;

public class HospitalManagementPatientDAOImpl implements HospitalManagementPatientDAO {
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
			pst.setInt(8, hosPatientCenter.getConsultantId());
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
				Integer updateConsultantId = Integer.parseInt(br.readLine());
				pst = con.prepareStatement("UPDATE patient Set PConsultantId=? where PId=?");
				pst.setDouble(1, updateConsultantId);
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

	public void deletePatientDetails(HospitalManagementPatientCenter hosPatientCenter) {
		try (Connection con = DBUtil.getConnection();) {
			PreparedStatement pst = null;
			String query = "DELETE FROM patient WHERE PId=?";
			pst = con.prepareStatement(query);
			System.out.println("Enter the patient id:");
			Integer deleteId = Integer.parseInt(br.readLine());
			pst.setInt(1, deleteId);
			pst.executeUpdate();
			System.out.println("Rows Deleted!");
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public List<HospitalManagementPatientCenter> getPatientDetails(HospitalManagementPatientCenter hosPatientCenter) {
		List<HospitalManagementPatientCenter> patientList = new ArrayList<>();
		try (Connection con = DBUtil.getConnection();) {
			Statement st = con.createStatement();
			String query = "SELECT * FROM patient";
			ResultSet rs = st.executeQuery(query);
			while (rs.next()) {
				patientList.add(new HospitalManagementPatientCenter(rs.getInt(1), rs.getString(2), rs.getString(3),
						rs.getInt(4), rs.getString(5), rs.getString(6), rs.getLong(7), rs.getInt(8)));
				// System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3)+"
				// "+rs.getInt(4)+" "+rs.getString(5)+" "+rs.getString(6)+" "+rs.getLong(7)+"
				// "+rs.getInt(8));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return patientList;
	}

	public void getPatientReport(HospitalManagementPatientCenter hosPatientCenter) {
		try (Connection con = DBUtil.getConnection();) {
			System.out.println("Enter the patient ID to get report:");
			Integer patientId = Integer.parseInt(br.readLine());
			if (patientId <= 100) {
				throw new InvalidIdException("Enter the valid ID!");
			}
			System.out.println("----------PatientReport----------");
			String query = "SELECT p.PId,p.PName,p.PAge,p.PGender,p.PDisease,p.PAdmitStatus,p.PContactNo,d.doc_id,d.doc_name,d.doc_specialist FROM patient p join doctor d on p.PConsultantId=d.doc_id where p.PId=?";
			PreparedStatement pst = con.prepareStatement(query);
			pst.setInt(1, patientId);
			ResultSet rs = pst.executeQuery();
			while (rs.next()) {
				System.out.println("Patient ID: " + rs.getInt(1));
				System.out.println("Patient Name: " + rs.getString(2));
				System.out.println("Patient Age: " + rs.getInt(3));
				System.out.println("Patient Gender:" + rs.getString(4));
				System.out.println("Patient Disease: " + rs.getString(5));
				System.out.println("Patient Admit Status: " + rs.getString(6));
				System.out.println("Patient Contact Number: " + rs.getLong(7));
				System.out.println("Doctor ID: " + rs.getInt(8));
				System.out.println("Doctor Name: " + rs.getString(9));
				System.out.println("Doctor Designation: " + rs.getString(10));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
