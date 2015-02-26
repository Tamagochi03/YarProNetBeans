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
    Shape3D shape;
    TextureLoader tex;
    ImageComponent2D imagen;
    Background background;
    BoundingSphere bounds = new BoundingSphere();
    TransformGroup Tuxcontent = new TransformGroup();
    
    public Comiendo() {
        shape = new Shape3D();
        trans = new Transformaciones(shape);
        
    }
    
    public TransformGroup estadoComiendo() {
    
        trans.trasladarRayman();
        
        tex = new TextureLoader("estrella.JPG", null);
        imagen= tex.getImage();
        background = new Background();
        background.setImage(imagen);
        background.setApplicationBounds(bounds);
        Tuxcontent.addChild(background);
        return Tuxcontent;
        
    }
}
