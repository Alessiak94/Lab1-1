package it.polito.tdp.alien;

public class Esempio {

	public static void main(String[] args) {

		/*Word a= new Word("alieno1","italiano");
		Word b= new Word("alieno2","inglese");
		Word c= new Word("alieno3","francese");
		Word d= new Word("alieno4","tedesco");
		Word e= new Word("alieno5","russo");
		*/
		AlienDictionary alieno= new AlienDictionary();
		alieno.addWord("alieno1", "italiano");
		alieno.addWord("alieno2", "inglese");
		alieno.addWord("alieno1", "francese");
		alieno.addWord("alieno4", "tedesco");
		
		System.out.println(alieno);

		
	}

}
