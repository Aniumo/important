public class TestMC {
    public static void main(String[] args) {
        MC a = new MC();   //初始化
        a.input();
        System.out.println("翻倍前：");
        a.show();
        a.add();
        System.out.println("翻倍后：");
        a.show();
    }
}