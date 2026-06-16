public class BinarySearch {
    static int binarySearch(int[] arr, int target){
        int low=0;
        int high = arr.length - 1;

        while (low <= high) {
            int mid = (low+high)/2;

            if(arr[mid]==target) return mid;
            else if (arr[mid]<target) {
                low = mid + 1;// go right
            }
            else{
                high = mid -1;//go left
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 7, 9, 11, 13};
        System.out.println(binarySearch(arr,11));
    }
}
