package Day16;
class InvalidAgeException extends Exception{
    public InvalidAgeException(String m){
        super(m);
    }
}
public class Practice5 {
    public static void validate(int age) 
      throws InvalidAgeException {
        if (age < 18) {
            throw new InvalidAgeException("Age must be 18 or above.");
        }
        System.out.println("Valid age: " + age);
    }
    public static void main(String[] args) throws InvalidAgeException{
        validate(3);
    }
}
