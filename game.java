import java.awt.Color;
import java.awt.Font;

import javax.swing.*;

public class game {

    private String title;

    public game(String title) {
        this.title = title;
    } 

    JFrame screen = new JFrame(this.title);

    public void gui() {    
        

        JLabel text1 = new JLabel();
        text1.setVerticalAlignment(JLabel.TOP);
        text1.setHorizontalAlignment(JLabel.CENTER);

        text1.setText("Let's play Rock Paper Scissors !!!");
        text1.setFont(new Font("Verdana", Font.PLAIN, 18));
        

        screen.setSize(1080,800);
        screen.setLocation(120, 60);
        screen.getContentPane().setBackground(Color.ORANGE);
        screen.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        screen.add(text1);
        screen.setVisible(true);



        int pScore = 0;
        int cScore = 0;

        while (true) {

            
        }
    }
    
}