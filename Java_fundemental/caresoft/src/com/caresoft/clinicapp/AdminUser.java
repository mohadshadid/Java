package com.caresoft.clinicapp;

import java.util.ArrayList;
import java.util.Date;

import javax.swing.text.Highlighter.Highlight;
import javax.swing.text.Highlighter.HighlightPainter;

public class AdminUser extends User implements HIPAACompliantUser, HIPAACompliantAdmin, Highlight {
	private Integer employeeID;
    private String role;
    private ArrayList<String> securityIncidents=new ArrayList<String>();
    public AdminUser(Integer id,String role) {
		// TODO Auto-generated constructor stub
    	super(id);
    	this.role=role;
    	this.employeeID=this.id;
    	
	}
	@Override
	public int getStartOffset() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getEndOffset() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public HighlightPainter getPainter() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<String> reportSecurityIncidents() {
		// TODO Auto-generated method stub
			
		return securityIncidents;
	}

	@Override
	public boolean assignPin(int pin) {
		// TODO Auto-generated method stub
		int temp=pin;
		int digits=0;
		while(temp>1) {
			temp/=10;
			digits++;
		}
		if (digits>=6) {
			this.setPin(pin);
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public boolean accessAuthorized(Integer confirmedAuthID) {
		// TODO Auto-generated method stub
		if(this.id==confirmedAuthID) {
			return true;
		}
		
		else {
			this.authIncident();
			return false;
			
		}
		}
    // TO DO: Implement a constructor that takes an ID and a role
    // TO DO: Implement HIPAACompliantUser!
    // TO DO: Implement HIPAACompliantAdmin!
    
    public void newIncident(String notes) {
        String report = String.format(
            "Datetime Submitted: %s \n,  Reported By ID: %s\n Notes: %s \n", 
            new Date(), this.id, notes
        );
        securityIncidents.add(report);
    }
    public void authIncident() {
        String report = String.format(
            "Datetime Submitted: %s \n,  ID: %s\n Notes: %s \n", 
            new Date(), this.id, "AUTHORIZATION ATTEMPT FAILED FOR THIS USER"
        );
        securityIncidents.add(report);
    }
    
    // TO DO: Setters & Getters

}
