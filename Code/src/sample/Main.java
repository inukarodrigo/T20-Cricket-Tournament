package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.util.ArrayList;
import java.util.Dictionary;
import java.util.Scanner;

public class Main extends Application {
    //Creating objects using classes
    private static dictionariesForEachTeamProfiles dictionariesForEachTeamProfiles =new dictionariesForEachTeamProfiles();
    private static afganistanPlayerProfile afganistanPlayerProfile=new afganistanPlayerProfile();
    private static australiaPlayerProfile australiaPlayerProfile=new australiaPlayerProfile();
    private static bangladeshPlayerProfile bangladeshPlayerProfile=new bangladeshPlayerProfile();
    private static englandPlayerProfile englandPlayerProfile=new englandPlayerProfile();
    private static indiaPlayerProfile indiaPlayerProfile=new indiaPlayerProfile();
    private static newZealandPlayerProfile newZealandPlayerProfile=new newZealandPlayerProfile();
    private static pakistanPlayerProfile pakistanPlayerProfile=new pakistanPlayerProfile();
    private static sriLankaPlayerProfile sriLankaPlayerProfile=new sriLankaPlayerProfile();


    private static listOfAllThePlayers listOfAllThePlayers=new listOfAllThePlayers(afganistanPlayerProfile,australiaPlayerProfile,bangladeshPlayerProfile,englandPlayerProfile,indiaPlayerProfile,newZealandPlayerProfile,pakistanPlayerProfile,sriLankaPlayerProfile);

    //This object will be used to display player profiles where ever it is needed
    private static editDeleteAndDisplayPlayerProfiles editDeleteAndDisplayPlayerProfiles =new editDeleteAndDisplayPlayerProfiles(listOfAllThePlayers.getAllThePlayers());

    //This object will store dictionaries created for each team profile in an arrayList
    private static listOfAllTheTeams listOfAllTheTeams=new listOfAllTheTeams(dictionariesForEachTeamProfiles);

    //This object will be used to display player profiles where ever it is needed
    private static editDeleteAndDisplayTeamProfile editDeleteAndDisplayTeamProfile =new editDeleteAndDisplayTeamProfile(listOfAllTheTeams.getAllTheTeams());

    //This object will be used to get the match summery of 2 teams
    private static teamWonLooseDecisionInOneMatch teamWonLooseDecisionInOneMatch = new teamWonLooseDecisionInOneMatch(listOfAllThePlayers,listOfAllTheTeams);

    //This object will be used to get the the position of the teams according to the rating
    private static positionOfTeams positionOfTeams = new positionOfTeams(listOfAllTheTeams);

    //This object will display a match summery for a given match
    private static overviewOfAMatchSummery matchSummery = new overviewOfAMatchSummery(teamWonLooseDecisionInOneMatch);

    //This object will display best 5 bowlers and batsmen
    private static best5BowlersAndBatsman best5BowlersAndBatsman = new best5BowlersAndBatsman(listOfAllThePlayers.getAllThePlayers());

    //This object will display match information of group A and B matches
    private static tournamentMatches tournamentMatches = new tournamentMatches(teamWonLooseDecisionInOneMatch,matchSummery, positionOfTeams,best5BowlersAndBatsman,afganistanPlayerProfile,australiaPlayerProfile,bangladeshPlayerProfile,englandPlayerProfile,indiaPlayerProfile,newZealandPlayerProfile,pakistanPlayerProfile,sriLankaPlayerProfile);


    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("guiAskingForEditAndDeleteTeamProfile.fxml"));
        primaryStage.setScene(new Scene(root, 1300, 700));
        primaryStage.show();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Adding values to the allThePlayers arrayList
        listOfAllThePlayers.insertValuesToTheArrayList();

        //Adding values to the allTheTeams arrayList
        listOfAllTheTeams.addValuesToTheArray();

        launch(args);

    }
    public void editPlayerProfile(String playerName,String feature,String newVal){
        editDeleteAndDisplayPlayerProfiles.getUsersInputAndEditPlayerProfile(playerName,feature,newVal);
    }
    public void deletePlayerProfile(String playerName){
        editDeleteAndDisplayPlayerProfiles.getUsersInputAndDeletePlayerProfiles(playerName);
    }

    public void editTeamProfile(String option,String teamName,String fieldName,String newValue) {
        editDeleteAndDisplayTeamProfile.getUsersInputAndEditTeamProfile(option,teamName,fieldName,newValue);
    }
    public void deleteTeamProfile(String team){
        editDeleteAndDisplayTeamProfile.getUsersInputAndDeleteTeamProfile(team);
    }
    public void displayTeamProfile(String team){
        editDeleteAndDisplayTeamProfile.displayTeamProfile(team);
    }
    public void displayPlayerProfile(String team){
        if (team.equals("Afganistan") || team.equals("Australia") || team.equals("Bangladesh") || team.equals("England") || team.equals("India") || team.equals("New Zealand") || team.equals("Pakistan") || team.equals("Sri Lanka")){
            editDeleteAndDisplayPlayerProfiles.displayPlayerProfile(team);
        }else {
            System.out.println("Invalid team name.");
        }
    }
    public void clickedOnce(String askToDisplayMatchSummery,String askToDisplayBest5Bowlers,String askToDisplayBest5Batsmen,String askToDisplayTournamentStanding,int outerLoopCount,int innerLoopCount,String groupAOrB){
        ArrayList group = new ArrayList();
        if (groupAOrB.equals("A")){
             group = listOfAllTheTeams.getGroupA();
        }else {
             group = listOfAllTheTeams.getGroupB();
        }

        Dictionary team1 =(Dictionary) group.get(outerLoopCount);
        Dictionary team2 = (Dictionary) group.get(innerLoopCount);
        tournamentMatches.matchBetweenTwoTeams(team1,team2);
        getUserInputAndDisplayMatchSummery(askToDisplayMatchSummery);
        getUserInputAndDisplayBest5BatsmenAndBowlers(askToDisplayBest5Batsmen,askToDisplayBest5Bowlers);
        System.out.println();
        getUserInputAndDisplayTournamentStanding(askToDisplayTournamentStanding);
        tournamentMatches.resetPlayerFeaturesInOneTeam(team1.get("Name").toString());  //Reset some player features after each match
        tournamentMatches.resetPlayerFeaturesInOneTeam(team2.get("Name").toString());
    }
    public void displayTeamWhoQualifiedForFinals(String groupAOrB){
        ArrayList group = new ArrayList();
        if (groupAOrB.equals("A")){
            group = listOfAllTheTeams.getGroupA();
        }else {
            group = listOfAllTheTeams.getGroupB();
        }
        tournamentMatches.displayTeamWhoQualifiedForFinals(group);
    }
    public void getUserInputAndDisplayMatchSummery(String askUserToDisplayMatchSummery){
        tournamentMatches.getUserInputAndDisplayMatchSummery(askUserToDisplayMatchSummery);
    }
    public void getUserInputAndDisplayBest5BatsmenAndBowlers(String askUserToDisplayBest5Batsmen,String askUserToDisplayBest5Bowlers){
        tournamentMatches.displayBest5BowlersOrBatsmen(askUserToDisplayBest5Batsmen,askUserToDisplayBest5Bowlers);
    }
    public void getUserInputAndDisplayTournamentStanding(String askUserInputAndDisplayTournamentStanding){
        tournamentMatches.displayTournamentStanding(askUserInputAndDisplayTournamentStanding);
    }
}

