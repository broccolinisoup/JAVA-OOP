package com.broccolinisoup.oop.Abstraction;

public class Violin extends MusicalInstrument{
	
	public Violin(String name, String description){
		this.name = name;
		this.description = description;
		
	}
	@Override
		protected String play() {
			return "giy giy giy giiiiyyyyyyy";
		
	}

}
