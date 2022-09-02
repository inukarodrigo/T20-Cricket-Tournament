package sample;

import java.util.ArrayList;
import java.util.Hashtable;

public class sriLankaPlayerProfile extends playerProfileDictionaryStructure {
    private Hashtable DimuthKarunaratne =new Hashtable();
    private Hashtable LasithMalinga =new Hashtable();
    private Hashtable DushmanthaChameera =new Hashtable();
    private Hashtable KusalPerera =new Hashtable();
    private Hashtable KusalMendis =new Hashtable();
    private Hashtable AvishkaFernando =new Hashtable();
    private Hashtable MaheeshTheekshana = new Hashtable();
    private Hashtable DhananjayaDeSilva =new Hashtable();
    private Hashtable AnjeloMathews =new Hashtable();
    private Hashtable IsuruUdana =new Hashtable();
    private Hashtable ThisaraPerera =new Hashtable();
    private Hashtable SurangaLakmal =new Hashtable();

    //Creating an arrayList consisting of all the Sri Lankan players dictionaries
    private ArrayList SriLankaTeam = new ArrayList();
    private ArrayList SriLankaBowling = new ArrayList();

    public ArrayList getSriLankaTeam() {
        return SriLankaTeam;
    }

    public ArrayList getSriLankaBowling() {
        return SriLankaBowling;
    }
    public sriLankaPlayerProfile() {
        //When user create an object with this class,automatically dictionaries get updates
        super.addCommonValuesToTheDictionary(DimuthKarunaratne,"Dimuth Karunaratne","Batsman","Sri Lanka");
        super.addCommonValuesToTheDictionary(LasithMalinga,"Lasith Malinga","Bowler","Sri Lanka");
        super.addCommonValuesToTheDictionary(DushmanthaChameera,"Dushmantha Chameera","Bowler","Sri Lanka");
        super.addCommonValuesToTheDictionary(KusalPerera,"Kusal Perera","Batsman","Sri Lanka");
        super.addCommonValuesToTheDictionary(KusalMendis,"Kusal Mendis","Batsman","Sri Lanka");
        super.addCommonValuesToTheDictionary(AvishkaFernando,"Avishka Fernando","Batsman","Sri Lanka");
        super.addCommonValuesToTheDictionary(MaheeshTheekshana,"Maheesh Theekshana","Bowler","Sri Lanka");
        super.addCommonValuesToTheDictionary(DhananjayaDeSilva,"Dhananjaya De Silva","All Rounder","Sri Lanka");
        super.addCommonValuesToTheDictionary(AnjeloMathews,"Anjelo Mathews","All Rounder","Sri Lanka");
        super.addCommonValuesToTheDictionary(IsuruUdana,"Isuru Udana","All Rounder","Sri Lanka");
        super.addCommonValuesToTheDictionary(ThisaraPerera,"Thisara Perera","Bowler","Sri Lanka");
        super.addCommonValuesToTheDictionary(SurangaLakmal,"Suranga Lakmal","All Rounder","Sri Lanka");

        SriLankaTeam.add(0,DimuthKarunaratne);
        SriLankaTeam.add(1,LasithMalinga);
        SriLankaTeam.add(2,DushmanthaChameera);
        SriLankaTeam.add(3,KusalPerera);
        SriLankaTeam.add(4,KusalMendis);
        SriLankaTeam.add(5,AvishkaFernando);
        SriLankaTeam.add(6,MaheeshTheekshana);
        SriLankaTeam.add(7,DhananjayaDeSilva);
        SriLankaTeam.add(8,AnjeloMathews);
        SriLankaTeam.add(9,IsuruUdana);
        SriLankaTeam.add(10,ThisaraPerera);
        SriLankaTeam.add(11,SurangaLakmal);
    }
    public Hashtable getDimuthKarunaratne() {
        return DimuthKarunaratne;
    }

    public Hashtable getLasithMalinga() {
        return LasithMalinga;
    }

    public Hashtable getDushmanthaChameera() {
        return DushmanthaChameera;
    }

    public Hashtable getKusalPerera() {
        return KusalPerera;
    }

    public Hashtable getKusalMendis() {
        return KusalMendis;
    }

    public Hashtable getAvishkaFernando() {
        return AvishkaFernando;
    }

    public Hashtable getMaheeshTheekshana() {
        return MaheeshTheekshana;
    }

    public Hashtable getDhananjayaDeSilva() {
        return DhananjayaDeSilva;
    }

    public Hashtable getAnjeloMathews() {
        return AnjeloMathews;
    }

    public Hashtable getIsuruUdana() {
        return IsuruUdana;
    }

    public Hashtable getThisaraPerera() {
        return ThisaraPerera;
    }

    public Hashtable getSurangaLakmal() {
        return SurangaLakmal;
    }
}
