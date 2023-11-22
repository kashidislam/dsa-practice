import java.util.Scanner;

public class GCD {

    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int numberA = s.nextInt();
        int numberB = s.nextInt();
        s.close();

        // GCD OF 0,0 is 0

        if(numberA < numberB){      // SWAPPING THE NUMBERS (NUMBER1 and NUMBER2)
            int temp = numberA;
            numberA = numberB;
            numberB = temp;
        }
        // CHECK IF ANY OF THE TWO NUMBER IS ZERO
        if(numberA == 0  || numberB == 0){
            if(numberA == 0){
                System.out.println("GCD is: " + numberB);
        }
            else{
                System.out.println("GCD is: " + numberA);
            }
            return ;
        }
        int gcd = findGCD(numberA,numberB);
        System.out.println("The GCD of " + numberA + " and " + numberB + " is: " + gcd);
    }

    public static int findGCD(int a, int b){
        while(b != 0){
            int temp = b;
            b = a%b;
            a = temp;
        } 
        return a;
    }
    
}
