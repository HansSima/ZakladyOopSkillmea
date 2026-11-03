public class RodinnyDum {
    int pocetOken;
    int pocetDveri;
    float rozloha;
    String adresa;


    public float vypocetCenyDomu(float cenaZaMetrCtverecni){
        float cena = rozloha * cenaZaMetrCtverecni + pocetOken * 10000 + pocetDveri * 8000;
        System.out.println(cena);
        return cena;
    }



}
