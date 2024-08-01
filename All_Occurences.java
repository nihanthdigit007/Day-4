package Day04_programs;
import java.util.*;
public class All_Occurences {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of array: ");
        int n=sc.nextInt();
        int[] arr=new int[n];
        ArrayList<Integer> a=new ArrayList<>();
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the number to return the indices: ");
        int m=sc.nextInt();
        for(int i=0;i<n;i++){
            if(arr[i]==m)
                a.add(i);
        }
        System.out.println(a);
    }
}
