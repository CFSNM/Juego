package Game;

import Game.Interfaces.IGameCharacter;
import Game.Interfaces.IShapeView;

/**
 * Created by Cesar on 27/06/2017.
 */
public class Player implements IGameCharacter {


    Position position;
    double width, height, orientation, speed;
    int lifePoints;
    IShapeView sv;

    public Player(IShapeView sv)
    {
        position = new Position(30, 300);
        orientation = 0;
        speed = 1;
        lifePoints = 100;
        this.sv = sv;
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position pos) {
        position = pos;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight(){
        return height;
    }

    public double getOrientation() {
        return orientation;
    }

    public void setOrientation(double newOrientation) {

        orientation = newOrientation;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double newSpeed) {

        speed = newSpeed;
    }

    public int getLifePoints() {
        return lifePoints;
    }

    public void setLifePoints(int lifePoints) {
        this.lifePoints = lifePoints;
    }

    public IShapeView getShapeView()
    {
        return sv;

    }

    // rotate()
}
