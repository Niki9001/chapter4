/**
 * method 方法，函数
 * 1. 使用方法的好处：
 *  方法的理解： ‘方法’是类或对象行为特征的抽象，用来完成某个功能操作
 *  方法的好处： 实现代码重用，减少冗余，简化代码
 *
 * 2. 使用举例
 *  Math.random()
 *  Math.sqrt()
 *
 * 3. 声明举例
 *  person类
 *
 * 4. 声明方法的格式
 *  权限修饰符 [其他修饰符] 返回值类型 方法名（形参列表） [throws 异常类型]{  //《==方法头
 *      //方法体
 *  }
 *
 * 5. 具体的方法声明的细节
 *  1.权限修饰符： private \ 缺省 \ protected \ public
 *  2.返回值类型：描述当调用完此方法时，是否需要返回一个结果
 *      分类：
 *          无返回值类型，使用void
 *          有具体返回值，要指明返回值类型，可以是基本型，也可以是引用数据类型
 *              需要在方法内部配合使用return + 返回值
 *      【经验】我们在声明方法时要不啊哟提供返回值类型呢？
 *          根据方法具体实现的功能来决定，
 *          根据题目要求
 *  3.方法名
 *  4. 形参列表，属于局部变量，声明类型和变量名，可声明多个
 *      格式：（形参类型1 形参1，形参类型2 形参2）
 *      分类：无形参列表：不能省略（）
 *          有形参列表：根据方法调用时变量数量决定
 *  5.方法体，当我们调用一个方法时，真正执行的代码，体现了此方法的功能
 *
 * 6. 注意点
 *  java里方法不能独立存在，必须定义在类里
 *  方法不调用不执行，调用一次执行一次
 *  方法里不能再定义方法
 *  方法内可以使用奔雷中的其他方法或属性
 *
 *
 *
 * */

public class method {
    public static void main(String[] args) {
        person1 p1 = new person1();
        p1.eat();
        p1.getAge();
        p1.age=10;
    }
}

class person1{
    String name;
    int age;
    char gender;
    public void eat(){
        System.out.println("Person eating");
        sleep(8);
    }
    public void sleep(int hours){
        System.out.println("Person at least sleep " + hours + " hours.");
    }
    public String interests(String hobby){
        String info = "my hobby is "+ hobby;
        System.out.println(info);
        return info;
    }
    public int getAge(){
        return age;
    }

}