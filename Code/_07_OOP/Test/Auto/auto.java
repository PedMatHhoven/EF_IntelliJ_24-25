package _07_OOP.Test.Auto;

public class auto {
    //Attribute
    private String Brand;
    private String Model;
    private String Color;
    //Konstruktor
    public auto(String brand, String model, String color) {
        Brand = brand;
        Model = model;
        Color = color;
    }
    //getter/ setter
    public void setBrand(String brand) {
        Brand = brand;
    }

    public String getBrand() {
        return Brand;
    }

    public void setModel(String model) {
        Model = model;
    }

    public String getModel() {
        return Model;
    }

    public void setColor(String color) {
        Color = color;
    }

    public String getColor() {
        return Color;
    }
    //weitere Methoden
    public void fahren(){
        System.out.println("Der " + Color + "e " + Brand + " fährt los");
    }

    public void radioAnmachen(){
        System.out.println("Das Radio ist an... \n Wühlmaus, Knopfaugen, lange Nase wer könnte das sein ...");
    }

    public void tanken(){
        System.out.println("Das Auto tankt...");
    }
}
