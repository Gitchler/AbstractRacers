public class RacerRunner 
{
    public static void main(String[] args)
    {
        Race theGreatRace = new Race(100);
        Hare Hoppit = new Hare("Hoppit");
        Tortoise Tam = new Tortoise("Tam");
        Longship VK = new Longship("Viking Overlord");
        theGreatRace.addContestant(Tam);
        theGreatRace.addContestant(Hoppit);
        theGreatRace.addContestant(VK);
        System.out.println(Tam.toString());
        System.out.println(Hoppit.toString());
        System.out.println(VK.toString());
        theGreatRace.runRace();
        System.out.println("The winner is " + theGreatRace.getWinner().getName() + "!");
    }
}