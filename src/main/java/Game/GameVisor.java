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
    private Map<Class, IShapeView> shape2ClassMap;

    public GameVisor()
    {
        gameItems = new ArrayList<IGameItem>();
        imagePath2ClassMap = new HashMap<Class, String>();
        shape2ClassMap = new HashMap<Class, IShapeView>();
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
        super.paint(g);
        g.setColor(Color.BLUE);

        for(IGameItem item : gameItems)
        {
            if (item instanceof IGameCharacter)
            {
                ((IGameCharacter)item).getShapeView().drawView(g);
            }
        }
    }

}
