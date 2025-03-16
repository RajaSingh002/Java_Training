public class Smartkitchen {

    private CoffeMaker brewMaster;
    private Refrigerator iceBox;
    private DishWahser dishwahser;

    public Smartkitchen() {
        brewMaster = new CoffeMaker();
        iceBox = new Refrigerator();
        dishwahser = new DishWahser();
    }

    public CoffeMaker getBrewMaster() {
        return brewMaster;
    }

    public Refrigerator getIceBox() {
        return iceBox;
    }

    public DishWahser getDishWahser() {
        return dishwahser;
    }

    public void setKitchenSate(boolean coffeeFlag, boolean fridgeFlag, boolean dishWasherFlag) {
        brewMaster.setHasWorkToDo(coffeeFlag);
        iceBox.setHasWorkToDo(dishWasherFlag);
        dishwahser.setHasWorkToDo(dishWasherFlag);
    }

    public void doKitchenWork(){
        brewMaster.brewCoffee();
        iceBox.orderFood();
        dishwahser.doDishes();
    }
}
