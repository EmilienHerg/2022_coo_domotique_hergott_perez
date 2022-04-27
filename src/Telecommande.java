import java.util.ArrayList;
import java.util.List;

public class Telecommande {

    private List<Appareil> appareils;

    public Telecommande() {
        this.appareils = new ArrayList<Appareil>();
    }

    public void ajouterAppareil(Appareil a) {
        this.appareils.add(a);
    }

    public void activerAppareil(int indiceAppareil) {
        if (indiceAppareil < this.appareils.size()) {
            this.appareils.get(indiceAppareil).allumer();
        }
    }

    public void desactiverAppareil(int indiceAppareil) {
        if (indiceAppareil < this.appareils.size()) {
            this.appareils.get(indiceAppareil).eteindre();
        }
    }

    public void activerTout() {
        if (!this.appareils.isEmpty()) {
            for (int i = 0; i < this.appareils.size(); i++) {
                this.activerAppareil(i);
            }
        }
    }

    public String toString() {
        String s = "";
        if (!this.appareils.isEmpty()) {
            for (int i = 0; i < this.appareils.size(); i++) {
                s += this.appareils.get(i).toString() + "\n";
            }
        }
        return s;
    }

    public Appareil getAppareil(int inciceAppareil){
        if (inciceAppareil < this.appareils.size()) {
            return this.appareils.get(inciceAppareil);
        } else {
            return null;
        }
    }

}
