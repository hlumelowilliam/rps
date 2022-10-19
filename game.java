import java.awt.Color;

import javax.swing.*;

public class game {

    private String title;

    public game(String title) {
        this.title = title;
    } 

    public void gui() {    
        JFrame screen = new JFrame(this.title);

        screen.setSize(1000,800);
        screen.setLocation(120, 60);
        screen.getContentPane().setBackground(Color.ORANGE);
        screen.setVisible(true);
    }
    
}