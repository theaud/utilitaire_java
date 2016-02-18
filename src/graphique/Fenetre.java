package graphique;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import util3.ComplexeInt;
 
public class Fenetre extends JFrame{
 /* private Panneau pan = new Panneau();
  private JButton[] bouton ;
  
  private JPanel container = new JPanel();
  private JLabel label = new JLabel("Choix de la forme");
  private int compteur = 0;
  private boolean animated = true;
  private boolean backX, backY;
 
  private Thread t;  
  private JComboBox combo = new JComboBox();
  
  private objet objet=new objet();
  
  public Fenetre(){
    this.setTitle("Animation");
    this.setSize(300, 300);
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.setLocationRelativeTo(null);
 
    container.setBackground(Color.white);
    container.setLayout(new BorderLayout());
    container.add(pan, BorderLayout.CENTER);
    
    bouton=new JButton[3];
    bouton[0] = new JButton("Go");
    bouton[1] = new JButton("Stop");
    bouton[2] = new JButton("Couleur");
    
    bouton[0].addActionListener(new BoutonListener());     
    bouton[1].addActionListener(new Bouton2Listener());
    bouton[2].addActionListener(new BoutonListener());
    bouton[1].setEnabled(false);    
    JPanel south = new JPanel();
    south.add(bouton[0]);
    south.add(bouton[1]);
    south.add(bouton[2]);
    container.add(south, BorderLayout.SOUTH);
    
    combo.addItem("ROND");
    combo.addItem("CARRE");
    combo.addItem("TRIANGLE");
    combo.addItem("ETOILE");    
    combo.addActionListener(new FormeListener());
    
    JPanel top = new JPanel();
    top.add(label);
    top.add(combo);    
    container.add(top, BorderLayout.NORTH);
    this.setContentPane(container);
    this.setVisible(true);          
  }

  private void go(ComplexeInt size){
    x = pan.getPosX();
    y = pan.getPosY();
    while(this.animated){
      if(x < 1) backX = false;
      if(x > pan.getWidth() - size.getRe()) backX = true;    
      if(y < 1) backY = false;
      if(y > pan.getHeight() - size.getIm()) backY = true;      
      if(!backX) pan.setPosX(++x);
      else pan.setPosX(--x);
      if(!backY) pan.setPosY(++y);
      else pan.setPosY(--y);
      
      pan.repaint();
      try {
        Thread.sleep(3);
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
    }    
  }
 
  //Classe écoutant notre bouton
  public class BoutonListener implements ActionListener{
     public void actionPerformed(ActionEvent arg0) {
      animated = true;
      t = new Thread(new PlayAnimation());
      t.start();
      bouton[0].setEnabled(false);
      bouton[1].setEnabled(true); 
    }
  }
  
  class Bouton2Listener implements ActionListener{
    public void actionPerformed(ActionEvent e) {
      animated = false;  
      bouton[0].setEnabled(true);
      bouton[1].setEnabled(false);
    }  
  }  
  
  class PlayAnimation implements Runnable{
    public void run() {
    ComplexeInt size=new ComplexeInt(50,50);  
        go(size);    
    }  
  }
    
  class FormeListener implements ActionListener{
    public void actionPerformed(ActionEvent e) {
      //La méthode retourne un Object puisque nous passons des Object dans une liste
      //Il faut donc utiliser la méthode toString() pour retourner un String (ou utiliser un cast)
      pan.setForme(combo.getSelectedItem().toString());
    }  
  }   */ 
}