import java.util.Random;

public class Main {
    public static void main(String[] args) {

        RodinnyDum dumNovakovych = new RodinnyDum();
        dumNovakovych.pocetOken = 15;
        dumNovakovych.rozloha = 100.6f;
        dumNovakovych.pocetDveri = 5;
        dumNovakovych.vypocetCenyDomu();

        RodinnyDum dumZajicu = new RodinnyDum();
        dumZajicu.pocetOken = 20;
        dumZajicu.rozloha = 80.5f;
        dumZajicu.pocetDveri = 8;
        dumZajicu.vypocetCenyDomu();



    }
}