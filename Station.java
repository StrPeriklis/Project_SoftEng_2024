package com.example.omnibus;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Station {
	@Id

	  @GeneratedValue(strategy=GenerationType.AUTO)
	private Integer id;
	private String title;
	private float lat;
	private float lng;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
