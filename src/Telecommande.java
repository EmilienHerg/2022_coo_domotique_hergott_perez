public class Telecommande {

    public Telecommande() {
        throw new Error (" code non ecrit ");
    }

    public void ajouterLampe(Lampe l) {
        throw new Error (" code non ecrit ");
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
