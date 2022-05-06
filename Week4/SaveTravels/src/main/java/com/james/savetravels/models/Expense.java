package com.james.savetravels.models;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.persistence.Table;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name="expenses")

public class Expense {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
	@NotBlank
	@Size(min=2, max=200, message="Name must be at least 2 characters.")
    private String name;
	
	@NotBlank
	@Size(min=2, max=200, message="Vendor must be at least 2 characters.")
    private String vendor;
	
	@NotNull
	@Min(value = 1, message="Cost must be more than $0")
	private Double cost;
	
	@NotBlank
	@Size(min=2, max=200, message="Description must be at least 2 characters" )
	private String description;
	
	public Expense() {}
	
	public Expense(String name, String vendor, Double cost, String description) {
		this.name = name;
		this.vendor = vendor;
		this.cost = cost;
		this.description = description;	

	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getVendor() {
		return vendor;
	}

	public void setVendor(String vendor) {
		this.vendor = vendor;
	}

	public Double getCost() {
		return cost;
	}

	public void setCost(Double cost) {
		this.cost = cost;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	
	
	
}