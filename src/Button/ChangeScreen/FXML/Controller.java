package Button.ChangeScreen.FXML;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;

public class Controller {

	@FXML
	Button button;
	@FXML
	BorderPane borderpane;

	public void buttonaction(ActionEvent event) throws IOException {
		
		System.out.println("nice");
		
		BorderPane borderpane2 = FXMLLoader.load(getClass().getResource("Sample2.fxml"));
		
		borderpane.getChildren().setAll(borderpane2);
		
		
	}
	
}
