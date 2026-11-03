public class Kocka extends Zvire {

    private int pocetSnezenychRyb;

    Kocka(String rasa, float hmotnost, int pocetSnezenychRyb) {
        this.rasa = rasa;
        this.hmotnost = hmotnost;
        this.pocetSnezenychRyb = pocetSnezenychRyb;
    }

    public void vydejZvuk(){
        System.out.println("Mnau");
    }

}
