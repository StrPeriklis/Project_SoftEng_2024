package com.example.omnibus;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Driver {
	@Id
	  @GeneratedValue(strategy=GenerationType.AUTO)
	private Integer id;
	
