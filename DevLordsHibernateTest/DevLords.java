package com.ePassport2Core.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="DEV_LORDS")
public class DevLords {

	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	@Column(name="ID")
    private Long id;
	
	@Column(name="FIRST_NAME")
    private String firstName;
	
	@Column(name="LAST_NAME")
    private String lastName;
    
	public DevLords(){}
	
    public DevLords(String firstName, String lastName) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
	}
    
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
}
