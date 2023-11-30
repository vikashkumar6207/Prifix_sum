import java.util.Scanner;
/*Given array of size n. answer q quires where you need to print the 
sum of values in a ginen range of indices from l to r (both indexing)
 */
public class prifixSumArray_l_To_r {
    static int[] makeprifixSumArray(int []arr){
        for(int i = 1;i < arr.length;i++){
            arr[i] = arr[i] + arr[i-1];
        }
        return arr;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array Length : ");
        int n = sc.nextInt();
        int arr[] = new int[n+1];
        System.out.println("Enter element");
        for(int i = 1;i <= n;i++){
            arr[i] = sc.nextInt();
        }
        int[] prefixSum = makeprifixSumArray(arr);
        System.out.println("Enter quires");
        int q= sc.nextInt();
        while(q-->0){
            System.out.println("enter l and r : ");
            int l = sc.nextInt();
            int r = sc.nextInt();
            int ans = prefixSum[r] - prefixSum[l-1];
            System.out.println(ans);
        }
        
    }
}
