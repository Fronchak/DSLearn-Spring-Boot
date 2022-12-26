package com.fronchak.DSLearn.entities;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "course")
public class Course implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String name;
	
	@Column(name = "img_uri")
	private String imgUri;
	
	@Column(name = "img_gray_uri")
	private String imgGrayUri;
	
	@OneToMany(mappedBy = "course")
	private Set<Offer> offers = new HashSet<>();
	
	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getImgUri() {
		return imgUri;
	}
	
	public void setImgUri(String imgUri) {
		this.imgUri = imgUri;
	}
	
	public String getImgGrayUri() {
		return imgGrayUri;
	}
	
	public void setImgGrayUri(String imgGrayUri) {
		this.imgGrayUri = imgGrayUri;
	}
	
	public Set<Offer> getOffers() {
		return offers;
	}
	
	public void addOffer(Offer offer) {
		offers.add(offer);
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
		Course other = (Course) obj;
		return Objects.equals(id, other.id);
	}
}
