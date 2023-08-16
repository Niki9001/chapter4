public class Circle {
    double radius;

    public static void main(String[] args) {
        Circle c = new Circle();
        c.radius=2;
        System.out.println(c.findArea());
    }
    public double findArea(){
        return radius*radius*Math.PI;
    }
}
