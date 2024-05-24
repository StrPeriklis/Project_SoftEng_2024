package com.example.omnibus;

import java.sql.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity

public class BusDriver {
	@Id
	  @GeneratedValue(strategy=GenerationType.AUTO)
	private Integer id;

	@ManyToOne
	  @JoinColumn(name = "bid", referencedColumnName = "id")
	private Bus B;
	@ManyToOne
	  @JoinColumn(name = "did", referencedColumnName = "id")
	private Driver D;
	private Date dt;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Bus getB() {
		return B;
	}
