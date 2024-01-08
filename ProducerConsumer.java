class Buffer {
  int[] buffer;
  int size;
  int count;
  
  public Buffer(int[] buffer, int size) {
    this.buffer = buffer;
    this.size = size;
    this.count = 0;
  }

  public synchronized void produce(int i) {
    if(count == size) {
      wait();
    }

    buffer[count] = i;
    count++;
    notifyAll();
  }

  public synchronized int consume() {
    if(count == 0) {
      wait();
    }

    int item = buffer[count];
    count--;
    notifyAll();
    return item;
  }

}

class Producer extends Thread {
  Buffer buffer;
  Producer(Buffer buffer) {
    this.buffer = buffer;
  }

  public void run() {
    for(int i=0; i<10; i++) {
      try {
        buffer.produce(i);
        Thread.sleep(1000);
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
    }
  }

}

class Consumer extends Thread {
  Buffer buffer;
  public Consumer(Buffer buffer) {
    this.buffer = buffer;
  }
  public void run() {
    for(int i=0; i<10; i++) {
      int item = buffer.consume();
      System.out.println(item);

      try {
        buffer.consume();
        Thread.sleep(1000);
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
    }
  }

}


public class ProducerConsumer {
  public static void main(String[] args) {
    int[] a = new int[6];
    Buffer b = new Buffer(a, 6);
    Producer p = new Producer(b);
    Consumer c = new Consumer(b);
    p.start();
    c.start();
    try {
      p.join();
      Thread.sleep(1000);
      c.join();
      Thread.sleep(1000);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
  }
}