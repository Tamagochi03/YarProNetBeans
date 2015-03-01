/*
 *Aquí se implementan los métodos necesarios de la clase
   Transformaciones para un tamagochi que está jugando.
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
public class Jugando {
    
    Transformaciones trans;
    //Shape3D shape;
    TextureLoader tex;
    ImageComponent2D imagen;
    Background background;
    BoundingSphere bounds = new BoundingSphere();
    TransformGroup Tuxcontent = new TransformGroup();
    TransformGroup Tuxtrans = new TransformGroup();
    TransformGroup grupoTrans = new TransformGroup();
    
    public Jugando(Shape3D shape) {
    
        Tuxcontent.addChild(Tuxtrans);
        estadoDurmiendo(shape);
    }
    
    public TransformGroup estadoDurmiendo(Shape3D shape) {
    
        trans.trasladarRayman();
        trans.rotarRaymanX();
        grupoTrans.addChild(shape);
        return grupoTrans;  
    }
    
    
    public TransformGroup fondoDurmiendo() {
    
        tex = new TextureLoader("jugar.png", null);
        imagen= tex.getImage();
        background = new Background();
        background.setImage(imagen);
        background.setApplicationBounds(bounds);
        Tuxcontent.addChild(background);
        return Tuxcontent;
    }
}