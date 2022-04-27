import java.util.ArrayList;
import java.util.List;

public class Telecommande {

    private List<Lampe> lampes;

    public Telecommande() {
        this.lampes = new ArrayList<Lampe>();
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
        if (this.lampes != null) {
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
        return s;
    }

    public Lampe getLampe(int inciceLampe){
        if (inciceLampe < this.lampes.size()) {
            return this.lampes.get(inciceLampe);
        } else {
            return null;
        }
    }

}
