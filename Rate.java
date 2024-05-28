package com.example.omnibus;

import java.sql.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Rate {
	@Id
	  @GeneratedValue(strategy=GenerationType.AUTO)
	private Integer id;
private Integer gradebus;
	private Integer gradeDriver;
	private String Comment1;
	private String Comment2;
	private Date dt;
	@ManyToOne
	  @JoinColumn(name = "uid", referencedColumnName = "id")
	private User usr;
	
	@ManyToOne
	  @JoinColumn(name = "did", referencedColumnName = "id")
	
	private Driver drv;
	@ManyToOne
	  @JoinColumn(name = "bid", referencedColumnName = "id")
	
	private Bus b;
	public Integer getId() {
		return id;
