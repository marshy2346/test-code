package cen3031.hostelsolutions.tuesdays;

import java.util.logging.Level;
import java.util.logging.Logger;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class ApplicationStart extends Application {

	public static void main(String[] args) {
		Application.launch(args);

	}

	@Override
	public void start(Stage primaryStage) {  // Starts the GUI
		 try {
	            AnchorPane page = (AnchorPane) FXMLLoader.load(ApplicationStart.class.getResource("login.fxml"));
	            Scene scene = new Scene(page);
				primaryStage.setScene(scene);
	            primaryStage.setTitle("FXML is Simple");
	            primaryStage.show();
	        } catch (Exception ex) {
	            Logger.getLogger(ApplicationStart.class.getName()).log(Level.SEVERE, null, ex);
	        }
		
	}

}
