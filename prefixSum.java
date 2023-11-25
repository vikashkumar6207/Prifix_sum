import java.util.Scanner;
public class prefixSum {
/*Given an integer array 'a', return the prefix Sum / running Sum in the same array without creating a new array */
    static void printArray(int arr[]){
        int n = arr.length;
        for(int i = 0;i < n;i++){
            System.out.print(arr[i]+" ");
        }
    }
    static int[] prifixSumArray(int arr[]){
        int n = arr.length;

        /*creating a new array */
        // int pref[] = new int[n];
        //  pref[0] = arr[0];
        // for(int i = 1;i < n;i++){
        //     pref[i] = pref[i-1]+arr[i];
        // }
        // return pref;

            /*without creating a new array */
        for(int i = 1;i < n;i++){
            arr[i] = arr[i-1]+arr[i];
        }
        return arr;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i = 0;i < n;i++){
            arr[i] = sc.nextInt();
        }
        printArray(arr);
        System.out.println();
        int []pref = prifixSumArray(arr);
        printArray(pref); 
    }

}