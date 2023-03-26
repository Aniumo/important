//补充完成一个方法fun 1，伴随着类而存在，参数为两个String，没有返回值，执行后直接在控制台输出
//如：两个参数字符串"张三" "李四"  输出："张三喜欢李四"   
import java.util.Scanner;
public class MyChallenge {
    static  Scanner input = new Scanner(System.in);
    
    public void fun1(String a, String b) {
        System.out.println(a + "喜欢" + b);
    }
    // 补充完成一个方法fun2，伴随着类而存在，参数为一个int类型整数，返回值为boolean类型
    // 判断三位整数是不是水仙花数，是则返回true，否返回false

    public static boolean fun2(int b){
        // 水仙花数
        // System.out.println("请输入一个三位数，查看是否是水仙花数：");
        //  int b = input.nextInt();
        
          int  n1 = b % 10;
          int  n2 = b/10%10;
          int  n3 = b/100;
        
          return(n1*n1*n1+n2*n2*n2+n3*n3*n3==b);
    }
    // 补充完成一个方法fun3，伴随着类而存在，参数为两个int类型整数，返回值为这两个数的最大公约数
    public static int fun3(int one , int two){
    Scanner input = new Scanner(System.in);
    System.out.print("请输入第一个数：");
    int one = input.nextInt();
    System.out.print("请输入第二个数：");
    int two = input.nextInt();
    int r = (one % two);   //两个数求余不等于0
    while(r!=0 ){
        one = two;  //则将two的值赋给one,将余数r赋给two，这样也不用判断m和n的大小
                    // ，若m＜n,在第一次循环结束后，就使m>n了。
        two = r;
        r = (one%two);
    }
    System.out.println("最大公约数："+two);

}




    // import java.util.Scanner;
    public static void main(String[] args) {
        /*方法1：我采用了，不加static的样子，是依靠变量实例存在的*/ 
        MyChallenge n = new MyChallenge();
        n.fun1("张三", "李四");

       /**/
       fun2(321);
    }
}
/*补充：不加static修饰，随着实例变量的存在而存在
加static修饰，随着类的存在而存在
*/
