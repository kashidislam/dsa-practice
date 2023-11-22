import java.util.Scanner;

public class FactorsOfANumber {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int number = s.nextInt();
        s.close();

        // FIND ALL THE FACTORS OF A NUMBER ---> number
        System.out.println("Factors of " + number + " are: ");
        findFactors(number);
    }

    public static void findFactors(int n){
        int i = 1;
        while(i <= Math.sqrt(n)){
            if(n%i == 0){
                System.out.print(i + " ");
                if(i != n/i){   // THIS CASE IS EDGE CASE WHEN THE NUMBER IS A PERFECT SQUARE 
                    System.out.print(n/i + " ");
                }
            }
            i++;
        }
    }
    
}
