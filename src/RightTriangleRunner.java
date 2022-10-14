public class RightTriangleRunner {
    public static void main(String[] args) {
        RightTriangle tri1 = new RightTriangle(3,4);
        RightTriangle tri2 = new RightTriangle(6.5,10.7);
        RightTriangle tri3 = new RightTriangle(1,1);

        double hyp1 = tri1.hypotenuse();
        double hyp2 = tri2.hypotenuse();
        double hyp3 = tri3.hypotenuse();

        System.out.println(hyp1);
        System.out.println(hyp2);
        System.out.println(hyp3);
    }
}
