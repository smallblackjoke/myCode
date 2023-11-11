import java.awt.*;
import java.util.Scanner;

public class Array_1108_2 {
    public static void main(String[] args) {
        Scanner myScnner = new Scanner(System.in);
        int[] arr = new int[]{10,12,45,90};
        System.out.println("请输入要插入的值：");
        int number = myScnner.nextInt();
        arr = insert(arr,number);
        for(int ele:arr){
            System.out.print(ele + " ");
        }
    }

    public static int[] insert(int[] arr,int num){
        //确定插入位置
        int index = -1;
        for(int i =0;i<arr.length;i++){
            if(arr[i]>num){
                index = i;
                break;
            }
        }
        if(index == -1)
            index = arr.length;
        // 初始化新的数组
        int [] new_arr = new int[arr.length+1];
        for(int j=0;j<new_arr.length;j++){
            if(j<index){
                new_arr[j] = arr[j];
            } else if (j==index) {
                new_arr[j] = num;
            } else {
                new_arr[j] = arr[j-1];
            }
        }
        return new_arr;
    }
}
