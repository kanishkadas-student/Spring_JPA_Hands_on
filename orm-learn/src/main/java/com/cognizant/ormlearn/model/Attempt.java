package com.cognizant.ormlearn.model;

import java.util.Date;
import java.util.Set;

import javax.persistence.*;

@Entity
@Table(name="attempt")
public class Attempt {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="at_id")
	private int id;
	@Column(name="at_date")
	private Date date;
	@Column(name="at_score", nullable=true)
	private double score;
	@ManyToOne
	@JoinColumn(name="at_us_id")
	private User user;
	@OneToMany(mappedBy = "attempt", fetch = FetchType.EAGER)
	private Set<AttemptQuistion> attemptQuistionList;
	
	public Attempt(int id, Date date, double score) {
		super();
		this.id = id;
		this.date = date;
		this.score = score;
	}
	public Attempt() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public double getScore() {
		return score;
	}
	public void setScore(double score) {
		this.score = score;
	}
	@Override
	public String toString() {
		return "Attempt [id=" + id + ", date=" + date + ", score=" + score + "]";
	}
	public Set<AttemptQuistion> getAttemptQuistionList() {
		return attemptQuistionList;
	}
	public void setAttemptQuistionList(Set<AttemptQuistion> attemptQuistionList) {
		this.attemptQuistionList = attemptQuistionList;
	}
	
	
	
	
}
