interface Engine {

  int price = 50000;

  void start();

  void stop();

  void accelerate();
}

interface Brake {
  void brake();
}

interface Media {
  void play();

  void stopMedia();
}

class Car implements Engine, Brake, Media {

  @Override
  public void accelerate() {
    System.out.println("Accelerating....");
  }

  @Override
  public void start() {
    System.out.println("Starting....");
  }

  @Override
  public void stop() {
    System.out.println("Stopping....");
  }

  @Override
  public void stopMedia() {
    System.out.println("Media Stopping....");
  }
  @Override
  public void brake() {
    System.out.println("Brakes applied....");
  }

  @Override
  public void play() {
    System.out.println("Media playing...");
  }
}

class MultipleInheritance {
  public static void main(String[] args) {
    Car c = new Car();
    c.start();
    c.accelerate();
    c.brake();
    c.play();
    c.stopMedia();
    c.stop();
  }
}