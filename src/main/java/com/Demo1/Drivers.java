package com.Demo1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Required;

public class Drivers {

	private String driver;
	private String url;
	private String username;
	private String password;
	public String getDriver() {
		return driver;
	}
	@Required
	public void setDriver(String driver) {
		this.driver = driver;
	}
	public String getUrl() {
		return url;
	}
	@Required
	public void setUrl(String url) {
		this.url = url;
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
	@Override
	public String toString() {
		return "Drivers [driver=" + driver + ", url=" + url + ", username=" + username + ", password=" + password + "]";
	}
	
	public void show() throws SQLException, ClassNotFoundException {
		
		Class.forName(driver);
		Connection connection=DriverManager.getConnection(url,username,password);
		System.out.println(connection);
	}
	
}
