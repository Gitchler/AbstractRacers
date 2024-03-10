
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
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public void move()
    {
        energy = (int)(Math.random() * 22 + 1);
        if (energy == 1)
        {
            setPosition(getPosition()+5);
        }
        
        else if (energy == 2)
        {
            setPosition(getPosition()+7);
        }
        
        else if (energy == 3)
        {
            setPosition(getPosition()+9);
        }
        
        else
        {
            setPosition(getPosition());
        }
    }
}