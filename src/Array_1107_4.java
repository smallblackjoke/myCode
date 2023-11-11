import java.util.Scanner;

public class Array_1107_4 {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        int [] arr = {1,2,3};
        do{
            System.out.println("是否要进行数组扩容？y/n");
            String flag = myScanner.next();
            if(flag.equals("y")){
                System.out.println("请输入需要添加的整数：");
                int num = myScanner.nextInt();
                arr = append(arr,num);
            }
            for(int element:arr){
                System.out.print(element + "\t");
            }
            System.out.println();

        }while (true);
    }
    public static int[] append(int[] arr,int num){
        int [] arr_new = new int[arr.length + 1];
        for(int i = 0;i<arr.length;i++){
            arr_new[i] = arr[i];
        }
        arr_new[arr.length] = num;
        return arr_new;
    }
}
