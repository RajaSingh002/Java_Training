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
            System.out.println("Switch is Turned on");
        } else {
            System.out.println("Cannot turn On. No Power in Wire");
        }
    }

    public void turnOff() {
        isOn = false;
        System.out.println("Switch is Turned off");
    }

    public boolean isOn() {
        return isOn;
    }
}
