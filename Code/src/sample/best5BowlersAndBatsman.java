package sample;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Dictionary;

public class best5BowlersAndBatsman {
    private ArrayList allThePlayers = new ArrayList();
    private int[] maximumWicketsOrScoreTakenByPlayers = new int[5];

    public best5BowlersAndBatsman(ArrayList allThePlayers) {
        this.allThePlayers = allThePlayers;
    }

    public void displayBest5Bowlers(){
        addValuesToTheArrayAndSortInDescendingOrder("ball");
        int newLengthOfTheArray=removeDuplicateElementInAnArray(maximumWicketsOrScoreTakenByPlayers, maximumWicketsOrScoreTakenByPlayers.length);
        int noOfBestBowlers = 0;
        for (int i=0;i< newLengthOfTheArray;i++){
            for (int j=0;j<allThePlayers.size();j++){
                Dictionary playerProfile = (Dictionary) allThePlayers.get(j);
                if (maximumWicketsOrScoreTakenByPlayers[i]==(int)playerProfile.get("Wickets")){
                    System.out.println(playerProfile.get("Name")+" has taken "+ maximumWicketsOrScoreTakenByPlayers[i]+" wickets.");
                    noOfBestBowlers++;
                    if (noOfBestBowlers==5){
                        System.out.println("*************************");
                        break;
                    }
                }
            }
        }
    }
    public void displayBest5Batsmen(){
        addValuesToTheArrayAndSortInDescendingOrder("bat");
        int newLengthOfTheArray=removeDuplicateElementInAnArray(maximumWicketsOrScoreTakenByPlayers, maximumWicketsOrScoreTakenByPlayers.length);
        int noOfBestBatsmen = 0;
        for (int i=0;i< newLengthOfTheArray;i++){
            for (int j=0;j<allThePlayers.size();j++){
                Dictionary playerProfile = (Dictionary) allThePlayers.get(j);
                if (maximumWicketsOrScoreTakenByPlayers[i]==(int)playerProfile.get("Runs")){
                    System.out.println(playerProfile.get("Name")+" has taken "+ maximumWicketsOrScoreTakenByPlayers[i]+" runs.");
                    noOfBestBatsmen++;
                    if (noOfBestBatsmen==5){
                        break;
                    }
                }
            }
        }
    }

    private void addValuesToTheArrayAndSortInDescendingOrder(String option){
        String feature = null;
        if (option.equals("bat")){
            feature = "Runs";
        }else if (option.equals("ball")){
            feature = "Wickets";
        }
         Integer[] wicketsOrScoreOfAllThePlayers = new Integer[allThePlayers.size()];
         for (int i=0;i<allThePlayers.size();i++){
             Dictionary playerProfile = (Dictionary) allThePlayers.get(i);
             wicketsOrScoreOfAllThePlayers[i] = (Integer) playerProfile.get(feature);
         }
        Arrays.sort(wicketsOrScoreOfAllThePlayers, Collections.reverseOrder()); //Sort the values in descending order
        for (int i=0;i<5;i++){
            maximumWicketsOrScoreTakenByPlayers[i] = wicketsOrScoreOfAllThePlayers[i];
        }
    }
    private int removeDuplicateElementInAnArray(int arr[], int arrayLength) {
        if (arrayLength==0 || arrayLength==1)
            return arrayLength;

        int[] temp = new int[arrayLength];
        int j = 0;
        for (int i=0; i<arrayLength-1; i++)
            if (arr[i] != arr[i+1])
                temp[j++] = arr[i];

        temp[j++] = arr[arrayLength-1];

        // Changing original array
        for (int i=0; i<j; i++)
            arr[i] = temp[i];

        return j;
    }
}
