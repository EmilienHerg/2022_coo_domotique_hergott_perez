public class Telecommande {

    private Lampe[] lampes;

    public Telecommande() {
        this.lampes = null;
    }

    public void ajouterLampe(Lampe l) {
        Lampe[] tab = new Lampe[this.lampes.length + 1];
        if (this.lampes != null) {
            int i = 0;
            while (i < this.lampes.length) {
               tab[i] = this.lampes[i];
               i++;
            }
            tab[i] = l;
        } else {
            tab[0] = l;
        }
        this.lampes = tab;
    }

    public void activerLampe(int indiceLampe) {
        throw new Error (" code non ecrit ");
    }

    public void desactiverLampe(int indiceLampe) {
        throw new Error (" code non ecrit ");
    }

    public void activerTout() {
        throw new Error (" code non ecrit ");
    }

    public String toString() {
        throw new Error (" code non ecrit ");
    }

    public Lampe getLampe(int inciceLampe){
        throw new Error (" code non ecrit ");
    }

}
