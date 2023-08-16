/**
 * 可变参数形参方法
 * 1. 使用场景
 * 在调用方法时，可能会出现方法形参的类型是确定的，但是参数的个数不确定，此时可以使用可变参数形参
 *
 * 2. 格式： (参数类型 ... 参数名)
 *
 * 3. 说明
 *      1. 可变形参可以赋值的参数个数可以为0个，1个或多个
 *      2. 可变个数形参的方法与同一个类中，同名的多个方法之间可以构成方法重载
 *      3. 同类型数组不构成重载
 *      4. 可变个数的形参必须声明在形参列表的最后
 *      5. 可变形参遍历需要用for循环，参考列表遍历
 *
 * */
public class Args {
    public static void main(String[] args) {
        Args ag = new Args();
        ag.print(1,2,3,4);
    }
    public void print(int ... nums){
        System.out.println("1111");
        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
        }
    }
}

