public class PassObject {
    public static void main(String[] args) {
        PassObject po = new PassObject();
        Circle cir = new Circle();
        po.printAreas(cir,1,2,3,4,5);
    }
    public void printAreas(Circle c, int ... time){

        for (int i = 0; i < time.length; i++) {
            c.radius=time[i];
            System.out.println(c.findArea());
        }


    }
}
