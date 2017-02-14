package application;
	
import controller.ReservaMesas;
import controller.Mk;

import javafx.application.Application;
import javafx.stage.Stage;
import view.FMesas;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			
			FMesas janela_Mesas = new FMesas(320, 240);
			primaryStage.setScene(janela_Mesas);
			primaryStage.show();
			
			Mk mk = new Mk();
			ReservaMesas gtr = new ReservaMesas();
			gtr.addReserva(mk.cliente1, mk.mesa1, "21:00", 3);
			
		} catch(Exception e) {
			e.printStackTrace();
		}
		
	}
	
	public static void main(String[] args) {
		launch(args);
		
	}
}
