public class ArgsExe {
    public static void main(String[] args) {
        ArgsExe ae = new ArgsExe();
        System.out.println(ae.Str(",","hello","world"));
    }
    public String Str(String op, String ... a1){
        String result = "";
        for (int i = 0; i < a1.length; i++) {
            if (i==0){
                result = result + a1[i];
            } else {
                result = result + op + a1[i];
            }
        }
        return result;
    }
}
