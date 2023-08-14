/**
 *
 * 1. 设计类就是设计类的成员
 * class {
 *
 * }
 *
 * 2. 类的内部成员：
 *  属性 field
 *      1. 按数据类型：基本数据类型、引用数据类型
 *      2. 类的声明位置不同： 成员变量（或属性)，局部变量（方法内、方法形参、构造器内、构造器外）
 *  行为 method （功能）
 *
 * 3. 成员变量 member variable / field vs 局部变量 local variable
 *  相同点
 *      声明格式相同 数据类型 变量名 = 变量值；
 *      变量都有其有效的作用域，出了作用域就失效了
 *      变量必须 先声明，再赋值，再使用
 *  不同点：
 *      类中的位置不同
 *          属性field放在类内，方法外的变量
 *          局部变量local variable，声明方法，构造器内部的变量
 *      在内存中分配的位置不同
 *          属性field：随着对象创建，存储在堆空间中
 *          局部变量local variable：栈
 *      生命周期
 *          属性field：随着对象的创建而创建，随着对象的消亡而消亡
 *          局部变量local variable： 随着方法对应的栈帧入栈，局部变量会在栈中分配，对应的栈帧出帧，局部变量消亡
 *      作用域
 *          属性field：整个类的内部都有效
 *          局部变量local variable：仅限于声明此局部变量所在的方法（或构造器、代码块）中
 *      是否有权限修饰符进行修饰
 *          权限修饰符： public protected private
 *              用于表明所修饰的结构可调用的范围大小
 *          属性field是可以使用权限修饰符进行修饰
 *          局部变量local variable不可以使用
 *
 *  4. 类的实例化
 *      等价描述：类的实例化、创建类的对象、创建类的实例
 *      格式： 类类型 对象名 = 通过new创建的对象实体
 *      举例：
 *          c1 p1 = new c1();
 *          Scanner sc = new Scanner();
 *  5. 是否有默认值
 *      属性field都有默认初始化值
 *          意味着如果没有给属性进行初始化赋值，则会有默认的初始化值
 *
 *      局部变量local variable都没有默认初始化值
 *          意味着在使用局部变量之前，必须要显式的赋值
 *
 *
 *  TODO： 面向对象完成具体功能的操作的三部流程（！非常重要）
 *      1. 创建类，并设计类的内部成员（属性，方法）
 *      2. 创建类的对象，比如
 *      3. 通过对象，调用其内部声明的属性或方法，并完成相关的功能
 *
 *
 *
 * */
public class c1 {
    //field
    double price; //成员变量
    String name;

    //method
    public void call(){
        System.out.println("make a call");
    }

    public void sendMessage(String message){
        System.out.println("Send message " + message);
    }

    public void playGame(){
        System.out.println("play games");
    }

}
