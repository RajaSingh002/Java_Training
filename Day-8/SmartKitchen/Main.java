public class Main {
    

    public static void main(String[] args) {
        Smartkitchen kitchen=new Smartkitchen();

        // kitchen.getDishWahser().setHasWorkToDo(true);
        // kitchen.getBrewMaster().setHasWorkToDo(true);
        // kitchen.getIceBox().setHasWorkToDo(true);
        // kitchen.getDishWahser().doDishes();
        // kitchen.getBrewMaster().brewCoffee();
        // kitchen.getIceBox().orderFood();

        kitchen.setKitchenSate(true,false,true);
        kitchen.doKitchenWork();
}
}