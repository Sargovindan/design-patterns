package pl.finsys.structural.adapter;

public class Line implements Shape {
    private LegacyLine adaptee = new LegacyLine();

    public void draw(int x1, int y1, int x2, int y2) {
        adaptee.drawPi(x1, y1, x2, y2);
    }
}
