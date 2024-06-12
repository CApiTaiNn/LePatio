package modele;

import java.time.LocalDate;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Date;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class Test {
	private final StringProperty nom;
	public static void main(String[] args) {
		Date date = new Date();
		System.out.println(formatDate(date));
	}
	public Test() {
		// TODO Auto-generated constructor stub
		this.nom = new SimpleStringProperty();
	}
	public Test(String n) {
		// TODO Auto-generated constructor stub
		this.nom = new SimpleStringProperty(n);
	}
	public String getNom() {
		return nom.get();
	}
	public void setNom(String nom) {
		this.nom.set(nom);
	}
	public StringProperty nomProperty() {
		return this.nom;
	}public static String formatDate(Date date) {
        LocalDate localDate = date.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        return localDate.format(formatter);
    }
}
