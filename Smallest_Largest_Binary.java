package Day04_programs.Binary_Search;

import java.util.Scanner;
public class Smallest_Largest_Binary {
    static int finding_Element(int[] arr,int target,int r) {
        int start = 0, end = arr.length-1, mid;
        while (start <= end) {
            mid = start + (end-start)/ 2;
            if (arr[mid] == target) {
                if(r==0)
                    return mid+1;
                if(r==1)
                    return mid-1;
            }
            if (arr[mid] > target) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return -1;
    }
            public static void main (String[]args){
                Scanner sc = new Scanner(System.in);
                System.out.print("Enter Array Size: ");
                int n = sc.nextInt();
                int[] arr = new int[n];
                System.out.println("Enter Elements in Sorted Order: ");
                for (int i = 0; i < n; i++) {
                    arr[i] = sc.nextInt();
                }
                System.out.println("Enter the Target Element: ");
                int target = sc.nextInt();
                int result = finding_Element(arr, target,0);
                if(result==-1)
                    System.out.println("Element Not Found");
                else
                    System.out.println("Smallest element Index : "+result+" Value: "+arr[result]);
                result = finding_Element(arr, target,1);
                if(result==-1)
                    System.out.println("Element Not Found");
                else
                    System.out.println("Largest element Index: "+result+" Value: "+arr[result]);
            }
        }