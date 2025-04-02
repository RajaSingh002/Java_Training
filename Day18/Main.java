package Day18;

abstract class Circuit {
    protected boolean isOn;

    public void turnOn() {
        isOn = true;
        System.out.println("switch is on");
    }

    public void turnOff() {
        isOn = false;
        System.out.println("switch is off");
    }

    public abstract void speedUp();

    public abstract void speedDown();
}

class FanCircuit extends Circuit {
    private int speed;
    private static final int maxSpeed = 5;
    private static final int minspeed = 0;

    public FanCircuit() {
        this.speed = 0;
    }

    @Override
    public void speedUp() {
        if (isOn) {
            if (speed < maxSpeed) {
                speed++;
                System.out.println("Fan speed increased to: " + speed);
            } else {
                System.out.println("Fan is already at max speed!");
            }
        } else {
            System.out.println("Cannot increase speed. The switch is OFF.");
        }
    }

    @Override
    public void speedDown() {
        if (isOn) {
            if (speed > minspeed) {
                speed--;
                System.out.println("Fan speed decreased to: " + speed);
            } else {
                System.out.println("Fan is already at the minimum speed");
            }
        } else {
            System.out.println("Cannot decrease speed. The switch is OFF.");
        }
    }
}

public class Main {
    public static void main1(String[] args) {
        Main m=new Main();
        Circuit fan = new FanCircuit();
        fan.turnOn();
        fan.speedUp();
        fan.speedUp();
        fan.speedDown();
        fan.turnOff();
    }
}
