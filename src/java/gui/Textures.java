package src.java.gui;

import javax.imageio.ImageIO;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.awt.image.BufferedImage;

public class Textures {

    static final String PATH = "C:\\Users\\HP\\IdeaProjects\\puzzle-game-solver\\src\\res";

    static HashMap<Type, BufferedImage> images;

    static void load() {
        images = new HashMap<>();

        for(Type type : Type.values()) {
            try {
                BufferedImage image = ImageIO.read(new File(PATH + "\\" + type.toString() + ".png"));
                images.put(type, image);
            } catch(IOException e ) {
                e.printStackTrace();
            }
        }
    }

    static BufferedImage getImage(Type type) {
        return images.get(type);
    }

}
