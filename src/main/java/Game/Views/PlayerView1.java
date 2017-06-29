package Game.Views;

import Game.Interfaces.IShape;
import Game.Interfaces.IShapeView;
import Game.Position;
import Game.Shapes.Circle;

import java.awt.*;
import java.util.ArrayList;

/**
 * Created by Cesar on 29/06/2017.
 */
public class PlayerView1 implements IShapeView {


    private ArrayList<IShape> viewsList;
    Position p;

    public PlayerView1()
    {
        this.viewsList = new ArrayList<IShape>();

        p = new Position(150, 350);

        Circle c = new Circle(30,p);
        Position p2 = p.translate(0,25);

        Game.Shapes.Rectangle r = new Game.Shapes.Rectangle(30,30,p2);

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

    public Position getPosition() {
        return p;
    }

    public void move()
    {
        for(IShape shape: viewsList)
        {

        }
    }

}
