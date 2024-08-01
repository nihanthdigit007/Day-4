package Day04_programs.Binary_Search;
import java.util.Scanner;
public class Binary_search {
    static int binarysearch(int start,int end,int[] arr,int target){
        int mid;
        while(start<=end){
            mid = start + end / 2;
            if(arr[mid]==target){
                return mid;
            }
            if (arr[mid] > target){
                end = mid-1;
                }
            else{
                start=mid+1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the array size: ");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter the sorted array Elements: ");
        for(int i=0;i<n;i++)
            arr[i]=sc.nextInt();
        System.out.println("Enter the element to search: ");
        int target=sc.nextInt();
        int start=0,end=n-1;
        System.out.println(binarysearch(start,end,arr,target));
    }
}
