class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message);
    }
}

public class Q21_CustomExceptionDemo {

    public static void main(String[] args) {

        int age = 15;

        try {
            if (age < 18) {
                throw new InvalidAgeException(
                        "Age must be 18 or above.");
            }

            System.out.println("Valid Age");

        } catch (InvalidAgeException e) {
            System.out.println("Exception Caught: "
                    + e.getMessage());
        }
    }
}
