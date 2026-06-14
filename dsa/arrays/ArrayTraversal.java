public class ArrayTraversal {
    public static void main(String[] args) {
        int[] arr = {3, 7, 2, 9, 4};
        int sum = 0;
        for(int i=0;i<arr.length;i++){
            sum = sum + arr[i];
        }
        double avg = (double)sum / arr.length;
        System.out.println("Sum: " + sum);
        System.out.println("Average: " + avg);

        int start = 0; int end = arr.length - 1;
        while(start<end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();  // move to next line

        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println("Min: " + min);
    }
}
