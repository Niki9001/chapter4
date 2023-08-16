public class OverloadExer2 {
    public static void main(String[] args) {
        OverloadExer2 o2 = new OverloadExer2();
        o2.max(1,10);
        o2.max(11.1,12.1);
        o2.max(19.9,17.7,100.1);
        o2.max(19.9,17.7,100.1,44.4);

        System.out.println(o2.max1(15,16));
        System.out.println(o2.max1(111,444,222));
    }
    public void max(int i,int k){
        if (i>k){
            System.out.println(i);
        } else if (i<k) {
            System.out.println(k);
        }else {
            System.out.println(i=k);
        }
    }
    public void max(double d1, double d2){
        if (d1>d2){
            System.out.println(d1);
        } else if (d1<d2) {
            System.out.println(d2);
        }else {
            System.out.println(d1=d2);
        }
    }

    public void max(double d1,double d2,double d3){
        double max = 0;
        double min = 1000;

        double[] arr = new double[]{d1,d2,d3};

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
            if (arr[i]>max){
                max = arr[i];
            }
            if (arr[i]<min){
                min = arr[i];
            }
        }
        System.out.println("max is "+max+", min is "+min);
    }

    public void max(double d1,double d2,double d3,double d4){
        double[] arr = new double[]{d1,d2,d3,d4};
        double max = arr[0];
        for (double num:arr) {
            if (num>max){
                max=num;
            }
        }
        System.out.println(max);
    }
    public int max1(int i, int l){
        return (i>=l) ? i:l;
    }
    public int max1(int i, int l,int k){
        int tempmax = max1(i,l);

        return max1(tempmax,k);
    }
}
