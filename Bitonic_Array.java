package Day04_programs.Binary_Search;
import java.util.Scanner;
public class Bitonic_Array {
    static void sorted_Array(int[] arr){
        for(int i=0;i<arr.length-1;i++){
            if(arr[i+1]<arr[i]){
                System.out.println("Peak Element Index: "+i);
                break;
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Array Size: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter Elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        sorted_Array(arr);
    }
}