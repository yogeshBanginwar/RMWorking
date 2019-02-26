package com.resource.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import javax.persistence.Table;
@Entity
@Table
public class TrainningMaster extends BaseModel {
	
private String	training_course_name;
private String	training_code;
private Integer	training_period;
private String	training_cirtification_name;
private boolean	training_cirtification_flag;
@OneToMany( fetch=FetchType.LAZY,mappedBy="trainningMaster")
private List<TrainningDetails> trainningDetails;

	
	public List<TrainningDetails> getTrainningDetails() {
	return trainningDetails;
}





public void setTrainningDetails(List<TrainningDetails> trainningDetails) {
	this.trainningDetails = trainningDetails;
}





	public TrainningMaster() {
		super();
	}


	


	public String getTraining_course_name() {
		return training_course_name;
	}


	public void setTraining_course_name(String training_course_name) {
		this.training_course_name = training_course_name;
	}


	public String getTraining_code() {
		return training_code;
	}


	public void setTraining_code(String training_code) {
		this.training_code = training_code;
	}


	public Integer getTraining_period() {
		return training_period;
	}


	public void setTraining_period(Integer training_period) {
		this.training_period = training_period;
	}


	public String getTraining_cirtification_name() {
		return training_cirtification_name;
	}


	public void setTraining_cirtification_name(String training_cirtification_name) {
		this.training_cirtification_name = training_cirtification_name;
	}


	public boolean isTraining_cirtification_flag() {
		return training_cirtification_flag;
	}


	public void setTraining_cirtification_flag(boolean training_cirtification_flag) {
		this.training_cirtification_flag = training_cirtification_flag;
	}
	

}
