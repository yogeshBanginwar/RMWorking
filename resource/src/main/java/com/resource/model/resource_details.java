package com.resource.model;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table
public class resource_details extends BaseModel {
	private String resource_name;
	private String resource_email;
	private String resource_skills;
	private String resource_status;
	private String resource_allocation_date;
	private String resource_location;
	private String resource_training_status;
	private Date training_start_date;
	private Date training_end_date;
	@OneToMany(fetch=FetchType.LAZY,mappedBy="resource")
	private List<TrainningDetails> trainningDetails;
	
	public resource_details() {
		super();
	}
	
	public String getResource_name() {
		return resource_name;
	}
	public void setResource_name(String resource_name) {
		this.resource_name = resource_name;
	}
	public String getResource_email() {
		return resource_email;
	}
	public void setResource_email(String resource_email) {
		this.resource_email = resource_email;
	}
	public String getResource_skills() {
		return resource_skills;
	}
	public void setResource_skills(String resource_skills) {
		this.resource_skills = resource_skills;
	}
	public String getResource_status() {
		return resource_status;
	}
	public void setResource_status(String resource_status) {
		this.resource_status = resource_status;
	}
	public String getResource_allocation_date() {
		return resource_allocation_date;
	}
	public void setResource_allocation_date(String resource_allocation_date) {
		this.resource_allocation_date = resource_allocation_date;
	}
	public String getResource_location() {
		return resource_location;
	}
	public void setResource_location(String resource_location) {
		this.resource_location = resource_location;
	}
	public String getResource_training_status() {
		return resource_training_status;
	}
	public void setResource_training_status(String resource_training_status) {
		this.resource_training_status = resource_training_status;
	}
	public Date getTraining_start_date() {
		return training_start_date;
	}
	public void setTraining_start_date(Date training_start_date) {
		this.training_start_date = training_start_date;
	}
	public Date getTraining_end_date() {
		return training_end_date;
	}
	public void setTraining_end_date(Date training_end_date) {
		this.training_end_date = training_end_date;
	}

	public List<TrainningDetails> getTrainningDetails() {
		return trainningDetails;
	}

	public void setTrainningDetails(List<TrainningDetails> trainningDetails) {
		this.trainningDetails = trainningDetails;
	}
	

	
	

}
