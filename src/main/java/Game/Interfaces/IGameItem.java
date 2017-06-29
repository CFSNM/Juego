package Game.Interfaces;

import Game.Position;

/**
 * Created by Cesar on 27/06/2017.
 */
public interface IGameItem {

    public Position getPosition();
    public void setPosition(Position pos);
    public double getWidth();
    public double getHeight();

}
