/*
 * PudellGoalie
 * Writes basic statistics/averages about soccer playes in a nice format
 * Author:Tristan P.-S.
 */ 
public class PudellGoalie extends PudellSoccerPlayer
{
  private int saves;//blocks
  private int goalsAllowed;//goals scored when in goal
  private double savePercent;//saves/saves+goalsAllowed
  private double avgGoalsAllowed;//goals allowed per game / amount of games
  private double avgSaves;//Saves/ amt of games
  private double avgShutouts;//shutouts/ amt of games
  private int shutouts;//when the other team doesn't score
  private boolean goalieChek;//check to see if the player is a goalie before toString()
  public PudellGoalie(int sa, int ga, int sh, int g, int a, int gp, String n, int t, boolean st, String tn, int f, int s, String po)
  {
    super(g, a, gp, n, t , st, tn, f, s, po);
    saves=sa;
    goalsAllowed=ga;
    shutouts=sh;
    avgGoalsAllowed=ga/getGamesPlayed();
    avgSaves=sa/getGamesPlayed();
    avgShutouts=sh/getGamesPlayed();
    savePercent=sa/(ga+sa);
  }//PudellGoalie normal constructor
  public PudellGoalie()
  {
    saves=0;
    goalsAllowed=0;
    shutouts=0;
    avgGoalsAllowed=0;
    avgSaves=0;
    avgShutouts=0;
    savePercent=0;
  }//PudellGoalie default constructor
public boolean  goalieCheck(String p)
 {
   if( p == "goalie")
     goalieChek=true;
   else
     goalieChek=false;
    return goalieChek;
 }// goalieCheck method, sees if subclass should print its values
public String toString()
{
  if (goalieChek=true)
  {
  return getToStringStuff()+"\n Saves: "+saves+"\n Goals Allowed: "+goalsAllowed+"\n Shutouts: "+shutouts+"\nSave Percentage: "+savePercent+"\n Average Saves: "+avgSaves+"\n Average Goals Allowed: "+avgGoalsAllowed+ 
    "\n Average Shutouts: "+avgShutouts;
  }//if statement
  else
  {
    return "";
  }//else statement
} //toString(printing) method
}//PudellGoalie