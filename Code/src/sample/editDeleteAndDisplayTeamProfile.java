package sample;

import java.util.*;

public class editDeleteAndDisplayTeamProfile {
    private Scanner scanner=new Scanner(System.in);
    private ArrayList allTheTeams = new ArrayList();

    public editDeleteAndDisplayTeamProfile(ArrayList allTheTeams) {
        this.allTheTeams = allTheTeams;
    }
    public void displayTeamProfile(Object countryName){
        boolean isTeamExist = false;
        for(int i=0;i<this.allTheTeams.size();i++){
            Dictionary playerDictionary = (Dictionary) allTheTeams.get(i);
            Object country= playerDictionary.get("Name");
            if (country.equals(countryName)){
                isTeamExist = true;
                printTeam(playerDictionary);
                break;
            }
        }if (!isTeamExist){
            System.out.println("Team not found.");
        }
    }

    public void getUsersInputAndEditTeamProfile(String option, String teamName, String fieldName, String newVal){
            String team=teamName;
            if (isValidTeam(team)){
                if (option.toLowerCase().equals("edit")){
                    String key =fieldName;
                    if (key.equals("No of matches") || key.equals("Position")){
                        try {
                            int value =Integer.parseInt(newVal);
                            editTeamProfile(team,key,value);
                            displayTeamProfile(team);
                        }catch (NumberFormatException e){
                            System.out.println("You have entered an invalid value or the text field is empty");
                        }
                    }else {
                        System.out.println("Invalid field.");
                    }
                }
            }else {
                System.out.println("Invalid team name.");
            }
    }
    public void getUsersInputAndDeleteTeamProfile(String team){
        deleteTeamProfile(team);
    }
    private void printTeam(Dictionary playerDictionary){
        System.out.println(("Name = "+playerDictionary.get("Name")));
        System.out.println("Number of matches = "+playerDictionary.get("No of matches"));
        System.out.println("Position = "+playerDictionary.get("Position"));
        System.out.println("Rating = "+playerDictionary.get("Rating"));
        System.out.println();
    }

    private boolean isValidTeam(String team){
        if (team.equals("Afganistan") || team.equals("Australia") || team.equals("Bangladesh") || team.equals("England") || team.equals("India") || team.equals("New Zealand") || team.equals("Pakistan") || team.equals("Sri Lanka")){
            return true;
        }else
            return false;
    }

    private boolean isValidOption(String option){
        if (option.toLowerCase().equals("edit") || option.toLowerCase().equals("delete")){
            return true;
        }else
            return false;
    }
    private void editTeamProfile(String countryName,String key,int value){
        boolean isTeamExist = false;
        for (int i=0;i<allTheTeams.size();i++){
            Dictionary teamProfile=(Dictionary)allTheTeams.get(i);
            Object country = teamProfile.get("Name");
            if (country.equals(countryName)){
                isTeamExist = true;
                teamProfile.put(key,value);
                System.out.println("Successfully updated");
                break;
            }
        }if (!isTeamExist){
            System.out.println("Team not found.");
        }
    }
    private void deleteTeamProfile(String teamName){
        int i;
        for (i=0;i<allTheTeams.size();i++) {
            Dictionary teamProfile=(Dictionary)allTheTeams.get(i);
            Object country = teamProfile.get("Name");
            if (country.equals(teamName)){
                teamProfile.remove("No of matches");
                System.out.println("Deleted successfully");
                break;
            }
        }if (i==allTheTeams.size()){
            System.out.println("Invalid Team Name.");
        }
    }
}
