package control;

import javafx.application.Application;
import javafx.stage.Stage;

public class App extends Application{

	@Override
	public void start(Stage primaryStage) throws Exception {
		MainController mainControl = new MainController();
		mainControl.mostrar(primaryStage);
		
		//Hola prueba commit número 1
	}
	
	public static void main(String[] args) {
		launch(args);
	}

}
