package com.kareemullah.hospitalData.util;

import java.util.Properties;

public class MysqlConnection 
{
	public static Properties getMysqlDbConnection() 
	{
		Properties properties = new Properties();
		properties.setProperty("Connection.driver_class","com.mysql.cj.jdbc.Driver");
		properties.setProperty("hibernate.connection.url","jdbc:mysql://localhost:3306/hospital_data");
		properties.setProperty("hibernate.connection.username","root");
		properties.setProperty("hibernate.connection.password","root");
		properties.setProperty("hibernate.dialect","org.hibernate.dialect.MySQL8Dialect");
		properties.setProperty("hibernate.show_sql","true");
		properties.setProperty("hibernate.hbm2ddl.auto","update");
		
		
		
		
		return properties;
	}
	

}
