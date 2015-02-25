/*
 Esta clase crea el universo en el cual podrá vivir Rayman
 */
package tmagochi03;

import com.sun.j3d.utils.geometry.Primitive;
import com.sun.j3d.utils.geometry.ColorCube;
import com.sun.j3d.utils.universe.SimpleUniverse;
import java.awt.GraphicsConfiguration;
import javax.media.j3d.BranchGroup;
import javax.media.j3d.Canvas3D;
import javax.media.j3d.DirectionalLight;
import javax.media.j3d.TransformGroup;

/**
 *
 * @author Yareli Avilés
 */
public class Universo {
    
    
    private BranchGroup group;
    private SimpleUniverse universe;
    private LoadScene ls;
    TransformGroup tg = new TransformGroup();
    
    
    public Universo(Canvas3D canvas3D){
        
        universe = new SimpleUniverse(canvas3D);
        group = new BranchGroup();
        setup3DGraphics();
        
        
    }
    
    void setup3DGraphics() {

      //DirectionalLight light1;
      
      //int primflags = Primitive.GENERATE_NORMALS +
      //Primitive.GENERATE_TEXTURE_COORDS/*+Primitive.ENABLE_APPEARANCE_MODIFY */; 

          //ap.setTextureUnitState(textureUnitState);  
      //sphere = new Sphere(0.5f, primflags, ap);
      //sphere.setCapability(Primitive.ENABLE_APPEARANCE_MODIFY); 
      //ap = sphere.getAppearance();
      //ap.setCapability(Appearance.ALLOW_TEXTURE_ATTRIBUTES_WRITE);
          //ap.setCapability(Appearance.ALLOW_TEXTURE_WRITE);
          //ap.setCapability(Appearance.ALLOW_MATERIAL_WRITE);
          //group.addChild(sphere);
      group = new BranchGroup();
      ls = new LoadScene("C:\\Users\\YareliS\\Documents\\NetBeansProjects\\YarProNetBeans\\Tmagochi03\\src\\tmagochi03\\Rayman3.obj");
      ls.load();
      ls.listSceneNamedObjects();
      group.addChild(ls.getParte());
      //group.addChild(ls.getRoot());
     // group.addChild(ls.getRoot()/*new ColorCube(1)*/);
      universe.getViewingPlatform().setNominalViewingTransform();
      universe.addBranchGraph(group);
      
      //Mundo3D mundo = new Mundo3D(ls.getParte());
      
  }
    
    public static void main(String[] args) {
    
    
    }
}
