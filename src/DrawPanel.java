import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Random;

public class DrawPanel extends JPanel {

    private static final  Color SKY_COLOR = new Color(	65, 105, 225);

    private static final Random rnd = new Random();
    private Timer timer;

    private Rocket rocket;
    private Planet planet1, planet2, planet3, sun;
    private Star star1, star2, star3, star4, star5, star6, star7, star8, star9, star10;


    public DrawPanel() {

        planet1 = new Planet(600 + rnd.nextInt(50), 100, 50, Color.PINK);
        planet2 = new Planet(200 + rnd.nextInt(50), 450, 50, new Color(0, 0, 128));
        planet3 = new Planet(700 + rnd.nextInt(50), 300, 60, new Color(34, 139, 34));
        sun = new Planet(100 + rnd.nextInt(50), 150, 100, new Color(255, 140, 0));

        star1 = new Star(15 + rnd.nextInt(770), 15 + rnd.nextInt(570), 10, 10, Color.WHITE);
        star2 = new Star(15 + rnd.nextInt(770), 15 + rnd.nextInt(570), 10, 10, Color.WHITE);
        star3 = new Star(15 + rnd.nextInt(770), 15 + rnd.nextInt(570), 10, 10, Color.WHITE);
        star4 = new Star(15 + rnd.nextInt(770), 15 + rnd.nextInt(570), 10, 10, Color.WHITE);
        star5 = new Star(15 + rnd.nextInt(770), 15 + rnd.nextInt(570), 6, 6, Color.WHITE);
        star6 = new Star(15 + rnd.nextInt(770), 15 + rnd.nextInt(570), 6, 6, Color.WHITE);
        star7 = new Star(15 + rnd.nextInt(770), 15 + rnd.nextInt(570), 6, 6, Color.WHITE);
        star8 = new Star(15 + rnd.nextInt(770), 15 + rnd.nextInt(570), 4, 4, Color.WHITE);
        star9 = new Star(15 + rnd.nextInt(770), 15 + rnd.nextInt(570), 4, 4, Color.WHITE);
        star10 = new Star(15 + rnd.nextInt(770), 15 + rnd.nextInt(570), 4, 4, Color.WHITE);


        rocket = new Rocket(300, 250, 100, Color.GRAY);

        timer = new Timer(100, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                rocket.setX(rocket.getX()-1);
                rocket.setY(rocket.getY()-1);
                planet1.setC(new Color(rnd.nextInt(255), rnd.nextInt(255), rnd.nextInt(255)));
                planet2.setC(new Color(rnd.nextInt(255), rnd.nextInt(255), rnd.nextInt(255)));
                planet3.setC(new Color(rnd.nextInt(255), rnd.nextInt(255), rnd.nextInt(255)));
               /* planet1.setC(new Color(255, 105, 180));
                planet2.setC(new Color(72, 61, 139));
                planet3.setC(new Color(0, 255, 127));*/
                star1 = new Star(15 + rnd.nextInt(770), 15 + rnd.nextInt(570), 10, 10, Color.WHITE);
                star2 = new Star(15 + rnd.nextInt(770), 15 + rnd.nextInt(570), 10, 10, Color.WHITE);
                star3 = new Star(15 + rnd.nextInt(770), 15 + rnd.nextInt(570), 10, 10, Color.WHITE);
                star4 = new Star(15 + rnd.nextInt(770), 15 + rnd.nextInt(570), 10, 10, Color.WHITE);
                star5 = new Star(15 + rnd.nextInt(770), 15 + rnd.nextInt(570), 6, 6, Color.WHITE);
                star6 = new Star(15 + rnd.nextInt(770), 15 + rnd.nextInt(570), 6, 6, Color.WHITE);
                star7 = new Star(15 + rnd.nextInt(770), 15 + rnd.nextInt(570), 6, 6, Color.WHITE);
                star8 = new Star(15 + rnd.nextInt(770), 15 + rnd.nextInt(570), 4, 4, Color.WHITE);
                star9 = new Star(15 + rnd.nextInt(770), 15 + rnd.nextInt(570), 4, 4, Color.WHITE);
                star10 = new Star(15 + rnd.nextInt(770), 15 + rnd.nextInt(570), 4, 4, Color.WHITE);

                repaint();
            }
        });
        this.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if (timer.isRunning())
                    timer.stop();

                else
                    timer.start();

            }
        });
    }


    @Override

    public void paintComponent(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;

        g2d.setColor(SKY_COLOR);
        g2d.fillRect(0, 0, getWidth(), getHeight());

       /* GradientPaint gp1 = new GradientPaint(0, 0, new Color(238, 130, 238), 0, 20, new Color(	255, 0, 255), true);
        g2d.setPaint(gp1);
        g2d.fillOval(20, 260, 40, 40);*/

        planet1.drawPlanet(g2d);
        planet2.drawPlanet(g2d);
        planet3.drawPlanet(g2d);
        sun.drawPlanet(g2d);

        star1.drawStar(g2d);
        star2.drawStar(g2d);
        star3.drawStar(g2d);
        star4.drawStar(g2d);
        star5.drawStar(g2d);
        star6.drawStar(g2d);
        star7.drawStar(g2d);
        star8.drawStar(g2d);
        star9.drawStar(g2d);
        star10.drawStar(g2d);

        rocket.drawRocket(g2d);
    }



}
