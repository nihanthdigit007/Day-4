import java.util.*;
public class Remove_Duplicates{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of ArrayList: ");
        int n=sc.nextInt();
        ArrayList<Integer> list = new ArrayList<>();
        char ch;
            System.out.println("Enter element  in the list");
            list.add(sc.nextInt());
        ArrayList<Integer> uniqueElements = new ArrayList<Integer>();
        for(int i: list){
            if(uniqueElements.contains(i))
                continue;
            uniqueElements.add(i);
        }
        System.out.println(uniqueElements);
    }
}