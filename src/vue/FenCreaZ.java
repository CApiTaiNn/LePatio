package vue;

import java.io.IOException;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.layout.Pane;
import javafx.fxml.FXMLLoader;

public class FenCreaZ extends Stage {
	
	public FenCreaZ() throws IOException {
		this.setTitle("Creation de zones");
		Scene laScene = new Scene(creerSceneGraph());
		this.setMinHeight(600);
		this.setMinWidth(30);
		this.setScene(laScene);
	}

	private Pane creerSceneGraph() throws IOException {
     	FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("/pageCreaZone.fxml"));
        Pane root = loader.load();
        loader.getController();
     	return root;
	}
}

