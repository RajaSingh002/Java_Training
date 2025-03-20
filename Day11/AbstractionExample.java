package Day11;

enum Color{
    RED(1),BLUE(2);
    int x;
    Color(int x){
        this.x=x;
    }
    public int getX(){
        return x;
    }

    void fun(){
        System.out.println("fun");
    }
}
public abstract class AbstractionExample {
 public static void main(String[] args) {
    Color c=Color.RED;
    c.fun();
    System.out.println(c);
    System.out.println(c.getX());
    for(Color item:Color.values()){
        System.out.println(item);
    }
 }
     
}
