/*
Aquí se crea el universo 3D
 */

package tmagochi03;

/**
 *
 * @author Yareli Avilés
 */

import com.sun.j3d.utils.universe.*;
import javax.media.j3d.*;

public class Mundo3D implements Runnable {

	SimpleUniverse universe = new SimpleUniverse();
	BranchGroup group = new BranchGroup();
	TransformGroup tg = new TransformGroup();
	Transform3D transform = new Transform3D();
	Thread thread = new Thread(this);
	
	double factor = 0;
	
	public Mundo3D(Shape3D shape) {
            
		thread.start();
		tg.setCapability(TransformGroup.ALLOW_TRANSFORM_WRITE);
		tg.setTransform(transform);
		tg.addChild(shape);
		group.addChild(tg);
		universe.getViewingPlatform().setNominalViewingTransform();
		universe.addBranchGraph(group);
		
	}
	
	public void run(){
		while (Thread.currentThread() == thread){
			try{
				factor = factor + 0.01;
				transform.rotY(factor);
				tg.setTransform(transform);
				Thread.sleep(10);
			} catch (InterruptedException ex) {
				System.out.println("Ha ocurrido una excepcion");
			}
		}
	}
	
}
