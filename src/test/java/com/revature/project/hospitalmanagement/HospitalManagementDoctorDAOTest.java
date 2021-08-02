package com.revature.project.hospitalmanagement;

import static com.revature.project.hospitalmanagement.dao.HospitalManagementDoctorDAOImpl.*;
import static com.revature.project.hospitalmanagement.dao.HospitalManagementPatientDAOImpl.patientIdList;
import static org.junit.jupiter.api.Assertions.*;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.revature.project.hospitalmanagement.client.HospitalManagementDoctorApplication;
import com.revature.project.hospitalmanagement.controller.HospitalManagementDoctorController;
import com.revature.project.hospitalmanagement.model.HospitalManagementDoctorCenter;
import com.revature.project.hospitalmanagement.dao.HospitalManagementDoctorDAOImpl;
import com.revature.project.hospitalmanagement.util.DBUtil;

class HospitalManagementDoctorDAOTest {

	static HospitalManagementDoctorCenter hosDocCenter = new HospitalManagementDoctorCenter();
	static HospitalManagementDoctorApplication hosDocApp = new HospitalManagementDoctorApplication();
	HospitalManagementDoctorDAOImpl hosDocDAOImpl=new HospitalManagementDoctorDAOImpl();
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	@BeforeEach
	void setUp() throws Exception {
		//hosDocDAOImpl = new HospitalManagementDoctorDAOImpl();
	}

	@AfterEach
	void tearDown() throws Exception {
		//hosDocDAOImpl = null;
	}

	@Test
	void testGetDoctorId() {
		long beforeCount = 0;
		long afterCount = 0;
		try {
			Connection con = DBUtil.getConnection();
			Statement st = con.createStatement();
			ResultSet rs = null;
			rs = st.executeQuery("Select doc_id from doctor");
			while (rs.next()) {
				beforeCount++;
			}
			hosDocDAOImpl.getDoctorId();
			;
			afterCount = doctorIdList.size();
		} catch (Exception e) {
			e.printStackTrace();
		}
		assertEquals(beforeCount, afterCount);
	}

	@Test
	void testAddDoctorDetails() {
		long beforeCount = 0;
		long afterCount = 0;
		try {
			Connection con = DBUtil.getConnection();
			Statement st = con.createStatement();
			ResultSet rs = null;
			System.out.println("Before Insert");
			rs = st.executeQuery("SELECT * FROM doctor");
			while (rs.next()) {
				beforeCount++;
			}
			hosDocApp.insertDoctor();
			System.out.println("After Insert");
			rs = st.executeQuery("SELECT * FROM doctor");
			while (rs.next()) {
				afterCount++;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		assertNotSame(beforeCount, afterCount);
	}

	@Test
	void testUpdateDoctorDetails() throws NumberFormatException, IOException {
		List<HospitalManagementDoctorCenter> beforeUpdateList = new ArrayList<>();
		List<HospitalManagementDoctorCenter> afterUpdateList = new ArrayList<>();
		System.out.println("Enter the update id:");
		Integer updateDocId = Integer.parseInt(br.readLine());
		try {
			Connection con = DBUtil.getConnection();
			PreparedStatement pst = con.prepareStatement("SELECT * FROM doctor WHERE doc_id=?");
			pst.setInt(1, updateDocId);
			ResultSet rs = pst.executeQuery();
			while (rs.next()) {
				beforeUpdateList.add(new HospitalManagementDoctorCenter(rs.getInt(1), rs.getString(2), rs.getInt(3),
						rs.getString(4), rs.getString(5), rs.getInt(6), rs.getInt(7), rs.getDouble(8)));
			}
			System.out.println(beforeUpdateList);
			hosDocDAOImpl.updateDoctorDetails(hosDocCenter);
			ResultSet resultSet = pst.executeQuery();
			while (resultSet.next()) {
				afterUpdateList.add(new HospitalManagementDoctorCenter(resultSet.getInt(1), resultSet.getString(2),
						resultSet.getInt(3), resultSet.getString(4), resultSet.getString(5), resultSet.getInt(6),
						resultSet.getInt(7), resultSet.getDouble(8)));
			}
			System.out.println(afterUpdateList);
		} catch (Exception e) {
			e.printStackTrace();
		}
		assertFalse(Arrays.equals(beforeUpdateList.toArray(), afterUpdateList.toArray()));
	}

	@Test
	void testDeleteDoctorDetails() {
		// fail("Not yet implemented");
		long beforeCount = 0;
		long afterCount = 0;
		try {
			Connection con = DBUtil.getConnection();
			Statement st = con.createStatement();
			ResultSet rs = null;
			System.out.println("Before delete");
			rs = st.executeQuery("SELECT * FROM doctor");
			while (rs.next()) {
				beforeCount++;
			}
			System.out.println("Row count:" + beforeCount);
			hosDocDAOImpl.deleteDoctorDetails(hosDocCenter);
			System.out.println("After delete");
			rs = st.executeQuery("SELECT * FROM doctor");
			while (rs.next()) {
				afterCount++;
			}
			System.out.println("Row count:" + afterCount);
		} catch (Exception e) {
			e.printStackTrace();
		}
		assertNotEquals(beforeCount, afterCount);
	}

	@Test
	void testGetDoctorDetails() {
		List<HospitalManagementDoctorCenter> doctorsList = new ArrayList<>();
		doctorsList = hosDocDAOImpl.getDoctorDetails(hosDocCenter);
		assertNotNull(doctorsList);
	}

	@Test
	void testGetParticularDoctorDetails() {
		List<HospitalManagementDoctorCenter> doctorList = new ArrayList<>();
		doctorList = hosDocDAOImpl.getParticularDoctorDetails(hosDocCenter);
		assertNotNull(doctorList);
	}

}
