package com.example.omnibus;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Bus {
	@Id
	  @GeneratedValue(strategy=GenerationType.AUTO)
	private Integer id;
