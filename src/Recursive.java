/**
 * 递归
 * 1. 方法自己调用自己的现象就是递归
 *
 * 2. 递归方法分类，直接递归、间接递归
 *
 * 3. 使用说明：
 *      递归方法包含了一种隐式循环
 *      递归方法会重复执行某段代码，但这种重复执行无需循环控制
 *      递归一定要向已知方向递归，否则这种递归就变成了无穷递归，停不下来，类似死循环，最终发生栈内溢出
 *
 * 4. 注意
 *      递归调用会占用大量的系统堆栈，内存消耗多，在递归调用多时速度要比循环慢得多，所以使用递归时要谨慎
 *      在要求高性能的情况下尽量避免使用递归，递归调用既花时间又“耗内存”，考虑使用循环迭代
 *
 * */

public class Recursive {
    public static void main(String[] args) {
        Recursive rs = new Recursive();
    //    rs.method1();
    }
    public void method1(){
        System.out.println("method1()....");
        method1();
    }
}

class Add{
    public static void main(String[] args) {
        Add ad = new Add();
        System.out.println(ad.adding(6));
    }
    //这个程序是从adding(100)开始的，然后到adding(1)的时候因为有return，就停下来了
    //else的运行逻辑是：
//    adding(5) = adding(4) + 5
//            = (adding(3) + 4) + 5
//            = ((adding(2) + 3) + 4) + 5
//            = (((adding(1) + 2) + 3) + 4) + 5
//            = ((1 + 2) + 3) + 4) + 5
//            = 15
//    而且adding（4）是没有值的，只是在控制流程
    public int adding(int num) {
        if (num == 1) {
            return 1;
        } else {
            return adding(num - 1) + num;
        }
    }
}

class Mult{
    public static void main(String[] args) {
        Mult mt = new Mult();
        System.out.println(mt.multiby(4));
    }
    public int multiby(int num){
        if (num == 1){
            return 1;
        }else {
            return multiby(num-1)*num;
        }
    }
}

class Feib{
    public static void main(String[] args) {
        Feib fb = new Feib();
        System.out.println(fb.fArray(5));
    }
    public int fArray(int num){
        if (num == 1){
            return 1;
        } else if (num == 2) {
            return 1;
        }else {
            return fArray(num-1)+fArray(num-2);
        }
    }
}

class RecuExer{
    public static void main(String[] args) {
        RecuExer re = new RecuExer();
        System.out.println(re.fNum(10));
    }
    public int fNum(int num){
        if (num == 20){
            return 1;
        } else if (num == 21) {
            return 4;
        }else {
            return fNum(num+2)-2*fNum(num+1);
        }
    }
}