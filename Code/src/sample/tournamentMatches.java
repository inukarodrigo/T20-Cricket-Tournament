package sample;

import java.util.*;

public class tournamentMatches {
    private Scanner scanner = new Scanner(System.in);
    private teamWonLooseDecisionInOneMatch teamWonLooseDecisionInOneMatch;
    private overviewOfAMatchSummery overviewOfAMatchSummery;
    private positionOfTeams positionOfTeams;
    private best5BowlersAndBatsman best5BowlersAndBatsman;
    private afganistanPlayerProfile afganistanPlayerProfile;
    private australiaPlayerProfile australiaPlayerProfile;
    private bangladeshPlayerProfile bangladeshPlayerProfile;
    private englandPlayerProfile englandPlayerProfile;
    private indiaPlayerProfile indiaPlayerProfile;
    private newZealandPlayerProfile newZealandPlayerProfile;
    private pakistanPlayerProfile pakistanPlayerProfile;
    private sriLankaPlayerProfile sriLankaPlayerProfile;


    public tournamentMatches(sample.teamWonLooseDecisionInOneMatch teamWonLooseDecisionInOneMatch, overviewOfAMatchSummery overviewOfAMatchSummery, positionOfTeams positionOfTeams, sample.best5BowlersAndBatsman best5BowlersAndBatsman, sample.afganistanPlayerProfile afganistanPlayerProfile, sample.australiaPlayerProfile australiaPlayerProfile, sample.bangladeshPlayerProfile bangladeshPlayerProfile, sample.englandPlayerProfile englandPlayerProfile, sample.indiaPlayerProfile indiaPlayerProfile, sample.newZealandPlayerProfile newZealandPlayerProfile, sample.pakistanPlayerProfile pakistanPlayerProfile, sample.sriLankaPlayerProfile sriLankaPlayerProfile) {
        this.teamWonLooseDecisionInOneMatch = teamWonLooseDecisionInOneMatch;
        this.overviewOfAMatchSummery = overviewOfAMatchSummery;
        this.positionOfTeams = positionOfTeams;
        this.best5BowlersAndBatsman = best5BowlersAndBatsman;
        this.afganistanPlayerProfile = afganistanPlayerProfile;
        this.australiaPlayerProfile = australiaPlayerProfile;
        this.bangladeshPlayerProfile = bangladeshPlayerProfile;
        this.englandPlayerProfile = englandPlayerProfile;
        this.indiaPlayerProfile = indiaPlayerProfile;
        this.newZealandPlayerProfile = newZealandPlayerProfile;
        this.pakistanPlayerProfile = pakistanPlayerProfile;
        this.sriLankaPlayerProfile = sriLankaPlayerProfile;
    }

