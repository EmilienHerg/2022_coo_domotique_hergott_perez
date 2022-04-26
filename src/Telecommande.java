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
        int taille = this.lampes.size();
        for (int i = 0; i < taille; i++) {
            this.activerLampe(i);
        }
    }

    public String toString() {
        String s = "";
        int taille = this.lampes.size();
        for (int i = 0; i < taille; i++) {
            s += lampes[i].nom + ": " +;
        }
    }

    public Lampe getLampe(int inciceLampe){
        throw new Error (" code non ecrit ");
    }
}
