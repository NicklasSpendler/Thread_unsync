public class Counter extends Thread {
    static int num = 0;
    public static void main(String[] args) {
        Counter counterThread1 = new Counter();
        Counter counterThread2 = new Counter();
        Counter counterThread3 = new Counter();
        Counter counterThread4 = new Counter();
        Counter counterThread5 = new Counter();
        Counter counterThread6 = new Counter();
        Counter counterThread7 = new Counter();
        Counter counterThread8 = new Counter();
        Counter counterThread9 = new Counter();
        Counter counterThread10 = new Counter();
        counterThread1.start();
        counterThread2.start();
        counterThread3.start();
        counterThread4.start();
        counterThread5.start();
        counterThread6.start();
        counterThread7.start();
        counterThread8.start();
        counterThread9.start();
        counterThread10.start();
        try {
            counterThread1.join();
            counterThread2.join();
            counterThread3.join();
            counterThread4.join();
            counterThread5.join();
            counterThread6.join();
            counterThread7.join();
            counterThread8.join();
            counterThread9.join();
            counterThread10.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("last sum: "+num);
    }

    public void run(){
        for (int i = 0; i< 100000; i++){
            num++;
        }
    }
}