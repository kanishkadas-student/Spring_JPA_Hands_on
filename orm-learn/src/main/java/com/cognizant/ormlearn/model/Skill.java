package com.cognizant.ormlearn.model;

import java.util.Set;

import javax.persistence.*;

@Entity
@Table(name= "skill")
public class Skill {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="sk_id")
	private int id;
	@Column(name="sk_name")
	private String name;

	public Skill(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
	@ManyToMany(mappedBy = "skillList")
	private Set<Employee> employeeList;
	
	public Skill() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Skill [id=" + id + ", name=" + name + "]";
	}
	
	public Set<Employee> getEmployeeList() {
		return employeeList;
	}

	public void setEmployeeList(Set<Employee> employeeList) {
		this.employeeList = employeeList;
	}

}
