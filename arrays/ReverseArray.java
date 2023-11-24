public class ReverseArray{
    public static void main(String [] args){
        int [] arr = {1,2,3,4,5};
        printArray(arr);
       // reverseArray(arr);
       // printArray(arr);
        System.out.println("REVERSE AN ARRAY RECURSIVELY");
        reverseArray(arr, 0, arr.length-1);
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

    // REVERSE AN ARRAY USING RECURSION

    public static void reverseArray(int [] a, int s, int e){
        if(s < e){
            int temp = a[s];
            a[s] = a[e];
            a[e] = temp;
            reverseArray(a,s+1,e-1);
        }
    }
}