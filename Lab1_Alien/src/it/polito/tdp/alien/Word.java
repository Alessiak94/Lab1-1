package it.polito.tdp.alien;

import java.util.*;

public class Word {

	private String alienWord;
	private	String translation;
	
	public Word(String a,String t) {
		alienWord=a.toLowerCase();
		translation=t.toLowerCase();

	}
	
	public String compare(String alienWord){
		
		if(alienWord.toLowerCase().compareTo(this.alienWord)==0)
		return translation;
		else return null;
	}

	public String getAlienWord(){
		return alienWord;
	}
	
	
	
	@Override
	public boolean equals(Object obj) {

		Word d=(Word)obj;
		
		if(d.getAlienWord().toLowerCase().compareTo(this.alienWord)==0)
		return true;
		else return false;
	}

	public String getTranslation() {
		return translation;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return ""+alienWord+" "+translation;
	}
	


}
