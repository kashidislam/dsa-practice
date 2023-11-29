import java.util.Scanner;

public class SelectionSort{
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
        selectionSort(inputArray);
        System.out.println("The array after sorting");
        printArray(inputArray);
    }

    // SELECTION SORT ALGORITHM

    public static void selectionSort(int [] a){
        for(int i = 0; i < a.length-1; i++){
            int minIndex = i;
            for(int j = i+1; j < a.length; j++){
                if(a[j] < a[minIndex]){
                    minIndex = j;   // assigning the index which have the min element
                }
            }
            // SWap the i-th index element to the minIndex element 
            int temp = a[i];
            a[i] = a[minIndex];
            a[minIndex] = temp;
        }
    }

    public static void printArray(int [] a){
        for(int val : a){
            System.out.print(val + " ");
        }
        System.out.println();
    }

}