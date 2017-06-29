package Game;

/**
 * Created by Cesar on 27/06/2017.
 */
public class Position {

    private int x, y;

    public Position(int x, int y)
    {
        this.x = x;
        this.y = y;
    }

    public int getX()
    {
        return x;
    }

    public int getY()
    {
        return y;
    }

    public void modify(int dx, int dy)
    {
        x = x + dx;
        y = y + dy;
    }

    public Position translate(int dx, int dy)
    {
        return new Position(this.getX() + dx, this.getY() + dy);
    }
}
