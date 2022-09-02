package sample;

import java.util.ArrayList;
import java.util.Hashtable;

public class australiaPlayerProfile extends playerProfileDictionaryStructure {
    private Hashtable SteveSmith =new Hashtable();
    private Hashtable DavidWarner =new Hashtable();
    private Hashtable AaronFinch =new Hashtable();
    private Hashtable MitchelStarc =new Hashtable();
    private Hashtable AdamZampa =new Hashtable();
    private Hashtable GlennMaxwell =new Hashtable();
    private Hashtable MatthewWade =new Hashtable();
    private Hashtable PatCummins =new Hashtable();
    private Hashtable MarcusStoinis =new Hashtable();
    private Hashtable AlexCarey =new Hashtable();
    private Hashtable NathanLyon =new Hashtable();
    private Hashtable KaneRichardson =new Hashtable();

    //Creating an arrayList consisting of all the Afganistan players dictionaries
    private ArrayList AustraliaTeam = new ArrayList();
    private ArrayList AustraliaBowling = new ArrayList();

    public ArrayList getAustraliaTeam() {
        return AustraliaTeam;
    }

    public ArrayList getAustraliaBowling() {
        return AustraliaBowling;
    }

    public australiaPlayerProfile() {
        //When user create an object with this class,automatically dictionaries get updates
        super.addCommonValuesToTheDictionary(SteveSmith,"Steve Smith","Batsman","Australia");
        super.addCommonValuesToTheDictionary(DavidWarner,"David Warner","Batsman","Australia");
        super.addCommonValuesToTheDictionary(AaronFinch,"Aaron Finch","Batsman","Australia");
        super.addCommonValuesToTheDictionary(MitchelStarc,"Mitchel Starc","Bowler","Australia");
        super.addCommonValuesToTheDictionary(AdamZampa,"Adam Zampa","Bowler","Australia");
        super.addCommonValuesToTheDictionary(GlennMaxwell,"Glenn Maxwell","All Rounder","Australia");
        super.addCommonValuesToTheDictionary(MatthewWade,"Matthew Wade","Batsman","Australia");
        super.addCommonValuesToTheDictionary(PatCummins,"Pat Cummins","Bowler","Australia");
        super.addCommonValuesToTheDictionary(MarcusStoinis,"Marcus Stoinis","All Rounder","Australia");
        super.addCommonValuesToTheDictionary(AlexCarey,"Alex Carey","Batsman","Australia");
        super.addCommonValuesToTheDictionary(NathanLyon,"Nathan Lyon","Batsman","Australia");
        super.addCommonValuesToTheDictionary(KaneRichardson,"Kane Richardson","Bowler","Australia");

        AustraliaTeam.add(0,SteveSmith);
        AustraliaTeam.add(1,DavidWarner);
        AustraliaTeam.add(2,AaronFinch);
        AustraliaTeam.add(3,MitchelStarc);
        AustraliaTeam.add(4,AdamZampa);
        AustraliaTeam.add(5,GlennMaxwell);
        AustraliaTeam.add(6,MatthewWade);
        AustraliaTeam.add(7,PatCummins);
        AustraliaTeam.add(8,MarcusStoinis);
        AustraliaTeam.add(9,AlexCarey);
        AustraliaTeam.add(10,NathanLyon);
        AustraliaTeam.add(11,KaneRichardson);
    }
    public Hashtable getSteveSmith() {
        return SteveSmith;
    }

    public Hashtable getDavidWarner() {
        return DavidWarner;
    }

    public Hashtable getAaronFinch() {
        return AaronFinch;
    }

    public Hashtable getMitchelStarc() {
        return MitchelStarc;
    }

    public Hashtable getAdamZampa() {
        return AdamZampa;
    }

    public Hashtable getGlennMaxwell() {
        return GlennMaxwell;
    }

    public Hashtable getMatthewWade() {
        return MatthewWade;
    }

    public Hashtable getPatCummins() {
        return PatCummins;
    }

    public Hashtable getMarcusStoinis() {
        return MarcusStoinis;
    }

    public Hashtable getAlexCarey() {
        return AlexCarey;
    }

    public Hashtable getNathanLyon() {
        return NathanLyon;
    }

    public Hashtable getKaneRichardson() {
        return KaneRichardson;
    }
}
