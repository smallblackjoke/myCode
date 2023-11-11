import java.util.Scanner;

public class TwoArray_1108_1 {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("请输入打印杨辉三角的层数：");
        int n = myScanner.nextInt();
        System.out.println("开始打印!!!");
        int[][] yanghui = Yanghui(n);
        for(int i=0;i<yanghui.length;i++){
            for (int j=0;j<yanghui[i].length;j++){
                System.out.print(yanghui[i][j] + "\t");
            }
            System.out.println();
        }
    }
    public static int [][] Yanghui(int n){
        int [][]yanghui = new int[n][];
        for(int i =0;i<n;i++){
            yanghui[i] = new int[i+1];
            if(i==0){
                yanghui[i][i]=1;
            }
            for(int j=0;j<i+1;j++){
                if(j==0){
                    yanghui[i][j]=1;
                } else if (j==i) {
                    yanghui[i][j]=1;
                }
                else {
                    yanghui[i][j]=yanghui[i-1][j-1] + yanghui[i-1][j];
                }
            }
        }
        return yanghui;
    }
}
