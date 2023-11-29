import java.util.Scanner;

public class BubbleSort {
    public static void main(String[] args){

        Scanner s = new Scanner(System.in);
        int size = s.nextInt();
        int [] inputArray = new int[size];
        for(int i = 0; i < size; i++){
            inputArray[i] = s.nextInt();
        }
        s.close();
        System.out.println("The input array ");
        printArray(inputArray);
        bubbleSort(inputArray);
        System.out.println("The array after sorting");
        printArray(inputArray);
    }

    public static void bubbleSort(int [] a){
        for(int i = a.length-1; i >=1; i--){
            for(int j = 0; j < i; j++){
                if(a[j] > a[j+1]){
                    int temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                }
            }
        }
    }

    public static void printArray(int [] a){
        for(int val : a){
            System.out.print(val + " ");
        }
        System.out.println();
    }

}
