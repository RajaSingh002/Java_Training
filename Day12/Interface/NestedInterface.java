package Day12.Interface;
 class NestedI{
    int x=10;
    void fun1(){

    }
    public interface InnerNestedInterface2 {
        void fun();
          
      }
}
public class NestedInterface implements NestedI.InnerNestedInterface2{
    @Override
   public  void fun(){
    System.out.println("fun");
    }

    public static void main(String[] args) {
        NestedI.InnerNestedInterface2 t;
        NestedInterface obj=new NestedInterface();
        obj.fun();
        t=obj;
        t.fun();
        
        
    }

    
}


