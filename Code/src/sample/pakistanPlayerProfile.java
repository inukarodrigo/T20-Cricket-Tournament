package sample;

import java.util.ArrayList;
import java.util.Hashtable;

public class pakistanPlayerProfile extends playerProfileDictionaryStructure {
    private Hashtable BabarAzam =new Hashtable();
    private Hashtable ShaheenAfridi =new Hashtable();
    private Hashtable MohommadAmir =new Hashtable();
    private Hashtable ShoaibMalik =new Hashtable();
    private Hashtable AsifAli =new Hashtable();
    private Hashtable HasanAli =new Hashtable();
    private Hashtable MohammadHafeez = new Hashtable();
    private Hashtable FakharZaman =new Hashtable();
    private Hashtable SarfarazAhmad =new Hashtable();
    private Hashtable ShadabKhan =new Hashtable();
    private Hashtable ImadWasim =new Hashtable();
    private Hashtable WahabRiaz =new Hashtable();

    //Creating an arrayList consisting of all the Pakistan players dictionaries
    private ArrayList PakistanTeam = new ArrayList();
    private ArrayList PakistanBowling = new ArrayList();

    public ArrayList getPakistanTeam() {
        return PakistanTeam;
    }

    public ArrayList getPakistanBowling() {
        return PakistanBowling;
    }

    public pakistanPlayerProfile() {
        //When user create an object with this class,automatically dictionaries get updates
        super.addCommonValuesToTheDictionary(BabarAzam,"Babar Azam","Batsman","Pakistan");
        super.addCommonValuesToTheDictionary(ShaheenAfridi,"Shaheen Afridi","Bowler","Pakistan");
        super.addCommonValuesToTheDictionary(MohommadAmir,"Mohommad Amir","Bowler","Pakistan");
        super.addCommonValuesToTheDictionary(ShoaibMalik,"Shoaib Malik","All Rounder","Pakistan");
        super.addCommonValuesToTheDictionary(AsifAli,"Asif Ali","Batsman","Pakistan");
        super.addCommonValuesToTheDictionary(HasanAli,"Hasan Ali","Bowler","Pakistan");
        super.addCommonValuesToTheDictionary(MohammadHafeez,"Mohammad Hafeez","All Rounder","Pakistan");
        super.addCommonValuesToTheDictionary(FakharZaman,"Fakhar Zaman","Batsman","Pakistan");
        super.addCommonValuesToTheDictionary(SarfarazAhmad,"Sarfaraz Ahmad","Batsman","Pakistan");
        super.addCommonValuesToTheDictionary(ShadabKhan,"Shadab Khan","All Rounder","Pakistan");
        super.addCommonValuesToTheDictionary(ImadWasim,"Imad Wasim","All Rounder","Pakistan");
        super.addCommonValuesToTheDictionary(WahabRiaz,"Wahab Riaz","All Rounder","Pakistan");

        PakistanTeam.add(0,BabarAzam);
        PakistanTeam.add(1,ShaheenAfridi);
        PakistanTeam.add(2,MohommadAmir);
        PakistanTeam.add(3,ShoaibMalik);
        PakistanTeam.add(4,AsifAli);
        PakistanTeam.add(5,HasanAli);
        PakistanTeam.add(6,MohammadHafeez);
        PakistanTeam.add(7,FakharZaman);
        PakistanTeam.add(8,SarfarazAhmad);
        PakistanTeam.add(9,ShadabKhan);
        PakistanTeam.add(10,ImadWasim);
        PakistanTeam.add(11,WahabRiaz);
    }
    public Hashtable getBabarAzam() {
        return BabarAzam;
    }

    public Hashtable getShaheenAfridi() {
        return ShaheenAfridi;
    }

    public Hashtable getMohommadAmir() {
        return MohommadAmir;
    }

    public Hashtable getShoaibMalik() {
        return ShoaibMalik;
    }

    public Hashtable getAsifAli() {
        return AsifAli;
    }

    public Hashtable getHasanAli() {
        return HasanAli;
    }

    public Hashtable getMohammadHafeez() {
        return MohammadHafeez;
    }

    public Hashtable getFakharZaman() {
        return FakharZaman;
    }

    public Hashtable getSarfarazAhmad() {
        return SarfarazAhmad;
    }

    public Hashtable getShadabKhan() {
        return ShadabKhan;
    }

    public Hashtable getImadWasim() {
        return ImadWasim;
    }

    public Hashtable getWahabRiaz() {
        return WahabRiaz;
    }
}
