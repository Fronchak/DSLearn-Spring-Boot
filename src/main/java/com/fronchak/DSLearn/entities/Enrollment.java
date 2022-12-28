package com.fronchak.DSLearn.entities;

import java.time.Instant;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fronchak.DSLearn.entities.pk.EnrollmentPK;

@Entity
@Table(name = "enrollment")
public class Enrollment {

	@EmbeddedId
	private EnrollmentPK id = new EnrollmentPK();
	
	@Column(name = "enroll_moment", columnDefinition = "TIMESTAMP WITHOUT TIME ZONE")
	private Instant enrollMoment;
	
	@Column(name = "refund_moment", columnDefinition = "TIMESTAMP WITHOUT TIME ZONE")
	private Instant refundMoment;
	private boolean available;
	
	@Column(name = "only_update")
	private boolean onlyUpdate;
	
	@ManyToMany(mappedBy = "enrollmentsDone")
	private Set<Lesson> lessonsDone = new HashSet<>();
	
	@OneToMany(mappedBy = "enrollment")
	private Set<Deliver> deliveries = new HashSet<>();
	
	public Enrollment( ) {}
	
	public Enrollment(User user, Offer offer) {
		id.setUser(user);
		id.setOffer(offer);
	}
	
	public void setId(User user, Offer offer) {
		id.setUser(user);
		id.setOffer(offer);
	}
	
	public User getStudent() {
		return id.getUser();
	}
	
	public void setStudent(User student) {
		id.setUser(student);
	}
	
	public Offer getOffer() {
		return id.getOffer();
	}
	
	public void setOffer(Offer offer) {
		id.setOffer(offer);
	}
 	
	public Instant getEnrollMoment() {
		return enrollMoment;
	}

	public void setEnrollMoment(Instant enrollMoment) {
		this.enrollMoment = enrollMoment;
	}
	
	public Instant getRefundMoment() {
		return refundMoment;
	}
	
	public void setRefundMoment(Instant refundMoment) {
		this.refundMoment = refundMoment;
	}
	
	public boolean isAvailable() {
		return available;
	}
	
	public void setAvailable(boolean available) {
		this.available = available;
	}
	
	public boolean isOnlyUpdate() {
		return onlyUpdate;
	}
	
	public void setOnlyUpdate(boolean onlyUpdate) {
		this.onlyUpdate = onlyUpdate;
	}

	public Set<Lesson> getLessonsDone() {
		return lessonsDone;
	}

	public void addLessonDone(Lesson lessonDone) {
		lessonsDone.add(lessonDone);
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
		Enrollment other = (Enrollment) obj;
		return Objects.equals(id, other.id);
	}	
}
