package Day11.Abstract_Challenge;

public abstract class ProductForSale implements Animal  {
    

    protected String type;
    protected int price;
    protected String description;

    public ProductForSale(String type, int price, String description) {
        this.type = type;
        this.price = price;
        this.description = description;
    }

  public double getSalesPrice(int qty){
    return qty * price;
  }

  public void printPricedItem(int qty){
    System.out.print(qty+ price + description + type);
  }

    abstract void showDetails();
    
}
