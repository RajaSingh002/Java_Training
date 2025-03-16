package Day9.Practice16;

public class Main {
    final int x=12;
    
        
    private static void xyz(final StringBuilder str,int x){
    //    str=new StringBuilder("Hii"); //Error
        str.append("Raja");
        // System.out.println(s);
        // str=s;
       System.out.println(str);
    }

   
    public static void main(String[] args) {
        xyz(new StringBuilder("Hello"), 12);
       
       
       final Base parent = new Base();
        //  parent=new Base();  //Error
        Child child = new Child();
        Base childReferredToAsBase = new Child();

        // parent.recommendedMethod();
        // System.out.println("--------------------");
        // child.recommendedMethod();
        // System.out.println("--------------------");
        // childReferredToAsBase.recommendedMethod();



        System.out.println("--------------------");
        parent.recommendedStatic();
        System.out.println("--------------------");
        childReferredToAsBase.recommendedStatic();
        System.out.println("--------------------");
        child.recommendedStatic();
    }
}
