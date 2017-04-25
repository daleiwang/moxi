package com.moxi.model;

import java.sql.Date;

public class NewsCategory {

	private long id;
	private String name;
	private String description;
	private String image;
	private Date addDate;
	private int state;

	@Override
	public String toString() {
		return "NewsCategory [id=" + id + ", name=" + name + ", description=" + description + ", image=" + image
				+ ", addDate=" + addDate + ", state=" + state + "]";
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public Date getAddDate() {
		return addDate;
	}

	public void setAddDate(Date addDate) {
		this.addDate = addDate;
	}

	public int getState() {
		return state;
	}

	public void setState(int state) {
		this.state = state;
	}

}
