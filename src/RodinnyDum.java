public class RodinnyDum {

    private int pocetOken;
    private int pocetDveri;
    private float rozloha;
    private String adresa;

    RodinnyDum(int pocOken, int pocDveri, float roz, String adr){
        pocetOken = pocOken;
        pocetDveri = pocDveri;
        rozloha = roz;
        adresa = adr;
    }

    public float vypocetCenyDomu(float cenaZaMetrCtverecni){
        float cena = rozloha * cenaZaMetrCtverecni + pocetOken * 10000 + pocetDveri * 8000;
        System.out.println(cena);
        return cena;
    }

    //Pro cteni hodnoty tzv. getter
    public int getPocetOken() {
        return pocetOken;
    }

    //Pro prepsani hodnoty tzv. setter
    public void setPocetOken(int pocetOken) {
        this.pocetOken = pocetOken;
    }

}
