package com.broccolinisoup.oop.Abstraction;

public class Guitar extends MusicalInstrument{
	
	
	public Guitar(String name, String description){
		this.name = name;
		this.description = description;	
	}

	@Override
	protected String play() {
		return "din din din din diri din";
		
	}
	
	

}
