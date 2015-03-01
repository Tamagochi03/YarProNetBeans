/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tmagochi03;

import javafx.scene.transform.Transform;
import javax.media.j3d.BranchGroup;
import javax.media.j3d.Shape3D;
import javax.media.j3d.TransformGroup;

/**
 *
 * @author Yareli Avilés
 */
public class MaquinaEstado3D {
    
    BranchGroup group;
    TransformGroup transGrupo;
    Transformaciones trans;
    Shape3D shape;
    Jugando jugando;
    Muerto muerto;
    Cansado cansado;
    Comiendo comiendo;
    
    public MaquinaEstado3D() {
        
        group = new BranchGroup();
        shape = new Shape3D();
        trans = new Transformaciones(shape);
        transGrupo = new TransformGroup();
        jugando = new Jugando(shape);
        muerto = new Muerto();
        cansado = new Cansado();
        comiendo = new Comiendo(shape);
    }
    
   /*void setup3DGraphics() {
   
        group.addChild(shape);
   } */
    
   
}
