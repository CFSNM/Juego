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
        this.sv = sv;
        position = sv.getPosition();
        orientation = 90;
        speed = 9;
        lifePoints = 100;
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

    public void move()
    {
        double angle = Math.toRadians(orientation);

        int newX = (int)(position.getX() + Math.cos(angle)*speed);
        int newY = (int)(position.getY() + Math.sin(angle)*speed);

        Position newP = new Position(newX, newY);
        this.setPosition(newP);
        sv.move(orientation, speed);

    }

    public void turnRight()
    {
        orientation = orientation + 10;
    }

    public void turnLeft()
    {
        orientation = orientation - 10;

    }


}
