/**
 * The Longship class codes for a viking longship as one of the racers. The
 * longship's motion is dependent upon the waters it sails. It moves forward
 * two times when move() is called in normal waters, but if it hits choppy 
 * waters it only moves forward once. If there is strong wind, it moves back
 * once, and if there is a hurricane, it moves back three times.
 *
 * @author Chase, Luke
 * @version 3/4/2024
 */
public class Longship extends Racer
{
    private int sailConditions;

    /**
     * Constructor for objects of class Hare
     */
    public Longship(String name)
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
        sailConditions = (int)(Math.random() * 10 + 1);
        if (sailConditions == 1)
        {
            //Choppy waters
            setPosition(getPosition()+1);
        }
        
        else if(sailConditions == 2)
        {
            //Strong wind
            setPosition(getPosition()-1);
        }
        else if (sailConditions == 3)
        {
            //Storm
            setPosition(getPosition()-3);
        }
        else
        {
            //Normal waters
            setPosition(getPosition()+2);
        }
    }
}