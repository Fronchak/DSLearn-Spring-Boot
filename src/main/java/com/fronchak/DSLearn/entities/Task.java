package com.fronchak.DSLearn.entities;

import java.time.Instant;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "task")
public class Task extends Lesson {

	private static final long serialVersionUID = 1L;
	
	private String description;
	
	@Column(name = "question_count")
	private Integer questionCount;
	
	@Column(name = "approval_count")
	private Integer approvalCount;
	private Double weight;
	
	@Column(name = "due_date", columnDefinition = "TIMESTAMP WITHOUT TIME ZONE")
	private Instant dueDate;
	
	public String getDescription() {
		return description;
	}
	
	public void setDescription(String description) {
		this.description = description;
	}
	
	public Integer getQuestionCount() {
		return questionCount;
	}
	
	public void setQuestionCount(Integer questionCount) {
		this.questionCount = questionCount;
	}
	
	public Integer getApprovalCount() {
		return approvalCount;
	}
	
	public void setApprovalCount(Integer approvalCount) {
		this.approvalCount = approvalCount;
	}
	
	public Double getWeight() {
		return weight;
	}
	
	public void setWeight(Double weight) {
		this.weight = weight;
	}
	
	public Instant getDueDate() {
		return dueDate;
	}
	
	public void setDueDate(Instant dueDate) {
		this.dueDate = dueDate;
	}
}
