package it.polito.tdp.alien;
import java.util.*;
public class AlienDictionary {
	
	private List<WordEnhanced> dizionario;
	
	public AlienDictionary (){
		dizionario= new LinkedList<WordEnhanced>();
	}

	public void	addWord	(String	alienWord,String translation){
		WordEnhanced d= new WordEnhanced(alienWord.toLowerCase());
		d.addWord(translation);
		/*if(dizionario.contains(d)==true)
			dizionario.remove(d);
		dizionario.add(d);*/
		boolean a=true;
			
		for(int i=0;i<dizionario.size();i++){
			if(dizionario.get(i).getParola().compareTo(alienWord)==0)
				{dizionario.get(i).addWord(translation.toLowerCase());
				a=false;}
		}
		if (a==true)
			dizionario.add(d);
	}
	public String translateWord(String alienWord){
		String tot="";
		for(int i=0;i<dizionario.size();i++)
			if(dizionario.get(i).getParola().compareTo(alienWord.toLowerCase())==0){
				for( int j=0;j<dizionario.get(i).getTraduzioni().size();j++)
					tot+=""+dizionario.get(i).getTraduzioni().get(j)+"\n";
				}
		
		return tot;
	}

	public void rimuoviTutto(){
		dizionario.clear();
	}
	
	public List<String> cercaParola(String parola){
		List<String> l= new LinkedList<String>();
		int i=parola.indexOf("?");
		String[] a={"a","b","c","d","e","f","g","h", "i","l","m","n","o","p","q","r","s","t","u","v","w","x","z","y","j","k"};
		for(int j=0;j<dizionario.size();j++)
			for(int k=0;k<a.length;k++)
				if(dizionario.get(j).getParola().compareTo(""+parola.substring(0,i)+a[k]+parola.substring(i+1))==0)
					{l.addAll(dizionario.get(j).getTraduzioni());break;}
		
		return l;
	}
	
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return ""+dizionario;}
	
	
}
