class Thread1 extends Thread {
  public void run() {
    for(int i=0; i<5; i++) {
      System.out.println(i);
      try{
        Thread.sleep(1000);
      } catch (InterruptedException e){
        e.printStackTrace();
      }
    }
  }
}

class Thread2 extends Thread {
  public void run() {
    for(int i=5; i<10; i++) {
      System.out.println(i);
      try{
        Thread.sleep(1000);
      } catch (InterruptedException e){
        e.printStackTrace();
      }
    }
  }
}

class ThreaLifeCycle {
  public static void main(String[] args) {
    Thread1 t1 = new Thread1();
    System.out.println(t1.getState());
    Thread2 t2 = new Thread2();
    System.out.println(t2.getState());

    t1.start();
    System.out.println(t1.getState());
    System.out.println(t2.getState());
    t2.start();
    System.out.println(t1.getState());
    System.out.println(t2.getState());
    try {
      Thread.sleep(1000);
      System.out.println(t1.getState());
      System.out.println(t2.getState());
      Thread.sleep(1000);
      System.out.println(t1.getState());
      System.out.println(t2.getState());

    } catch(InterruptedException e) {
      e.printStackTrace();
    }

    try {
      t1.join();
      System.out.println(t1.getState());
      System.out.println(t2.getState());
      t2.join();
      System.out.println(t1.getState());
      System.out.println(t2.getState());
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
      System.out.println(t1.getState());
      System.out.println(t2.getState());
  }
}