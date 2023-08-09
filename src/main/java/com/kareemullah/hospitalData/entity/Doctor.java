package com.kareemullah.hospitalData.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name = "doctor_info")
public class Doctor 
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	private String name;
	
	private String email;
	
	private String specialization;
	
	private boolean availibility;
	
	@ManyToMany(cascade = CascadeType.ALL,mappedBy = "doctor")
	private List<Person> person;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="medicalObservation_id")
	private MedicalObservation medicalObservation;

	public Doctor() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Doctor(Integer id, String name, String email, String specialization, boolean availibility,
			List<Person> person) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.specialization = specialization;
		this.availibility = availibility;
		this.person = person;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSpecialization() {
		return specialization;
	}

	public void setSpecialization(String specialization) {
		this.specialization = specialization;
	}

	public boolean isAvailibility() {
		return availibility;
	}

	public void setAvailibility(boolean availibility) {
		this.availibility = availibility;
	}

	public List<Person> getPerson() {
		return person;
	}

	public void setPerson(List<Person> person) {
		this.person = person;
	}

	public MedicalObservation getMedicalObservation() {
		return medicalObservation;
	}

	public void setMedicalObservation(MedicalObservation medicalObservation) {
		this.medicalObservation = medicalObservation;
	}

}
