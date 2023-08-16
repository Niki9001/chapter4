public class StudentTest2 {
    public static void main(String[] args) {
        Student[] st = new Student[20];
        for (int i = 0; i < st.length; i++) {
            st[i] = new Student();
            st[i].number = i + 1;
            st[i].state = (int) (Math.random()*6);
            st[i].grade = (int) (Math.random()*101);
            //System.out.println(st[i].info());
        }
//        for (int i = 0; i < st.length-1; i++) {
//            for (int j = 0; j < st.length-i-1; j++) {
//                if (st[j].grade>st[j+1].grade){
//                    Student temp = st[j];
//                    st[j]=st[j+1];
//                    st[j + 1] = temp;
//                }
//            }
//        }
//        for (int i = 0; i < st.length; i++) {
//            //System.out.println(st[i].info());
//        }
        StudentSort sst = new StudentSort();
        sst.studentsort(st);

    }
}
