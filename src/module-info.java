/**
 * 
 */
/**
 * @author elgachet
 *
 */
module LePatio {
	requires javafx.graphics;
	  requires javafx.controls;
	  requires javafx.base;
	  requires javafx.fxml;
	  requires java.base;

	  opens controleur to javafx.graphics, javafxcontrols, javafx.fxml, javafx.base;
	  opens vue to javafx.graphics, javafxcontrols, javafx.fxml, javafx.base;
	  opens modele to javafx.graphics, javafxcontrols, javafx.fxml, javafx.base;
}