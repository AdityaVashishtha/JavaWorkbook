package com.springTest;

import java.sql.Connection;
import java.sql.DriverManager;

import com.mysql.jdbc.Driver;

public class DatabaseConnection {
	private String url;
	private String driver;
	private String username;
	private String password;
	private Connection con;
	
	public DatabaseConnection() {
		super();
	}

	public DatabaseConnection(String url, String driver, String username, String password) {
		super();
		this.url = url;
		this.driver = driver;
		this.username = username;
		this.password = password;
	}

	public Connection getCon() {
		return con;
	}

	public void setCon(Connection con) {
		this.con = con;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getDriver() {
		return driver;
	}

	public void setDriver(String driver) {
		this.driver = driver;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	
	public void start() {
		System.out.println("STARTING CONNECTION");
		try {
			Class.forName(this.driver);
			con = DriverManager.getConnection(url, username, password);
			System.out.println("CONNECTION DONE: "+con);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	public void stop() {
		System.out.println("STOPPING CONNECTION");
		try {
			con.close();
		} catch (Exception e) {			
			e.printStackTrace();
		}		
	}
	
}
