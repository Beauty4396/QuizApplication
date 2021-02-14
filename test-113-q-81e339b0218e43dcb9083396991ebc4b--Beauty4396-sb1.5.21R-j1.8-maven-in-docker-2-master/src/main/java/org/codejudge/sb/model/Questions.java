package org.codejudge.sb.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table
public class Questions {

	@Id
	private int id;
	private String name;
	private ArrayList<String> options = new ArrayList<>();
	private int correct_option;
	
	@ManyToOne
	private Quiz quiz;
	
	private int points;
	
	

	public Questions() {
		super();
	}

	public Questions(int id, String name, ArrayList<String> options, int correct_option, Quiz quiz, int points) {
		super();
		this.id = id;
		this.name = name;
		this.options = options;
		this.correct_option = correct_option;
		this.quiz = quiz;
		this.points = points;
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

	public ArrayList<String> getOptions() {
		return options;
	}

	public void setOptions(ArrayList<String> options) {
		this.options = options;
	}

	public int getCorrect_option() {
		return correct_option;
	}

	public void setCorrect_option(int correct_option) {
		this.correct_option = correct_option;
	}

	public Quiz getQuiz() {
		return quiz;
	}

	public void setQuiz(Quiz quiz) {
		this.quiz = quiz;
	}

	public int getPoints() {
		return points;
	}

	public void setPoints(int points) {
		this.points = points;
	}

	@Override
	public String toString() {
		return "Questions [id=" + id + ", name=" + name + ", options=" + options + ", correct_option=" + correct_option
				+ ", quiz=" + quiz + ", points=" + points + "]";
	}
	
	
	
}
