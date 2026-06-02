import java.lang.reflect.Method;
import java.lang.reflect.Parameter;

class Demo {
    public void greet(String name) {
        System.out.println("Hello, " + name);
    }
}

public class Q39_ReflectionDemo {
    public static void main(String[] args) throws Exception {

        Class<?> cls = Class.forName("Demo");

        System.out.println("Methods in Demo class:");

        for (Method method : cls.getDeclaredMethods()) {
            System.out.print("Method: " + method.getName() + "(");

            Parameter[] params = method.getParameters();
            for (int i = 0; i < params.length; i++) {
                System.out.print(params[i].getType().getSimpleName());
                if (i < params.length - 1)
                    System.out.print(", ");
            }

            System.out.println(")");
        }

        Object obj = cls.getDeclaredConstructor().newInstance();

        Method greetMethod = cls.getDeclaredMethod("greet", String.class);

        System.out.println("\nInvoking method dynamically:");
        greetMethod.invoke(obj, "Chirag");
    }
}
