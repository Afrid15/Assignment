public class LivingRoomLight implements Light {
    private int brightness;

    @Override
    public void on() {
        brightness = 100; // Full brightness
        System.out.println("Living Room light is ON at full brightness.");
    }

    @Override
    public void off() {
        brightness = 0;
        System.out.println("Living Room light is OFF.");
    }

    @Override
    public void dim(int level) {
        brightness = level;
        System.out.println("Living Room light dimmed to " + level + "%.");
    }

    public int getBrightness() {
        return brightness;
    }
}