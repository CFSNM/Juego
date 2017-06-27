package Game;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Cesar on 27/06/2017.
 */
public class ImagePanel extends JPanel {

    public String imagePath;
    Image image;

    public ImagePanel(String imagePath){
        this.imagePath = imagePath;
        image = new ImageIcon(this.getClass().getResource("/resources/shoot.jpg")).getImage();
        repaint();

    }

    @Override
    public void paint(Graphics g)
    {
        g.drawImage(image, 0, 0, getWidth(), getHeight(),
                this);

        setOpaque(false);
    }

    }
