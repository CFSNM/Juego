package Game.Shapes;

import Game.Position;

import java.awt.*;

/**
 * Created by Cesar on 02/07/2017.
 */
public class Triangle extends GameShape {

    Position p;
    int base, height;
    int [] xVertex, yVertex;

    public Triangle(Position p, int base, int height) {
        super(p);
        this.p = p;
        this.base = base;
        this.height = height;
        xVertex = new int[3];
        yVertex = new int[3];

        update();
    }

    public void draw(Graphics g)
    {
        g.fillPolygon(xVertex, yVertex, 3);
    }

    public Position getPosition()
    {
        return p;
    }

    @Override
    public void setPosition(Position newP)
    {
        this.p = newP;

        update();

    }

    private void update()
    {

        xVertex[0] = p.getX();
        yVertex[0] = p.getY() - height/2;

        xVertex[1] = p.getX() - base/2;
        yVertex[1] = p.getY() + height/2;

        xVertex[2] = p.getX() + base/2;
        yVertex[2] = p.getY() + height/2;
    }


}
