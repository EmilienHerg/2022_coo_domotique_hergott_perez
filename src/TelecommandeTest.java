import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * classe de test permettant de tester la classe Telecommande
 */
public class TelecommandeTest {

    /**
     * test du constructeur de Telecommande
     */
    @Test
    public void test_ajout_lampe() {
        // preparation des donnees
        Telecommande t = new Telecommande();
        Lampe l = new Lampe("l1")

        // methode testee
        t.ajouterLampe(l);

        // verification
        boolean res = t.getLampe(0).isAllume();
        assertFalse(res, "une nouvelle lampe devrait etre eteinte");
    }

    /**
            * test du constructeur de Telecommande
     */
    @Test
    public void test_ajout_lampee() {
        // preparation des donnees
        Telecommande t = new Telecommande();
        Lampe l = new Lampe("l1")

        // methode testee
        t.ajouterLampe(l);

        // verification
        boolean res = t.getLampe(0).isAllume();
        assertFalse(res, "une nouvelle lampe devrait etre eteinte");
    }





}