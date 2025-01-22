package _07_OOP.Test.Rechteck;

public class Rechteck {
  private int X, Y;
  
  public Rechteck(int x,int y){
    X = x;
    Y = y;
  }
  
  public int getX(){
    return X;
  }
  
  public int getY(){
    return Y;
  }
  
  public int flächeninhalt(){
    return X * Y;
  }
  public int umfang(){
    return 2*X + 2*Y;     
  }
  
  public double diagonale(){
    double wert = (X*X) + (Y*Y);
    return Math.sqrt(wert);
  }
}