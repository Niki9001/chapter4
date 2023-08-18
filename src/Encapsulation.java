/**
 * 封装性
 *
 * 1. 为什么要封装性？
 *  理论上：
 *      高内聚，类的内部数据操作细节自己完成，不允许外部干涉
 *      低耦合，仅暴露少量的方法给外部使用，尽量方便外部调用
 *  通俗的说就是把该隐藏的隐藏起来，该暴露的暴露出来
 *
 * 2. 如何实现封装
 *      权限修饰符：private 缺省 protected public
 *      作用：可以使用权限修饰，修饰类及类的内部成员，当这些成员被调用时，体现可见性的大小
 *      案例：见下列代码
 *      4种权限的使用
 *          类只能使用public和缺省
 *          类的内部成员可以使用4种权限修饰符进行修饰
 *      开发中4种权限使用的频率情况: private 和 public 常用
 *
 *  3. 封装性的体现
 *      场景1：私有化(private)类的属性，提供公共(public)的get和set方法，对此属性进行获取或修改
 *      场景2：将类中不需要对外暴露的方法，设置为private
 *
 *
 * */
public class Encapsulation {
    public static void main(String[] args) {
        Animal a1 = new Animal();
        a1.name = "frog";
        //被private了
        //a1.legs = -4;
        a1.setLegs(-2);
        a1.eat();
        //被private了
        //System.out.println(a1.name+"  "+a1.legs);
        System.out.println(a1.name+"   "+a1.getLegs());
    }

}

class Animal{
    String name;
    private int legs;
    public void eat(){
        System.out.println("animal eats");
    }
    //设置legs的属性值
    public void setLegs(int l){
        if (l>=0 && l%2==0){
            legs=l;
        }else {
            System.out.println("invalid");
        }
    }
    //获取legs的属性值
    public int getLegs(){
        return legs;
    }
}
