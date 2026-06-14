public class ArrayBasics {
    public static void main(String[] args) {
        int[] arr = {2, 3, 5, 6, 8};
        for(int i=0; i<arr.length;i++){
            System.out.println(arr[i]);
        }
        int max = arr[0];

        for(int i=1;i<arr.length;i++){
            if (arr[i]>max){
                max=arr[i];
            }
        }
        System.out.println("max number: " + max);
    }
}
