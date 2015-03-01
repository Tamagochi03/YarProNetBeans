/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tmagochi03;

import javafx.scene.transform.Transform;
import javax.media.j3d.Shape3D;
import javax.media.j3d.TransformGroup;

/**
 *
 * @author Yareli Avilés
 */
public class MaquinaEstado3D {
    TransformGroup transGrupo;
    Transformaciones trans;
    Shape3D shape;
    
    
    public MaquinaEstado3D() {
        shape = new Shape3D();
        trans = new Transformaciones(shape);
        transGrupo = new TransformGroup();
    }
    
    /*public TransformGroup tamagochiMuerto() {
    
        Muerto muerto = new Muerto();
        
    }*/
}
