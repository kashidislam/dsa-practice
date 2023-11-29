import java.util.Scanner;

public class InsertionSort {

    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int size = s.nextInt();
        int [] inputArray = new int[size];
        for(int i = 0; i < size; i++){
            inputArray[i] = s.nextInt();
        }
        s.close();

        System.out.println("The input array");
        printArray(inputArray);

        insertionSort(inputArray);

        System.out.println("The array after sorting");
        printArray(inputArray);
    }
    // INSERTION SORT ALGORITHMS
    public static void insertionSort(int[] a){

        for(int i = 1; i < a.length; i++){
            int j = i;      
            while(j > 0 && a[j] < a[j-1]){
                int temp = a[j-1];
                a[j-1]= a[j];
                a[j] = temp;
                j--;
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
