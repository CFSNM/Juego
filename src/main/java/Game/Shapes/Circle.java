package Game.Shapes;

import Game.IShape;
import Game.Position;

import java.awt.*;
import java.awt.geom.AffineTransform;

/**
 * Created by Cesar on 29/06/2017.
 */
public class Circle implements IShape {

    private int radius;
    private Position p;


    public Circle(int radius, Position p)
    {
        this.radius = radius;
        this.p = p;
    }
    public void draw(Graphics g)
    {
        g.fillOval(p.getX(),p.getY(),radius,radius);
    }

    public Position getPosition() {
        return p;
    }

    public void setPosition(Position newP) {
        this.p = newP;
    }

    public void rotateAboutPoint(double angle, int x, int y)
    {
        double angleInRadians = Math.toRadians(angle);

    }

    public void rotateAboutCenter(double angle)
    {
        rotateAboutPoint(angle, 0,0);
    }

    public int getRadius(){
        return radius;
    }

    public double getArea(){
        return Math.PI*radius*radius;
    }


}
