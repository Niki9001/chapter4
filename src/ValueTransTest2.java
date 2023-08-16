public class ValueTransTest2 {
    public static void main(String[] args) {
        Data date = new Data();
        ValueTransTest2 v2 = new ValueTransTest2();

        date.m=10;
        date.n=20;
        System.out.println("m = "+date.m+", n = "+date.n);

        v2.swap(date);
        System.out.println("m = "+date.m+", n = "+date.n);
    }
    public void swap(Data data){
        int k = data.m;
        data.m = data.n;
        data.n = k;

    }
}
class Data{
    int m;
    int n;
}

