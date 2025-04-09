package switchCircuit2;

import java.util.Scanner;

public class Client {
     private Scanner sc = new Scanner(System.in);

   

    private Switch mySwitch = new Switch();
    private FanSwitch myFanSwitch = new FanSwitch();

    public void start() {
        while (true) {

            System.out.println("switch control panel");
            System.out.println("1. Turn ON Switch");
            System.out.println("2. Turn OFF Switch");
            System.out.println("3. Turn ON Fan");
            System.out.println("4. Turn OFF Fan");
            System.out.println("5. Increase Fan Speed");
            System.out.println("6. Decrease Fan Speed");
            System.out.println("7. Show Fan Status");
            System.out.println("8. Show Switch Status");
            System.out.println("9. Exit");

            int choice;

            while (true) {
                System.out.print("Enter your choice: ");
                String input = sc.nextLine().trim();
                if (input.isEmpty()) {
                    System.out.println("Inavlid input ! please enter valid number between 1 to 9 ");
                    continue;

            
                }

                if (input.matches("\\d+")) {
                    choice = Integer.parseInt(input);
                    break;
                } else {
                    System.out.println("Invalid input ! Please Enter a valid number between 1 to 9.............");
                }

            }

            switch (choice) {
                case 1:
                    mySwitch.turnOn();
                    break;
                case 2:
                    mySwitch.turnOff();
                    break;
                case 3:
                    myFanSwitch.turnOn();
                    break;
                case 4:
                    myFanSwitch.turnOff();
                    break;
                case 5:
                    myFanSwitch.speedUp();
                    break;
                case 6:
                    myFanSwitch.speedDown();
                    break;
                case 7:
                    System.out.println("Fan is " + (myFanSwitch.isOn() ? "ON" : "OFF") +
                            " at speed " + myFanSwitch.getSpeed());
                    break;
                case 8:
                    System.out.println("Switch is " + (mySwitch.isOn() ? "ON" : "OFF"));
                    break;
                case 9:
                    System.out.println("Exit");
                    sc.close();
                    return;
                default:
                    System.out.println("Invalid choice! Please enter a valid option.");
            }
        }

    }
}
