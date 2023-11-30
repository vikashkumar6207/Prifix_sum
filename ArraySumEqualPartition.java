import java.util.Scanner;
/*check if we can partition the array into two sunarrays with eqial 
sum of a part of the array is equal to the suffix sum of rest of the array. */
public class ArraySumEqualPartition {
    static int findArraySum(int []arr){
        int totalSum = 0;
        for(int i = 0;i < arr.length;i++){
            totalSum += arr[i];
        }
        return totalSum;
    }
    static boolean equalSumPartition(int[] arr){
        int totalSum = findArraySum(arr);
        int prefSum = 0;
        for(int i = 0;i < arr.length;i++){
            prefSum += arr[i];
            int suffixSum = totalSum - prefSum;
            if(suffixSum == prefSum){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int []arr = new int[n];
        for(int i = 0;i < n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(equalSumPartition(arr));
    }
}
