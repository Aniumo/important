package first;
//  未加static的，依靠着类的存在而存在，所有要实例化后才能使用

public class TestStudent {
 
    public static void main(String[] args) {
        //实列化
        Student Sd = new Student();
        // 调用
        Sd.age =18;
        Sd.name = "小银";
        Sd.sex="女";
        // 调用方法
        Sd.eat();
        Sd.sleep();
        Student Sd1 = new Student();
        Sd1.age =19;
        Sd1.name = "李友";
        Sd1.sex="女";
        Sd.eat();
        Sd.sleep();
        //在此处补充代码
    }

}
 