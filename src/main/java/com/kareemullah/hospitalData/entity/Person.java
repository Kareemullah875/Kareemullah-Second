package com.kareemullah.hospitalData.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name="person_info")
public class Person implements Serializable
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	private String name;
	
	private String email;
	
	private String age;
	
	private String address;
	
	@ManyToMany(cascade = CascadeType.ALL)
	@JoinColumn
	private List<Doctor> doctor;
	
	@OneToOne(cascade = CascadeType.ALL,mappedBy = "person")
	private MedicalHistory history;

	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Person(Integer id, String name, String email, String age, String address, List<Doctor> doctor,
			MedicalHistory history) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.age = age;
		this.address = address;
		this.doctor = doctor;
		this.history = history;
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

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public List<Doctor> getDoctor() {
		return doctor;
	}

	public void setDoctor(List<Doctor> doctor) {
		this.doctor = doctor;
	}

	public MedicalHistory getHistory() {
		return history;
	}

	public void setHistory(MedicalHistory history) {
		this.history = history;
	}

		
}
