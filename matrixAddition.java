package Array2D;

import java.util.Scanner;

public class matrixAddition {
    static void printArray(int arr[][]){
        for(int i = 0;i < arr.length;i++){
            for(int j = 0;j < arr.length;j++){
                System.out.print(arr[i][j]+" ");
    
            }
            System.out.println();
        }
    }
    static void Addition(int arr1[][], int r1, int c1, int arr2[][], int r2, int c2){
        if(r1 != r2 || c1 != c2){
            System.out.println("Addition is not possible");
            return;
        }
        int sum[][] = new int[r1][c1];
        for(int i = 0;i < r1;i++){
            for(int j = 0;j < c1;j++){
                sum[i][j] = arr1[i][j] + arr2[i][j];
            }
        }
       printArray(sum);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("enter the r1 : ");
        int r1 = sc.nextInt();
        System.out.println("enter the c1 : ");
        int c1 = sc.nextInt();
        System.out.println("enter the element : ");
        int matrix1[][] = new int[r1][c1];
        for(int i = 0;i < r1;i++){
            for(int j = 0;j < c1;j++){
                matrix1[i][j] = sc.nextInt();
            }
        }
        System.out.println("enter the r2 : ");
        int r2 = sc.nextInt();
        System.out.println("enter the c2 : ");
        int c2 = sc.nextInt();
        System.out.println("enter the element : ");
        int matrix2[][] = new int[r2][c2];
        for(int i = 0;i < r2;i++){
            for(int j = 0;j < c2;j++){
                matrix2[i][j] = sc.nextInt();
            }
        }
        printArray(matrix1);
        printArray(matrix2);
        
        Addition(matrix1, r1, c1, matrix2, r2, c2);
        

    }
}
