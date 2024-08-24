public class LightDimCommand implements Command {
    private Light light;
    private int prevLevel;
    private int newLevel;

    public LightDimCommand(Light light, int newLevel) {
        this.light = light;
        this.newLevel = newLevel;
    }

    @Override
    public void execute() {
        prevLevel = light.getBrightness();
        light.dim(newLevel);
    }

    @Override
    public void undo() {
        light.dim(prevLevel);
    }
}
