package Day04_programs;

import java.util.Scanner;

public class Non_Duplicate_Character {
    static int count(char b,String str){
        int k=0;
        for(int i=0;i<str.length();i++){
            if(b==str.charAt(i))
                k++;
        }
        return k;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter String: ");
        String str=sc.nextLine();
        int con=0;
        for(int i=0;i<str.length();i++){
            int c=count(str.charAt(i),str);
            if(c==1) {
                System.out.println(str.charAt(i));
                break;
            }
            else{
                con++;
            }
        }
        if(con==str.length())
            System.out.println("There is no  first NON_DUPLICATE Character");
    }
}
