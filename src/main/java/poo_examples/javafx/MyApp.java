package poo_examples.javafx;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import poo_examples.javafx.view.View;
import poo_examples.javafx.view.ViewSwitcher;

public class MyApp extends Application{

	@Override
	public void start(Stage stage) throws Exception {
		Scene scene = new Scene(new Pane());
		
		ViewSwitcher.setScene(scene);
		ViewSwitcher.switchTo(View.LOGIN);
		
		stage.setScene(scene);
		stage.show();
	}
	
	public static void main(String[] args) {
		launch(args);
	}

}
