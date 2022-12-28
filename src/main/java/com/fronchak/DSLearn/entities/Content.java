package com.fronchak.DSLearn.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "content")
public class Content extends Lesson {

	private static final long serialVersionUID = 1L;
	
	@Column(name = "text_content")
	private String textContent;
	
	@Column(name = "video_uri")
	private String videoUri;
	
	public String getTextContent() {
		return textContent;
	}
	
	public void setTextContent(String textContent) {
		this.textContent = textContent;
	}
	
	public String getVideoUri() {
		return videoUri;
	}
	
	public void setVideoUri(String videoUri) {
		this.videoUri = videoUri;
	}
	
	
}
