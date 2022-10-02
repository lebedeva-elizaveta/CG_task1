import java.awt.*;

public class Star {
    private int x, y, width, height;
    private Color c;

    public Star(int x, int y, int width, int height, Color c) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
        this.c = c;
    }

    public void drawStar(Graphics2D g){
        Color color = g.getColor();
        g.setColor(c);

        g.fillRect(x, y, width, height);
        g.fillPolygon(new int[] {x, x + width, x + width / 2}, new int[] {y, y, y - height * 5 / 6}, 3);
        g.fillPolygon(new int[] {x + width, x + width, x + width + width * 5 / 6}, new int[] {y, y + height, y + height / 2}, 3);
        g.fillPolygon(new int[] {x, x + width, x + width / 2}, new int[] {y + height, y + height, y + height + height * 5 / 6}, 3);
        g.fillPolygon(new int[] {x, x, x - width * 5 / 6}, new int[] {y, y + height, y + height / 2}, 3);
        g.setColor(color);
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

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public Color getC() {
        return c;
    }

    public void setC(Color c) {
        this.c = c;
    }
}
