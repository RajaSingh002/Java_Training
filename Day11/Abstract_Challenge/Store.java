package Day11.Abstract_Challenge;

import java.util.ArrayList;

record InnerStore(int qty,ProductForSale produc) {
    
}

public class Store {
    private static ArrayList<ProductForSale>storeProduct=new ArrayList<>();
    public static void main(String[] args) {
        
        storeProduct.add(new ArtObject("Abc",220,"cjcd"));
        storeProduct.add(new ArtObject("bcd", 1223, "fjhfbewjf") );
        listVoid();
    }

    public static void listVoid(){
     for(var x:storeProduct){
        System.out.println();
        x.showDetails();
     }
    }
}
