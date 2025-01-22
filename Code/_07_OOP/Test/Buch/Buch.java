package _07_OOP.Test.Buch;//Beispiel eigene Klasse

public class Buch {
	//Attribute
	private int Seitenanzahl;
	private String Titel, Autor;
	
	//Methoden
	
	//Konstruktor (gleiche Name wie Klasse)
	public Buch(int seitenanzahl, String titel, String autor) {
		Seitenanzahl = seitenanzahl;
		this.Titel = titel; //this nicht nötig hier
		this.Autor = autor;
	}
	
	public void setTitel(String titel) {
		Titel = titel;
	}
	
	public String getTitel() {
		return Titel;
	}
	
	public static void main (String args[]) {
	   Buch Daniel = new Buch(123, "RUHE", "SIMON");
	   Daniel.setTitel("ET REICHT!");	
	   System.out.println(Daniel.Seitenanzahl + " " + Daniel.getTitel() + " " + Daniel.Autor);
	   System.out.println(); 
	}
}

