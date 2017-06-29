package Game;

/**
 * Created by Cesar on 27/06/2017.
 */
public interface IGameCharacter extends IGameItem {

    public double getOrientation();
    public void setOrientation(double newOrientation);
    public void setSize(double newSize);
    public double getSpeed();
    public void setSpeed(double newSpeed);
    public int getLifePoints();
    public void setLifePoints(int lifePoints);
    public IShapeView getShapeView();
}
