public class EmployeeTestD {
    public static void main(String[] args) {
        EmployeeD ed = new EmployeeD();
        ed.name="kk";
        ed.birthday=new MyDate();
        ed.birthday.year=2010;
        ed.birthday.month=01;
        ed.birthday.day=15;


        EmployeeD ed2 = new EmployeeD();
        ed2.name="mm";
        ed2.birthday=new MyDate();
        ed2.birthday.year=2000;
        ed2.birthday.month=04;
        ed2.birthday.day=10;
        System.out.println(ed2.name+ed2.birthday.year);

    }
}
