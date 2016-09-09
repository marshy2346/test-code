package cen3031.hostelsolutions.tuesdays;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class AppController {

	
		
	
	    @FXML
	    private Label labelPass;

	    @FXML
	    private Button labelExit;

	    @FXML
	    private Label labelID;

	    @FXML
	    private Button labelLogin;

	    @FXML
	    private TextField userID;

	    @FXML
	    private PasswordField passwordEntry;
	    
	    
	   
	    
	    @FXML 
	    private void handleLoginButtonPressed(ActionEvent event) {
	    	System.exit(0);
	    	String user_id = userID.getText();
	    	String password = passwordEntry.getText();
	    	
	    }
	    
	    @FXML 
	    private void handleExitButtonPressed(ActionEvent event) {
	    	System.exit(0);
	    }
	  
	    


	
}
