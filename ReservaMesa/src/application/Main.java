package application;
	
import controller.ReservaMesas;
import controller.GestaoMesas;
import controller.Mk;

import javafx.application.Application;
import javafx.stage.Stage;
import view.FMesas;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;


public class Main extends Application {
	GestaoMesas gestorMesas;
	@Override
	public void start(Stage primaryStage) {

		gestorMesas = new GestaoMesas();
		
		FMesas janela_Mesas = new FMesas(320, 240, gestorMesas);
		primaryStage.setScene(janela_Mesas);
		primaryStage.show();
		
		Mk mk = new Mk();
		ReservaMesas gtr = new ReservaMesas();
		gtr.addReserva(mk.cliente1, mk.mesa1, "21:00", 3);
	
		
	}
	
	public static void main(String[] args) {
		launch(args);
		
	}
}
