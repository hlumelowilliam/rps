import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.*;

public class game extends frame {

    public game() {

    }

    private int pScore = 0;
    private int cScore = 0;

    JButton start = new JButton("Start");
    JButton quit = new JButton("Quit");

    JLabel text = new JLabel();
    

    public void home(){
        
        
        start.setBounds(400, 400, 80, 20);
        start.setVisible(true);
        start.addActionListener(e -> {
            play();
        });
        screen.add(start);

        
        quit.setBounds(700, 400, 80, 20);
        quit.addActionListener(e -> {
            quit();
        });
        quit.setVisible(true);
        screen.add(quit);
    }

    public void quit(){       // if player chooses to quit.
        screen.dispose();
    }

    public void play(){

        start.setVisible(false);
        quit.setVisible(false);

        text.setFont(new Font("Verdana", Font.PLAIN, 24));
        text.setVerticalAlignment(JLabel.TOP);
        text.setHorizontalAlignment(JLabel.CENTER);
        text.setText("Let's Play !!!");
        text.setVisible(true);
        
        screen.add(text);

        

        

        




    }


}