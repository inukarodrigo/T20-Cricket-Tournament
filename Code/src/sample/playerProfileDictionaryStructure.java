package sample;
import java.util.Hashtable;

public class playerProfileDictionaryStructure {
    //Used protected specifier therefore,only sub classes can access this method
    protected void addCommonValuesToTheDictionary(Hashtable player,String name,String role,String country){
        player.put("Name",name);
        player.put("Role",role);
        player.put("country",country);
        player.put("Matches",0);
        player.put("Innings",0);
        player.put("Runs",0);
        player.put("50s",0);
        player.put("Best",0);
        player.put("Wickets",0);
        player.put("Scores taken in a match",0);
        player.put("Wickets taken in a match",0);
        player.put("Balls took for scoring",0);
        player.put("Method of dismissal","Not played");
        player.put("Overs Bowled",0);
    }
}
