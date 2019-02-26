package com.resource.model;

import java.util.Date;
import java.util.List;
import com.resource.model.resource_details;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
@Entity
public class TrainningDetails extends BaseModel {
	
	private Date planned_start_date;
	private Date planned_end_date;
	private Date actual_start_date;
	private Date actual_end_date;
	
	@ManyToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="resouce_id")
	private resource_details resource;
	@ManyToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="trainningMaster_id")
	private TrainningMaster trainningMaster;
	public resource_details getResource() {
		return resource;
	}
	public void setResource(resource_details resource) {
		this.resource = resource;
	}
	public TrainningMaster getTrainningMaster() {
		return trainningMaster;
	}
	public void setTrainningMaster(TrainningMaster trainningMaster) {
		this.trainningMaster = trainningMaster;
	}
	public Date getPlanned_start_date() {
		return planned_start_date;
	}
	public void setPlanned_start_date(Date planned_start_date) {
		this.planned_start_date = planned_start_date;
	}
	public Date getPlanned_end_date() {
		return planned_end_date;
	}
	public void setPlanned_end_date(Date planned_end_date) {
		this.planned_end_date = planned_end_date;
	}
	public Date getActual_start_date() {
		return actual_start_date;
	}
	public void setActual_start_date(Date actual_start_date) {
		this.actual_start_date = actual_start_date;
	}
	public Date getActual_end_date() {
		return actual_end_date;
	}
	public void setActual_end_date(Date actual_end_date) {
		this.actual_end_date = actual_end_date;
	}
	

}
