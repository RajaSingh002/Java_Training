package SwitchCircuit;

public class Switch {
    private boolean isOn;
    private final Wire wire;

    public Switch(Wire wire) {
        this.wire = wire;
        this.isOn = false;
    }

    public void turnOn() {
        if (wire.getVoltage() > 0 && wire.getCurrent() > 0) {
            isOn = true;
            System.out.println("Switch is TURNED ON.");
        } else {
            System.out.println("Cannot turn ON. No power in the wire!");
        }
    }

    public void turnOff() {
        isOn = false;
        System.out.println("Switch is TURNED OFF.");
    }

    public boolean isOn() {
        return isOn;
    }
}
