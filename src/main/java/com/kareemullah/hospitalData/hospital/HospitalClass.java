package com.kareemullah.hospitalData.hospital;

import java.util.ArrayList;
import java.util.List;

import com.kareemullah.hospitalData.entity.Doctor;
import com.kareemullah.hospitalData.entity.MedicalHistory;
import com.kareemullah.hospitalData.entity.MedicalObservation;
import com.kareemullah.hospitalData.entity.Person;
import com.kareemullah.hospitalData.repository.HospitalRepository;

public class HospitalClass {

	
	
	

	public static void main(String[] args) 
	{
		Person person = new Person();
		person.setName("legain");
		person.setEmail("l@12gmail.com");
		person.setAge("22");
		person.setAddress("Bangalore");
	//	person.setHistory(history);
	//	person.setDoctor(doctorlist);
		
		Person person1 = new Person();
		person1.setName("Ronaldo");
		person1.setEmail("ron11@gmail.com");
		person1.setAge("30");
		person1.setAddress("UAE");
	//	person.setHistory(history);
	//	person.setDoctor(doctorlist);
		
		
		ArrayList<Person> listperson = new ArrayList<Person>();
		listperson.add(person);
		listperson.add(person1);
		
		
		
		
		Doctor doctor = new Doctor();
		doctor.setName("cardio");
		doctor.setEmail("cardio@1gmail.com");
		doctor.setAvailibility(true);
		doctor.setSpecialization("Cardialogy");
	//	doctor.setPerson(listperson);
		
		Doctor doctor1 = new Doctor();
		doctor1.setName("ortho");
		doctor1.setEmail("ortho@1gmail.com");
		doctor1.setAvailibility(true);
		doctor1.setSpecialization("Orthopedic");
	//	doctor1.setPerson(listperson);
		
		
		
		MedicalHistory history = new MedicalHistory();
		history.setPatientName("legain");
		history.setPerson(person);
		person.setHistory(history);
	//	history.setObservation(null);
		
		MedicalObservation observation = new MedicalObservation();
		observation.setEncounter("Good");
	//	observation.setHistory(history);
	//	observation.setDoctors(doctorlist);
		
		MedicalObservation observation1 = new MedicalObservation();
		observation1.setEncounter("discharge");
	//	observation1.setHistory(history);
	//	observation1.setDoctors(doctorlist);
		
		ArrayList<MedicalObservation> MOlist = new ArrayList<MedicalObservation>();
		MOlist.add(observation);
		MOlist.add(observation1);
		
		history.setObservation(MOlist);
		
		observation.setHistory(history);
		observation1.setHistory(history);
		
		
		 List<Doctor> doctorlist = new ArrayList<Doctor>();
		 doctor.setPerson(listperson);
		 doctor1.setPerson(listperson);
		 doctorlist.add(doctor);
		 doctorlist.add(doctor1);
		
		 observation.setDoctors(doctorlist);
		 
		 
		 doctor.setMedicalObservation(observation1);
		 doctor1.setMedicalObservation(observation1);
		 
		 
		 
		
		
		HospitalRepository repository = new HospitalRepository();
		repository.save(doctorlist);

//bean means if any object is created in a ioc or spring container.
//if  two classes  are implementing from same interface we  are use of Qualifier or primary annotations

	}

}
