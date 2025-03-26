package Day16;

public class Practice1 {
    public static void main(String[] args) {
        try {

            System.out.println("Hello");
            int res=10/0;
            
         }
         finally{
            System.out.println("final block");
         }
        //   catch (ArithmeticException e) {
        //     // TODO: handle exception
        //     System.out.println(e);
        // }

        System.out.println("I will excute always");
    }
}
