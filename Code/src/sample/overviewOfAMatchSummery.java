package sample;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Dictionary;
import java.util.Hashtable;

public class overviewOfAMatchSummery {
    teamWonLooseDecisionInOneMatch teamWonLooseDecisionInOneMatch;

    public overviewOfAMatchSummery(sample.teamWonLooseDecisionInOneMatch teamWonLooseDecisionInOneMatch) {
        this.teamWonLooseDecisionInOneMatch = teamWonLooseDecisionInOneMatch;
    }

    public void displayMatchSummery(){
        System.out.println();
        //Printing who won the toss and the decision of the team who won the toss
        for (String name:teamWonLooseDecisionInOneMatch.getInnings().keySet()){
            String key = name.toString();
            String value = teamWonLooseDecisionInOneMatch.getInnings().get(name).toString();
            System.out.println(key+": "+ value);
        }

        //Match summery in Team1 side
        System.out.println();
        System.out.println("Team "+teamWonLooseDecisionInOneMatch.team1+": ");
        System.out.println();
        //Printing each bowler's wickets with the name in team 1
        bowlerWickets(1);

        //Printing total wickets taken by bowling team when bowling:
        displayTotalWickets(1);
        System.out.println("*************************");

        //Printing each batsman's score with the name and balls took for scoring and method of dismissal if out
        displayBatsmanDetail(1);

        //Printing total runs taken by batting side:
        totalRunsOfTheBattingSide(1);
        System.out.println("*************************");

        //Match summery in Team2 Side:
        System.out.println();
        System.out.println("Team "+teamWonLooseDecisionInOneMatch.team2+": ");

        //Printing each bowler's wickets with the name in team 2
        bowlerWickets(2);

        //Printing total wickets taken by bowling team when bowling:
        displayTotalWickets(2);
        System.out.println("*************************");

        //Printing each batsman's score with the name and balls took for scoring and method of dismissal if out
        System.out.println();
        displayBatsmanDetail(2);

        //Printing total runs taken by batting side:
        totalRunsOfTheBattingSide(2);
        System.out.println("*************************");

        //Printing which team won the match:
        displayTeamWhoWonTheMatch();
    }
    private void bowlerWickets(int teamNumber){
        ArrayList Array = new ArrayList();
        Array = getTeamBowlingOrBatting(teamNumber,"ball");
        for (int i=0;i<Array.size();i++){
            Hashtable playerProfile = (Hashtable) Array.get(i);
            for (Object name:playerProfile.keySet()){
                String key = name.toString();
                String value = playerProfile.get(name).toString();
                if (key.equals("Name") || (key.equals("Wickets taken in a match")) || (key.equals("Overs Bowled"))) {
                    System.out.println(key + ": " + value);
                }
            }
            System.out.println();
        }
    }

    private void displayTotalWickets(int teamNumber){
        String countryName=null;
        if (teamNumber==1){
            countryName = teamWonLooseDecisionInOneMatch.team1;
        }else if (teamNumber == 2){
            countryName = teamWonLooseDecisionInOneMatch.team2;
        }
        int totWickets = calculateTotalWicketsTakenByOneSide(teamNumber);
        System.out.println("Total wickets taken by "+countryName+" team is "+totWickets);
    }
    private int calculateTotalWicketsTakenByOneSide(int teamNumber){
        int totWickets = 0;
        ArrayList teamBowling = new ArrayList();
        teamBowling = getTeamBowlingOrBatting(teamNumber,"ball");
        for (int i=0;i<teamBowling.size();i++){
            Dictionary playerProfile = (Dictionary) teamBowling.get(i);
            totWickets+=(Integer) playerProfile.get("Wickets taken in a match");
        }
        return totWickets;
    }
    private void displayBatsmanDetail(int teamNumber){
        ArrayList teamBatting = new ArrayList();
        teamBatting = getTeamBowlingOrBatting(teamNumber,"bat");
        for (int i=0;i<teamBatting.size();i++){
            Hashtable playerProfile = (Hashtable) teamBatting.get(i);
            for (Object name:playerProfile.keySet()){
                String key = name.toString();
                String value = playerProfile.get(name).toString();
                if (key.equals("Name") || key.equals("Scores taken in a match") || key.equals("Balls took for scoring") || key.equals("Method of dismissal")){
                    System.out.println(key +": "+value);
                }
            }
            System.out.println();
        }

    }
    private void totalRunsOfTheBattingSide(int teamNumber){
        if (teamNumber==1){
            System.out.println("Total marks of "+teamWonLooseDecisionInOneMatch.team1+" team is "+teamWonLooseDecisionInOneMatch.totalMarksScoredByTeam1);
        }else if (teamNumber==2){
            System.out.println("Total marks of "+teamWonLooseDecisionInOneMatch.team2+" team is "+teamWonLooseDecisionInOneMatch.totalMarksScoredByTeam2);
        }
    }
    private void displayTeamWhoWonTheMatch(){
        int totalInTeam1 = teamWonLooseDecisionInOneMatch.totalMarksScoredByTeam1;
        String team1 = teamWonLooseDecisionInOneMatch.team1;
        int totalInTeam2 = teamWonLooseDecisionInOneMatch.totalMarksScoredByTeam2;
        String team2 = teamWonLooseDecisionInOneMatch.team2;
        if (totalInTeam1>totalInTeam2){
            System.out.println(team1+" won the match");
        }else
            System.out.println(team2+" won the match");
    }


    private ArrayList getTeamBowlingOrBatting(int teamNumber, String option){
        if (teamNumber==1 && option.equals("ball")){
            return teamWonLooseDecisionInOneMatch.getTeam1Bowling();
        }else if (teamNumber==2 && option.equals("ball")){
            return teamWonLooseDecisionInOneMatch.getTeam2Bowling();
        }else if (teamNumber==1 && option.equals("bat")){
            return teamWonLooseDecisionInOneMatch.getTeam1Batting();
        }else
            return teamWonLooseDecisionInOneMatch.getTeam2Batting();
    }
}
