package com.revature.project.hospitalmanagement;

import static com.revature.project.hospitalmanagement.dao.HospitalManagementPatientDAOImpl.*;
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

import com.revature.project.hospitalmanagement.client.HospitalManagementPatientApplication;
import com.revature.project.hospitalmanagement.controller.HospitalManagementPatientController;
import com.revature.project.hospitalmanagement.model.HospitalManagementDoctorCenter;
import com.revature.project.hospitalmanagement.model.HospitalManagementPatientCenter;
import com.revature.project.hospitalmanagement.dao.HospitalManagementPatientDAOImpl;
import com.revature.project.hospitalmanagement.util.DBUtil;

class HospitalManagementPatientDAOTest {
	static HospitalManagementPatientController hosPatientController = new HospitalManagementPatientController();
	static HospitalManagementPatientCenter hosPatientCenter = new HospitalManagementPatientCenter();
	static HospitalManagementPatientApplication hosPatientApp = new HospitalManagementPatientApplication();
	HospitalManagementPatientDAOImpl hosPatientDAOImpl;
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	@BeforeEach
	void setUp() throws Exception {
		hosPatientDAOImpl = new HospitalManagementPatientDAOImpl();
	}

	@AfterEach
	void tearDown() throws Exception {
		hosPatientDAOImpl = null;
	}

	@Test
	void testGetPatientId() {
		// fail("Not yet implemented");
		long beforeCount = 0;
		long afterCount = 0;
		try {
			Connection con = DBUtil.getConnection();
			Statement st = con.createStatement();
			ResultSet rs = null;
			rs = st.executeQuery("Select PId from patient");
			while (rs.next()) {
				beforeCount++;
			}
			hosPatientDAOImpl.getPatientId();
			afterCount = patientIdList.size();
		} catch (Exception e) {
			e.printStackTrace();
		}
		assertEquals(beforeCount, afterCount);
	}

	@Test
	void testAddPatientDetails() {
		long beforeCount = 0;
		long afterCount = 0;
		try {
			Connection con = DBUtil.getConnection();
			Statement st = con.createStatement();
			ResultSet rs = null;
			System.out.println("Before delete");
			rs = st.executeQuery("SELECT * FROM patient");
			while (rs.next()) {
				beforeCount++;
			}
			System.out.println("Row count:" + beforeCount);
			hosPatientApp.insertPatient();
			System.out.println("After delete");
			rs = st.executeQuery("SELECT * FROM patient");
			while (rs.next()) {
				afterCount++;
			}
			System.out.println("Row count:" + afterCount);
		} catch (Exception e) {
			e.printStackTrace();
		}
		assertNotSame(beforeCount, afterCount);
	}

	void testUpdatePatientDetails() throws NumberFormatException, IOException {
		List<HospitalManagementPatientCenter> beforeUpdateList = new ArrayList<>();
		List<HospitalManagementPatientCenter> afterUpdateList = new ArrayList<>();
		System.out.println("Enter the update id:");
		Integer updatePatientId = Integer.parseInt(br.readLine());
		try {
			Connection con = DBUtil.getConnection();
			PreparedStatement pst = con.prepareStatement("SELECT * FROM patient WHERE PId=?");
			pst.setInt(1, updatePatientId);
			ResultSet rs = pst.executeQuery();
			while (rs.next()) {
				beforeUpdateList.add(new HospitalManagementPatientCenter(rs.getInt(1), rs.getString(2), rs.getString(3),
						rs.getInt(4), rs.getString(5), rs.getString(6), rs.getLong(7), rs.getInt(8)));
			}
			System.out.println(beforeUpdateList);
			hosPatientDAOImpl.updatePatientDetails(hosPatientCenter);
			ResultSet resultSet = pst.executeQuery();
			while (resultSet.next()) {
				afterUpdateList.add(new HospitalManagementPatientCenter(resultSet.getInt(1), resultSet.getString(2),
						resultSet.getString(3), resultSet.getInt(4), resultSet.getString(5), resultSet.getString(6),
						resultSet.getLong(7), resultSet.getInt(8)));
			}
			System.out.println(afterUpdateList);
		} catch (Exception e) {
			e.printStackTrace();
		}
		assertFalse(Arrays.equals(beforeUpdateList.toArray(), afterUpdateList.toArray()));
	}

	@Test
	void testDeletePatientDetails() {
		// fail("Not yet implemented");
		long beforeCount = 0;
		long afterCount = 0;
		try {
			Connection con = DBUtil.getConnection();
			Statement st = con.createStatement();
			ResultSet rs = null;
			System.out.println("Before delete");
			rs = st.executeQuery("SELECT * FROM patient");
			while (rs.next()) {
				beforeCount++;
			}
			System.out.println("Row count:" + beforeCount);
			hosPatientDAOImpl.deletePatientDetails(hosPatientCenter);
			System.out.println("After delete");
			rs = st.executeQuery("SELECT * FROM patient");
			while (rs.next()) {
				afterCount++;
			}
			System.out.println("Row count:" + afterCount);
		} catch (Exception e) {
			e.printStackTrace();
		}
		assertNotSame(beforeCount, afterCount);
	}

	@Test
	void testGetPatientDetails() {
		List<HospitalManagementPatientCenter> patientsList = new ArrayList<>();
		patientsList = hosPatientDAOImpl.getPatientDetails(hosPatientCenter);
		assertNotNull(patientsList);
	}

	@Test
	void testGetPatientReport() {
		fail("Not yet implemented");
	}

	@Test
	void testGetParticularPatientDetails() {
		List<HospitalManagementPatientCenter> patientList = new ArrayList<>();
		patientList = hosPatientDAOImpl.getParticularPatientDetails(hosPatientCenter);
		assertNotNull(patientList);
	}

}
