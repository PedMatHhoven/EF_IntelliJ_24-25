package _07_OOP.Test.Kuchen;

public class Kuchen {
  //Atribute
  private int Stockwerke;
  private String Form, Boden, Füllung, 	 Glasurfarbe, Verzierung;

  //Konstruktor
  public Kuchen(int stw, String form, String bo, String fll, String farb, String vz){
    Stockwerke=stw;
    Form=form;
    Boden=bo;
    Füllung=fll;
    Glasurfarbe=farb;
    Verzierung=vz;
  }

  //setter (set-Methoden)
  public void setStockwerke(int stw) {
    if (stw>0 && stw<6){
      Stockwerke=stw; 
    } 
  } 
  
  public void setForm(String form ) {
    if (form.equals("rund") || form.equals("viereckig")) {
      Form=form; 
    } 
  }
  
  public void setBoden(String bo) {
    Boden=bo; 
  }
  
  public void setFüllung(String fll) {
    Füllung=fll;
  }
  
  public void setGlasurfarbe(String farb) {
    Glasurfarbe=farb; 
  }
  
  public void setVerzierung(String vz) {
    Verzierung=vz; 
  }

  //getter (get-Methoden)
  public int getStockwerke (){
    return Stockwerke;
  }
  
  public String getForm (){
    return Form;
  }
  
  public String getBoden(){
    return Boden;
  }
  
  public String getFüllung (){
    return Füllung;
  }  
  
  public String getGlasurfarbe(){
    return Glasurfarbe;
  } 
   
  public String getVerzierung(){
    return Verzierung; 
  }  
}
