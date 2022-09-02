package sample;

import java.util.ArrayList;
import java.util.Dictionary;
import java.util.Hashtable;
import java.util.Random;

public class teamWonLooseDecisionInOneMatch {
    private listOfAllThePlayers listOfAllThePlayers;
    private listOfAllTheTeams listOfAllTheTeams;
    private WeightedRandom possibleThingsThatCanHappenToABall = new WeightedRandom();
    private ArrayList Team1Batting = new ArrayList();
    private ArrayList Team1Bowling = new ArrayList();
    private ArrayList Team2Batting = new ArrayList();
    private ArrayList Team2Bowling = new ArrayList();
    Random random = new Random();

    private Hashtable <String,String> innings = new Hashtable<String,String>();

    private final String[] toss = {"Head","Tail"};
    private final String[] Play = {"Bat","Ball"};


    //Assigning initial values for the specific variables
    int ballsTookForScoring = 0;
    int scoresTakenInAMatchByOnePlayer = 0;
    int player = 0;
    int totalBallsBowled = 0; //This is used to find if a player stays till the last over
    int totalMarksScoredByTeam1 = 0;
    int totalMarksScoredByTeam2 = 0;
    String team1; //These variables are used by displayMatchSummeryAndStoringToAFile class
    String team2;

    public teamWonLooseDecisionInOneMatch(sample.listOfAllThePlayers listOfAllThePlayers,sample.listOfAllTheTeams listOfAllTheTeams) {
        this.listOfAllThePlayers = listOfAllThePlayers;
        this.listOfAllTheTeams = listOfAllTheTeams;
    }

    public void wonLooseDecision(String team1, String team2){
        this.team1 = team1;
        this.team2 = team2;
        assigningBowlersAndBatsman(team1,Team1Batting,Team1Bowling);
        assigningBowlersAndBatsman(team2,Team2Batting,Team2Bowling);
        findTeamWhoWonTheTossAndTheirDecision(team1,team2);
        resetInitialValues();
        for (int i=0;i<20;i++){
            //1st innings (Team1 bat and Team2 ball)
            getSummeryOfAnOverAndDoChangesAccordingly(Team1Batting,Team2Bowling);
        }
        //Resetting initial values after 1st innings
        resetInitialValues();
        for (int i=0;i<20;i++){
            //2nd innings (Team2 bat and Team1 ball)
            getSummeryOfAnOverAndDoChangesAccordingly(Team2Batting,Team1Bowling);
        }
        //Updating relevant features from player profile after the end of the match
        updatingRelevantFeaturesFromEachAndEveryPlayerProfile();
        updatingRelevantFeaturesFromTeamProfile(listOfAllTheTeams.getAllTheTeams(),team1,team2);

        /*
        This method will reset some of the temporary features of player profile to
        default values.If we want to display player profiles,then we should call
        player profiles before calling the below method
         */
//        resetPlayerFeaturesAfterEachMatch(Team1Batting);
//        resetPlayerFeaturesAfterEachMatch(Team2Batting);
    }

    public void resetPlayerFeaturesAfterEachMatch(ArrayList team){
        for (int i=0;i<team.size();i++){
            Dictionary playerProfile = (Dictionary) team.get(i);
            playerProfile.put("Scores taken in a match",0);
            playerProfile.put("Wickets taken in a match",0);
            playerProfile.put("Balls took for scoring",0);
            playerProfile.put("Overs Bowled",0);
            playerProfile.put("Method of dismissal","Not played");
        }
    }

