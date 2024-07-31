import java.util.List;
public class Assignment43 {


        public static int findFirstOccurrence(List<Integer> list, int target) {
            for (int i = 0; i < list.size(); i++) {
                if (list.get(i) == target) {
                    return i;
                }
            }
            return -1;
        }

        public static void main(String[] args) {
            List<Integer> list = List.of(10, 20, 30, 40, 50, 30);
            int target = 30;
            int result = findFirstOccurrence(list, target);
            System.out.println("Element found at index: " + result);
        }
    }
