public class Q38_DecompileExample {

    private int number = 10;

    public int square(int n) {
        return n * n;
    }

    public static void main(String[] args) {
        Q38_DecompileExample obj = new Q38_DecompileExample();
        System.out.println("Square of 5 = " + obj.square(5));
    }
}
