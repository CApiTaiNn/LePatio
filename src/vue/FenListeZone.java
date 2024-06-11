package vue;

import java.io.IOException;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.layout.Pane;
import javafx.fxml.FXMLLoader;

public class FenListeZone extends Stage{
	
	public FenListeZone() throws IOException {
		this.setTitle("Liste des employ�s");
		Scene laScene = new Scene(creerSceneGraph());
		this.setMinHeight(600);
		this.setMinWidth(30);
		this.setScene(laScene);
	}
	private Pane creerSceneGraph() throws IOException {
		FXMLLoader loader;
		loader = new FXMLLoader(getClass().getResource("/pageZone.fxml"));
		Pane racine = loader.load();
		return racine;
	}
	
}
