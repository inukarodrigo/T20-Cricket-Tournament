package sample;
import java.util.*;

public class dictionariesForEachTeamProfiles {
    //This class will create dictionaries for each team and we can use this class
    //to edit the dictionary and to display dictionaries of specific team
    private Hashtable Afganistan=new Hashtable();
    private Hashtable Australia=new Hashtable();
    private Hashtable Bangladesh=new Hashtable();
    private Hashtable England=new Hashtable();
    private Hashtable India=new Hashtable();
    private Hashtable NewZealand=new Hashtable();
    private Hashtable Pakistan=new Hashtable();
    private Hashtable SriLanka=new Hashtable();





    public dictionariesForEachTeamProfiles() {
        //When a object was created, relevant dictionaries also will be updated
        insertValuesForTheRelavantDictionary(Afganistan,"Afganistan",2,8);
        insertValuesForTheRelavantDictionary(Australia,"Australia",7,3);
        insertValuesForTheRelavantDictionary(Bangladesh,"Bangladesh",4.1,6);
        insertValuesForTheRelavantDictionary(India,"India",6.5,4);
        insertValuesForTheRelavantDictionary(England,"England",8,2);
        insertValuesForTheRelavantDictionary(NewZealand,"New Zealand",10,1);
        insertValuesForTheRelavantDictionary(Pakistan,"Pakistan",4,7);
        insertValuesForTheRelavantDictionary(SriLanka,"Sri Lanka",4.45,5);


    }

    private void insertValuesForTheRelavantDictionary(Hashtable country, String countryName, double rating,int position){
        country.put("Name",countryName);
        country.put("No of matches",0);
        country.put("Position",position);
        country.put("Rating",rating);
    }
    public Hashtable getAfganistan() {
        return Afganistan;
    }

    public Hashtable getAustralia() {
        return Australia;
    }

    public Hashtable getBangladesh() {
        return Bangladesh;
    }

    public Hashtable getEngland() {
        return England;
    }

    public Hashtable getIndia() {
        return India;
    }

    public Hashtable getNewZealand() {
        return NewZealand;
    }

    public Hashtable getPakistan() {
        return Pakistan;
    }

    public Hashtable getSriLanka() {
        return SriLanka;
    }
}
