import java.awt.*;

public class Rocket {
        private int x, y, delta;
        private Color c;

        public Rocket(int x, int y, int delta, Color c) {
            this.x = x;
            this.y = y;
            this.delta = delta;
            this.c = c;
        }

        public void drawRocket(Graphics2D g){
            Color color = g.getColor();
            g.setColor(c);

            //тело ракеты
            g.fillPolygon(new int[] {x, x + delta, x + delta * 3, x + delta * 2}, new int[] {y, y - delta, y + delta, y + delta * 2}, 4);
            g.setStroke(new BasicStroke(3));
            g.setColor(Color.BLACK);
            g.drawPolygon(new int[] {x, x + delta, x + delta * 3, x + delta * 2}, new int[] {y, y - delta, y + delta, y + delta * 2}, 4);
            //нос
            g.setColor(Color.RED);
            g.fillPolygon(new int[] {x, x + delta, x - delta * 2 / 3}, new int[] {y, y - delta, y - delta - delta / 2 }, 3);
            g.setColor(Color.BLACK);
            g.drawPolygon(new int[] {x, x + delta, x -  delta * 2 / 3}, new int[] {y, y - delta, y - delta - delta / 2 }, 3);
            //иллюминатор
            g.setColor(new Color(	173, 216, 230));
            g.fillOval(x + delta / 2, y - delta / 2, delta, delta );
            g.setColor(Color.BLACK);
            g.drawOval(x + delta / 2, y - delta / 2, delta, delta );
            //крылья
            g.setColor(Color.RED);
            g.fillPolygon(new int[] {x + delta * 2, x + delta * 3, x + delta * 3 + delta / 2}, new int[] {y, y + delta, y + delta / 2}, 3);
            g.setColor(Color.BLACK);
            g.drawPolygon(new int[] {x + delta * 2, x + delta * 3, x + delta * 3 + delta / 2}, new int[] {y, y + delta, y + delta / 2}, 3);
            g.setColor(Color.RED);
            g.fillPolygon(new int[] {x + delta, x + delta * 2, x + delta + delta / 2}, new int[] {y + delta, y + delta * 2, y + delta * 2 + delta / 2}, 3);
            g.setColor(Color.BLACK);
            g.drawPolygon(new int[] {x + delta, x + delta * 2, x + delta + delta / 2}, new int[] {y + delta, y + delta * 2, y + delta * 2 + delta / 2}, 3);
            //сопло
            g.setColor(Color.DARK_GRAY);
            g.fillPolygon(new int[] {x + delta * 2, x + delta * 3, x + delta * 3 , x + delta * 2 + delta / 4}, new int[] {y + delta * 2, y + delta, y + delta + delta / 4 , y + delta * 2 }, 4);
            g.setColor(Color.BLACK);
            g.drawPolygon(new int[] {x + delta * 2, x + delta * 3, x + delta * 3 , x + delta * 2 + delta / 4}, new int[] {y + delta * 2, y + delta, y + delta + delta / 4 , y + delta * 2}, 4);
            //огонь
            g.setColor(Color.ORANGE);
           /* g.fillPolygon(new int[] {x + 2 * delta + delta / 2, x + 3 * delta, x + 3 * delta + delta / 2, x + 2 * delta + delta / 2},
           new int[] {y + 2 * delta, y + delta + delta / 2, y + delta + delta / 2, y + 2 * delta + delta / 2}, 4);
            g.fillPolygon(new int[] {x + 2 * delta + delta / 2 + delta / 4, x + 3 * delta + delta / 4, x + 3 * delta + delta / 4 + delta / 2, x + 2 * delta + delta / 2 + delta / 4},
            new int[] {y + 2 * delta + delta / 4, y + delta + delta / 2 + delta / 4, y + delta + delta / 2 + delta / 4, y + 2 * delta + delta / 4 + delta / 2 }, 4);
            g.fillPolygon(new int[] {x + 3 * delta, x + 3 * delta + delta / 2, x + 4 * delta, x + 3 * delta},
            new int[] {y + 2 * delta + delta / 2, y + 2 * delta, y + delta * 2, y + delta * 3 }, 4);
            g.fillPolygon(new int[] {x + 3 * delta + delta / 4, x + 3 * delta + delta / 2 + delta / 4, x + 4 * delta },
            new int[] {y + 2 * delta + delta / 2 + delta / 4, y + 2 * delta + delta / 4, y +  delta * 3  }, 3);
            */
            g.fillPolygon(new int[] {x + 2 * delta + delta / 2, x + 3 * delta, x + 3 * delta + delta / 2, x + 3 * delta + delta / 4,
                    x + 3 * delta + delta / 4 + delta / 2, x + 3 * delta + delta / 2, x + 4 * delta, x + 3 * delta + delta / 2 + delta / 4,
                    x + 4 * delta, x + 3 * delta + delta / 4, x + 3 * delta, x + 3 * delta, x + 2 * delta + delta / 2 + delta / 4,
                    x + 2 * delta + delta / 2 + delta / 4, x + 2 * delta + delta / 2}, new int[] {y + 2 * delta, y + delta + delta / 2,
                    y + delta + delta / 2, y + delta + delta / 2 + delta / 4, y + delta + delta / 2 + delta / 4, y + 2 * delta, y + delta * 2,
                    y + 2 * delta + delta / 4, y +  delta * 3, y + 2 * delta + delta / 2 + delta / 4, y + delta * 3, y + 2 * delta + delta / 2,
                    y + 2 * delta + delta / 4 + delta / 2, y + 2 * delta + delta / 4, y + 2 * delta + delta / 2 }, 15);
            //внутренняя часть огня
            g.setColor(Color.RED);

            g.fillPolygon(new int[] {x + 2 * delta + delta / 2 + delta / 7, x + 3 * delta - delta/ 7, x + 3 * delta + delta / 2 - delta/ 7, x + 3 * delta + delta / 4 - delta/ 7,
                    x + 3 * delta + delta / 4 + delta / 2 - delta/ 7, x + 3 * delta + delta / 2 - delta/ 7, x + 4 * delta - delta/ 7, x + 3 * delta + delta / 2 + delta / 4 - delta/ 7,
                    x + 4 * delta - delta/ 7, x + 3 * delta + delta / 4 + delta / 7, x + 3 * delta + delta / 7, x + 3 * delta + delta / 7, x + 2 * delta + delta / 2 + delta / 4 + delta / 7,
                    x + 2 * delta + delta / 2 + delta / 4 + delta / 7, x + 2 * delta + delta / 2 + delta / 7}, new int[] {y + 2 * delta - delta/ 7, y + delta + delta / 2 + delta / 7,
                    y + delta + delta / 2 + delta / 7, y + delta + delta / 2 + delta / 4 + delta / 7, y + delta + delta / 2 + delta / 4 + delta / 7, y + 2 * delta + delta / 7, y + delta * 2 + delta / 7,
                    y + 2 * delta + delta / 4 + delta / 7, y +  delta * 3 - delta/ 7, y + 2 * delta + delta / 2 + delta / 4 - delta/ 7, y + delta * 3 - delta/ 7, y + 2 * delta + delta / 2 - delta/ 7,
                    y + 2 * delta + delta / 4 + delta / 2 - delta/ 7, y + 2 * delta + delta / 4 - delta/ 7, y + 2 * delta + delta / 2 - delta/ 7 }, 15);
            g.setColor(Color.BLACK);
            g.drawPolygon(new int[] {x + 2 * delta + delta / 2, x + 3 * delta, x + 3 * delta + delta / 2, x + 3 * delta + delta / 4,
                    x + 3 * delta + delta / 4 + delta / 2, x + 3 * delta + delta / 2, x + 4 * delta, x + 3 * delta + delta / 2 + delta / 4,
                    x + 4 * delta, x + 3 * delta + delta / 4, x + 3 * delta, x + 3 * delta, x + 2 * delta + delta / 2 + delta / 4,
                    x + 2 * delta + delta / 2 + delta / 4, x + 2 * delta + delta / 2}, new int[] {y + 2 * delta, y + delta + delta / 2,
                    y + delta + delta / 2, y + delta + delta / 2 + delta / 4, y + delta + delta / 2 + delta / 4, y + 2 * delta, y + delta * 2,
                    y + 2 * delta + delta / 4, y +  delta * 3, y + 2 * delta + delta / 2 + delta / 4, y + delta * 3, y + 2 * delta + delta / 2,
                    y + 2 * delta + delta / 4 + delta / 2, y + 2 * delta + delta / 4, y + 2 * delta + delta / 2 }, 15);


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

        public int getDelta() {
            return delta;
        }

        public void setDelta(int delta) {
            this.delta = delta;
        }

        public Color getC() {
            return c;
        }

        public void setC(Color c) {
            this.c = c;
        }

}
