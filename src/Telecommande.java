import java.util.ArrayList;
import java.util.List;

public class Telecommande {

    private List<Lampe> lampes;
    private List<Hifi> hifi;


    public Telecommande() {
        this.lampes = new ArrayList<Lampe>();
        this.hifi = new ArrayList<Hifi>();
    }

    public void ajouterLampe(Lampe l) {
        this.lampes.add(l);
    }

    public void activerLampe(int indiceLampe) {
        if (indiceLampe < this.lampes.size()) {
            this.lampes.get(indiceLampe).allumer();
        }
    }

    public void desactiverLampe(int indiceLampe) {
        if (indiceLampe < this.lampes.size()) {
            this.lampes.get(indiceLampe).eteindre();
        }
    }

    public void activerTout() {
        if (!this.lampes.isEmpty()) {
            for (int i = 0; i < this.lampes.size(); i++) {
                this.activerLampe(i);
            }
        }
    }

    public String toString() {
        String s = "";
        if (!this.lampes.isEmpty()) {
            for (int i = 0; i < this.lampes.size(); i++) {
                s += this.lampes.get(i).toString() + "\n";
            }
        }
        if (!this.hifi.isEmpty()) {
            for (int i = 0; i < this.hifi.size(); i++) {
                s+= this.hifi.get(i).toString() + "\n";
            }
        }
        return s;
    }

    public Lampe getLampe(int inciceLampe){
        if (inciceLampe < this.lampes.size()) {
            return this.lampes.get(inciceLampe);
        } else {
            return null;
        }
    }

    public void ajouterHifi(Hifi hifi) {
        this.hifi.add(hifi);
    }

    public void allumerHifi(int indiceHifi) {
        if (indiceHifi < this.hifi.size()) {
            this.hifi.get(indiceHifi).allumer();
        }
    }

    public void eteindreHifi(int indiceHifi) {
        if (indiceHifi < this.hifi.size()) {
            this.hifi.get(indiceHifi).eteindre();
        }
    }

    public void allumerTout(int indiceHifi) {
        if (!this.hifi.isEmpty()) {
            for (int i = 0; i < this.hifi.size(); i++) {
                this.allumerHifi(indiceHifi);
            }
        }
    }

    public Hifi getHifi(int indiceHifi) {
        if (indiceHifi < this.hifi.size()) {
            return this.hifi.get(indiceHifi);
        } else {
            return null;
        }
    }
    
}
