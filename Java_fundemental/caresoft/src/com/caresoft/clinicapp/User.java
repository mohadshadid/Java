package com.caresoft.clinicapp;

public class User {
    protected Integer id;
    protected int pin;
    
    // TO DO: Getters and setters
	// Implement a constructor that takes an ID
    public User(Integer id) {
		// TODO Auto-generated constructor stub
    	this.id=id;
    	
	}

    public Integer getId() {
		return id;
	}
    public int getPin() {
		return pin;
	}
    public void setId(Integer id) {
		this.id = id;
	}
    public void setPin(int pin) {
		this.pin = pin;
	}
}
