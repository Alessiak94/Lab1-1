package it.polito.tdp.alien;

/**
 * Sample Skeleton for 'Alien.fxml' Controller Class
 */



import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class AlienController {
	
    @FXML
    private ResourceBundle resources;
    @FXML
    private URL location;
    @FXML
    private TextField txtWord;
    @FXML
    private TextArea txtResult;
    @FXML
    private Button btnTranslate;
    @FXML
    private Button btnReset;
    
    private String parolaAliena;
    private AlienDictionary dizionario;
        
    
    @FXML // This method is called by the FXMLLoader when initialization is complete
    void initialize() {
    	assert txtWord != null : "fx:id=\"txtWord\" was not injected: check your FXML file 'Alien.fxml'.";
    	assert txtResult != null : "fx:id=\"txtResult\" was not injected: check your FXML file 'Alien.fxml'.";
    	assert btnTranslate != null : "fx:id=\"bntTranslate\" was not injected: check your FXML file 'Alien.fxml'.";
    	assert btnReset != null : "fx:id=\"btnReset\" was not injected: check your FXML file 'Alien.fxml'.";
    	dizionario= new AlienDictionary();
    }
  
    
    @FXML
    void doTranslate(ActionEvent event) {
    	txtResult.setText("");
    	
    	parolaAliena= txtWord.getText().toLowerCase();
    	if(parolaAliena.contains(" ")){
    		int i= parolaAliena.indexOf(" ");
    		dizionario.addWord(parolaAliena.substring(0, i), parolaAliena.substring(i+1));
    		txtResult.setText(String.format("Aggiunta la parola %s con traduzione %s.", parolaAliena.substring(0, i),parolaAliena.substring(i+1)));
    	}
    	else if(parolaAliena.contains("?")){
    		String tot="";
    		for(int i=0;i<dizionario.cercaParola(parolaAliena).size();i++)
    			tot+=dizionario.cercaParola(parolaAliena).get(i)+"\n";
    		if(tot.compareTo("")==0)
    			txtResult.setText("Nessuna Corrispondenza");
    		else
    		txtResult.setText(""+tot);}
    	else{if(dizionario.translateWord(parolaAliena).compareTo("")!=0)
    		txtResult.setText(""+dizionario.translateWord(parolaAliena));
    	else txtResult.setText("Parola non presente nel dizionario");
    		
    	}
    	
    	    	
    }
    
    
    @FXML
    void doReset(ActionEvent event) {

    	txtResult.setText("");
    	dizionario.rimuoviTutto();
    	
    }
    
}
