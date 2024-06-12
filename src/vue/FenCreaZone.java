package vue;

import java.io.IOException;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.layout.Pane;
import javafx.fxml.FXMLLoader;

public class FenCreaZone extends Stage{
	
	public FenCreaZone() throws IOException {
		this.setTitle("Création d'un fauteuil");
		Scene laScene = new Scene(creerSceneGraph());
		this.setMinHeight(300);
		this.setMinWidth(30);
		this.setHeight(300);
		this.setScene(laScene);
	}
	private Pane creerSceneGraph() throws IOException {
		FXMLLoader loader;
		loader = new FXMLLoader(getClass().getResource("/pageCreaFaut.fxml"));
		Pane racine = loader.load();
		return racine;
	}
	
}