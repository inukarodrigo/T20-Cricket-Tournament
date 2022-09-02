package sample;

import java.util.ArrayList;
import java.util.Hashtable;

public class afganistanPlayerProfile extends playerProfileDictionaryStructure {
    private Hashtable RashidKhan =new Hashtable();
    private Hashtable MohommadNabi =new Hashtable();
    private Hashtable AsgharAfghan =new Hashtable();
    private Hashtable HashmatullahShahidi =new Hashtable();
    private Hashtable MujeebRahman =new Hashtable();
    private Hashtable HamidHasan =new Hashtable();
    private Hashtable RahmatShah =new Hashtable();
    private Hashtable NoorAli =new Hashtable();
    private Hashtable GulbadinNaib =new Hashtable();
    private Hashtable SayedShirzad =new Hashtable();
    private Hashtable IkramAlikhil =new Hashtable();
    private Hashtable SamiullahShinwari =new Hashtable();

    //Creating an arrayList consisting of all the Afghanistan players dictionaries
    private ArrayList AfganistanTeam = new ArrayList();
    private ArrayList AfganistanBowling = new ArrayList();

    public ArrayList getAfganistanTeam() {
        return AfganistanTeam;
    }

    public ArrayList getAfganistanBowling() {
        return AfganistanBowling;
    }

    public afganistanPlayerProfile() {
        //When user create an object with this class,automatically dictionaries get updates
        super.addCommonValuesToTheDictionary(RashidKhan,"Rashid Khan","Bowler","Afganistan");
        super.addCommonValuesToTheDictionary(MohommadNabi,"Mohommad Nabi","All Rounder","Afganistan");
        super.addCommonValuesToTheDictionary(AsgharAfghan,"Asghar Afghan","Batsman","Afganistan");
        super.addCommonValuesToTheDictionary(HashmatullahShahidi,"Hashmatullah Shahidi","Batsman","Afganistan");
        super.addCommonValuesToTheDictionary(MujeebRahman,"Mujeeb Rahman","Bowler","Afganistan");
        super.addCommonValuesToTheDictionary(HamidHasan,"Hamid Hasan","Bowler","Afganistan");
        super.addCommonValuesToTheDictionary(RahmatShah,"Rahmat Shah","All Rounder","Afganistan");
        super.addCommonValuesToTheDictionary(NoorAli,"Noor Ali","Batsman","Afganistan");
        super.addCommonValuesToTheDictionary(GulbadinNaib,"Gulbadin Naib","Bowler","Afganistan");
        super.addCommonValuesToTheDictionary(SayedShirzad,"Sayed Shirzad","Bowler","Afganistan");
        super.addCommonValuesToTheDictionary(IkramAlikhil,"Ikram Alikhil","Batsman","Afganistan");
        super.addCommonValuesToTheDictionary(SamiullahShinwari,"Samiullah Shinwari","All Rounder","Afganistan");

        AfganistanTeam.add(0,RashidKhan);
        AfganistanTeam.add(1,MohommadNabi);
        AfganistanTeam.add(2,AsgharAfghan);
        AfganistanTeam.add(3,HashmatullahShahidi);
        AfganistanTeam.add(4,MujeebRahman);
        AfganistanTeam.add(5,HamidHasan);
        AfganistanTeam.add(6,RahmatShah);
        AfganistanTeam.add(7,NoorAli);
        AfganistanTeam.add(8,GulbadinNaib);
        AfganistanTeam.add(9,SayedShirzad);
        AfganistanTeam.add(10,IkramAlikhil);
        AfganistanTeam.add(11,SamiullahShinwari);
    }

    public Hashtable getRashidKhan() {
        return RashidKhan;
    }

    public Hashtable getMohommadNabi() {
        return MohommadNabi;
    }

    public Hashtable getAsgharAfghan() {
        return AsgharAfghan;
    }

    public Hashtable getHashmatullahShahidi() {
        return HashmatullahShahidi;
    }

    public Hashtable getMujeebRahman() {
        return MujeebRahman;
    }

    public Hashtable getHamidHasan() {
        return HamidHasan;
    }

    public Hashtable getRahmatShah() {
        return RahmatShah;
    }

    public Hashtable getNoorAli() {
        return NoorAli;
    }

    public Hashtable getGulbadinNaib() {
        return GulbadinNaib;
    }

    public Hashtable getSayedShirzad() {
        return SayedShirzad;
    }

    public Hashtable getIkramAlikhil() {
        return IkramAlikhil;
    }

    public Hashtable getSamiullahShinwari() {
        return SamiullahShinwari;
    }
}
