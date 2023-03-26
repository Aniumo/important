package first;
/*  第一题  定义一个int类型的一维数组，大小为5，
然后在没有给里面的元素赋值时输出数组内元素，看看值是多少。
那之后，给数组元素**一次性**赋值1、2、3、4、5。
再使用基本的for循环遍历输出里面所有元素。 */
public class array {
    public static void main(String[] args) {
                  //定义一个int 类型的数组
    //1. int[] num = new int[5] ;
                 //可以使用遍历；实现数组里面的元素，遍历一遍【增强for循环】
    //    for(int i:num){
        // System.out.println(i);
                  // 让元素遍历一遍，因为没有赋元素，所以打印出来的默认的int =0、double=0.0d、float=0.0f、Boolean=false
                 // 而引用数据类型：的默认值为null
    // }
    // 2.一次性赋元素
    int [] num={1,2,3,4,5} ;    //int[] num = new int[]{1,2,3,4,5} ; 
    for(int i:num){
        System.out.println(i);
    }
}
}