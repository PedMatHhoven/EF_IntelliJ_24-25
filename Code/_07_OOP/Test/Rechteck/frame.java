package _07_OOP.Test.Rechteck;

import java.awt.*;
import javax.swing.*;

public class frame extends JFrame {
  public frame() { 
    // Frame-Initialisierung
    super();
    setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
    int frameWidth = MeinRechteck.getX()+100; 
    int frameHeight = MeinRechteck.getY()+100;
    setSize(frameWidth, frameHeight);
    Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
    int x = (d.width - getSize().width) / 2;
    int y = (d.height - getSize().height) / 2;
    setLocation(x, y);
    setTitle("Dein Rechteck");
    setResizable(false);
    Container cp = getContentPane();
    cp.setLayout(null);
    setVisible(true);
  } 
  
  static Rechteck MeinRechteck = new Rechteck(300, 500);
  
  public static void main(String[] args) {
    new frame();
    System.out.println("Ihr erstelltes Rechteck hat eine Seitenl�nge von x = " + MeinRechteck.getX() + " und y = " + MeinRechteck.getY() + ".");
    System.out.println("Es hat einen Fl�cheninhalt von: "+ MeinRechteck.flächeninhalt() + ",");
    System.out.println("und einen Umfang von: " + MeinRechteck.umfang() + ".");
    System.out.println("Die Diagonale w�re " + MeinRechteck.diagonale() + " lang.");
  } 
  
  public void paint(Graphics g) {
    g.drawRect (50, 50, MeinRechteck.getX(), MeinRechteck.getY());  
  }
} 
