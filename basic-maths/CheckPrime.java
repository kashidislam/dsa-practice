import java.util.Scanner;

public class CheckPrime {

    public static void main(String [] args){
        Scanner s = new Scanner(System.in);
        int number = s.nextInt();
        s.close();

        // CHECK IF THE NUMBER IS PRIME OR NOT
        for(int i = 2; i < Math.sqrt(number); i++){
            if(number % i == 0){
                System.out.println("The number " + number + " is NOT PRIME.");
                return;
            }
        }
        System.out.println("The number " + number + " is PRIME.");
    }
    
}
