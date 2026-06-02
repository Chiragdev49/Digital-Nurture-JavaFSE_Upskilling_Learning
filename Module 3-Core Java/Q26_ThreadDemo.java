class T extends Thread {

    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(Thread.currentThread().getName()
                    + " : Running " + i);
        }
    }
}

public class Q26_ThreadDemo {

    public static void main(String[] args) {

        T t1 = new T();
        T t2 = new T();

        t1.start();
        t2.start();
    }
}
