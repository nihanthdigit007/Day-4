import java.util.*;
public class Duplicate_Elements{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of ArrayList: ");
        int n=sc.nextInt();
        ArrayList<Integer> list = new ArrayList<>();
        System.out.println("Enter element to add in the list");
        for(int i=0;i<n;i++){
            list.add(sc.nextInt());
        }
        int count;
        for(int i=0;i<list.size();i++){
            count=1;
            for(int j=i+1;j<list.size();j++){
                if(list.get(i).equals(list.get(j))){
                    count++;
                    list.set(j,-1);
                }
            }
            if(count>1 && list.get(i)!=-1)
                System.out.println("Duplicate element "+list.get(i));
        }
    }
}