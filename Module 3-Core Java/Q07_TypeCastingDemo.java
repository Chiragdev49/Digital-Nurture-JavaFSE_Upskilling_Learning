public class Q07_TypeCastingDemo {
    public static void main(String[] args) {

        // double to int (narrowing conversion)
        double d = 12.8;
        int i = (int) d;

        // int to double (widening conversion)
        int x = 10;
        double d2 = x;

        System.out.println("Double value: " + d);
        System.out.println("After casting to int: " + i);
        System.out.println("Int value: " + x);
        System.out.println("After casting to double: " + d2);
    }
}
