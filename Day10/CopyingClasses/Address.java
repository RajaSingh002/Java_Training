package Day10.CopyingClasses;

public class Address {
    String city;

    Address(String city) {
        this.city = city;
    }
  

    //Copy Constructor
    Address(Address other){
        this.city=other.city;
    }

}
