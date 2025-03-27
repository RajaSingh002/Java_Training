class Parent {
    int i=10;
    Parent(){
        System.out.println("Parent constructor is called");
        fun();
    }

    void fun(){
        System.out.println("fun is called "+i);
    }
}







public class Main extends Parent {

    int i=20;
    Main(){
        System.out.println("child constructor is called");
    }

    @Override
    void fun(){
        System.out.println("child fun is called "+i);
    }
    public static void main(String[] args) {
        Main tt=new Main();
    }
}
