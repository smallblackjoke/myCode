import java.util.Random;

public class sort_1108_1 {
    public static void main(String[] args) {
        int[] arr = new int[10];
        Random r = new Random();
        for(int i=0 ; i < arr.length ; i++){
            arr[i] = r.nextInt(101);
        }
        show(arr);
        arr = bubbleSort(arr);
        show(arr);
    }
    public static void show(int[] arr){
        for(int j =0;j<arr.length;j++){
            System.out.print(arr[j]+" ");
        }
        System.out.println();
    }
    public static int[] bubbleSort(int[] arr){
        int len = arr.length;
        for(int i=0;i < len;i++) {
            for (int j = 0; j < len - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
            show(arr);
        }
        return arr;
    }
}
