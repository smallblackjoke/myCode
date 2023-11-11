public class Array_1107_3 {
    public static void main(String[] args) {
        //数组反转
        int [] myarry = {11,22,33,44,55,66,77};
        //确定中间坐标，然后进行头尾交换
        int len = myarry.length;
        for(int i = 0;i< len/2;i++){
            int temp = myarry[i];
            myarry[i] = myarry[len-1-i];
            myarry[len-1-i] = temp;
        }
        for(int num:myarry){
            System.out.print(num + "\t");
        }
    }
}
