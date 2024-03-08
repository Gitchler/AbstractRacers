import java.util.ArrayList;

public class Race 
{
    private ArrayList<Racer> contestants;
    private int DISTANCE;
    private boolean ended;
    private Racer winner;
    
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
        for (Racer racer : contestants)
        {
            racer.move();
            if (racer.getPosition() >= DISTANCE)
            {
                ended = true;
            }
        }
    }
    
    public boolean raceOver()
    {
        return ended;
    }
    
    public Racer getWinner()
    {
        for (Racer racer : contestants)
        {
            if (racer.getPosition() >= DISTANCE)
            {
                winner = racer;
            }
        }
        return winner;
    }
}
