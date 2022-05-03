public class ChemineeAdaptee implements Appareil {

    private Cheminee ch;

    public ChemineeAdaptee (Cheminee c) {
        this.ch = c;
    }

    public void allumer() {
        int lumiere = this.ch.getLumiere() + 10;
        this.ch.changerIntensite(lumiere);
    }

    public void eteindre() {
        this.ch.changerIntensite(0);
    }

    public String toString() {
        return this.ch.toString();
    }
}
