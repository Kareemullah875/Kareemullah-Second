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
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "medical_observation_info")
public class MedicalObservation implements Serializable
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	private String encounter;
	
	@OneToMany(cascade = CascadeType.ALL,mappedBy = "medicalObservation")
	private List<Doctor> doctors;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "medical_id")
//	@Column(nullable = false)
	private MedicalHistory history;

	public MedicalObservation(Integer id, String encounter, List<Doctor> doctors, MedicalHistory history) {
		super();
		this.id = id;
		this.encounter = encounter;
		this.doctors = doctors;
		this.history = history;
	}

	public MedicalObservation() {
		super();
		// TODO Auto-generated constructor stub
	}



	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getEncounter() {
		return encounter;
	}

	public void setEncounter(String encounter) {
		this.encounter = encounter;
	}

	public List<Doctor> getDoctors() {
		return doctors;
	}

	public void setDoctors(List<Doctor> doctors) {
		this.doctors = doctors;
	}

	public MedicalHistory getHistory() {
		return history;
	}

	public void setHistory(MedicalHistory history) {
		this.history = history;
	}
	

}
