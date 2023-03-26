import java.util.Scanner;

public class MC {
    static Scanner sc = new Scanner(System.in);
    /*伴随着对象实例存在的二维数组【二维数组：数据类型[][] 数组名=new 数据类型[行][列]
    行X列=下标个数】*/
    double[][] array;

/*一、*/
    //方法input，伴随对象实例存在，无参数，无返回值
    //控制台输出提示提醒输入二维数组的行数和列数，然后再提示输入所有的数组元素(double类型数组)
    public void input(){
        System.out.print("请输入二维数组的行数：");
        int n = sc.nextInt();
        System.out.print("请输入二维数组的列数：");
        int m = sc.nextInt();
        System.out.println("输入所有的数组元素----------");
         //补充代码完成二维数组的初始化，获取二维数组所有元素的值所有的[遍历]。
        array =new double[n][m];
        //遍历二维数组的每一行
        for(int i = 0;i<n;i++){
                //遍历二维数组的每一列
            for(int j=0;j<m;j++){
                     //提示语句参考System.out.println("请输入第"+(i+1)+"行第"+(j+1)+"列的元素：");
                System.out.println("请输入第"+(i+1)+"行第"+(j+1)+"列的元素：");
                array[i][j] = sc.nextDouble();   


            }
        }
        //注意使用对象自己的成员变量数组array，不要重新去定义一个数组

    }
/*二 、*/
    //方法add，将数组中所有的元素翻倍，无参数，无返回值
public  void add(){
      //遍历二维数组的每一行
      for(int i = 0;i<array.length;i++){
        //遍历二维数组的每一列
    for(int j=0;j<array[i].length;j++){
    array[i][j]=array[i][j]*2;
    }
  }
}


    //方法show，将数组中所有元素以矩形的形式打印到命令行，无参数，无返回值
    public  void show(){
            //遍历二维数组的每一行
      for(int i = 0;i<array.length;i++){
        //遍历二维数组的每一列
    for(int j=0;j<array[i].length;j++){
        System.out.println(array[i][j]+" ");
    }
    System.out.println();
  } 
    }
    //输出格式化语句可参考System.out.printf("%6s",array[i][j]+" ");

    
}
