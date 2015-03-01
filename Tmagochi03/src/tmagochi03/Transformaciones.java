/*
 * Aquí se crean todas las transformaciones que se puedan ocupar para el modelo.
 */
package tmagochi03;

import java.util.Map;
import javax.media.j3d.BranchGroup;
import javax.media.j3d.Shape3D;
import javax.media.j3d.Transform3D;
import javax.media.j3d.TransformGroup;
import javax.vecmath.Vector3d;
import javax.vecmath.Vector3f;


/**
 *
 * @author Yareli Avilés
 */
public class Transformaciones /*implements Runnable*/{

    BranchGroup group = new BranchGroup();
    TransformGroup tg = new TransformGroup();
    Transform3D transform = new Transform3D();
    double factor = 0;
    Vector3f translada;
    Vector3d escala;
    LoadScene scene;
    Map<String, Shape3D> nameMap = scene.getNamedObjects();
    //Thread thread = new Thread(this);
    Shape3D wing = nameMap.get("wing");
    
    public Transformaciones(Shape3D shape){
    
      //  thread.start();
        /*tg.addChild(wing);
        tg.setCapability(TransformGroup.ALLOW_TRANSFORM_WRITE);
	tg.setTransform(transform);
	tg.addChild(shape);
	group.addChild(tg);*/
	
    }

   
     
    public void rotarRaymanX() {
  
        factor = factor + 0.01;
	transform.rotX(factor);
	tg.setTransform(transform);
	

    }
    
    public void rotarRaymanY() {
  
        factor = factor + 0.01;
	transform.rotY(factor);
	tg.setTransform(transform);
	

    }
    
    public void rotarRaymanZ() {
  
        factor = factor + 0.01;
	transform.rotZ(factor);
	tg.setTransform(transform);
	

    }
    
    public void trasladarRayman() {
    
        translada = new Vector3f(2F, 3F, -10F);
        transform.setTranslation(translada);
        tg.setTransform(transform);
        
    }
    
    public void escalaRayman() {
     
        escala = new Vector3d(3D, 1D, 2D);
        transform.setScale(escala);
        tg.setTransform(transform);
    }
    			
}
