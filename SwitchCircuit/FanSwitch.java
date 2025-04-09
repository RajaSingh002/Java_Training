package SwitchCircuit;

public class FanSwitch {
    private boolean isOn;
    private int speed;
    private final Wire wire;

    private static final int MinSpeed = 1;
    private static final int MaxSpeed = 5;

    public FanSwitch(Wire wire) {
        this.wire = wire;
        this.isOn = false;
        this.speed = 0;
    }

    public void turnOn() {
        if (wire.getVoltage() > 0 && wire.getCurrent() > 0 && (isOn==false)) {
            isOn = true;
            speed = 1;
            System.out.println("fan is On ");
        } else {
            System.out.println("Fan is already On.");
        }
    }

    public void turnOff() {
        if(isOn==false){
            System.out.println("Fan is already Off");
        }
        else{
            isOn = false;
            speed = 0;
            System.out.println("Fan is turn off.");
        }
       
    }

    public void speedUp() {
        if (!isOn) {
            System.out.println("cannot increase speed, fan is off ");
            return;
        }
        if (speed < MaxSpeed) {
            speed++;
            System.out.println("Fan speed increased to " + speed);
        } else {
            System.out.println("Fan is already at max speed");
        }
    }

    public void speedDown() {
        if (!isOn) {
            System.out.println("Cannot decrease speed. fan is off");
            return;
        }
        if (speed > MinSpeed) {
            speed--;
            System.out.println("Fan speed decreased to " + speed);
        } else {
            System.out.println("Fan is already at min speed");
        }
    }

    public boolean isOn() {
        return isOn;
    }

    public int getSpeed() {
        return speed;
    }
}








