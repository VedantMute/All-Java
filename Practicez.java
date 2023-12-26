public class Practicez extends Thread {
    public void run() {
        System.out.println("Inside the run() method");
    }

    public static void main(String[] args) {
        Practicez t1 = new Practicez();
        Practicez t2 = new Practicez();

        System.out.println("Priority of thread t1 is: " + t1.getPriority());
        System.out.println("Priority of thread t2 is: " + t2.getPriority());

        t1.setPriority(6);
        t2.setPriority(3);

        // Main thread priority
        System.out.println("Current/Main Thread:" + Thread.currentThread().getName());
        System.out.println("Priority MainThread: " + Thread.currentThread().getPriority());

        t1.start();
        t2.start();
    }
}
