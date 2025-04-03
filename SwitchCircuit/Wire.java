package SwitchCircuit;

public final  class Wire {
    private final double voltage;
    private final double current;
    private final double resistance;

    private static Wire instance;

    private Wire() {

        this.voltage = 220.0;
        this.current = 5.0;
        this.resistance = 50.0;
    }

    public static Wire getInstance() {
        if (instance == null) {
            instance = new Wire();
        }
        return instance;
    }

    protected double getVoltage() {
        return voltage;
    }

    protected double getCurrent() {
        return current;
    }

    protected double getResistance() {
        return resistance;
    }

}
