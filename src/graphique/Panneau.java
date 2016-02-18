
package graphique;
import util3.*;
import java.awt.Color;

import java.awt.Graphics;

 
import javax.swing.JPanel;
 
public class Panneau extends JPanel {
  private int posX = -50;
  private int posY = -50;
  private String forme = "ROND";

  public void paintComponent(Graphics g){
    //On choisit une couleur de fond pour le rectangle
    g.setColor(Color.white);
    //On le dessine de sorte qu'il occupe toute la surface
    g.fillRect(0, 0, this.getWidth(), this.getHeight());
    //On redéfinit une couleur pour le rond
    g.setColor(Color.red);
    //On délègue la méthode de dessin à la méthode draw()
    ComplexeInt size=new ComplexeInt(50,50);
    draw(g,size);      
  }

 
  private void draw(Graphics g,ComplexeInt size){

      ComplexeInt[] S=ComplexeInt.newTableComplexeInt(5);

      switch(this.forme)
      {case "ROND":g.fillOval(posX, posY, size.getRe(), size.getIm());
                break;
                
        case "CARRE":g.fillRect(posX, posY,  size.getRe(), size.getIm());
                break;
                
        case "TRIANGLE"://Calcul des sommets      
       S[0].set(posX + size.getRe()/2,posY);
       S[1].set(posX + size.getRe(), posY + size.getIm());
       S[2].set(posX, posY + size.getIm()); 
      //Nous créons deux tableaux de coordonnées
      
      int[] ptsX = {S[0].getRe(),S[1].getRe(), S[2].getRe()};
      int[] ptsY = {S[0].getIm(),S[1].getIm(),S[2].getIm()};      
      //Nous utilisons la méthode fillPolygon()
      g.fillPolygon(ptsX, ptsY, 3);
                break;
                
        case "ETOILE"://------------------------------------------------------------- 
              
            S[0].set(posX + size.getRe()/2, posY);
            S[1].set(posX + size.getRe()  , posY + size.getIm());
            S[2].set(posX                 , posY + size.getIm()/3+1);      
            S[3].set(posX + size.getRe()  , posY + size.getIm()/3+1);
            S[4].set(posX                 , posY + size.getIm());

            g=drawLine(g,S[0], S[1]); 
            g=drawLine(g,S[1], S[2]); 
            g=drawLine(g,S[2], S[3]); 
            g=drawLine(g,S[3], S[4]);  
            g=drawLine(g,S[4], S[0]);
                break;
                
          default:g.fillOval(posX, posY, size.getRe(), size.getIm());
                break;
      }
  }
  
  public void setForme(String form){this.forme = form;}
  
  public int getPosX() {return posX;}
  public void setPosX(int posX) {this.posX = posX;}
 
  public int getPosY() {return posY;}
  public void setPosY(int posY) {this.posY = posY;}

   public Graphics drawLine(Graphics g,ComplexeInt origine,ComplexeInt destination)
  {
      g.drawLine(origine.getRe(),origine.getIm(),destination.getRe(),destination.getIm());
      return g;
  }

    
  
}