public class Array_1107_2 {
    public static void main(String[] args) {
        // 求数组int[] = {4,-1,9,10,23}的最大值并得到下标
        int[] myarray = {4,-1,9,10,23};
        int i=0,j = myarray.length -1,max_value = 0,index = -1;
        while(i < j){
            if(myarray[i] > myarray[j]){
                max_value = myarray[i];
                index = i;
                j--;
            }
            else {
                max_value = myarray[j];
                index = j;
                i++;
            }
        }
        System.out.println("最大值为" + max_value+ "，其下标为"+index);
    }
}
