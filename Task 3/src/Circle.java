public class Circle implements Shape {
    @Override
    public void draw() {
        int r = 10; // Radius of the circle
        int diameter = 2 * r + 1;
        for (int i = 0; i < diameter; i++) {
            for (int j = 0; j < diameter; j++) {
                int x = i - r;
                int y = j - r;
                if (x * x + y * y <= r * r + r * 0.8) {
                    System.out.print("* ");
                } else {
                    System.out.print("  "); // Adjust for circle spacing
                }
            }
            System.out.println();
        }
    }
}