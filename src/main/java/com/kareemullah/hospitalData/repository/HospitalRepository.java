package com.kareemullah.hospitalData.repository;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.kareemullah.hospitalData.entity.Doctor;
import com.kareemullah.hospitalData.entity.Person;
import com.kareemullah.hospitalData.util.SessionFactoryUtil;

public class HospitalRepository
{
	public void save(List<Doctor> doctor)
	{
		SessionFactory sessionFactory = SessionFactoryUtil.getSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		
		doctor.forEach(e-> {
			
			List<Person> p=e.getPerson();
			p.forEach(e2->{
			e2.setDoctor(doctor);
		});
			session.save(e);
		});
		
		
		transaction.commit();
	}

}
