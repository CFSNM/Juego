package Game.Shapes;

import Game.Interfaces.IShape;
import Game.Position;

import java.awt.*;

/**
 * Created by Cesar on 29/06/2017.
 */
public class Rectangle implements IShape {

    int width, height;
    Position p;


    public Rectangle(int width, int height, Position p)
    {
        this.width = width;
        this.height = height;
        this.p = p;
    }

    public void draw(Graphics g)
    {
        g.fillRect(p.getX(), p.getY(), width, height);
    }

    public Position getPosition()
    {
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

    public int getWidth(){
        return width;
    }

    public int getHeight(){
        return height;
    }

    public double getArea(){
        return width*height/2;
    }
}
