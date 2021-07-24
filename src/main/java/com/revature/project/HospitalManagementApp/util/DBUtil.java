package com.revature.project.HospitalManagementApp.util;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class DBUtil {
	public static Connection getConnection() throws IOException, SQLException {
			FileInputStream fileStream = new FileInputStream("C:\\Users\\RamkumarC\\Documents\\workspace-spring-tool-suite-4-4.11.0.RELEASE\\HospitalManagementApp\\src\\main\\java\\jdbc.properties");
			Properties properties = new Properties();
			properties.load(fileStream);
			String url = properties.getProperty("url");
			String userName = properties.getProperty("username");
			String passWord = properties.getProperty("password");
			Connection con = DriverManager.getConnection(url, userName, passWord);
			return con;
	}

}
