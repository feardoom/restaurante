package view;
import controller.GestaoMesas;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;

public class FMesas extends Scene {
	Group gn;
	GestaoMesas gestorMesas;	
	
	public FMesas(double width, double height, GestaoMesas g) {
		super(new Group(), width, height);
		gn = (Group) this.getRoot();
		this.gestorMesas = g;
		init();
	}
	
	private void init() {
		GridPane g = new GridPane();
		
		Label lblLotacao = new Label("Lotacao");
		CheckBox cbFumador = new CheckBox("Fumador");
		TextField txtLotacao = new TextField();
		Button cmdAdd = new Button("Adicionar");
		
		g.add(lblLotacao, 0, 0);
		g.add(txtLotacao, 1, 0);
		g.add(cbFumador, 0, 1);
		g.add(cmdAdd, 0, 2);
		
		gn.getChildren().add(g);
		
		cmdAdd.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent event) {
				gestorMesas.addMesa(Integer.getInteger(txtLotacao.getText()), cbFumador.isSelected());
			}
		});
		
	}
}
