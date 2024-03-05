public class RacerRunner 
{
    public static void main(String[] args)
    {
        Race theGreatRace = new Race(100);
        Hare Hoppit = new Hare("Hoppit");
        Tortoise Tam = new Tortoise("Tam");
        theGreatRace.addContestant(Tam);
        theGreatRace.addContestant(Hoppit);
        System.out.println(Tam.toString());
        System.out.println(Hoppit.toString());
        theGreatRace.runRace();
    }
}
