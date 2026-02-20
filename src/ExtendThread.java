// 1. Create a class MyThread that extends Thread
class MyThread extends Thread {
    // 2. Override the run method to define the thread's action
    @Override
    public void run() {
        System.out.println("Thread is running");
    }
}

public class Main {
    public static void main(String[] args) {
        // 3. Create an instance of the MyThread class
        MyThread t = new MyThread();
        
        // 4. Start the thread (this internally calls the run method)
        t.start();
    }
}
