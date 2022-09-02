package sample;

import java.util.ArrayList;

public class listOfAllTheTeams {
    //This class is used to create an arrayList of dictionaries of all the teams
    //and return the arrayList
    //using composition
    private dictionariesForEachTeamProfiles dictionariesForEachTeamProfiles;

    public listOfAllTheTeams(dictionariesForEachTeamProfiles dictionariesForEachTeamProfiles) {
        this.dictionariesForEachTeamProfiles = dictionariesForEachTeamProfiles;
    }
    private ArrayList allTheTeams=new ArrayList();

    //Creating an ArrayList which consists of group A teams dictionaries
    private ArrayList groupA = new ArrayList();

    //Creating an ArrayList which consists of group B teams dictionaries
    private ArrayList groupB = new ArrayList();
    public void addValuesToTheArray(){
        //Inserting values to the array
        allTheTeams.add(dictionariesForEachTeamProfiles.getAfganistan());
        allTheTeams.add(dictionariesForEachTeamProfiles.getAustralia());
        allTheTeams.add(dictionariesForEachTeamProfiles.getBangladesh());
        allTheTeams.add(dictionariesForEachTeamProfiles.getEngland());
        allTheTeams.add(dictionariesForEachTeamProfiles.getIndia());
        allTheTeams.add(dictionariesForEachTeamProfiles.getNewZealand());
        allTheTeams.add(dictionariesForEachTeamProfiles.getPakistan());
        allTheTeams.add(dictionariesForEachTeamProfiles.getSriLanka());

        //Adding elements to the group A
        groupA.add(0, dictionariesForEachTeamProfiles.getAfganistan());
        groupA.add(1, dictionariesForEachTeamProfiles.getAustralia());
        groupA.add(2, dictionariesForEachTeamProfiles.getBangladesh());
        groupA.add(3, dictionariesForEachTeamProfiles.getEngland());

        //Adding elements to the group B
        groupB.add(0, dictionariesForEachTeamProfiles.getIndia());
        groupB.add(1, dictionariesForEachTeamProfiles.getNewZealand());
        groupB.add(2, dictionariesForEachTeamProfiles.getPakistan());
        groupB.add(3, dictionariesForEachTeamProfiles.getSriLanka());
    }

    public ArrayList getAllTheTeams() {
        return allTheTeams;
    }

    public ArrayList getGroupA() {
        return groupA;
    }

    public ArrayList getGroupB() {
        return groupB;
    }
}
