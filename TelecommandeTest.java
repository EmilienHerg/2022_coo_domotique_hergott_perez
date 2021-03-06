import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * classe de test permettant de tester la classe Telecommande
 */
public class TelecommandeTest {

    /**
     * test ajouter lampe 1
     */
    @Test
    public void test_ajout_lampe() {
        // preparation des donnees
        Telecommande t = new Telecommande();
        Lampe l = new Lampe("lampe1");

        // methode testee
        t.ajouterAppareil(l);

        // verification
        boolean res = t.getAppareil(0).isAllume();

        assertFalse(res, "une nouvelle lampe devrait etre eteinte");
        assertEquals("lampe1: Off\n",t.toString(),"erreur methode");
    }

    /**
     * test ajouteur lampe 2
     */
    @Test
    public void test_ajout_2_lampes() {
        // preparation des donnees
        Telecommande t = new Telecommande();
        Lampe l1 = new Lampe("lampe1");
        Lampe l2 = new Lampe("lampe2");
        t.ajouterAppareil(l1);

        // methode testee
        t.ajouterAppareil(l2);

        // verification
        boolean res1 = t.getAppareil(0).isAllume();
        boolean res2 = t.getAppareil(1).isAllume();
        assertFalse(res1, "une nouvelle lampe devrait etre eteinte");
        assertFalse(res2, "une nouvelle lampe devrait etre eteinte");
        assertEquals("lampe1: Off\nlampe2: Off\n", t.toString(), "erreur methode");

    }

    /**
     *  test activer lampe 1
     */
    @Test
    public void test_activation_lampe_0() {
        // preparation des donnees
        Telecommande t = new Telecommande();
        Lampe l1 = new Lampe("lampe1");
        t.ajouterAppareil(l1);

        // methode testee
        t.activerAppareil(0);

        // verification
        boolean res = t.getAppareil(0).isAllume();
        assertTrue(res, "la lampe en position 0 devrait etre allumee");
        assertEquals("lampe1: On\n", t.toString(), "erreur methode");
    }

    /**
     * test activer lampe 2
     */
    @Test
    public void test_activation_lampe_1() {
        // preparation des donnees
        Telecommande t = new Telecommande();
        Lampe l1 = new Lampe("lampe1");
        Lampe l2 = new Lampe("lampe2");
        t.ajouterAppareil(l1);
        t.ajouterAppareil(l2);

        // methode testee
        t.activerAppareil(1);

        // verification
        boolean res1 = t.getAppareil(0).isAllume();
        boolean res2 = t.getAppareil(1).isAllume();
        assertFalse(res1, "la lampe en position 0 devrait etre eteinte");
        assertTrue(res2, "la lampe en position 1 devrait etre allumee");
        assertEquals("lampe1: Off\nlampe2: On\n", t.toString(), "erreur methode");
    }

    @Test
    public void test_activation_lampe_inexistante() throws Exception {
        // preparation des donnees
        Telecommande t = new Telecommande();

        // methode testee
        t.activerAppareil(1);

        // verification
        assertEquals(null, t.getAppareil(1),"la telecommande devrait etre null");
    }


    /**
     * test activerTout
     */
    @Test
    public void test_activerTout() {
        // preparation des donnees
        Telecommande t = new Telecommande();
        Lampe l1 = new Lampe("lampe1");
        Lampe l2 = new Lampe("lampe2");
        t.ajouterAppareil(l1);
        t.ajouterAppareil(l2);

        // methode testee
        t.activerTout();

        // verificarion
        boolean res1 = t.getAppareil(0).isAllume();
        boolean res2 = t.getAppareil(1).isAllume();

        assertTrue(res1, "la lampe en position 0 devrait etre allumee");
        assertTrue(res2, "la lampe en position 1 devrait etre allumee");

    }

}