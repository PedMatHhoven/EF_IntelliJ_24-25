package _06_String;

public class warmwerden_String {
    public static void main(String[] args) {
        String s = "Guten Tag"; //bekannt; ähnlich wie int, double, ...
        System.out.println("String Kurzform: " + s);
        String t = new String("Guten Tag");  //neues Objekt der Klasse String
        System.out.println("String als Objekt: " + t);
        char[] u ={'G','u','t','e','n',' ','T','a','g'}; //character-Array (Reihe von Buchstaben)
        System.out.print("String als Buchstaben-Array: ");
        for (int i = 0; i < u.length; i++) System.out.print(u[i]);
        System.out.println();
        //Methoden der Klasse String an Beispielen
        System.out.println("charAt(2): " + s.charAt(2)); //Variable.Methodenname - ab dafür
        System.out.println("endswith('Tag'): " + s.endsWith("Tag"));
        System.out.println("indexOf('e'): " + s.indexOf('e'));
    }
}
