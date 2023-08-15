import java.util.Scanner;

public class StudentTest {
    public static void main(String[] args) {

        Student[]st = new Student[20];

        for (int i = 0; i < 20; i++) {
            st[i] = new Student();
            st[i].number=i+1;
            st[i].state=(int)(Math.random()*6+1);
            st[i].grade=(int)(Math.random()*101);

        }
        for (int i = 0; i < st.length; i++) {
            if (st[i].state==3){
                Student stu = st[i];
                System.out.println(stu.number+" "+stu.state+" "+stu.grade);
                System.out.println(stu.info());
            }
        }
        for (int i = 0; i < 20; i++) {
            Student st1 = new Student();

            System.out.println(st[i].info());
        }



    }
}
