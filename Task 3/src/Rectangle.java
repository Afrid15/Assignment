public class Rectangle implements Shape{
    @Override
    public void draw() {
        int length = 6;
        int breadth = 4;
        for (int i = 0; i < breadth; i++) {
            for (int j = 0; j < length; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
