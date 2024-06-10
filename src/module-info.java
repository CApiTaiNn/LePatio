/**
 * 
 */
/**
 * @author smorgant
 *
 */
module LePatio {
	requires javafx.graphics;
	requires javafx.controls;
	requires javafx.base;
	requires javafx.fxml;
	
	opens modele to javafx.graphics, javafx.controls, javafx.fxml, javafx.base;
	opens vue to javafx.graphics, javafx.controls, javafx.fxml, javafx.base;
	opens controleur to javafx.graphics, javafx.controls, javafx.fxml, javafx.base;

}