    private void assigningBowlersAndBatsman(String team, ArrayList teamBatting,ArrayList teamBowling){
        //This method will assign all the players in a country to Team1Batting or Team2Batting
        //and also will assign players for team1Bowling or team2Bowling
        switch (team){
            case "Afganistan":
                storePlayersOfASpecificCountryToAnArray("Afganistan",teamBatting,teamBowling);
                break;
            case "Australia":
                storePlayersOfASpecificCountryToAnArray("Australia",teamBatting,teamBowling);
                break;
            case "Bangladesh":
                storePlayersOfASpecificCountryToAnArray("Bangladesh",teamBatting,teamBowling);
                break;
            case "England":
                storePlayersOfASpecificCountryToAnArray("England",teamBatting,teamBowling);
                break;
            case "India":
                storePlayersOfASpecificCountryToAnArray("India",teamBatting,teamBowling);
                break;
            case "New Zealand":
                storePlayersOfASpecificCountryToAnArray("New Zealand",teamBatting,teamBowling);
                break;
            case "Pakistan":
                storePlayersOfASpecificCountryToAnArray("Pakistan",teamBatting,teamBowling);
                break;
            case "Sri Lanka":
                storePlayersOfASpecificCountryToAnArray("Sri Lanka",teamBatting,teamBowling);
                break;
        }
    }

    private void findTeamWhoWonTheTossAndTheirDecision(String team1,String team2){
        String[] teams = {team1,team2};
        int randomIndex = random.nextInt(teams.length);
        String TeamWhoCallsTheToss = teams[randomIndex]; //Always the team who calls the toss select their choice as head

        int randomIndex1 = random.nextInt(toss.length);  //To randomize the result of the coin flip
        String choice = toss[randomIndex1];
        if (choice.equals("Head")){
            if (TeamWhoCallsTheToss.equals(teams[0])){
                innings.put("Team who won the toss",TeamWhoCallsTheToss);
            }else
                innings.put("Team who won the toss",teams[1]);
        }else {
            if (TeamWhoCallsTheToss.equals(teams[0])) {
                innings.put("Team who won the toss", teams[1]);
            }else
                innings.put("Team who won the toss",teams[0]);
        }
        int randomIndexForPlay = random.nextInt(Play.length);
        innings.put("Decision of the team who won the toss(Bat/Ball)",Play[randomIndexForPlay]);
    }

    private void getSummeryOfAnOverAndDoChangesAccordingly(ArrayList teamBatting,ArrayList teamBowling){
        //This will randomly pick a bowler from opposite team
        Dictionary randomBowlerFromTeam2 =(Dictionary) teamBowling.get(random.nextInt(teamBowling.size()));


        ArrayList ArrayOfPossibleThingsThatCanHappenToABallInAnOver = new ArrayList();
        ArrayOfPossibleThingsThatCanHappenToABallInAnOver = getAnArrayOfPossibleThingsThatCanHappenToABallInAnOver();
        //This will increment the number of overs bowled by a bowler

        randomBowlerFromTeam2.put("Overs Bowled",(Integer)randomBowlerFromTeam2.get("Overs Bowled")+1);
        for (int j=0;j<ArrayOfPossibleThingsThatCanHappenToABallInAnOver.size();j++){
            if (this.player!=10){
                Dictionary playerProfile = (Dictionary) teamBatting.get(player);
                doingChangesIfThePlayerScoreInABall((String) ArrayOfPossibleThingsThatCanHappenToABallInAnOver.get(j),playerProfile);
                doingChangesIfThePlayerGotOutInABall((String) ArrayOfPossibleThingsThatCanHappenToABallInAnOver.get(j),playerProfile,randomBowlerFromTeam2);
                doingChangesIfAPlayerStaysTillLastOver(playerProfile);
            }
            else if (this.player==10){
                break;
            }
        }
    }

    private void resetInitialValues(){
        this.ballsTookForScoring = 0;
        this.scoresTakenInAMatchByOnePlayer = 0;
        this.player = 0;
        this.totalBallsBowled = 0;
        this.totalMarksScoredByTeam1 = 0;
        this.totalMarksScoredByTeam2 = 0;
    }

