public class ReverseArray{
    public static void main(String [] args){
        int [] arr = {1,2,3,4,5,6};
        printArray(arr);
        reverseArray(arr);
        printArray(arr);
    }

    public static void reverseArray(int [] a){
        int start = 0;
        int end = a.length-1;

        while(start <= end){
            int temp = a[start];
            a[start++] = a[end];
            a[end--] = temp;
        }
    }

    public static void printArray(int [] a){
        for( int val : a){
            System.out.print(val + " ");
        }
        System.out.println();
    }
}