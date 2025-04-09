package switchCircuit2;

public class Switch extends Wire{
    private boolean isOn;

    public Switch() {
        this.isOn = false;
    }

    public void turnOn() {
        try {
            if (getVoltage() > 0 && getCurrent() > 0) {
                isOn = true;
                System.out.println("Switch is Turned on");
            } else {
                System.out.println("Cannot turn On. No Power in Wire");
            }
        } catch (Exception e) {
            
            e.printStackTrace();
        }
    }

    public void turnOff() {
        if(isOn==false){
            System.out.println("Switch is alreay turned off");
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