    private void updatingRelevantFeaturesFromEachAndEveryPlayerProfile(){
        for (int i=0;i<Team1Batting.size();i++){
            Dictionary playerProfile = (Dictionary) Team1Batting.get(i);
            playerProfile.put("Innings",(Integer)playerProfile.get("Innings")+2);  //Increment by 2 because there are 2 innings in a match
            playerProfile.put("Matches",(Integer)playerProfile.get("Matches")+1);
            totalMarksScoredByTeam1 +=(Integer) playerProfile.get("Scores taken in a match");

        }
        for (int i=0;i<Team2Batting.size();i++){
            Dictionary playerProfile = (Dictionary) Team2Batting.get(i);
            playerProfile.put("Innings",(Integer)playerProfile.get("Innings")+2);  //Increment by 2 because there are 2 innings in a match
            playerProfile.put("Matches",(Integer)playerProfile.get("Matches")+1);
            totalMarksScoredByTeam2 +=(Integer) playerProfile.get("Scores taken in a match");

        }
    }
    private void updatingRelevantFeaturesFromTeamProfile(ArrayList allTheTeams,String team1,String team2){
        for (int i=0;i<allTheTeams.size();i++){
            Dictionary teamProfile = (Dictionary) allTheTeams.get(i);
            if (teamProfile.get("Name").equals(team1) || teamProfile.get("Name").equals(team2)){
                teamProfile.put("No of matches",(Integer)teamProfile.get("No of matches")+1);
            }
            if (teamProfile.get("Name").equals(team1)){
                if (totalMarksScoredByTeam1>totalMarksScoredByTeam2){
                    teamProfile.put("Rating",(Double)teamProfile.get("Rating")+(totalMarksScoredByTeam1/10));
                }else {
                    teamProfile.put("Rating", (Double) teamProfile.get("Rating") + (totalMarksScoredByTeam1 / 20));
                }
            }else if (teamProfile.get("Name").equals(team2)){
                if (totalMarksScoredByTeam2>totalMarksScoredByTeam1){
                    teamProfile.put("Rating",(Double)teamProfile.get("Rating")+(totalMarksScoredByTeam2/10));
                }else {
                    teamProfile.put("Rating", (Double) teamProfile.get("Rating") + (totalMarksScoredByTeam2 / 20));
                }
            }
        }
    }

    private void doingChangesIfThePlayerScoreInABall(String score,Dictionary playerProfile){
        //If player scored 0,1,2,3,4,5 or 6,the relevant fields will be updated.
        for (int i=0;i<=6;i++){
            try {
                if (i==Integer.parseInt(score)){
                    this.ballsTookForScoring+=1;
                    this.totalBallsBowled+=1;
                    this.scoresTakenInAMatchByOnePlayer+=i;
                    playerProfile.put("Balls took for scoring",ballsTookForScoring);
                    playerProfile.put("Scores taken in a match",scoresTakenInAMatchByOnePlayer);
                    break;
                }
            }catch (NumberFormatException e){
                break;
            }
        }
    }
    private void doingChangesIfThePlayerGotOutInABall(String option,Dictionary playerProfile,Dictionary randomBowlerFromTeam2){
        if (option.equals("caught") || option.equals("bowled") || option.equals("leg by wicket") || option.equals("run out") || option.equals("stumped")){
            playerProfile.put("Method of dismissal",option);
            if ((Integer)playerProfile.get("Scores taken in a match")>=50){
                int previousValue = (Integer) playerProfile.get("50s");
                playerProfile.put("50s",previousValue+1);
            }
            if ((Integer)playerProfile.get("Best")<(Integer) playerProfile.get("Scores taken in a match")){
                playerProfile.put("Best",(Integer)playerProfile.get("Scores taken in a match"));
            }
            randomBowlerFromTeam2.put("Wickets taken in a match",(Integer)randomBowlerFromTeam2.get("Wickets taken in a match")+1); //This variable resets to 0 after each match
            randomBowlerFromTeam2.put("Wickets",(Integer)randomBowlerFromTeam2.get("Wickets")+1); //Total wickets gained by bowlers in each match,used to get best 5 bowlers
            int totalRunsInPreviousMatch = (Integer) playerProfile.get("Runs");
            playerProfile.put("Runs",totalRunsInPreviousMatch+(Integer) playerProfile.get("Scores taken in a match"));
            this.ballsTookForScoring += 1;
            this.totalBallsBowled+=1;
            playerProfile.put("Balls took for scoring",ballsTookForScoring);
            this.player+=1;
            this.ballsTookForScoring = 0;
            this.scoresTakenInAMatchByOnePlayer = 0;

        }
    }

