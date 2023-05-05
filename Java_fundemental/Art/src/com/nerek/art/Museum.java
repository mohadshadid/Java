package com.nerek.art;

import java.util.ArrayList;

public class Museum {
	private ArrayList<Art> arts = new ArrayList<Art> ();
	public void addToMuseum(Art art) {
		arts.add(art);
	}
	public ArrayList<Art> getArts() {
		return arts;
	}
}
