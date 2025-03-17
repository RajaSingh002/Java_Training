package Day10.CopyingClasses;

 class Person {
    String name;
    Address address; // Reference type

    Person(String name, Address address) {
        this.name = name;
        this.address = address;
    }

    // Shallow copy constructor
    // Person(Person other) {
    //     this.name = other.name; // Copying primitive field
    //     this.address = other.address; // Copying reference (shallow copy)
    // }

    Person(Person other) {
        this.name = other.name; // Copying primitive field
        this.address = new Address(other.address); //Deep Copy and creates new Address Object
    }

    void display() {
        System.out.println("Name: " + name + ", City: " + address.city);
    }
}