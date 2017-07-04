package Game.Shapes;

import Game.Position;

import java.awt.*;

/**
 * Created by Cesar on 04/07/2017.
 */
public abstract class GameShape {

    private Position p;
    public GameShape(Position p)
    {
        this.p = p;
    }
    public abstract void draw(Graphics g);

    public Position getPosition()
    {
        return p;
    }

    public void setPosition(Position newP)
    {
        this.p = newP;
    }

    public void rotateAboutPoint(double angle, int x, int y)
    {
        angle = Math.toRadians(angle + 180);
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
        double angleInRadians = Math.toRadians(angle + 180);
        int newX = (int)(p.getX() + Math.cos(angleInRadians)*speed);
        int newY = (int)(p.getY() + Math.sin(angleInRadians)*speed);

        Position newP = new Position(newX, newY);
        this.setPosition(newP);
    }
}
