public class ValueTransTest {
    public static void main(String[] args) {
        int n = 20;
        int m = 10;
        System.out.println("m = "+m+", n = "+n);
        //调换m和n值
//        int k = m;
//        m=n;
//        n=k;
//        System.out.println("m = "+m+", n = "+n);

        ValueTransTest vt = new ValueTransTest();
        vt.swap(m,n);

    }

    public void swap(int m, int n){
        int k = m;
        m = n;
        n = k;
        System.out.println("m = "+m+", n = "+n);
    }
}

