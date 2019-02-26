package com.resource.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "interview")
public class Interview extends BaseModel  {

	
	private String interviewer_name;
	private String interviewie_exp;
	private String interviewie_skills;
	private String interviewie_name;
	private String interview_status ;
	private Date interview_date;
	private String offer_letter_released;
	private Date interviewie_joining_date;
	@ManyToOne
	@JoinColumn(name="demandDetails_id")
	private DemandDetails demandDetails;
	public String getInterviewer_name() {
		return interviewer_name;
	}
	public void setInterviewer_name(String interviewer_name) {
		this.interviewer_name = interviewer_name;
	}
	public String getInterviewie_exp() {
		return interviewie_exp;
	}
	public void setInterviewie_exp(String interviewie_exp) {
		this.interviewie_exp = interviewie_exp;
	}
	public String getInterviewie_skills() {
		return interviewie_skills;
	}
	public void setInterviewie_skills(String interviewie_skills) {
		this.interviewie_skills = interviewie_skills;
	}
	public String getInterviewie_name() {
		return interviewie_name;
	}
	public void setInterviewie_name(String interviewie_name) {
		this.interviewie_name = interviewie_name;
	}
	public String getInterview_status() {
		return interview_status;
	}
	public void setInterview_status(String interview_status) {
		this.interview_status = interview_status;
	}
	public Date getInterview_date() {
		return interview_date;
	}
	public void setInterview_date(Date interview_date) {
		this.interview_date = interview_date;
	}
	public String getOffer_letter_released() {
		return offer_letter_released;
	}
	public void setOffer_letter_released(String offer_letter_released) {
		this.offer_letter_released = offer_letter_released;
	}
	public Date getInterviewie_joining_date() {
		return interviewie_joining_date;
	}
	public void setInterviewie_joining_date(Date interviewie_joining_date) {
		this.interviewie_joining_date = interviewie_joining_date;
	}
	public DemandDetails getDemandDetails() {
		return demandDetails;
	}
	public void setDemandDetails(DemandDetails demandDetails) {
		this.demandDetails = demandDetails;
	}
	public Interview() {
		super();
	}

	
}
