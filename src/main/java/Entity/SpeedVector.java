package Entity;

public class SpeedVector {
    private double x;

    private double y;

    public SpeedVector(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public void modify(double xmod, double ymod) {
        x += xmod;
        y += ymod;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }
}
