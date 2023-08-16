public class OverloadExer1 {
    public static void main(String[] args) {
        OverloadExer1 oe = new OverloadExer1();
        oe.mOL(2);
        oe.mOL(4,6);
        oe.mOL("World");

    }
    public void mOL(int i1){
        System.out.println(i1*i1);
    }
    public void mOL(int i1,int i2){
        System.out.println(i1*i2);
    }
    public void mOL(String s1){
        System.out.println(s1);
    }
}
