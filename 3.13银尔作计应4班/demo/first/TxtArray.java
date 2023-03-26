package first;
/* 定义一个String类型的一维数组，大小为5，
然后在没有给里面的元素赋值时输出数组内元素，看看值是多少。
那之后给给数组元素**一次性**赋值张三、李四、王五、赵六、田七。
再使用**增强型for循环**遍历输出里面所有元素。*/
public class TxtArray{
    public static void main(String[] args) {
       /* //1.
        String[] num = new String[]{"","","","",""};                   // String[] num = new String[]{"","","","",""};
         for(int i=0;i<5;i++){
            System.out.println(num[i]);
         }*/
         //注:string是引用数据类型,所以不添加元素的话,执行出来是null
        //2.
        String[] num = new String[]{"张三","李四","王五","赵六","田七"};   
        for(int i=0;i<num.length;i++){
            System.out.println(num[i]);
         }
    }
 }
