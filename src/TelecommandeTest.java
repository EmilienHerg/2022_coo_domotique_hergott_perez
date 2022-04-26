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
        Lampe l = new Lampe("l1");

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
        Lampe l = new Lampe("l1");

        // methode testee
        t.ajouterLampe(l);

        // verification
        boolean res = t.getLampe(0).isAllume();
        assertFalse(res, "une nouvelle lampe devrait etre eteinte");
    }













    @Test
    public void test_activation_lampe_0() {
        // preparation des donnees
        Telecommande t = new Telecommande();
        Lampe l1 = new Lampe("lampe1");

        // methode testee
        t.ajouterLampe(l1);

        // verification
        boolean res = t.getLampe(0).isAllume();
        assertTrue(res, "la lampe en position 0 devrait etre allumee");
        assertEquals("lampe1: On\n", t.toString(), "erreur methode");
    }

    @Test
    public void test_activation_lampe_1() {
        // preparation des donnees
        Telecommande t = new Telecommande();
        Lampe l1 = new Lampe("lampe1");
        Lampe l2 = new Lampe("lampe2");

        // methode testee
        t.ajouterLampe(l1);
        t.ajouterLampe(l2);
        t.activerLampe(1);

        // verification
        boolean res = t.getLampe(1).isAllume();
        assertTrue(res, "la lampe en position 1 devrait etre allumee");
        assertEquals("lampe1: Off\nlampe2: On\n", t.toString(), "erreur methode");
    }





}