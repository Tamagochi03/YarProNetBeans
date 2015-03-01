/*
 * Aquí se implementan los métodos necesarios de la clase
   Transformaciones para un tamagochi que está muerto.
 */
package tmagochi03;

import com.sun.j3d.utils.image.TextureLoader;
import javax.media.j3d.Background;
import javax.media.j3d.BoundingSphere;
import javax.media.j3d.ImageComponent2D;
import javax.media.j3d.Shape3D;
import javax.media.j3d.TransformGroup;

/**
 *
 * @author Yareli Avilés
 */
public class Muerto {
    
    TextureLoader tex;
    ImageComponent2D imagen;
    Background background;
    BoundingSphere bounds = new BoundingSphere();
    TransformGroup grupoTrans = new TransformGroup();
    TransformGroup Tuxcontent = new TransformGroup();
    TransformGroup Tuxtrans = new TransformGroup();
    
    public Muerto() {
    
        Tuxcontent.addChild(Tuxtrans);
        
    }
    
    public TransformGroup estadoMuerto() {
    
        return null;
           
    }
    
    public TransformGroup FondoMuerto() {
    
        tex = new TextureLoader("rip.jpg", null);
        imagen= tex.getImage();
        background = new Background();
        background.setImage(imagen);
        background.setApplicationBounds(bounds);
        Tuxcontent.addChild(background);
        return Tuxcontent;
    }
}

