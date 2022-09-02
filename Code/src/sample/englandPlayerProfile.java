package sample;

import java.util.ArrayList;
import java.util.Hashtable;

public class englandPlayerProfile extends playerProfileDictionaryStructure {
    private Hashtable JoeRoot =new Hashtable();
    private Hashtable BenStokes =new Hashtable();
    private Hashtable JosButtler =new Hashtable();
    private Hashtable MoeenAli =new Hashtable();
    private Hashtable EoinMorgan =new Hashtable();
    private Hashtable JonnyBairstow =new Hashtable();
    private Hashtable ChrisWoakes = new Hashtable();
    private Hashtable JofraArcher =new Hashtable();
    private Hashtable JasonRoy =new Hashtable();
    private Hashtable AdilRashid =new Hashtable();
    private Hashtable DomSibley =new Hashtable();
    private Hashtable MarkWood =new Hashtable();

    //Creating an arrayList consisting of all the England players dictionaries
    private ArrayList EnglandTeam = new ArrayList();
    private ArrayList EnglandBowling = new ArrayList();

    public ArrayList getEnglandTeam() {
        return EnglandTeam;
    }

    public ArrayList getEnglandBowling() {
        return EnglandBowling;
    }

    public englandPlayerProfile() {
        //When user create an object with this class,automatically dictionaries get updates
        super.addCommonValuesToTheDictionary(JoeRoot,"Joe Root","Batsman","England");
        super.addCommonValuesToTheDictionary(BenStokes,"Ben Stokes","All Rounder","England");
        super.addCommonValuesToTheDictionary(JosButtler,"Jos Buttler","Batsman","England");
        super.addCommonValuesToTheDictionary(MoeenAli,"Moeen Ali","All Rounder","England");
        super.addCommonValuesToTheDictionary(EoinMorgan,"Eoin Morgan","Batsman","England");
        super.addCommonValuesToTheDictionary(JonnyBairstow,"Jonny Bairstow","Batsman","England");
        super.addCommonValuesToTheDictionary(ChrisWoakes,"Chris Woakes","Bowler","England");
        super.addCommonValuesToTheDictionary(JofraArcher,"Jofra Archer","Bowler","England");
        super.addCommonValuesToTheDictionary(JasonRoy,"Jason Roy","Batsman","England");
        super.addCommonValuesToTheDictionary(AdilRashid,"Adil Rashid","Bowler","England");
        super.addCommonValuesToTheDictionary(DomSibley,"Dom Sibley","Batsman","England");
        super.addCommonValuesToTheDictionary(MarkWood,"Mark Wood","Bowler","England");

        EnglandTeam.add(0,JoeRoot);
        EnglandTeam.add(1,BenStokes);
        EnglandTeam.add(2,JosButtler);
        EnglandTeam.add(3,MoeenAli);
        EnglandTeam.add(4,EoinMorgan);
        EnglandTeam.add(5,JonnyBairstow);
        EnglandTeam.add(6,ChrisWoakes);
        EnglandTeam.add(7,JofraArcher);
        EnglandTeam.add(8,JasonRoy);
        EnglandTeam.add(9,AdilRashid);
        EnglandTeam.add(10,DomSibley);
        EnglandTeam.add(11,MarkWood);

    }
    public Hashtable getJoeRoot() {
        return JoeRoot;
    }

    public Hashtable getBenStokes() {
        return BenStokes;
    }

    public Hashtable getJosButtler() {
        return JosButtler;
    }

    public Hashtable getMoeenAli() {
        return MoeenAli;
    }

    public Hashtable getEoinMorgan() {
        return EoinMorgan;
    }

    public Hashtable getJonnyBairstow() {
        return JonnyBairstow;
    }

    public Hashtable getChrisWoakes() {
        return ChrisWoakes;
    }

    public Hashtable getJofraArcher() {
        return JofraArcher;
    }

    public Hashtable getJasonRoy() {
        return JasonRoy;
    }

    public Hashtable getAdilRashid() {
        return AdilRashid;
    }

    public Hashtable getDomSibley() {
        return DomSibley;
    }

    public Hashtable getMarkWood() {
        return MarkWood;
    }
}
