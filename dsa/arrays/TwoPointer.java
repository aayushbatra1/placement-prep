public class TwoPointer {
    static void twoSum(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            if ((arr[left] + arr[right]) == target) {
                System.out.println("Found at index " + left + " and " + right);
                return;
            } else if ((arr[left] + arr[right]) > target) {
                right = right - 1;
            } else if ((arr[left] + arr[right]) < target) {
                left = left + 1;
            }
        }
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 3 ,4, 6};
        twoSum(arr,6);
    }
}
