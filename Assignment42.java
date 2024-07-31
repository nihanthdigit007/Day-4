public class Assignment42 {
        public static int linearSearch(String[] arr, String target) {
            for (int i = 0; i < arr.length; i++) {
                if (arr[i].equals(target)) {
                    return i;
                }
            }
            return -1;
        }

        public static void main(String[] args) {
            String[] arr = {"apple", "banana", "cherry", "date", "elderberry"};
            String target = "cherry";
            int result = linearSearch(arr, target);
            System.out.println("Element found at index: " + result);
        }
    }