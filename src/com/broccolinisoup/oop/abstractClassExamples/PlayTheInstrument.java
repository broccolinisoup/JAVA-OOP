package com.broccolinisoup.oop.abstractClassExamples;

public class PlayTheInstrument {

	public static void main(String[] args) {
		Guitar guitar = new Guitar("Fender","For Perfectionists");
		Violin violin = new Violin("Stentor", "For experts");
		Musician guitarist = new Musician("Jim Morrison", guitar);
		Musician violinist = new Musician("Joshua Bell", violin);
		
		
		System.out.println("Jim Morrison is at the stage!!!"+ guitarist.instrument.play());
		System.out.println("Joshua Bell is at the stage!!!" + violinist.instrument.play());
		
		
		
		
		

	}

}
