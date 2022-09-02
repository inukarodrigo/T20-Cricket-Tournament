package sample;

import java.util.*;

public class editDeleteAndDisplayPlayerProfiles {
    private Scanner scanner=new Scanner(System.in);
    private ArrayList allThePlayers=new ArrayList();

    Dictionary playerProfileForEditOrDelete; //This is used to edit player profile

    public editDeleteAndDisplayPlayerProfiles(ArrayList allThePlayers) {
        this.allThePlayers = allThePlayers;
    }

    public void displayPlayerProfile(Object countryName){
        for(int i=0;i<this.allThePlayers.size();i++){
            Dictionary playerDictionary = (Dictionary) allThePlayers.get(i);
            Object country= playerDictionary.get("country");
            if (country.equals(countryName)){
                printTeam(playerDictionary);
            }
        }
    }

    public void getUsersInputAndEditPlayerProfile(String playerName, String feature, String newVal){
        String player=playerName;
        editPlayerProfile(player,feature,newVal);
    }
    public void getUsersInputAndDeletePlayerProfiles(String playerName){
        deletePlayerProfile(playerName);
    }

    private void editPlayerProfile(String playerName,String feature1,String newVal1){
        boolean isNameUpdated = false;
        if (isPlayerExist(playerName)){
            String feature = feature1;
            if (feature.toLowerCase().equals("name")){
                String newVal = newVal1;
                playerProfileForEditOrDelete.put(feature,newVal);
                isNameUpdated = true;
                System.out.println("Player profile updated.");
            }else if (feature.toLowerCase().equals("role")){
                String newVal = newVal1;
                playerProfileForEditOrDelete.put(feature,newVal);
                System.out.println("Player profile updated.");
            } else {
                System.out.println("Invalid feature");
            }
        }
        if (isNameUpdated==false){
            if (isPlayerExist(playerName) == false){
                System.out.println("Invalid player name.");
            }
        }
    }

    private void deletePlayerProfile(String playerName){
        boolean isDeletedPlayerProfile = false;
        if (isPlayerExist(playerName)){
            for (int i=0;i<allThePlayers.size();i++){
                if (playerProfileForEditOrDelete == (Dictionary) allThePlayers.get(i)){
                    allThePlayers.remove(i);
                    isDeletedPlayerProfile = true;
                    System.out.println("Deleted successfully.");
                    break;
                }
            }
        }
        if (isDeletedPlayerProfile == false){
            System.out.println("Invalid player name");
        }
    }
    private boolean isPlayerExist(String playerName){
        boolean playerFound = false;
        for (int i=0;i<allThePlayers.size();i++){
            Dictionary playerProfile = (Dictionary) allThePlayers.get(i);
            Object player = playerProfile.get("Name");
            if (player.equals(playerName)){
                this.playerProfileForEditOrDelete = playerProfile;
                playerFound=true;
                break;
            }
        }if (playerFound) {
            return true;
        }else
            return false;
    }

    private void printTeam(Dictionary playerDictionary){
        System.out.println(("Name = "+playerDictionary.get("Name")));
        System.out.println("Role = "+playerDictionary.get("Role"));
        System.out.println("Matches = "+playerDictionary.get("Matches"));
        System.out.println("Innings = "+playerDictionary.get("Innings"));
        System.out.println("Runs = "+playerDictionary.get("Runs"));
        System.out.println("50s = "+playerDictionary.get("50s"));
        System.out.println("Best = "+playerDictionary.get("Best"));
        System.out.println("Wickets = "+playerDictionary.get("Wickets"));
        System.out.println();
    }
}