    private void doingChangesIfAPlayerStaysTillLastOver(Dictionary playerProfile){
        if (this.totalBallsBowled==120 && this.player!=10){
            playerProfile.put("Runs",(Integer)playerProfile.get("Runs")+(Integer) playerProfile.get("Scores taken in a match"));
            playerProfile.put("Method of dismissal","Played till the last over.");
            playerProfile.put("Balls took for scoring",ballsTookForScoring);
            if ((Integer)playerProfile.get("Best")<(Integer) playerProfile.get("Scores taken in a match")){
                playerProfile.put("Best",(Integer)playerProfile.get("Scores taken in a match"));
            }
        }
    }

    private ArrayList getAnArrayOfPossibleThingsThatCanHappenToABallInAnOver(){
        ArrayList ArrayOfPossibleThingsThatCanHappenToABallInAnOver = new ArrayList();
        possibleThingsThatCanHappenToABall.addEntry("0",  28);
        possibleThingsThatCanHappenToABall.addEntry("1",   23);
        possibleThingsThatCanHappenToABall.addEntry("2",  22);
        possibleThingsThatCanHappenToABall.addEntry("3",   5);
        possibleThingsThatCanHappenToABall.addEntry("4",  5);
        possibleThingsThatCanHappenToABall.addEntry("5",  5);
        possibleThingsThatCanHappenToABall.addEntry("6",  5);
        possibleThingsThatCanHappenToABall.addEntry("caught",  2);
        possibleThingsThatCanHappenToABall.addEntry("bowled",  2);
        possibleThingsThatCanHappenToABall.addEntry("leg by wicket",  1);
        possibleThingsThatCanHappenToABall.addEntry("run out",  1);
        possibleThingsThatCanHappenToABall.addEntry("stumped",  1);

        for (int i = 0; i < 6; i++) {
            ArrayOfPossibleThingsThatCanHappenToABallInAnOver.add(possibleThingsThatCanHappenToABall.getRandom());
        }
        return ArrayOfPossibleThingsThatCanHappenToABallInAnOver;
    }

    private void storePlayersOfASpecificCountryToAnArray(String countryName,ArrayList teamBatting,ArrayList teamBowling){
        //This method will filter players related to one country and store that dictionaries
        //to one list and again filter bowler and all rounders and store that in another array
        for (int i=0;i<listOfAllThePlayers.getAllThePlayers().size();i++){
            Dictionary playerProfile = (Dictionary) listOfAllThePlayers.getAllThePlayers().get(i);
            Object country = playerProfile.get("country");
            Object role = playerProfile.get("Role");
            if (country.equals(countryName)){
                teamBatting.add(playerProfile);
            }
            if (country.equals(countryName) && (role.equals("Bowler") || role.equals("All Rounder"))){
                teamBowling.add(playerProfile);
            }
        }
    }

    public Hashtable<String, String> getInnings() {
        return innings;
    }

    public ArrayList getTeam1Batting() {
        return Team1Batting;
    }

    public ArrayList getTeam1Bowling() {
        return Team1Bowling;
    }

    public ArrayList getTeam2Batting() {
        return Team2Batting;
    }

    public ArrayList getTeam2Bowling() {
        return Team2Bowling;
    }
}
