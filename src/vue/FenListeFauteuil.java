package vue;

import java.io.IOException;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.layout.Pane;
import javafx.fxml.FXMLLoader;

public class FenListeFauteuil extends Stage{
	
	private controleurZone ctrlZone;
	
	public FenListeFauteuil() throws IOException {
		this.setTitle("Liste des Fauteuils !!!");
		Scene laScene = new Scene(creerSceneGraph());
		this.setMinHeight(600);
		this.setMinWidth(30);
		this.setScene(laScene);
	}
	private Pane creerSceneGraph() throws IOException {
		FXMLLoader loader;
		loader = new FXMLLoader(getClass().getResource("/pageZone.fxml"));
		Pane racine = loader.load();
		ctrlZone = loader.getController();
		return racine;
	}
	
	public controleurZone getControleur() {
        return ctrlZone;
    }
	
}
