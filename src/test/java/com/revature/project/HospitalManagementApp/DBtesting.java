package com.revature.project.HospitalManagementApp;

import static org.junit.jupiter.api.Assertions.*;

import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.revature.project.HospitalManagementApp.util.DBUtil;

class DBtesting {
	DBUtil dbUtil;
	@BeforeEach
	void setUp() throws Exception {
		dbUtil=new DBUtil();
	}

	@AfterEach
	void tearDown() throws Exception {
		dbUtil=null;
	}

	@Test
	void testGetConnection() throws IOException, SQLException {
		//fail("Not yet implemented");
		Connection con=dbUtil.getConnection();
		System.out.println(con);
	}

}
