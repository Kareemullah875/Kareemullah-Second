package com.kareemullah.hospitalData.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "medical_history_info")
public class MedicalHistory implements Serializable
{

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column(name = "patient_name")
	private String patientName;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn
//	@Column(nullable = false)
	private Person person;
	
	@OneToMany(cascade = CascadeType.ALL,mappedBy = "history")
	private List<MedicalObservation> observation;

	public MedicalHistory(Integer id, String patientName, Person person, List<MedicalObservation> observation) {
		super();
		this.id = id;
		this.patientName = patientName;
		this.person = person;
		this.observation = observation;
	}

	public MedicalHistory() {
		super();
		// TODO Auto-generated constructor stub
	}

	

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getPatientName() {
		return patientName;
	}

	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}

	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}

	public List<MedicalObservation> getObservation() {
		return observation;
	}

	public void setObservation(List<MedicalObservation> observation) {
		this.observation = observation;
	}
	
	
	
	

}