    String firstTeamWhoQualifiedForFinals;
    String secondTeamWhoQualifiedForFinals;
    public void groupMatches(ArrayList group,int count){
        for (int i=0;i<3;i++){
            for (int j=i+1;j<4;j++){
                matchBetweenTwoTeams((Dictionary) group.get(i),(Dictionary) group.get(j));
            }
        }
        if (count==1){
            firstTeamWhoQualifiedForFinals = displayTeamWhoQualifiedForFinals(group);
        }else if (count==2){
            secondTeamWhoQualifiedForFinals = displayTeamWhoQualifiedForFinals(group);
        }
    }
    public void matchBetweenTwoTeams(Dictionary firstTeamProfile,Dictionary secondTeamProfile){
        Dictionary teamProfile1 = firstTeamProfile;
        Dictionary teamProfile2 = secondTeamProfile;

        //Resetting arraylists after each match
        teamWonLooseDecisionInOneMatch.getTeam1Batting().removeAll(teamWonLooseDecisionInOneMatch.getTeam1Batting());
        teamWonLooseDecisionInOneMatch.getTeam2Batting().removeAll(teamWonLooseDecisionInOneMatch.getTeam2Batting());
        teamWonLooseDecisionInOneMatch.getTeam1Bowling().removeAll(teamWonLooseDecisionInOneMatch.getTeam1Bowling());
        teamWonLooseDecisionInOneMatch.getTeam2Bowling().removeAll(teamWonLooseDecisionInOneMatch.getTeam2Bowling());

        teamWonLooseDecisionInOneMatch.wonLooseDecision(teamProfile1.get("Name").toString(),teamProfile2.get("Name").toString());
        System.out.println("The match between "+teamProfile1.get("Name").toString()+" and "+teamProfile2.get("Name").toString());
//        getUserInputAndDisplayMatchSummery(option);
        //Resetting some values after the match from player profiles
//        resetPlayerFeaturesInOneTeam(teamProfile1.get("Name").toString());
//        resetPlayerFeaturesInOneTeam(teamProfile2.get("Name").toString());

//        displayBest5BowlersOrBatsmen(askUserToDisplayBest5Batsmen,askUserToDisplayBest5Bowlers);
//        displayTournamentStanding(askUserToDisplayTournamentStanding);

    }
    public void getUserInputAndDisplayMatchSummery(String askUserToDisplayMatchSummery){
        String askForMatchSummery = askUserToDisplayMatchSummery;
        if (askForMatchSummery.toLowerCase().equals("yes")){
            overviewOfAMatchSummery.displayMatchSummery();
        }
    }
    public void resetPlayerFeaturesInOneTeam(String team){
        switch (team){
            case "Afganistan":
                teamWonLooseDecisionInOneMatch.resetPlayerFeaturesAfterEachMatch(afganistanPlayerProfile.getAfganistanTeam());
                break;
            case "Australia":
                teamWonLooseDecisionInOneMatch.resetPlayerFeaturesAfterEachMatch(australiaPlayerProfile.getAustraliaTeam());
                break;
            case "Bangladesh":
                teamWonLooseDecisionInOneMatch.resetPlayerFeaturesAfterEachMatch(bangladeshPlayerProfile.getBangladeshTeam());
                break;
            case "England":
                teamWonLooseDecisionInOneMatch.resetPlayerFeaturesAfterEachMatch(englandPlayerProfile.getEnglandTeam());
                break;
            case "India":
                teamWonLooseDecisionInOneMatch.resetPlayerFeaturesAfterEachMatch(indiaPlayerProfile.getIndiaTeam());
                break;
            case "New Zealand":
                teamWonLooseDecisionInOneMatch.resetPlayerFeaturesAfterEachMatch(newZealandPlayerProfile.getNewZealandTeam());
                break;
            case "Pakistan":
                teamWonLooseDecisionInOneMatch.resetPlayerFeaturesAfterEachMatch(pakistanPlayerProfile.getPakistanTeam());
                break;
            case "Sri Lanka":
                teamWonLooseDecisionInOneMatch.resetPlayerFeaturesAfterEachMatch(sriLankaPlayerProfile.getSriLankaTeam());
                break;
        }
    }
    public void displayBest5BowlersOrBatsmen(String askUserToDisplayBest5Batsmen,String askUserToDisplayBest5Bowlers){
        String choiceToDisplayBest5Bowlers = askUserToDisplayBest5Bowlers;
        String choiceToDisplayBest5Batsmen = askUserToDisplayBest5Batsmen;
        if (choiceToDisplayBest5Bowlers.toLowerCase().equals("yes")){
            best5BowlersAndBatsman.displayBest5Bowlers();

        }
        if (choiceToDisplayBest5Batsmen.toLowerCase().equals("yes")){
            best5BowlersAndBatsman.displayBest5Batsmen();
        }
    }

    public void displayTournamentStanding(String askUserToDisplayTournamentStanding){
        String option = askUserToDisplayTournamentStanding;
        if (option.toLowerCase().equals("yes")){
            positionOfTeams.printPosition();
        }
    }

    public String displayTeamWhoQualifiedForFinals(ArrayList group){
        int[] position = new int[group.size()];
        for (int i=0;i<group.size();i++){
            Dictionary teamProfile = (Dictionary) group.get(i);
            position[i] = (Integer) teamProfile.get("Position");
        }
        Arrays.sort(position); //Sorting the array in ascending order
        for (int i=0;i<group.size();i++){
            Dictionary teamProfile = (Dictionary) group.get(i);
            if ((Integer) teamProfile.get("Position") == position[0]){
                System.out.println(teamProfile.get("Name")+" qualified for finals");
                return (String) teamProfile.get("Name");
            }
        }return null;
    }


}
