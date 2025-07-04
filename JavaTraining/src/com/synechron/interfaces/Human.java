package com.synechron.interfaces;

import com.synechron.basics.Person;

public class Human extends Person implements SpeakMultipleLanguage, Tall {
	@Override
	public void above6Feet() {
		System.out.println("yesh");
	}

	@Override
	public void canSpeakEnglish() {
		System.out.println("Yes");

	}

	@Override
	public void canSpeakFrench(String y) {
		System.out.println("French " + y);

	}

	@Override
	public void canSpeakRegionalLanguage(String language) {
		System.out.println("Can speak " + language);
		
	}
	
	public static void main(String[] args) {
		Human hm = new Human();
		hm.name = "aravind";
		hm.canSpeakRegionalLanguage("Kannada");
		System.out.println(hm);
	}
}
