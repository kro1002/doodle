package Button.ChangeScreen.FXML;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Main extends Application {

	Button button;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		
		Parent root = FXMLLoader.load(getClass().getResource("Sample.fxml"));
		
		Scene scene = new Scene(root,500,450);
		primaryStage.setScene(scene);
		primaryStage.show();
		
	}
	
	
	
}
