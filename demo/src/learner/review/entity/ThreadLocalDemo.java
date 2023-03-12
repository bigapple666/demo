package learner.review.entity;

public class ThreadLocalDemo extends Thread{

    private static ThreadLocal threadLocal = new ThreadLocal();

    @Override
    public synchronized void run() {
        for (int i = 0; i < 3; i++) {
            threadLocal.set(i);
            System.out.println(getName() + " threadLocal = " + threadLocal.get());
        }
    }

    public static void main(String[] args) {
        Thread thread1 = new ThreadLocalDemo();
        thread1.setName("thread1");
        Thread thread2 = new ThreadLocalDemo();
        thread2.setName("thread2");
        thread1.start();
        thread2.start();
    }
}
