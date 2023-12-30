import javax.swing.*;
import java.awt.*;

public class HanoiWritter extends JPanel {
    int[][] towers;
    private final int width = 950, height = 500;
    public HanoiWritter(){
        JFrame frame = new JFrame();
        frame.getContentPane().add(this);
        frame.setTitle("Kullat e Hanoit");
        frame.setBackground(Color.WHITE);
        frame.setSize(width, height);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    @Override
    public void paintComponent(Graphics pen){
        pen.setColor(Color.white);
        pen.fillRect(0, 0, width, height);

        pen.setColor(Color.BLACK);
        pen.setFont(new Font("Verdana", Font.PLAIN, 30));
        pen.drawString("Kullat e Hanoit", 350, 80);

        for (int i = 0; i < 3; i++) {
            int startX = i * 300 + 50;
            int startY = height - 100;
            pen.setColor(Color.black);
            pen.fillRoundRect(startX, startY, 200, 20, 20, 20);
            pen.fillRoundRect(startX + 90, height - 330, 20, 250, 20, 20);

            pen.setColor(Color.PINK);
            int[] plates = towers[i];
            for (int j = 0; j < plates.length; j++) {
                int plateWidth = 30 + plates[j] * 20;
                pen.fillRoundRect(startX + 100 - plateWidth / 2, startY - 20 - j * 30, plateWidth, 20, 20, 20);
            }
        }
    }

    public void redraw(int[][] towers){
        this.towers = towers;
        this.repaint();
    }
}
