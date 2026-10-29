public class RodinnyDum {
    int pocetOken;
    int pocetDveri;
    float rozloha;
    String adresa;


    public float vypocetCenyDomu(){
        float cena = rozloha * 80000 + pocetOken * 10000 + pocetDveri * 8000;
        System.out.println(cena);
        return cena;
    }



}
