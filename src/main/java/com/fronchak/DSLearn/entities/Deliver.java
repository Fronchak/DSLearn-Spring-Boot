package com.fronchak.DSLearn.entities;

import java.time.Instant;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fronchak.DSLearn.entities.enums.DeliverStatus;

@Entity
@Table(name = "deliver")
public class Deliver {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String uri;
	
	@Column(columnDefinition = "TIMESTAMP WITHOUT TIME ZONE")
	private Instant moment;
	private Integer status;
	private String feedback;
	
	@Column(name = "correct_count")
	private Integer correctCount;
	
	@ManyToOne
	@JoinColumns({
		@JoinColumn(name = "id_user", referencedColumnName = "id_user"),
		@JoinColumn(name = "id_offer", referencedColumnName = "id_offer")
	})
	private Enrollment enrollment;
	
	@ManyToOne
	@JoinColumn(name = "id_lesson")
	private Lesson lesson;
	
	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	public String getUri() {
		return uri;
	}
	
	public void setUri(String uri) {
		this.uri = uri;
	}
	
	public Instant getMoment() {
		return moment;
	}
	
	public void setMoment(Instant moment) {
		this.moment = moment;
	}
	
	public Integer getStatus() {
		return status;
	}
	
	public void setStatus(Integer status) {
		this.status = status;
	}
	
	public String getFeedback() {
		return feedback;
	}
	
	public void setFeedback(String feedback) {
		this.feedback = feedback;
	}
	
	public Integer getCorrectCount() {
		return correctCount;
	}
	
	public void setCorrectCount(Integer correctCount) {
		this.correctCount = correctCount;
	}
	
	public Enrollment getEnrollment() {
		return enrollment;
	}

	public void setEnrollment(Enrollment enrollment) {
		this.enrollment = enrollment;
	}
	
	public Lesson getLesson() {
		return lesson;
	}

	public void setLesson(Lesson lesson) {
		this.lesson = lesson;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(id);
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Deliver other = (Deliver) obj;
		return Objects.equals(id, other.id);
	}
	
	public void setStatus(DeliverStatus status) {
		this.status = status.getCode();
	}
	
	public DeliverStatus getDeliverStatus() {
		return DeliverStatus.toEnum(status);
	}
}
