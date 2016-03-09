package it.polito.tdp.alien;
import java.util.*;
public class AlienDictionary {
	
	private List<Word> dizionario;
	
	public AlienDictionary (){
		dizionario= new LinkedList<Word>();
	}

	public void	addWord	(String	alienWord,String translation){
		Word d= new Word(alienWord.toLowerCase(),translation.toLowerCase());
		if(dizionario.contains(d)==true)
			dizionario.remove(d);
		dizionario.add(d);
		
	}
	public String translateWord(String alienWord){
		for(int i=0;i<dizionario.size();i++)
			if(dizionario.get(i).getAlienWord().compareTo(alienWord.toLowerCase())==0)
				return dizionario.get(i).getTranslation();
		
		return null;
	}

	public void rimuoviTutto(){
		dizionario.clear();
	}
	
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return ""+dizionario;}
	
	
}
