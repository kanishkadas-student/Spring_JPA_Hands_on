package com.cognizant.ormlearn.model;

import java.util.Set;

import javax.persistence.*;

@Entity
@Table(name="department")
public class Department {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="dp_id")
	private int id;
	
	@Column(name="dp_name")
	private String name;
	
	@OneToMany(mappedBy = "department", fetch = FetchType.EAGER)
	private Set<Employee> employeeList;
		
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
	public Set<Employee> getEmployeeList() {
		return employeeList;
	}

	public void setEmployeeList(Set<Employee> employeeList) {
		this.employeeList = employeeList;
	}
	public Department(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public Department() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Department [id=" + id + ", name=" + name + "]";
	}
	
	
}
