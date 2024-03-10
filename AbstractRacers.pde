/**
 * Runs a race of Racers in the Processing environment
 */

 // Variables declared here
final int RACE_DISTANCE = 800;   // 100 px buffer before start and
                                 // after the finish
final int SCREENWIDTH = 1000;    // matches graphical window of 
                                 // size(1000, 800)
final int racerWidth = 100;            // racer width in pixels;
Race r;

/**
 * This method is run once before the draw() loop starts repeating.
 * Initialize the race variables, set up the screen...
 */
void setup()
{
  size(1000, 500);
  background(255);
  r = new Race(RACE_DISTANCE);
  r.addContestant(new Tortoise("Tam"));
  r.addContestant(new Hare("Hoppit"));
  r.addContestant(new Longship("Viking Overlord"));
}

void drawStartFinish()
{
  //draw the finish line
  strokeWeight(3);
  stroke(200, 0, 0);
  line(RACE_DISTANCE, 0, RACE_DISTANCE, height);
  
  //reset stroke
  strokeWeight(1);
  stroke(0);
  
  strokeWeight(50);
  stroke(135, 206, 250); // Light blue for viking longship waters
  line(0, (height/2)+150, width, (height/2)+150);
  
  //reset stroke
  strokeWeight(1);
  stroke(0);
}

void drawRacers()
{
    for (Racer r : r.getContestants())
    {
      int x = r.getPosition();
      int y = racerWidth;
    
       if (r instanceof Tortoise)
       {
         fill(23,110,46);
         circle(x, y, 50); 
       }
       else if (r instanceof Hare)
       {
         fill(230,201,154);
         circle(x, y+150, 50);
       }
       else if (r instanceof Longship)
       {
         fill (100, 60, 30);
         circle(x, y+300, 50);
       }
       r.move();
       delay(10);
    }
}

void draw()
{
  background(255);                  // clear screen
  if (!r.raceOver())
  {
    r.runRace();
    drawStartFinish();
    drawRacers();
  }
  else
  {
    drawStartFinish();
    drawRacers();
    System.out.println("The race is over!");
    System.out.println("The winner is...." + r.getWinner());
    noLoop();
  }
}
