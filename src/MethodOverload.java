/**
 * 方法重载 overload
 * 1. 定义：在同一个类中，允许存在一个以上的同名方法，只要他们的参数列表不同即可
 *          满足这样特征的多个方法，彼此之间构成方法重载
 * 2. 总结：两同一不同
 *          两同：同一个类，相同的方法名
 *          一不同：参数列表不同 1，参数个数不同。 2.参数类型不同
 *          注意：方法的重载与形参名，权限修饰符，返回值类型都没有关系
 * 3. 举例
 * 4. 如何判断两个方法是否相同
 *      方法名相同，且形参列表相同（形参个数和类型都相同，与形参名无关）
 *      要求: 在一个类中，允许存在多个相同名字的方法，只要他们的形参列表不同即可
 *      确定方法----通过不同的形参列表确定不同的方法
 *
 * 5. 在同一个类中不允许定义两个相同的方法
 *
 * */
public class MethodOverload {
    public static void main(String[] args) {
        MethodOverload mo = new MethodOverload();
        mo.add(1,2);
    }
    public void add(int i, int j, int k){

    }
    public void add(int j, int k){

    }
}
