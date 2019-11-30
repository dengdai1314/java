public class test {
 public static int oldVolume=0;
 public static int currentVolume=14;
 Boolean volumeFlag = false;
 public static String pause = "pause";
 public static String play = "play";
 
  public static void main(String[] args) {
   oldVolume = currentVolume;
   test t = new test();
   t.test(play);
   t.test(pause);
  }
  
  public void test(String type) {
   // TODO 自动生成的构造函数存根
   switch (type) {
   case "play":
    if (currentVolume>12) {
     currentVolume = 12;
     volumeFlag = true;
     System.out.println("12");
    }
    playMusic();
    break;
   case "pause":
    if (volumeFlag) {
     currentVolume = oldVolume;
     System.out.println(currentVolume);
    }
    pauseMusic();
    break;
   default:
    break;
   }
  }
  
  public  void playMusic() {
   System.out.println("playmusic"); 
  }
  
  public  void pauseMusic() {
   System.out.println("pauseMusic");
  }

}