package view;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;

public class FMesas extends Scene {
	Group gn;
	public FMesas(double width, double height) {
		super(new Group(), width, height);
		gn = (Group) this.getRoot();
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
	}
}
