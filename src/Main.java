import thermos.Thermostat;

public class Main {

	public static void main(String args[])
	{
		Telecommande t=new Telecommande();
		
		
		Lampe l1=new Lampe("Lampe1");
		t.ajouterAppareil(l1);

		Lampe l2=new Lampe("Lampe2");
		t.ajouterAppareil(l2);

		Hifi h1 = new Hifi();
		t.ajouterAppareil(h1);

		Hifi h2 = new Hifi();
		t.ajouterAppareil(h2);

		ChemineeAdaptee c1 = new ChemineeAdaptee(new Cheminee());
		t.ajouterAppareil(c1);

		ThermostatAdapter ta = new ThermostatAdapter(new Thermostat());
		t.ajouterAppareil(ta);


		TelecommandeGraphique tg=new TelecommandeGraphique(t);
		

		
	}
	
}
