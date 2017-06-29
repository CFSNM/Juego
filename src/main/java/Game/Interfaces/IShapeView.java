package Game.Interfaces;

import Game.Position;

import java.awt.*;

/**
 * Created by Cesar on 29/06/2017.
 */
public interface IShapeView {

    public void drawView(Graphics g);
    public void rotateAboutPoint(double angle, int x, int y);
    public void rotateAboutCenter(double angle);
    public Position getPosition();
    public void move();
}
