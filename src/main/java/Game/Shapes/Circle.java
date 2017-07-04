package Game.Shapes;

import Game.Position;

import java.awt.*;

/**
 * Created by Cesar on 29/06/2017.
 */
public class Circle extends GameShape {

    private int radius;
    private Position p;


    public Circle(int radius, Position p)
    {
        super(p);
        this.radius = radius;
        this.p = p;
    }
    public void draw(Graphics g)
    {
        g.fillOval(p.getX(),p.getY(),radius,radius);
    }


    public int getRadius(){
        return radius;
    }

    public double getArea(){
        return Math.PI*radius*radius;
    }


}
