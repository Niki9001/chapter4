public class FieldTest {
    public static void main(String[] args) {

    }
}

class Person{
    //属性或成员变量 field
    String name;
    int age;
    char gender;

    //
    public void eat(){
        String food = "Gongbao Chicken"; //局部变量 local variable
        System.out.println("I love "+food );
    }

    public void sleep(int hour){ //局部变量 local variable，形参
        System.out.println("People cant less than "+hour+" sleeping");
    }
}
