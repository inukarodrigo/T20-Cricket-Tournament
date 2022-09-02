package sample;

import java.util.ArrayList;
import java.util.Hashtable;

public class newZealandPlayerProfile extends playerProfileDictionaryStructure {
    private Hashtable KaneWilliamson =new Hashtable();
    private Hashtable IshSodhi =new Hashtable();
    private Hashtable MartinGuptill =new Hashtable();
    private Hashtable RossTailor =new Hashtable();
    private Hashtable TomLatham =new Hashtable();
    private Hashtable TrentBoult =new Hashtable();
    private Hashtable ColinDeGrandhomme = new Hashtable();
    private Hashtable TimSouthee =new Hashtable();
    private Hashtable LockieFerguson =new Hashtable();
    private Hashtable JamesNeesham =new Hashtable();
    private Hashtable MichellSantner =new Hashtable();
    private Hashtable ColinMunro =new Hashtable();

    //Creating an arrayList consisting of all the New Zealand players dictionaries
    private ArrayList NewZealandTeam = new ArrayList();
    private ArrayList NewZealandBowling = new ArrayList();

    public ArrayList getNewZealandTeam() {
        return NewZealandTeam;
    }

    public ArrayList getNewZealandBowling() {
        return NewZealandBowling;
    }

    public newZealandPlayerProfile() {
        //When user create an object with this class,automatically dictionaries get updates
        super.addCommonValuesToTheDictionary(KaneWilliamson,"Kane Williamson","Batsman","New Zealand");
        super.addCommonValuesToTheDictionary(IshSodhi,"Ish Sodhi","Bowler","New Zealand");
        super.addCommonValuesToTheDictionary(MartinGuptill,"Martin Guptill","Batsman","New Zealand");
        super.addCommonValuesToTheDictionary(RossTailor,"Ross Tailor","Batsman","New Zealand");
        super.addCommonValuesToTheDictionary(TomLatham,"Tom Latham","Batsman","New Zealand");
        super.addCommonValuesToTheDictionary(TrentBoult,"Trent Boult","Bowler","New Zealand");
        super.addCommonValuesToTheDictionary(ColinDeGrandhomme,"Colin De Grandhomme","All Rounder","New Zealand");
        super.addCommonValuesToTheDictionary(TimSouthee,"Tim Southee","Bowler","New Zealand");
        super.addCommonValuesToTheDictionary(LockieFerguson,"Lockie Ferguson","Bowler","New Zealand");
        super.addCommonValuesToTheDictionary(JamesNeesham,"James Neesham","All Rounder","New Zealand");
        super.addCommonValuesToTheDictionary(MichellSantner,"Michell Santner","All Rounder","New Zealand");
        super.addCommonValuesToTheDictionary(ColinMunro,"Colin Munro","All Rounder","New Zealand");

        NewZealandTeam.add(0,KaneWilliamson);
        NewZealandTeam.add(1,IshSodhi);
        NewZealandTeam.add(2,MartinGuptill);
        NewZealandTeam.add(3,RossTailor);
        NewZealandTeam.add(4,TomLatham);
        NewZealandTeam.add(5,TrentBoult);
        NewZealandTeam.add(6,ColinDeGrandhomme);
        NewZealandTeam.add(7,TimSouthee);
        NewZealandTeam.add(8,LockieFerguson);
        NewZealandTeam.add(9,JamesNeesham);
        NewZealandTeam.add(10,MichellSantner);
        NewZealandTeam.add(11,ColinMunro);
    }
    public Hashtable getKaneWilliamson() {
        return KaneWilliamson;
    }

    public Hashtable getIshSodhi() {
        return IshSodhi;
    }

    public Hashtable getMartinGuptill() {
        return MartinGuptill;
    }

    public Hashtable getRossTailor() {
        return RossTailor;
    }

    public Hashtable getTomLatham() {
        return TomLatham;
    }

    public Hashtable getTrentBoult() {
        return TrentBoult;
    }

    public Hashtable getColinDeGrandhomme() {
        return ColinDeGrandhomme;
    }

    public Hashtable getTimSouthee() {
        return TimSouthee;
    }

    public Hashtable getLockieFerguson() {
        return LockieFerguson;
    }

    public Hashtable getJamesNeesham() {
        return JamesNeesham;
    }

    public Hashtable getMichellSantner() {
        return MichellSantner;
    }

    public Hashtable getColinMunro() {
        return ColinMunro;
    }
}
