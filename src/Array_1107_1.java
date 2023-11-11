public class Array_1107_1 {
    public static void main(String[] args) {
        //创建一个char数组，存放A->Z,并且用for循环打印出来
        char[] myArray = new char[26];
        for(int i = 0 ; i < myArray.length ; i++) {
            myArray[i] = (char)('A' + i) ;
            System.out.println(myArray[i]);
        }

    }
}
