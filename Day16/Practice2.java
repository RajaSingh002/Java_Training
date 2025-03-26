package Day16;

public class Practice2 {
    public static void main(String[] args) {
        try {

            // ArithmeticException
            int res = 10 / 0;

            // NullPointerException
            String s = null;
            System.out.println(s.length());
        }
        catch (ArithmeticException e) {
            System.out.println(  e);
        }
        catch (NullPointerException e) {
            System.out.println(
                "Caught NullPointerException: " + e);
        }
        catch(Exception e){
            System.out.println(e);
        }

        finally{
            System.out.println("Final");
        }

        System.out.println("I will execute");
    }
}
