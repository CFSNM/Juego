package Game.Shapes;

import Game.Position;

import java.awt.*;

/**
 * Created by Cesar on 29/06/2017.
 */
public class Rectangle extends GameShape {

    int width, height;
    Position p;


    public Rectangle(int width, int height, Position p)
    {
        super(p);
        this.width = width;
        this.height = height;
        this.p = p;
    }

    public void draw(Graphics g)
    {
        g.fillRect(p.getX(), p.getY(), width, height);
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
