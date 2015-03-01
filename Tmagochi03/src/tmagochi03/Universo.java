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
    //MaquinaEstado3D maquina;
    
    
    public Universo(Canvas3D canvas3D){
        
        universe = new SimpleUniverse(canvas3D);
        group = new BranchGroup();
        //maquina = new MaquinaEstado3D();
        setup3DGraphics();
        
        
    }
    
    void setup3DGraphics() {

      group = new BranchGroup();
      ls = new LoadScene("C:\\Users\\YareliS\\Documents\\NetBeansProjects\\YarProNetBeans\\Tmagochi03\\src\\tmagochi03\\Rayman3.obj");
      ls.load();
      ls.listSceneNamedObjects();
      group.addChild(ls.getParte());
      universe.getViewingPlatform().setNominalViewingTransform();
      universe.addBranchGraph(group);
      
  }
    
   
}
