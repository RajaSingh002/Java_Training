package Day11.Abstract_Challenge;

public class ArtObject extends ProductForSale{
 

    @Override
    public void move() {
        // TODO Auto-generated method stub
        
    }
    public ArtObject(String type, int price, String description){
        super(type,price,description);
    }
    @Override
    public void showDetails() {
        // TODO Auto-generated method stub
        System.out.println(type);
        System.out.println(price);
        System.out.println(description);
    }
    
}
