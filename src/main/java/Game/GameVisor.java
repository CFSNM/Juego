package Game;

import Game.Interfaces.IGameCharacter;
import Game.Interfaces.IGameItem;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

/**
 * Created by Cesar on 28/06/2017.
 */
public class GameVisor extends JPanel {

    private ArrayList<IGameItem> gameItems;


    public GameVisor()
    {
        gameItems = new ArrayList<IGameItem>();

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

        for(IGameItem item : gameItems)
        {
            if (item instanceof IGameCharacter)
            {
                if(item instanceof Player)
                {
                    g.setColor(Color.BLUE);
                }

                ((IGameCharacter)item).getShapeView().drawView(g);
            }
        }
    }

}
