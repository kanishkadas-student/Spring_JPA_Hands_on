package com.cognizant.ormlearn.model;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="options")
public class Options {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "op_id")
	int id;
	@ManyToOne()
	@JoinColumn(name="op_qt_id")
	private Quistion quistion;
	@Column(name="op_score")
	private double score;
	@Column(name="op_text")
	private String text;
	@OneToMany(mappedBy="options")
	private Set<AttemptOption> attemptOptionsList;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Quistion getQuestion() {
		return quistion;
	}
	public void setQuestion(Quistion quistion) {
		this.quistion = quistion;
	}
	public double getScore() {
		return score;
	}
	public void setScore(double score) {
		this.score = score;
	}
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	public Set<AttemptOption> getAttemptOptionsList() {
		return attemptOptionsList;
	}
	public void setAttemptOptionsList(Set<AttemptOption> attemptOptionsList) {
		this.attemptOptionsList = attemptOptionsList;
	}
	@Override
	public String toString() {
		return "Options [id=" + id + ", question=" + quistion + ", score=" + score + ", text=" + text + "]";
	}
	
}
