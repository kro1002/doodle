package Button.ChangeScreen.FXML2.OtherScreenHandle;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;

public class Controller {

	@FXML
	Button button,labelbutton;
	@FXML
	BorderPane borderpane;
	@FXML
	Label label;
	
	
	//Sample2.FXML 변수
	@FXML
	Button button3,button4;
	@FXML
	BorderPane borderpane2;

	public void buttonaction(ActionEvent event) throws IOException {
		
		System.out.println("nice");
		
		BorderPane borderpane2 = FXMLLoader.load(getClass().getResource("Sample2.fxml"));
		
		borderpane.getChildren().setAll(borderpane2);
		
		//label.setText("안녕");
		
	}
	
	public void buttonaction3(ActionEvent event) {
		
		System.out.println("good 스크린");
		
		//화면이 전혀없는 상태여서 오류가 생기는 것 같다
		//label.setText("안녕입니다");
	}
	
	public void buttonaction4(ActionEvent event) throws IOException {
		
		
		BorderPane borderpane3 = FXMLLoader.load(getClass().getResource("Sample.fxml"));
		
		borderpane2.getChildren().setAll(borderpane3);
		
		//이것도 화면이 전혀 없는 상태로 간주하는 것 같다
		//label.setText("안녕입니다");
		
	
	}
	
	public void labelbuttonaction(ActionEvent event) {
		
		label.setText("안녕하세요");
		
		
	}
	
	
	
}
