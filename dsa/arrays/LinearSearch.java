public class LinearSearch {
    static int linearSearch(int[] arr,int target){
        for(int i=0;i<arr.length;i++){
            if (arr[i] == target){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {3, 7, 2, 9, 4};
        int result = linearSearch(arr,9);
        System.out.print(result);
    }
}
