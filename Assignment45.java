public class Assignment45 {

        public static int findMax(int[] arr) {
            if (arr.length == 0) {
                throw new IllegalArgumentException("Array is empty");
            }

            int max = arr[0];
            for (int i = 1; i < arr.length; i++) {
                if (arr[i] > max) {
                    max = arr[i];
                }
            }
            return max;
        }

        public static void main(String[] args) {
            int[] arr = {10, 20, 30, 40, 50};
            int maxElement = findMax(arr);
            System.out.println("Maximum element in the array is: " + maxElement);
        }
    }

