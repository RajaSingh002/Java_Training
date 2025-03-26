package SealedClass;
  interface Bike permits {
 Void fun1();
    
 }
 sealed class Human implements Bike permits Manish,Vartika,Anjali{
   
    
    void printName(){
        System.out.println("Default");
    }

    @Override
    public Void fun1() {
        // TODO Auto-generated method stub
        return null;
    }
}
non-sealed class Manish extends Human
{
    public void printName()
    {
        System.out.println("Manish Sharma");
    }
}

class c extends Manish{
    @Override
    public Void fun1() {
        // TODO Auto-generated method stub
        return null;
    }
}

final class Vartika extends Human
{
    public void printName()
    {
        System.out.println("Vartika Dadheech");
    }
}

final class Anjali extends Human
{
    public void printName()
    {
        System.out.println("Anjali Sharma");
    }
}
public  class Main {
    public static void main(String[] args) {
        Human h1 = new Anjali();
        Human h2 = new Vartika();
        Human h3 = new Manish();
        Human h4=new Human();
        h4.printName();         
        h1.printName();
        h2.printName();
        h3.printName();
    }
}
