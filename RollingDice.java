import java.util.Random;

public class RollingDice {
 
    public static void main(String[] args) {
   
       Random rano = new Random();
       int x = rano.nextInt(8);

       System.out.println(" You rolled a: " + x);
    }
}


