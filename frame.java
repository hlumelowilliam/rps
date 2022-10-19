import java.awt.*;
import javax.swing.*;


public class frame {
    
    JFrame screen = new JFrame("Rock Paper Scissors !!!");      // the Frame body.


    public frame() {
        setFrame();
    }
    private void setFrame(){

        screen.getContentPane().setBackground(Color.lightGray);
        screen.setSize(1500,980);
        screen.setResizable(false);
        screen.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        screen.getContentPane().setBackground(Color.lightGray);
        screen.setVisible(true);
    }
}
