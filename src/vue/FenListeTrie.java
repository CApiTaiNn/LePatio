package vue;

import java.io.IOException;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.layout.Pane;
import javafx.fxml.FXMLLoader;

public class FenListeTrie extends Stage{
	
	public FenListeTrie() throws IOException {
		this.setTitle("Liste des annulations");
		Scene laScene = new Scene(creerSceneGraph());
		this.setMinHeight(600);
		this.setMinWidth(30);
		this.setScene(laScene);
	}
	private Pane creerSceneGraph() throws IOException {
		FXMLLoader loader;
		loader = new FXMLLoader(getClass().getResource("/PageListeTrie.fxml"));
		Pane racine = loader.load();
		return racine;
	}
	
}
