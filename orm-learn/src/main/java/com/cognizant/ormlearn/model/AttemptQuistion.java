package com.cognizant.ormlearn.model;

import java.util.Set;

import javax.persistence.*;

@Entity
@Table(name="attempt_quistion")
public class AttemptQuistion {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "aq_id")
	private int id;
	@ManyToOne
	@JoinColumn(name = "aq_at_id")
	private Attempt attempt;
	@ManyToOne
	@JoinColumn(name = "aq_qt_id")
	private Quistion quistion;
	@OneToMany(mappedBy = "attemptQuistion", fetch = FetchType.EAGER)
	Set<AttemptOption> attemptOptionList;
	
	public AttemptQuistion(int id, Attempt attempt, Quistion quistion) {
		super();
		this.id = id;
		this.attempt = attempt;
		this.quistion = quistion;
	}
	public AttemptQuistion() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Attempt getAttempt() {
		return attempt;
	}
	public void setAttempt(Attempt attempt) {
		this.attempt = attempt;
	}
	public Quistion getQuistion() {
		return quistion;
	}
	public void setQuistion(Quistion quistion) {
		this.quistion = quistion;
	}
	@Override
	public String toString() {
		return "AttemptQuistion [id=" + id + ", attempt=" + attempt + ", quistion=" + quistion + "]";
	}
	public Set<AttemptOption> getAttemptOption() {
		return attemptOptionList;
	}
	public void setAttemptOption(Set<AttemptOption> attemptOption) {
		this.attemptOptionList = attemptOption;
	}
	
	
	
}
