package com.example.omnibus;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class LineBus {
	@Id
	  @GeneratedValue(strategy=GenerationType.AUTO)
	private Integer id;
	
	@ManyToOne
	  @JoinColumn(name = "lid", referencedColumnName = "id")
	private Line L;
	
	@ManyToOne
	  @JoinColumn(name = "bid", referencedColumnName = "id")
	private Bus B;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Line getL() {
		return L;
	}
	public void setL(Line l) {
		L = l;
	}
	public Bus getB() {
		return B;
	}
	public void setB(Bus b) {
		B = b;
	}
	

}
