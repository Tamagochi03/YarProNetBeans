/*
 * Aquí se implementan los métodos necesarios de la clase
   Transformaciones para un tamagochi que está comiendo
 */
package tmagochi03;

import com.sun.j3d.utils.image.TextureLoader;
import javax.media.j3d.Background;
import javax.media.j3d.BoundingSphere;
import javax.media.j3d.ImageComponent2D;
import javax.media.j3d.Shape3D;
import javax.media.j3d.Transform3D;
import javax.media.j3d.TransformGroup;

/**
 *
 * @author Yareli Avilés
 */
public class Comiendo {
    
    Transformaciones trans;
    
    TextureLoader tex;
    ImageComponent2D imagen;
    Background background;
    BoundingSphere bounds = new BoundingSphere();
    TransformGroup Tuxcontent = new TransformGroup();
    TransformGroup Tuxtrans = new TransformGroup();
    TransformGroup grupoTrans = new TransformGroup();
    
    
    public Comiendo(Shape3D shape) {
       
        Tuxcontent.addChild(Tuxtrans);
        estadoComiendo(shape);
    }
    
    public TransformGroup estadoComiendo(Shape3D shape) {
    
        trans.trasladarRayman();
        grupoTrans.addChild(shape);  
        return grupoTrans;
    }
    
    public TransformGroup fondoComiendo() {
    
        tex = new TextureLoader("cocina.jpg", null);
        imagen= tex.getImage();
        background = new Background();
        background.setImage(imagen);
        background.setApplicationBounds(bounds);
        Tuxcontent.addChild(background);
        return Tuxcontent;
    }
}
