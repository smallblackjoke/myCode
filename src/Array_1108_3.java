import java.util.Random;

public class Array_1108_3 {
    public static void main(String[] args) {
        Random r = new Random();
        int[] arr = new int[10];
        for(int i=0;i<arr.length;i++){
            arr[i] = r.nextInt(101);
        }
        show(arr);
        System.out.println();
        //倒叙打印
        reverse(arr);
        System.out.println();

        // 平均值
        double average = Average(arr);
        System.out.println("平均值为"+average);
        // 最大值
        int[] max_result = Max(arr);
        System.out.println("最大值："+max_result[0]+" 索引："+max_result[1]);
        // 包含某个数
        System.out.println("是否包含8："+contain(arr,8));
    }
    public static void reverse(int[] arr){
        for(int j =arr.length -1;j>-1;j--){
            System.out.print(arr[j]+" ");
        }
    }
    public static void show(int[] arr){
        for(int j =0;j<arr.length;j++){
            System.out.print(arr[j]+" ");
        }
    }
    public static double Average(int[] arr){
        int sum = 0;
        for(int j =0;j<arr.length;j++){
            sum += arr[j];
        }
        return (double)(sum/arr.length);
    }
    public static int[] Max(int[] arr){
        int max_value = -1;
        int index = -1;
        for(int j =0;j<arr.length;j++){
            if(arr[j]>max_value){
                max_value=arr[j];
                index = j;
            }
        }
        return new int[]{max_value,index};
    }
    public static boolean contain(int[] arr,int num){
        for(int j =0;j<arr.length;j++){
            if(arr[j] ==num)
                return true;
        }
        return false;
    }
}
