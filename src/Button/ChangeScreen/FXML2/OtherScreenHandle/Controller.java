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
	
	
	//Sample2.FXML ����
	@FXML
	Button button3,button4;
	@FXML
	BorderPane borderpane2;

	public void buttonaction(ActionEvent event) throws IOException {
		
		System.out.println("nice");
		
		BorderPane borderpane2 = FXMLLoader.load(getClass().getResource("Sample2.fxml"));
		
		borderpane.getChildren().setAll(borderpane2);
		
		//label.setText("�ȳ�");
		
	}
	
	public void buttonaction3(ActionEvent event) {
		
		System.out.println("good ��ũ��");
		
		//ȭ���� �������� ���¿��� ������ ����� �� ����
		//label.setText("�ȳ��Դϴ�");
	}
	
	public void buttonaction4(ActionEvent event) throws IOException {
		
		
		BorderPane borderpane3 = FXMLLoader.load(getClass().getResource("Sample.fxml"));
		
		borderpane2.getChildren().setAll(borderpane3);
		
		//�̰͵� ȭ���� ���� ���� ���·� �����ϴ� �� ����
		//label.setText("�ȳ��Դϴ�");
		
	
	}
	
	public void labelbuttonaction(ActionEvent event) {
		
		label.setText("�ȳ��ϼ���");
		
		
	}
	
	
	
}
