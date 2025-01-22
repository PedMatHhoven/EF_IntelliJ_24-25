package _07_OOP.Test.Dreieck;

public class ClassDreieck {
  private int posAX;
  private int posAY;
  private int posBX;
  private int posBY;
  private int posCX;
  private int posCY;
  
  public ClassDreieck(int posAX, int posAY, int posBX, int posBY, int posCX, int posCY) {
    this.posAX = posAX;
    this.posAY = posAY;
    this.posBX = posBX;
    this.posBY = posBY;
    this.posCX = posCX;
    this.posCY = posCY;
  }
  
  public int getPosAX() {
    return posAX;
  }
  
  public int getPosAY() {
    return posAY;
  }

  public void setPosAXAY(int posAX, int posAY) {
    this.posAX = posAX;
    this.posAY = posAY;
  }

  public int getPosBX() {
    return posBX;
  }
  
  public int getPosBY() {
    return posBY;
  }
  
  public void setPosBXBY(int posBX, int posBY) {
    this.posBX = posBX;
    this.posBY = posBY;
  }
  
  public int getPosCX() {
    return posCX;
  }
  public int getPosCY() {
    return posCY;
  }
  
  public void setPosCXCY(int posCX, int posCY) {
    this.posCX = posCX;
    this.posCY = posCY;
  }
  
  public double SeitenlängeA() {
    return Math.sqrt(Math.pow((posCX - posBX), 2) + Math.pow((posCY - posBY), 2));  
  }
  
  public double SeitenlängeB() {
    return Math.sqrt(Math.pow((posCX - posAX), 2) + Math.pow((posCY - posAY), 2));  
  }
 
  public double SeitenlängeC() {
    return Math.sqrt(Math.pow((posBX - posAX), 2) + Math.pow((posBY - posAY), 2));
  }
  
  public double Umfang() {
    return SeitenlängeA() + SeitenlängeB() + SeitenlängeC();
  } 
  
  public double Flächeninhalt() {
    double s = Umfang() / 2;
    return Math.sqrt(s * (s - SeitenlängeC()) * (s - SeitenlängeA()) * (s - SeitenlängeB()));
  }
}
