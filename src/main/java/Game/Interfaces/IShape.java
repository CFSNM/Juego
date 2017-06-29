package Game.Interfaces;

import Game.Position;

import java.awt.*;

/**
 * Created by Cesar on 29/06/2017.
 */
public interface IShape {

    public void draw(Graphics g);
    public Position getPosition();
    public void setPosition(Position newP);
    public void rotateAboutPoint(double angle, int x, int y);
    public void rotateAboutCenter(double angle);

}
