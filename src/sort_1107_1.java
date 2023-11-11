public class sort_1107_1 {
    public static void main(String[] args) {
        int [] arr = {13,50,28,64,88,99};
        int len = arr.length;
        for(int i=0;i < len -1;i++){
            for(int j =0;j<len -1 -i;j++){
                if(arr[j]>arr[j+1]){
                    int tmep = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = tmep;
                }
            }
        }
        for(int element:arr){
            System.out.print(element + "\t");
        }
    }
}
