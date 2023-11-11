public class Method_1110_01 {
    public static void main(String[] args) {
        Person p1 = new Person();
        p1.speak();
        p1.cal01();
        p1.cal02(500);
    }
}

class Person {
    String name;
    int age;
    int length;

    public void speak(){
        System.out.println("我是一个好人！");
    }

    public void cal01(){
        int sum  = 0;
        for(int i=0;i<=1000;i++){
            sum +=i;
        }
        System.out.println("1+...+1000综合为："+sum);
    }
    public void cal02(int n){
        int sum  = 0;
        for(int i=0;i<=n;i++){
            sum +=i;
        }
        System.out.println("1+...+"+n+"综合为："+sum);
    }
    public int getSum(int num1,int num2){
        return num1+num2;
    }
}
