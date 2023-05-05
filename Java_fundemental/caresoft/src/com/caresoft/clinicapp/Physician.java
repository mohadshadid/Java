package com.caresoft.clinicapp;

import java.util.ArrayList;
import java.util.Date;

public class Physician extends User implements HIPAACompliantUser {
	private ArrayList<String> patientNotes=new ArrayList<String>();
	@Override
	public boolean assignPin(int pin) {
		// TODO Auto-generated method stub
		int temp=pin;
		int digits=0;
		while(temp>1) {
			temp/=10;
			digits++;
		}
		if (digits==4) {
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
		
		else return false;
	}
    // TO DO: Constructor that takes an ID

	public Physician(Integer id) {
		// TODO Auto-generated constructor stub
		super(id);
		
	}
    // TO DO: Implement HIPAACompliantUser!
	   public void newPatientNotes(String notes, String patientName, Date date) {
	        String report = String.format(
	            "Datetime Submitted: %s \n", date);
	        report += String.format("Reported By ID: %s\n", this.id);
	        report += String.format("Patient Name: %s\n", patientName);
	        report += String.format("Notes: %s \n", notes);
	        this.patientNotes.add(report);
	    }

}
