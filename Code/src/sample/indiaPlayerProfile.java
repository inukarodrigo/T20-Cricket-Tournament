package sample;

import java.util.ArrayList;
import java.util.Hashtable;

public class indiaPlayerProfile extends playerProfileDictionaryStructure {
    private Hashtable ViratKohli =new Hashtable();
    private Hashtable RohitSharma =new Hashtable();
    private Hashtable KLRahul =new Hashtable();
    private Hashtable MSDhoni =new Hashtable();
    private Hashtable RishabhPant =new Hashtable();
    private Hashtable HardikPandya =new Hashtable();
    private Hashtable MohommadShami = new Hashtable();
    private Hashtable RavindraJadeja =new Hashtable();
    private Hashtable JaspritBumrah =new Hashtable();
    private Hashtable SharbulThakur =new Hashtable();
    private Hashtable YuzvendraChahal =new Hashtable();
    private Hashtable BhuvneshwarKumar =new Hashtable();

    //Creating an arrayList consisting of all the India players dictionaries
    private ArrayList IndiaTeam = new ArrayList();
    private ArrayList IndiaBowling = new ArrayList();

    public ArrayList getIndiaTeam() {
        return IndiaTeam;
    }

    public ArrayList getIndiaBowling() {
        return IndiaBowling;
    }
    public indiaPlayerProfile() {
        //When user create an object with this class,automatically dictionaries get updates
        super.addCommonValuesToTheDictionary(ViratKohli,"Virat Kohli","Batsman","India");
        super.addCommonValuesToTheDictionary(RohitSharma,"Rohit Sharma","Batsman","India");
        super.addCommonValuesToTheDictionary(KLRahul,"K L Rahul","Batsman","India");
        super.addCommonValuesToTheDictionary(MSDhoni,"MS Dhoni","Batsman","India");
        super.addCommonValuesToTheDictionary(RishabhPant,"Rishabh Pant","Batsman","India");
        super.addCommonValuesToTheDictionary(HardikPandya,"Hardik Pandya","All Rounder","India");
        super.addCommonValuesToTheDictionary(MohommadShami,"Mohommad Shami","Bowler","India");
        super.addCommonValuesToTheDictionary(RavindraJadeja,"Ravindra Jadeja","All Rounder","India");
        super.addCommonValuesToTheDictionary(JaspritBumrah,"Jasprit Bumrah","Bowler","India");
        super.addCommonValuesToTheDictionary(SharbulThakur,"Sharbul Thakur","All Rounder","India");
        super.addCommonValuesToTheDictionary(YuzvendraChahal,"Yuzvendra Chahal","Bowler","India");
        super.addCommonValuesToTheDictionary(BhuvneshwarKumar,"Bhuvneshwar Kumar","Bowler","India");

        IndiaTeam.add(0,ViratKohli);
        IndiaTeam.add(1,RohitSharma);
        IndiaTeam.add(2,KLRahul);
        IndiaTeam.add(3,MSDhoni);
        IndiaTeam.add(4,RishabhPant);
        IndiaTeam.add(5,HardikPandya);
        IndiaTeam.add(6,MohommadShami);
        IndiaTeam.add(7,RavindraJadeja);
        IndiaTeam.add(8,JaspritBumrah);
        IndiaTeam.add(9,SharbulThakur);
        IndiaTeam.add(10,YuzvendraChahal);
        IndiaTeam.add(11,BhuvneshwarKumar);
    }
    public Hashtable getViratKohli() {
        return ViratKohli;
    }

    public Hashtable getRohitSharma() {
        return RohitSharma;
    }

    public Hashtable getKLRahul() {
        return KLRahul;
    }

    public Hashtable getMSDhoni() {
        return MSDhoni;
    }

    public Hashtable getRishabhPant() {
        return RishabhPant;
    }

    public Hashtable getHardikPandya() {
        return HardikPandya;
    }

    public Hashtable getMohommadShami() {
        return MohommadShami;
    }

    public Hashtable getRavindraJadeja() {
        return RavindraJadeja;
    }

    public Hashtable getJaspritBumrah() {
        return JaspritBumrah;
    }

    public Hashtable getSharbulThakur() {
        return SharbulThakur;
    }

    public Hashtable getYuzvendraChahal() {
        return YuzvendraChahal;
    }

    public Hashtable getBhuvneshwarKumar() {
        return BhuvneshwarKumar;
    }
}
