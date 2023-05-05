package com.nerek.art;

public class Sculpture extends Art {
	protected String material;
	void  viewArt() {
		System.out.print("Title :");
		System.out.println(this.title);
		System.out.print("Author :");
		System.out.println(this.author);
		System.out.print("Description :");
		System.out.println(this.description);
		System.out.print("Material :");
		System.out.println(this.material);

	}
	public Sculpture(String title,String author,String description,String material) {
		// TODO Auto-generated constructor stub
		this.title = title;
		this.author = author;
		this.description = description;
		this.material = material;
		
	}
}
