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
