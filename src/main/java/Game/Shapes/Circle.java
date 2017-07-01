package Game.Shapes;

import Game.Interfaces.IShape;
import Game.Position;

import java.awt.*;

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
        angle = Math.toRadians(angle);
        double sinAlfa = Math.sin(angle);
        double cosAlfa = Math.cos(angle);
        double x2 = p.getX() + (x - p.getX()) * cosAlfa - (y - p.getY()) * sinAlfa;
        double y2 = p.getY() + (x - p.getX()) * sinAlfa + (y - p.getY()) * cosAlfa;

        p = new Position((int)x2,(int)y2);

    }

    public void rotateAboutCenter(double angle)
    {
        rotateAboutPoint(angle, 0,0);
    }

    public void move(double angle, double speed)
    {
        angle = Math.toRadians(angle);
        int newX = (int)(p.getX() + Math.cos(angle)*speed);
        int newY = (int)(p.getY() + Math.sin(angle)*speed);

        Position newP = new Position(newX, newY);
        this.setPosition(newP);
    }

    public int getRadius(){
        return radius;
    }

    public double getArea(){
        return Math.PI*radius*radius;
    }


}
