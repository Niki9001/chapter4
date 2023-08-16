public class StudentSort {
    public void studentsort(Student[] st){

        for (int i = 0; i < st.length-1; i++) {
            for (int j = 0; j < st.length-i-1; j++) {
                if (st[j].grade>st[j+1].grade){
                    Student temp = st[j];
                    st[j]=st[j+1];
                    st[j + 1] = temp;

                }
            }
        }
        String asort = new String();
        for (int i = 0; i < st.length; i++) {
            System.out.println(st[i].info());
        }

    }
}
