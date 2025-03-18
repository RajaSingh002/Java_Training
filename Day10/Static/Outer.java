package Day10.Static;

 class Outer {
    private static int a=3;
    protected static int b;
     static int c;
    private int id=1;
    protected int roll;
    String name;

     void display(){
        System.out.println("Show");
    }
  static class inner{
    int x=10;

      void display(){
        System.out.println(Outer.a);


        Outer p=new Outer();
        
        System.out.println(p.id);
      }
    
     
    
  }

}
