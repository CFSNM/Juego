package Game;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by Cesar on 28/06/2017.
 */
public class GameVisor extends JPanel {

    private ArrayList<IGameItem> gameItems;
    private Map<Class, String> imagePath2ClassMap;

    public GameVisor()
    {
        gameItems = new ArrayList<IGameItem>();
        imagePath2ClassMap = new HashMap<Class, String>();
    }

    public void update(ArrayList<IGameItem> newItems)
    {
        gameItems.clear();
        gameItems.addAll(newItems);
        this.repaint();
    }

    @Override
    public void paint(Graphics g)
    {
        for(IGameItem item : gameItems)
        {
            if (item instanceof Player)
            {
                g.drawOval((int)item.getPosition().getX(), (int)item.getPosition().getY(), (int)item.getSize(), (int)item.getSize());
            }
        }
    }
}
