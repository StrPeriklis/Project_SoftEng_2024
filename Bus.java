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
	
	private String arithmos_kykloforias;
	private String etos_kykloforias;
	private Integer kyvika;
	private Integer xoritikotita;
	private String marka;
	private String model;
    private float lat;
    private float lng;
