package com.cognizant.ormlearn.model;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="question")
public class Quistion {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "qt_id")
	private int id;
	@Column(name="qt_text")
	private String text;
	@OneToMany(mappedBy="question", fetch=FetchType.EAGER)
	private Set<Options> optionsList;
	@OneToMany(mappedBy="question")
	Set<AttemptQuistion> attemptQuistionsList;
	
	@Override
	public String toString() {
		return "Question [id=" + id + ", text=" + text + "]";
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	public Set<Options> getOptionsList() {
		return optionsList;
	}
	public void setOptionsList(Set<Options> optionsList) {
		this.optionsList = optionsList;
	}
	public Set<AttemptQuistion> getAttemptQuestionsList() {
		return attemptQuistionsList;
	}
	public void setAttemptQuestionsList(Set<AttemptQuistion> attemptQuestionsList) {
		this.attemptQuistionsList = attemptQuestionsList;
	}

}
