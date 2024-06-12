package vue;

import java.io.IOException;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.layout.Pane;
import javafx.fxml.FXMLLoader;

public class FenCreaFaut extends Stage {
	
	 private controleurCreaFaut ctrlFaut;
	
	public FenCreaFaut() throws IOException {
		this.setTitle("Creation d'un fauteuil");
		Scene laScene = new Scene(creerSceneGraph());
		this.setMinHeight(400);
		this.setMinWidth(30);
		this.setScene(laScene);
	}

	private Pane creerSceneGraph() throws IOException {
     	FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("/pageCreaFaut.fxml"));
        Pane root = loader.load();
        ctrlFaut = loader.getController();
     	return root;
	}
	
	
	public controleurCreaFaut getControleur() {
        return ctrlFaut;
    }
}

