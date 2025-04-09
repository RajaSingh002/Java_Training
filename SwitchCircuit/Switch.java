package SwitchCircuit;

public class Switch {
    private boolean isOn;
    private final Wire wire;

    public Switch(Wire wire) {
        this.wire = wire;
        this.isOn = false;
    }

    public void turnOn() {
        if (wire.getVoltage() > 0 && wire.getCurrent() > 0 && (isOn==false)) {
            isOn = true;
            System.out.println("Switch is Turned on");
        } else {
            System.out.println("Switch is already turn On");
        }
    }

    public void turnOff() {
        if(isOn==false){
            System.out.println("Switch is already Off");
        }
        else{
        isOn = false;
        System.out.println("Switch is Turned off");
        }
        
    }

    public boolean isOn() {
        return isOn;
    }
}
