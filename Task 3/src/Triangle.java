public class Triangle implements Shape{
    @Override
    public void draw() {
        int base = 5;
        for (int i = 0; i < base; i++) {
            for (int j = 0; j < base - i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
