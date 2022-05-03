import thermos.Thermostat;
public class ThermostatAdapter implements Appareil {

    private Thermostat th;

    public ThermostatAdapter(Thermostat t) {
        this.th = t;
    }
    public void allumer() {
        th.monterTemperature();
    }

    public void eteindre() {
        th.baisserTemperature();
    }
}
