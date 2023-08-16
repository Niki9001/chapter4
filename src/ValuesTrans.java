/**
 * 方法的传递机制
 * 1. 对于方法内声明的局部变量来说，如果出现赋值操作
 *      如果是基本数据类型的变量，则将此变量保存的数据值传递出去
 *      如果是引用数据类型的变量，则将此变量保存的地址值传递出去
 * 2. 方法的参数的传递机制： 值传递机制
 *      如果形参是基本数据类型的变量，则将此变量保存的数据值传递出去
 *      如果形参是引用数据类型的变量，则将此变量保存的地址值传递出去
 * 3. Java中的参数传递机制是什么？
 *      值传递
 *
 *
 *
 *
 * */
public class ValuesTrans {
    public static void main(String[] args) {
        //1. 基本数据类型的局部变量
        int m = 10;
        int n = m; //传递的是数据值
        System.out.println("m="+m+", n="+n);
        m++;
        System.out.println("m="+m+", n="+n);
        //2. 引用数据类型的局部变量
        int[] arr1 = new int[]{1,2,3,4,5};
        int[] arr2 = arr1; //传递的是地制值
        arr2[0] = 10;
        for (int i = 0; i < arr2.length; i++) {
            System.out.println(arr1[i]);
        }
    }

}
