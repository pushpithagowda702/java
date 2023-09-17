import java.util.concurrent.locks.*;

public class RaceCondition extends Thread {
  static long sum = 0;
  static ReentrantLock lock = new ReentrantLock();
  public static void main(String[] args) {
    RaceCondition t1 = new RaceCondition();
    RaceCondition t2 = new RaceCondition();
    t1.start();
    t2.start();
    try {
      t1.join();
      t2.join();
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
    System.out.println(sum);
  }

  public void run() {
    for(int i=1; i<=100000; i++) {
    lock.lock();
    try {
      sum += i;

    } finally {
      lock.unlock();
    }
  } 
}
}