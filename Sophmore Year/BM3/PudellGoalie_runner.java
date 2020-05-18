/*
 * PudellGoalie_runner
 * Runner file for PudellGoalie
 * Author:Tristan P.-S.
 * Values of stuff in order:goals, assists,games played, player name,time played(minutes), still playing,
 * team name, fouls, shots, position
 * WARNING: IF TESTING, PLAYER NAME+TEAM NAME CAN ONLY BE ONE WORD
 * IF TESTING SUBCLASS ASWELL: saves,goals allowed,shutouts, goals, assists,games played, player name,time played(minutes), still playing,
 * team name, fouls, shots, position
 */ 
public class PudellGoalie_runner
{
  public static void main(String[] args)
  {
    PudellGoalie p1 = new PudellGoalie(3, 2, 12, 8, 5, 3, "Jim", 60, true, "Bois", 7, 8, "goalie");
    PudellGoalie p2 = new PudellGoalie();
    PudellGoalie p3 = new PudellGoalie(5, 12, 15, 10,5, 3, "Jim", 60, true, "Bois", 7, 8, "goalie");
    PudellSoccerPlayer p4 = new PudellSoccerPlayer(6,7,12,"George",70,true,"Dab",11,13,"forward");
    p1.goalieCheck(p1.getPosition());
    p2.goalieCheck(p2.getPosition());
    p3.goalieCheck(p3.getPosition());
    System.out.println(p1.toString());
    System.out.println(p2.toString());
    System.out.println(p3.toString());
    System.out.println(p4.toString());
  }//main method
}//PudellGoalie_runner