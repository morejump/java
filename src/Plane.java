import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

/**
 * Created by luuthao on 5/29/16.
 */

public abstract class Plane {// this class have only a ability to fly :)))
    public int positionX;
    public int positionY;
    public BufferedImage image;//Sprite
    public int healthPoint;
    public int speedX;
    public int speedY;
    public Plane(int positionX, int positionY, String pathImage) { // this constructor to get position and image of plane
        this.positionX = positionX;
        this.positionY = positionY;
        try {
            this.image = ImageIO.read(new File(pathImage));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void getCurrentLocation(int x, int y) {
        positionY = y;
        positionX = x;
    }

    public void Move() {
        this.positionX += this.speedX;
        this.positionY += this.speedY;
    }

    public void draw(Graphics g) {
        g.drawImage(this.image, this.positionX, this.positionY, null);
    }

    }

