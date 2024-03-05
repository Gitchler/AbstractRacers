import java.util.ArrayList;

public class Race 
{
    private ArrayList<Racer> contestants;
    private int DISTANCE;
    private boolean ended;
    
    public Race(int distance)
    {
        DISTANCE = distance;
        contestants = new ArrayList<Racer>();
        ended = false;
    }

    public void addContestant(Racer r)
    {
        contestants.add(r);
    }

    public ArrayList<Racer> getContestants()
    {
        return contestants;
    }
    
    public int getDistance()
    {
        return DISTANCE;
    }

    public void runRace()
    {
        while (ended == false)
        {
            System.out.println("Test");
            for (Racer racer : contestants)
            {
                racer.move();
                System.out.println(racer.toString());
                if (racer.getPosition() >= DISTANCE)
                {
                    ended = true;
                }
            }
        }
    }
}