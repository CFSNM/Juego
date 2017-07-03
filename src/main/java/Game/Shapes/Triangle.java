package Game.Shapes;

import Game.Interfaces.IShape;
import Game.Position;

import java.awt.*;

/**
 * Created by Cesar on 02/07/2017.
 */
public class Triangle implements IShape {

    Position p;
    int base, height;
    int [] xVertex, yVertex;

    public Triangle(Position p, int base, int height) {
        this.p = p;
        this.base = base;
        this.height = height;
        xVertex = new int[3];
        yVertex = new int[3];

        xVertex[0] = p.getX();
        yVertex[0] = p.getY() - height/2;

        xVertex[1] = p.getX() - base/2;
        yVertex[1] = p.getY() + height/2;

        xVertex[2] = p.getX() + base/2;
        yVertex[2] = p.getY() + height/2;
    }

    public void draw(Graphics g)
    {
        g.fillPolygon(xVertex, yVertex, 3);
    }

    public Position getPosition()
    {
        return p;
    }

    public void setPosition(Position newP)
    {
        this.p = newP;

        xVertex[0] = p.getX();
        yVertex[0] = p.getY() - height/2;

        xVertex[1] = p.getX() - base/2;
        yVertex[1] = p.getY() + height/2;

        xVertex[2] = p.getX() + base/2;
        yVertex[2] = p.getY() + height/2;
    }

    public void rotateAboutPoint(double angle, int x, int y)
    {
        angle = Math.toRadians(angle);
        double sinAlfa = Math.sin(angle);
        double cosAlfa = Math.cos(angle);
        double x2 = p.getX() + (x - p.getX()) * cosAlfa - (y - p.getY()) * sinAlfa;
        double y2 = p.getY() + (x - p.getX()) * sinAlfa + (y - p.getY()) * cosAlfa;

        Position newP = new Position((int)x2,(int)y2);

        this.setPosition(newP);
    }

    public void rotateAboutCenter(double angle)
    {
        rotateAboutPoint(angle, 0, 0);
    }

    public void move(double angle, double speed)
    {
        angle = Math.toRadians(angle);
        int newX = (int)(p.getX() + Math.cos(angle)*speed);
        int newY = (int)(p.getY() + Math.sin(angle)*speed);

        Position newP = new Position(newX, newY);
        this.setPosition(newP);

    }

}
