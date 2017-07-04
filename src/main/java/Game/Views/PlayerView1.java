package Game.Views;

import Game.Interfaces.IShapeView;
import Game.Position;
import Game.Shapes.Circle;
import Game.Shapes.GameShape;
import Game.Shapes.Triangle;

import java.awt.*;
import java.util.ArrayList;

/**
 * Created by Cesar on 29/06/2017.
 */
public class PlayerView1 implements IShapeView {


    private ArrayList<GameShape> viewsList;
    Position p;

    public PlayerView1()
    {
        this.viewsList = new ArrayList<GameShape>();

        p = new Position(150, 350);

        Circle c = new Circle(30,p);
        Position p2 = p.copy();
        p2.modify(0,-30);

        Game.Shapes.Rectangle r = new Game.Shapes.Rectangle(30,30,p2);

        Position p3 = p2.copy();
        p3.modify(15,-15);

        Triangle t = new Triangle(p3, 30, 30);
        viewsList.add(c);
        viewsList.add(r);
        viewsList.add(t);

    }
    public void drawView(Graphics g)
    {
        for(GameShape shape: viewsList)
        {
            shape.draw(g);
        }
    }


    public void rotateAboutPoint(double angle, int x, int y)
    {
        for(GameShape shape: viewsList)
        {
            shape.rotateAboutPoint(angle, x, y);
        }
    }

    public void rotateAboutCenter(double angle)
    {
        for(GameShape shape: viewsList)
        {
            shape.rotateAboutCenter(angle);
        }

    }

    public Position getPosition() {
        return p;
    }

    public void move(double angle, double speed)
    {
        for(GameShape shape: viewsList)
        {
            shape.move(angle, speed);
        }
    }

}
