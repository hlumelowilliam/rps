import java.awt.*;
import javax.swing.*;

public class game {

    private String title;   // the title that will show on the Frame.

    JFrame screen = new JFrame(this.title);      // the Frame body.

    public game(String title) {        //title initialiser.
        this.title = title;
    } 

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

    }
    
}