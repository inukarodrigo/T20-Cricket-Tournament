package sample;

import java.util.ArrayList;
import java.util.Hashtable;

public class bangladeshPlayerProfile extends playerProfileDictionaryStructure {
    private Hashtable ShakibAlHasan =new Hashtable();
    private Hashtable Mahmudullah =new Hashtable();
    private Hashtable MushfiqurRahim =new Hashtable();
    private Hashtable LitonDas =new Hashtable();
    private Hashtable MustafizurRahman =new Hashtable();
    private Hashtable TamimIqbal =new Hashtable();
    private Hashtable SaumyaSarkar = new Hashtable();
    private Hashtable MashrafeMortaza =new Hashtable();
    private Hashtable MehidyHasan =new Hashtable();
    private Hashtable MohommadSaifuddin =new Hashtable();
    private Hashtable SabbirRahman =new Hashtable();
    private Hashtable RubelHossain =new Hashtable();

    //Creating an arrayList consisting of all the Bangladesh players dictionaries
    private ArrayList BangladeshTeam = new ArrayList();
    private ArrayList BangladeshBowling = new ArrayList();

    public ArrayList getBangladeshTeam() {
        return BangladeshTeam;
    }

    public ArrayList getBangladeshBowling() {
        return BangladeshBowling;
    }

    public bangladeshPlayerProfile() {
        //When user create an object with this class,automatically dictionaries get updates
        super.addCommonValuesToTheDictionary(ShakibAlHasan,"Shakib Al Hasan","All Rounder","Bangladesh");
        super.addCommonValuesToTheDictionary(Mahmudullah,"Mahmudullah","All Rounder","Bangladesh");
        super.addCommonValuesToTheDictionary(MushfiqurRahim,"Mushfiqur Rahim","Batsman","Bangladesh");
        super.addCommonValuesToTheDictionary(LitonDas,"Liton Das","Batsman","Bangladesh");
        super.addCommonValuesToTheDictionary(MustafizurRahman,"Mustafizur Rahman","Bowler","Bangladesh");
        super.addCommonValuesToTheDictionary(TamimIqbal,"Tamim Iqbal","Batsman","Bangladesh");
        super.addCommonValuesToTheDictionary(SaumyaSarkar,"Saumya Sarkar","All Rounder","Bangladesh");
        super.addCommonValuesToTheDictionary(MashrafeMortaza,"Mashrafe Mortaza","Bowler","Bangladesh");
        super.addCommonValuesToTheDictionary(MehidyHasan,"Mehidy Hasan","All Rounder","Bangladesh");
        super.addCommonValuesToTheDictionary(MohommadSaifuddin,"Mohommad Saifuddin","All Rounder","Bangladesh");
        super.addCommonValuesToTheDictionary(SabbirRahman,"Sabbir Rahman","All Rounder","Bangladesh");
        super.addCommonValuesToTheDictionary(RubelHossain,"Rubel Hossain","Bowler","Bangladesh");

        BangladeshTeam.add(0,ShakibAlHasan);
        BangladeshTeam.add(1,Mahmudullah);
        BangladeshTeam.add(2,MushfiqurRahim);
        BangladeshTeam.add(3,LitonDas);
        BangladeshTeam.add(4,MustafizurRahman);
        BangladeshTeam.add(5,TamimIqbal);
        BangladeshTeam.add(6,SaumyaSarkar);
        BangladeshTeam.add(7,MashrafeMortaza);
        BangladeshTeam.add(8,MehidyHasan);
        BangladeshTeam.add(9,MohommadSaifuddin);
        BangladeshTeam.add(10,SabbirRahman);
        BangladeshTeam.add(11,RubelHossain);
    }
    public Hashtable getShakibAlHasan() {
        return ShakibAlHasan;
    }

    public Hashtable getMahmudullah() {
        return Mahmudullah;
    }

    public Hashtable getMushfiqurRahim() {
        return MushfiqurRahim;
    }

    public Hashtable getLitonDas() {
        return LitonDas;
    }

    public Hashtable getMustafizurRahman() {
        return MustafizurRahman;
    }

    public Hashtable getTamimIqbal() {
        return TamimIqbal;
    }

    public Hashtable getSaumyaSarkar() {
        return SaumyaSarkar;
    }

    public Hashtable getMashrafeMortaza() {
        return MashrafeMortaza;
    }

    public Hashtable getMehidyHasan() {
        return MehidyHasan;
    }

    public Hashtable getMohommadSaifuddin() {
        return MohommadSaifuddin;
    }

    public Hashtable getSabbirRahman() {
        return SabbirRahman;
    }

    public Hashtable getRubelHossain() {
        return RubelHossain;
    }
}
