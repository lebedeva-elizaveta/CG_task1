import java.awt.*;

public class Planet {
    private int x, y, r;
    private Color c, Gr;

    public Planet(int x, int y, int r, Color c) {
        this.x = x;
        this.y = y;
        this.r = r;
        this.c = c;
    }

    public void drawPlanet(Graphics2D g){
        Color color = g.getColor();

        g.setColor(c);
        g.fillOval(x - r, y - r, r*2, r*2);
        g.setStroke(new BasicStroke(3));
        g.setColor(Color.BLACK);
        g.drawOval(x - r, y - r, r*2, r*2);
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getR() {
        return r;
    }

    public void setR(int r) {
        this.r = r;
    }

   /* public GradientPaint getGr() {
        return Gr;
    }*/

    public Color getC() {
        return c;
    }

    public void setC(Color c) {
        this.c = c;
    }
}
