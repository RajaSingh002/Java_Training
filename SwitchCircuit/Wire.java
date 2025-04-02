package SwitchCircuit;

public final class Wire {
    private final double voltage;
    private final double current;
    private final double resistance;


    private static final double DEFAULT_VOLTAGE = 220.0;
    private static final double DEFAULT_CURRENT = 5.0; 
    private static final double DEFAULT_RESISTANCE = 50.0; 

   
    private static Wire instance;

   
    private Wire() {
   
        this.voltage = DEFAULT_VOLTAGE;
        this.current = DEFAULT_CURRENT;
        this.resistance = DEFAULT_RESISTANCE;
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

