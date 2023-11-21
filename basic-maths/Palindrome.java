import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int number = s.nextInt();
        s.close();

        int reversedNumber = reverseFunction(number);
        System.out.println("The reverse of "+ number + " using Recursion " + reverseRecursively(number, 0));
        boolean checkPalindrome = isPalindrome(number,reversedNumber);

        System.out.print(checkPalindrome);
    }

    public static int reverseFunction(int num){
        int rNum = 0;
        while(num != 0){
            rNum = rNum*10 + num%10;
            num/=10;
        }
        return rNum;
    }

    public static boolean isPalindrome(int a, int b){
        if(a == b) return true;
        return false;
    }

    // REVERSE THE NUMBER USING RECURSION

    public static int reverseRecursively(int num, int ans){
        if(num == 0){
            return ans;
        }
        ans = ans*10 + num%10;
        return reverseRecursively(num/10, ans);
    }
}
