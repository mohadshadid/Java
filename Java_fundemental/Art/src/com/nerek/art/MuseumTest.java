package com.nerek.art;

import java.util.ArrayList;

public class MuseumTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Painting monalisa = new Painting("Monalisa","Leonardo da Vinci","The Mona Lisa bears a strong resemblance to many Renaissance depictions of the Virgin Mary, who was at that time seen as an ideal for womanhood.","Oil");
		Painting theScream= new Painting("The Scream","Edvard Munch","I sensed a scream passing through nature; it seemed to me that I heard the scream. I painted this picture, painted the clouds as actual blood. The color shrieked. This became The Scream","Oil And Crayon");
		Painting creationOfAdam = new Painting("The Creation of Adam","Michelangelo","The Creation of Adam (Italian: Creazione di Adamo) is a fresco painting by Italian artist Michelangelo, which forms part of the Sistine Chapel's ceiling","Fresco");
		Sculpture theThinker = new Sculpture("Auguste Rodin","Auguste Rodin","The Thinker (French: Le Penseur) is a bronze sculpture by Auguste Rodin, usually placed on a stone pedestal.","Bronze");
		Sculpture midosa = new Sculpture("Perseus with the Head of Medusa","Benvenuto Cellini","The sculpture stands on a square base which has bronze relief panels depicting the story of Perseus and Andromeda, similar to a predella on an altarpiece.","Bronze");
		Museum Louvre=new Museum();
		Louvre.addToMuseum(monalisa);
		Louvre.addToMuseum(theScream);
		Louvre.addToMuseum(creationOfAdam);
		Louvre.addToMuseum(theThinker);
		Louvre.addToMuseum(midosa);

		for(Art art:Louvre.getArts()) {
			art.viewArt();
			System.out.println("-----------------------------------");
		}
	}

}
