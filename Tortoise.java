
/**
 * Write a description of class Tortoise here.
 *
 * @author Chase Engstrom, Luke Haenisch
 * @version 3/4/2024
 */
public class Tortoise extends Racer
{
    /**
     * Constructor for objects of class Tortoise
     */
    public Tortoise(String name)
    {
        super(name);
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public int move()
    {
        setPosition(getPosition()+1);
    }
}
