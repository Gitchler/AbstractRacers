
/**
 * Write a description of class Hare here.
 *
 * @author Chase, Luke
 * @version 3/4/2024
 */
public class Hare extends Racer
{
    // instance variables - replace the example below with your own
    private int energy;

    /**
     * Constructor for objects of class Hare
     */
    public Hare(String name)
    {
        super(name);
        energy = 3;
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public void move()
    {
        if (energy > 0)
        {
            setPosition(getPosition()+5);
        }
        
        else
        {
            setPosition(getPosition());
        }
    }
}