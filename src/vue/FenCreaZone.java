package vue;

import java.io.IOException;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.layout.Pane;
import javafx.fxml.FXMLLoader;

public class FenCreaZone extends Stage{
	
	
	
	public FenCreaZone() throws IOException {
		this.setTitle("Création d'une Zone");
		Scene laScene = new Scene(creerSceneGraph());
		this.setMinHeight(400);
		this.setMinWidth(30);
		this.setHeight(400);
		this.setScene(laScene);
	}
	private Pane creerSceneGraph() throws IOException {
		FXMLLoader loader;
		loader = new FXMLLoader(getClass().getResource("/pageCreaZone.fxml"));
		Pane racine = loader.load();
		return racine;
	}
	
	
}