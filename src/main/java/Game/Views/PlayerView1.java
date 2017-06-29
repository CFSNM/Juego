package Game.Views;

import Game.IShape;
import Game.IShapeView;
import Game.Position;
import Game.Shapes.Circle;

import java.awt.*;
import java.util.ArrayList;

/**
 * Created by Cesar on 29/06/2017.
 */
public class PlayerView1 implements IShapeView {


    private ArrayList<IShape> viewsList;

    public PlayerView1()
    {
        this.viewsList = new ArrayList<IShape>();

        Circle c = new Circle(30,new Position(100,100));
        Game.Shapes.Rectangle r = new Game.Shapes.Rectangle(30,30,new Position(100,130));

        viewsList.add(c);
        viewsList.add(r);

    }
    public void drawView(Graphics g)
    {
        for(IShape shape: viewsList)
        {
            shape.draw(g);
        }
    }


    public void rotateAboutPoint(double angle, int x, int y)
    {
        for(IShape shape: viewsList)
        {
            shape.rotateAboutPoint(angle, x, y);
        }
    }

    public void rotateAboutCenter(double angle)
    {
        for(IShape shape: viewsList)
        {
            shape.rotateAboutCenter(angle);
        }

    }
}
