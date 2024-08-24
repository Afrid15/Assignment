public class Square implements Shape{
    @Override
    public void draw() {
        int side = 5;
        for (int i = 0; i < side; i++) {
            for (int j = 0; j < side; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
