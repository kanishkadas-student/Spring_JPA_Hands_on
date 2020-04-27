package com.cognizant.ormlearn.model;

import java.util.Set;

import javax.persistence.*;

@Entity
@Table(name="user")
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="us_id")
	private int id;
	@Column(name="us_name")
	private String name;
	@Column(name="us_email")
	private String email;
	
	@OneToMany(mappedBy = "user")
	private Set<Attempt> attemptList;
	
	
	public User(int id, String name, String email) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
	}
	public User() {
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Set<Attempt> getAttemptList() {
		return attemptList;
	}
	public void setAttemptList(Set<Attempt> attemptList) {
		this.attemptList = attemptList;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", email=" + email + ", attemptList=" + attemptList + "]";
	}
	
	
	
	
}