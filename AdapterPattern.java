interface MediaPlayer {
  public void play();
}

interface AdvancedMediaPlayer {
  public void play();
}

class MP4Player implements AdvancedMediaPlayer {
  public void play() {
    System.out.println("Played using MP4");
  }
}

class VLC implements AdvancedMediaPlayer {
  public void play() {
    System.out.println("Played using VLC");
  }
}

class MediaAdapter implements MediaPlayer {
  AdvancedMediaPlayer m;
  public MediaAdapter(AdvancedMediaPlayer m) {
    this.m = m;
  }

  public void play() {
    System.out.println("Played using " + this.m);
  }
}

public class AdapterPattern {
  public static void main(String[] args) {
    AdvancedMediaplayer n = new MP4Player();
    AdvancedMediaPlayer x = new VLC();
    AdvancedMediaAdapter f = new MediaAdapter(x);
    f.play();
    f = new MediaAdapter(n);
    f.play();
  }
}