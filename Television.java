public class Television{

  private String name;
  private int volume;
  private String color;
  private int channel;
  private boolean isOn;

public Television(String name, int volume, String color, int channel, boolean isOn) {
  this.name = name;
  this.volume = volume;
  this.color = color;
  this.channel = channel;
  this.isOn = true;
}
 public void setChannel (int channel) {
   this.channel = channel;
}
public void increaseVolume (int volume) {
   volume += 1;
}
public void decreaseVolume (int volume) {
     volume -= 1;
}

public int getChannel() {
 return channel;
} 
 
}


