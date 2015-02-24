/*
 * Aquí se pinta al modelo 3D en el JFrame.
 */

package tmagochi03;

import com.sun.j3d.utils.universe.*;
import javax.media.j3d.*;

/**
 *
 * @author YareliS
 */
public class Rayman3D {

    public static void main(String[] args) {
        LoadScene ls = new LoadScene("C:\\Users\\YareliS\\Documents\\NetBeansProjects\\Tamagochi\\src\\tamagochi\\Rayman 3\\Rayman3.obj");
        ls.load();
        ls.listSceneNamedObjects();
        Mundo3D mundo = new Mundo3D(ls.getParte());
    }
}
