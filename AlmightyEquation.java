import java.util.Scanner;

public class AlmightyEquation{

  public static void main(String[] args){ 

     double A,
            B,
            C,
            X1,
            X2;
Scanner input = new Scanner(System.in);

System.out.println("Pls Enter Your firstNumber for A:");
  A = input.nextDouble();

System.out.println("Pls Enter Your secondNumber for B:");
 B = input.nextDouble();

System.out.println("Pls Enter Your thirdNumber for C:");
  C = input.nextDouble();

System.out.println("Pls hold while we process your value");
   Double D = (Math.sqrt(Math.pow(B, 2))- (4 * A * C));
   X1 = (-B + D)/(2 * A);
   X2 = (-B - D)/(2 * A);
System.out.println("The variable of D is:" + D  +  "The Variable of X1: "+ X1  + "The variable of X2:" + X2 );

System.out.println("Therefore the value of X1 and X2 can be inputted into the Almighty formula (x*x + Bx + C) to arrive at a derivative");
    

      }





}