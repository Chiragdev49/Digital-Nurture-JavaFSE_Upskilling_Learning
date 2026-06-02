public class Q40_VirtualThreadDemo {

    public static void main(String[] args) throws InterruptedException {

        long startVirtual = System.currentTimeMillis();

        Thread[] virtualThreads = new Thread[100000];

        for (int i = 0; i < 100000; i++) {
            int id = i;
            virtualThreads[i] = Thread.startVirtualThread(() -> {
                System.out.println("Virtual Thread " + id);
            });
        }

        for (Thread t : virtualThreads) {
            t.join();
        }

        long endVirtual = System.currentTimeMillis();

        System.out.println("Virtual Threads Time: "
                + (endVirtual - startVirtual) + " ms");

        // Traditional Thread Comparison (reduced count)
        long startTraditional = System.currentTimeMillis();

        Thread[] normalThreads = new Thread[1000];

        for (int i = 0; i < 1000; i++) {
            int id = i;
            normalThreads[i] = new Thread(() -> {
                System.out.println("Traditional Thread " + id);
            });
            normalThreads[i].start();
        }

        for (Thread t : normalThreads) {
            t.join();
        }

        long endTraditional = System.currentTimeMillis();

        System.out.println("Traditional Threads Time: "
                + (endTraditional - startTraditional) + " ms");
    }
}
