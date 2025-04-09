package switchCircuit2;

public abstract class Wire {
    private final double voltage;
    private final double current;
    private final double resistance;

     
    protected Wire(){
        this.voltage=220;
        this.current=5;
        this.resistance=1;
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
