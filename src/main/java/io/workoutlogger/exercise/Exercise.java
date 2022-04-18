package io.workoutlogger.exercise;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import io.workoutlogger.split.Split;

@Entity
public class Exercise {
	
	@Id
	private String id;
	private String name;
	private String description;	
	@ManyToOne
	private Split split;
	
	public Exercise() {
	}
	
	public Exercise(String id, String name, String description, String splitId) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
		this.split = new Split(splitId, "","");
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}

	public Split getSplit() {
		return split;
	}

	public void setSplit(Split split) {
		this.split = split;
	}

	
}


