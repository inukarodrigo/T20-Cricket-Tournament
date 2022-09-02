package sample;

import java.util.ArrayList;

public class listOfAllThePlayers {
    //This class will create an arrayList consisting of dictionaries of all the players
    //and return the arrayList
    //Using Composition
    private afganistanPlayerProfile afganistanPlayerProfile;
    private australiaPlayerProfile australiaPlayerProfile;
    private bangladeshPlayerProfile bangladeshPlayerProfile;
    private englandPlayerProfile englandPlayerProfile;
    private indiaPlayerProfile indiaPlayerProfile;
    private newZealandPlayerProfile newZealandPlayerProfile;
    private pakistanPlayerProfile pakistanPlayerProfile;
    private sriLankaPlayerProfile sriLankaPlayerProfile;

    public listOfAllThePlayers(sample.afganistanPlayerProfile afganistanPlayerProfile, sample.australiaPlayerProfile australiaPlayerProfile, sample.bangladeshPlayerProfile bangladeshPlayerProfile, sample.englandPlayerProfile englandPlayerProfile, sample.indiaPlayerProfile indiaPlayerProfile, sample.newZealandPlayerProfile newZealandPlayerProfile, sample.pakistanPlayerProfile pakistanPlayerProfile, sample.sriLankaPlayerProfile sriLankaPlayerProfile) {
        //Initializing instance variable
        this.afganistanPlayerProfile = afganistanPlayerProfile;
        this.australiaPlayerProfile = australiaPlayerProfile;
        this.bangladeshPlayerProfile = bangladeshPlayerProfile;
        this.englandPlayerProfile = englandPlayerProfile;
        this.indiaPlayerProfile = indiaPlayerProfile;
        this.newZealandPlayerProfile = newZealandPlayerProfile;
        this.pakistanPlayerProfile = pakistanPlayerProfile;
        this.sriLankaPlayerProfile = sriLankaPlayerProfile;
    }


