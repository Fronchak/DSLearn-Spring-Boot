package com.fronchak.DSLearn.entities;

import java.io.Serializable;
import java.time.Instant;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "offer")
public class Offer implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String edition;
	
	@Column(name = "start_moment")
	private Instant startMoment;
	
	@Column(name = "end_moment")
	private Instant endMoment;
	
	@ManyToOne
	@JoinColumn(name = "id_course")
	private Course course;
	
	@OneToMany(mappedBy = "offer")
	private Set<Resource> resources = new HashSet<>();
	
	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	public String getEdition() {
		return edition;
	}
	
	public void setEdition(String edition) {
		this.edition = edition;
	}
	
	public Instant getStartMoment() {
		return startMoment;
	}
	
	public void setStartMoment(Instant startMoment) {
		this.startMoment = startMoment;
	}
	
	public Instant getEndMoment() {
		return endMoment;
	}
	
	public void setEndMoment(Instant endMoment) {
		this.endMoment = endMoment;
	}
	
	public Course getCourse() {
		return course;
	}

	public void setCourse(Course course) {
		this.course = course;
	}
	
	public Set<Resource> getResources() {
		return resources;
	}
	
	public void addResource(Resource resource) {
		resources.add(resource);
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
		Offer other = (Offer) obj;
		return Objects.equals(id, other.id);
	}
}
