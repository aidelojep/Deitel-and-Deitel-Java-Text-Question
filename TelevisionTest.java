import java.util.Scanner;


public class Television{ 

  public static void main(String[] args) {

Television myTelevision = new Television("SonyLED", 5, Black, 310, True);
  
System.out.printf("The default setting on this TV is: ", myTelevision.getName(), myTelevision.get);


   Scanner input = new Scanner(System.in);

      myTelevision.increaseVolume();
      
      myTevesion.decreaseVolume();



}






}