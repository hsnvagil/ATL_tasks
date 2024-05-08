package lesson_8;

public class MainApp {
    public static void main(String[] args) {
        Thread myThread = new MyThread("Agil");
        myThread.start();

        new Thread(() -> System.out.println("Thread name: " + Thread.currentThread().getName())).start();
    }

    public static class MyThread extends Thread {
        public MyThread(String name) {
            super(name);
        }

        @Override
        public void run() {
            System.out.println("Thread name: " + Thread.currentThread().getName());
        }

    }
}

