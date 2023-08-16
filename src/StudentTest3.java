public class StudentTest3 {
    public String StudentSpeInfo(Student[] st, int grade){
        String info = new String();
        for (int i = 0; i < st.length; i++) {
            if (st[i].state==grade){
                Student stu = st[i];
                info = stu.number+" "+stu.state+" "+stu.grade;
            }
        }
        return info;
    }
}

