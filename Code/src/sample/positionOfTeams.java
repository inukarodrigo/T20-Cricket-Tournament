package sample;

import java.util.Arrays;
import java.util.Collections;
import java.util.Dictionary;

public class positionOfTeams {
    listOfAllTheTeams listOfAllTheTeams;

    public positionOfTeams(sample.listOfAllTheTeams listOfAllTheTeams) {
        this.listOfAllTheTeams = listOfAllTheTeams;
    }

    private Double[] rating = new Double[8];

    public void printPosition(){
        calculatePosition();
        Integer[] positions ={1,2,3,4,5,6,7,8};
        for (int i = 0;i< positions.length;i++){
            for (int j = 0;j<listOfAllTheTeams.getAllTheTeams().size();j++){
                Dictionary teamProfile = (Dictionary) listOfAllTheTeams.getAllTheTeams().get(j);
                if ((Integer)teamProfile.get("Position")==positions[i]) {
                    System.out.println("Name: "+ teamProfile.get("Name"));
                    System.out.println("Number of matches: "+teamProfile.get("No of matches"));
                    System.out.println("Position: "+teamProfile.get("Position"));
                    System.out.println("Rating: "+teamProfile.get("Rating"));
                    System.out.println();
                    break;
                }
            }
        }
    }
    private void addValuesToTheArrayAndSortInDescendingOrder(){
        for (int i=0;i< listOfAllTheTeams.getAllTheTeams().size();i++){
            Dictionary teamProfile = (Dictionary) listOfAllTheTeams.getAllTheTeams().get(i);
            rating[i] = (Double) teamProfile.get("Rating");
        }
        //This will sort the array in descending order
        Arrays.sort(rating, Collections.reverseOrder());

    }
    private void calculatePosition(){
        addValuesToTheArrayAndSortInDescendingOrder();
        for (int i=0;i<8;i++){
            for (int j=0;j<listOfAllTheTeams.getAllTheTeams().size();j++){
                Dictionary teamProfile = (Dictionary) listOfAllTheTeams.getAllTheTeams().get(j);
                if ((Double) teamProfile.get("Rating")==(Double) rating[i]){
                    teamProfile.put("Position",i+1);
                }
            }
        }
    }

}
