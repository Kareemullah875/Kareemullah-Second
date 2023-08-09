package com.kareemullah.hospitalData.util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.kareemullah.hospitalData.entity.Doctor;
import com.kareemullah.hospitalData.entity.MedicalHistory;
import com.kareemullah.hospitalData.entity.MedicalObservation;
import com.kareemullah.hospitalData.entity.Person;

public class SessionFactoryUtil
{
	private static SessionFactory sessionFactory=null;
	
	public static SessionFactory getSessionFactory() 
	{
		if(sessionFactory==null)
		{
			Configuration cfg = new Configuration();
			cfg.setProperties(MysqlConnection.getMysqlDbConnection());
			cfg.addAnnotatedClass(Person.class);
			cfg.addAnnotatedClass(Doctor.class);
			cfg.addAnnotatedClass(MedicalHistory.class);
			cfg.addAnnotatedClass(MedicalObservation.class);
			sessionFactory =cfg.buildSessionFactory();
		}
		return sessionFactory;
	}

}
