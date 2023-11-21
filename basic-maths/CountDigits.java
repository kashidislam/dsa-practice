import java.util.Scanner;

public class CountDigits{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();
        s.close();

        int countDigit = countNumberDigit(num);
        System.out.println("The number of digits in " + num + " is: " + countDigit);
    }

    public static int countNumberDigit(int number){
        int count = 0;
        while(number != 0){
            count++;
            number/=10;
        }
        return count;
    }
}