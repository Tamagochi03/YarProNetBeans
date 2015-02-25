/*
 * Aquí se importa el modelo con extensión .obj a Java 3D.
 */

package tmagochi03;

/**
 *
 * @author Yareli Avilés
 */
import com.sun.j3d.loaders.Scene;
import com.sun.j3d.loaders.objectfile.ObjectFile;
import com.sun.j3d.utils.geometry.Primitive; // Contains the object loaded from disk.
import com.sun.j3d.utils.image.TextureLoader;
import java.awt.Container;
import java.io.FileReader;
import java.io.IOException; // Loader of .obj models
import java.util.Map;
import javax.media.j3d.*;
import javax.vecmath.Color4f;

public class LoadScene {

    String location;
    Shape3D parte;
    Scene scene;
    //BranchGroup root;
    //TransformGroup tg = new TransformGroup();
    
    static TextureLoader loader = new TextureLoader("C:\\Users\\YareliS\\Documents\\NetBeansProjects\\YarProNetBeans\\Tmagochi03\\src\\tmagochi03\\rayman.png",
            "RGP", new Container());
    static Texture texture = loader.getTexture();

    public LoadScene(String location) {
        this.location = location;
    }

    public void load() {
        try {
            ObjectFile loader = new ObjectFile(ObjectFile.RESIZE);
            scene = loader.load(new FileReader(location));

        } catch (Exception e) {
            System.out.println("Error al cargar el modelo");
        }
        Map<String, Shape3D> nameMap = scene.getNamedObjects();
        Shape3D shape = nameMap.get("mesh_rayman3_rayman_3");
        //tg.setCapability(TransformGroup.ALLOW_TRANSFORM_WRITE);
        /* Por default, el BrachGroup de la Scene ya contiene una referencia a la figura, no puede haber más de 1, por lo que la removemos. */
        this.parte = shape;
        //parte = shape;
        BranchGroup root = scene.getSceneGroup();
        root = scene.getSceneGroup();
        root.removeChild(shape);
        //parte.removeChild(shape);
    //Appearance appearance = new Appearance();
    //appearance.setTexture(null);

        //texture.setBoundaryModeS(Texture.WRAP);
        //texture.setBoundaryModeT(Texture.WRAP);
        //texture.setBoundaryColor(new Color4f(0.0f, 1.0f, 0.0f, 0.0f));
        TextureAttributes texAttr = new TextureAttributes();
        texAttr.setTextureMode(TextureAttributes.MODULATE);
        Appearance ap = new Appearance();
        ap.setTexture(texture);
        ap.setTextureAttributes(texAttr);
        int primflags = Primitive.GENERATE_NORMALS
                + Primitive.GENERATE_TEXTURE_COORDS;
        ObjectFile loader = new ObjectFile(ObjectFile.RESIZE);

        this.parte.setAppearance(ap);
        //parte.setAppearance(ap);

    }

    public void listSceneNamedObjects() {
        Map<String, Shape3D> nameMap = scene.getNamedObjects();
        for (String name : nameMap.keySet()) {
            System.out.printf("Name: %s\n", name);
        }
    }

    public Shape3D getParte() {
        return parte;
    }
    
   /* public BranchGroup getRoot() {
        return root;
    }*/

}
