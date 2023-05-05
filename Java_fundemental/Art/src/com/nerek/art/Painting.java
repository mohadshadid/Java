package com.nerek.art;

public class Painting extends Art {
	protected String paintType;
	void  viewArt() {
		System.out.print("Title :");
		System.out.println(this.title);
		System.out.print("Author :");
		System.out.println(this.author);
		System.out.print("Description :");
		System.out.println(this.description);
		System.out.print("Paint Type :");
		System.out.println(this.paintType);

	}
	public Painting(String title,String author,String description,String paintType) {
		// TODO Auto-generated constructor stub
		this.title = title;
		this.author = author;
		this.description = description;
		this.paintType = paintType;
		
	}
}
