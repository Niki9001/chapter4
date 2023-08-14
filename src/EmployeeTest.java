public class EmployeeTest {
    public static void main(String[] args) {
        Employee em = new Employee();
        em.id = 1;
        em.name = "a";
        em.salary = 4000;
        System.out.println(em.id+em.name+em.salary);

        Employee em1 = new Employee();
        em1.id = 2;
        em1.name = "b";
        em1.salary = 6000;
        System.out.println(em1.id+em1.name+em1.salary);
    }
}
