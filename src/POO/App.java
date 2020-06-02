package POO;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class App extends Application{
	public void start(Stage stage)throws Exception{
		
		Pane p=new Pane();
		Scene scn =new Scene(p,100,400);
		Label lbl=new Label("Hello world");
		lbl.relocate(200, 10);
		Button btn=new Button("OK");
		double x=(100-btn.getWidth())/2;
		double y=(400-btn.getHeight())/2;
		btn.relocate(x, y);
		p.getChildren().addAll(lbl,btn);
		stage.setScene(scn);
		stage.show();
		stage.setTitle("Janela Principal");
	}
	public static void main(String[] args) {
		Application.launch(App.class,args);
		
		
	}
}
