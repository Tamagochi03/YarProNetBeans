/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tmagochi03;

import tmagochi03.LoadScene;
import java.awt.*; 
import java.awt.event.*; 
import javax.swing.*; 
import javax.swing.event.*; 
import com.sun.j3d.utils.geometry.*; 
import com.sun.j3d.utils.universe.*; 
import com.sun.j3d.utils.image.*; 
import javax.media.j3d.*; 
import javax.vecmath.*;


/* *
@author Yareli Avilés 
*/ 

public class Tamagochi03 extends Frame {

  private Canvas3D canvas3D;
 Universo uni;
  //private Appearance ap;
  //private Texture feliz, enfermo;
  //private static Texture texture;
  //private TextureLoader loader;
  
  
  /**Declaración de Paneles*/
  
  private JPanel jpB;
  private JPanel jpL;
  private JPanel jpPb;
  private JPanel jpL1;
  private JPanel jpE;
  
  
  /**Declaración de Botones y etiquetas*/
  
  private JButton bcomer; //Boton de comer
  private JLabel lhambre; 
  private JButton bdormir; //Boton de dormir
  private JLabel lsueno;
  private JButton bjugar; //Boton de jugar
  private JLabel lAburrimiento;
  private JLabel lEnergia;
  private JLabel mensaje;
  
  
  /**Declaración de Barras de progreso*/
  
  private JProgressBar PbSuenio; 
  private JProgressBar PbHambre; 
  private JProgressBar PbAburrimiento; 
  private JProgressBar PbEnergia; 


  static Sphere sphere;


  public Tamagochi03() {

      super("Tamagochi 3D");


      setResizable(false); 
      setSize(900, 600);
      setLocationRelativeTo(null);
    
      
      /**Inicialización de Variables*/

      bcomer=new JButton("Comer");
      lhambre=new JLabel("Hambre");

      bdormir=new JButton("Dormir");
      lsueno=new JLabel("Sueno");

      bjugar=new JButton("Jugar");
      lAburrimiento = new JLabel("Aburrimiento");
      lEnergia=new JLabel("Energía");

      mensaje = new JLabel("Hola, soy Rayman");
                  
      PbSuenio = new JProgressBar();
      PbHambre = new JProgressBar();
      PbAburrimiento = new JProgressBar();
      PbEnergia = new JProgressBar();
      
      

      jpB = new JPanel();
      jpL = new JPanel();
      jpL1 = new JPanel();
      jpE = new JPanel();

      jpL.add(lhambre); jpL.add(PbSuenio);
      jpB.add(bcomer);

      jpL.add(lsueno); jpL.add(PbHambre);
      jpB.add(bdormir);

      jpL.add(lAburrimiento); jpL.add(PbAburrimiento);
      jpB.add(bjugar);
      jpE.add(lEnergia);
      jpE.add(PbEnergia);
      jpL1.add(mensaje);

      
      GraphicsConfiguration config =       
      SimpleUniverse.getPreferredConfiguration();
      canvas3D = new Canvas3D(config);
      canvas3D.setSize(500, 00);
        
      
      uni = new Universo(canvas3D);
      uni.setup3DGraphics();
      
      
      
      add("North", jpL);
      add("East", jpB);
      add("Center", jpL1);
      add("West", canvas3D);
      add("South", jpE);
 
      setVisible(true);

  }

  
  public static void main(String[] args) { 

      new Tamagochi03();
      

  }


      public void windowClosing(WindowEvent e) { 

          System.exit(0); 
      }
}