    private ArrayList allThePlayers=new ArrayList();
    public void insertValuesToTheArrayList(){
        //Inserting values to the array
        allThePlayers.add(afganistanPlayerProfile.getRashidKhan());
        allThePlayers.add(afganistanPlayerProfile.getMohommadNabi());
        allThePlayers.add(afganistanPlayerProfile.getAsgharAfghan());
        allThePlayers.add(afganistanPlayerProfile.getHashmatullahShahidi());
        allThePlayers.add(afganistanPlayerProfile.getMujeebRahman());
        allThePlayers.add(afganistanPlayerProfile.getHamidHasan());
        allThePlayers.add(afganistanPlayerProfile.getRahmatShah());
        allThePlayers.add(afganistanPlayerProfile.getNoorAli());
        allThePlayers.add(afganistanPlayerProfile.getGulbadinNaib());
        allThePlayers.add(afganistanPlayerProfile.getSayedShirzad());
        allThePlayers.add(afganistanPlayerProfile.getIkramAlikhil());
        allThePlayers.add(afganistanPlayerProfile.getSamiullahShinwari());

        allThePlayers.add(australiaPlayerProfile.getSteveSmith());
        allThePlayers.add(australiaPlayerProfile.getDavidWarner());
        allThePlayers.add(australiaPlayerProfile.getAaronFinch());
        allThePlayers.add(australiaPlayerProfile.getMitchelStarc());
        allThePlayers.add(australiaPlayerProfile.getAdamZampa());
        allThePlayers.add(australiaPlayerProfile.getGlennMaxwell());
        allThePlayers.add(australiaPlayerProfile.getMatthewWade());
        allThePlayers.add(australiaPlayerProfile.getPatCummins());
        allThePlayers.add(australiaPlayerProfile.getMarcusStoinis());
        allThePlayers.add(australiaPlayerProfile.getAlexCarey());
        allThePlayers.add(australiaPlayerProfile.getNathanLyon());
        allThePlayers.add(australiaPlayerProfile.getKaneRichardson());

        allThePlayers.add(bangladeshPlayerProfile.getShakibAlHasan());
        allThePlayers.add(bangladeshPlayerProfile.getMahmudullah());
        allThePlayers.add(bangladeshPlayerProfile.getMushfiqurRahim());
        allThePlayers.add(bangladeshPlayerProfile.getLitonDas());
        allThePlayers.add(bangladeshPlayerProfile.getMustafizurRahman());
        allThePlayers.add(bangladeshPlayerProfile.getTamimIqbal());
        allThePlayers.add(bangladeshPlayerProfile.getSaumyaSarkar());
        allThePlayers.add(bangladeshPlayerProfile.getMashrafeMortaza());
        allThePlayers.add(bangladeshPlayerProfile.getMehidyHasan());
        allThePlayers.add(bangladeshPlayerProfile.getMohommadSaifuddin());
        allThePlayers.add(bangladeshPlayerProfile.getSabbirRahman());
        allThePlayers.add(bangladeshPlayerProfile.getRubelHossain());

        allThePlayers.add(englandPlayerProfile.getJoeRoot());
        allThePlayers.add(englandPlayerProfile.getBenStokes());
        allThePlayers.add(englandPlayerProfile.getJosButtler());
        allThePlayers.add(englandPlayerProfile.getMoeenAli());
        allThePlayers.add(englandPlayerProfile.getEoinMorgan());
        allThePlayers.add(englandPlayerProfile.getJonnyBairstow());
        allThePlayers.add(englandPlayerProfile.getChrisWoakes());
        allThePlayers.add(englandPlayerProfile.getJofraArcher());
        allThePlayers.add(englandPlayerProfile.getJasonRoy());
        allThePlayers.add(englandPlayerProfile.getAdilRashid());
        allThePlayers.add(englandPlayerProfile.getDomSibley());
        allThePlayers.add(englandPlayerProfile.getMarkWood());

        allThePlayers.add(indiaPlayerProfile.getViratKohli());
        allThePlayers.add(indiaPlayerProfile.getRohitSharma());
        allThePlayers.add(indiaPlayerProfile.getKLRahul());
        allThePlayers.add(indiaPlayerProfile.getMSDhoni());
        allThePlayers.add(indiaPlayerProfile.getRishabhPant());
        allThePlayers.add(indiaPlayerProfile.getHardikPandya());
        allThePlayers.add(indiaPlayerProfile.getMohommadShami());
        allThePlayers.add(indiaPlayerProfile.getRavindraJadeja());
        allThePlayers.add(indiaPlayerProfile.getJaspritBumrah());
        allThePlayers.add(indiaPlayerProfile.getSharbulThakur());
        allThePlayers.add(indiaPlayerProfile.getYuzvendraChahal());
        allThePlayers.add(indiaPlayerProfile.getBhuvneshwarKumar());

        allThePlayers.add(newZealandPlayerProfile.getKaneWilliamson());
        allThePlayers.add(newZealandPlayerProfile.getIshSodhi());
        allThePlayers.add(newZealandPlayerProfile.getMartinGuptill());
        allThePlayers.add(newZealandPlayerProfile.getRossTailor());
        allThePlayers.add(newZealandPlayerProfile.getTomLatham());
        allThePlayers.add(newZealandPlayerProfile.getTrentBoult());
        allThePlayers.add(newZealandPlayerProfile.getColinDeGrandhomme());
        allThePlayers.add(newZealandPlayerProfile.getTimSouthee());
        allThePlayers.add(newZealandPlayerProfile.getLockieFerguson());
        allThePlayers.add(newZealandPlayerProfile.getJamesNeesham());
        allThePlayers.add(newZealandPlayerProfile.getMichellSantner());
        allThePlayers.add(newZealandPlayerProfile.getColinMunro());

        allThePlayers.add(pakistanPlayerProfile.getBabarAzam());
        allThePlayers.add(pakistanPlayerProfile.getShaheenAfridi());
        allThePlayers.add(pakistanPlayerProfile.getMohommadAmir());
        allThePlayers.add(pakistanPlayerProfile.getShoaibMalik());
        allThePlayers.add(pakistanPlayerProfile.getAsifAli());
        allThePlayers.add(pakistanPlayerProfile.getHasanAli());
        allThePlayers.add(pakistanPlayerProfile.getMohammadHafeez());
        allThePlayers.add(pakistanPlayerProfile.getFakharZaman());
        allThePlayers.add(pakistanPlayerProfile.getSarfarazAhmad());
        allThePlayers.add(pakistanPlayerProfile.getShadabKhan());
        allThePlayers.add(pakistanPlayerProfile.getImadWasim());
        allThePlayers.add(pakistanPlayerProfile.getWahabRiaz());

        allThePlayers.add(sriLankaPlayerProfile.getDimuthKarunaratne());
        allThePlayers.add(sriLankaPlayerProfile.getLasithMalinga());
        allThePlayers.add(sriLankaPlayerProfile.getDushmanthaChameera());
        allThePlayers.add(sriLankaPlayerProfile.getKusalMendis());
        allThePlayers.add(sriLankaPlayerProfile.getKusalPerera());
        allThePlayers.add(sriLankaPlayerProfile.getAvishkaFernando());
        allThePlayers.add(sriLankaPlayerProfile.getMaheeshTheekshana());
        allThePlayers.add(sriLankaPlayerProfile.getDhananjayaDeSilva());
        allThePlayers.add(sriLankaPlayerProfile.getAnjeloMathews());
        allThePlayers.add(sriLankaPlayerProfile.getIsuruUdana());
        allThePlayers.add(sriLankaPlayerProfile.getThisaraPerera());
        allThePlayers.add(sriLankaPlayerProfile.getSurangaLakmal());
    }

    public ArrayList getAllThePlayers() {
        return allThePlayers;
    }
}
