public class c1Test {
    public static void main(String[] args) {
        //创建对象
        c1 p1 = new c1();
        //通过c1的对象，调用其内部声明的属性或方法
        // 对象.属性
        p1.name = "iPhone";
        p1.price = 2000;

        System.out.println("name= " + p1.name + ", price= " + p1.price);

        //调用方法 method
        p1.call();
        p1.sendMessage("有内鬼，终止交易");
        p1.playGame();
    }
}
