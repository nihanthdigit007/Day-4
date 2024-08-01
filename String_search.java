package Day04_programs;

import java.util.Scanner;

public class String_search {
    static int stringsearch(String[] arr,String target){
        String s=target.toLowerCase();
        for (int i=0;i<arr.length;i++){
            String str=arr[i].toLowerCase();
            if(s.equals(str)){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter array size: ");
        int n=sc.nextInt();
        String[] arr=new String[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.next();
        }
        String target=sc.next();
        System.out.println(stringsearch(arr,target));
    }
}
