public class Main {
    public static void main(String[] args) {
        //for (int i = 0; i < 100; i++) {
        //    int randomNum = (int) (Math.random() * 66) - 15;
        //    System.out.println(randomNum);
        //}

        System.out.println( Math.cbrt(8) ); // 2.0
        System.out.println( Math.cbrt(0.125) ); // 0.5

        System.out.println( Math.pow(8, 1.0/3.0) ); // 2.0
        System.out.println( Math.pow(0.125, 1.0/3.0) ); // 0.5

        System.out.println( Math.pow(16, 1.0/4.0) ); // 2.0
        System.out.println( Math.pow(0.0625, 1.0/4.0) ); // 0.5
    }
}
