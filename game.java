import java.awt.*;
import javax.swing.*;

public class game {

    private String title = "Rock Paper Scissors !!!";   // the title that will show on the Frame.

    JFrame screen = new JFrame(this.title);      // the Frame body.

    public game() {        //title initialiser.
        gui();
    } 

    public void gui() {    
        
        JLabel text1 = new JLabel();
        text1.setVerticalAlignment(JLabel.TOP);
        text1.setHorizontalAlignment(JLabel.CENTER);

        text1.setText("Let's play Rock Paper Scissors !!!");
        text1.setFont(new Font("Verdana", Font.PLAIN, 18));
        
        screen.setSize(1080,900);
        screen.setLocation(120, 60);
        screen.getContentPane().setBackground(Color.ORANGE);
        screen.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        screen.add(text1);
        screen.setVisible(true);

        JButton start = new JButton("Start");
        JButton quit = new JButton("Quit");
        start.setBounds(50, 150, 100, 30);
        quit.setBounds(50, 150, 100, 30);

        start.setLocation(400, 600);
        quit.setLocation(600, 600);
        screen.add(start);
        screen.add(quit);

        quit.addActionListener(e -> {
            screen.dispose();
        });

        start.addActionListener(e -> {
            play();
        });

    }

    public void play() {

        JButton r = new JButton("Rock");
        r.setBounds(50, 150, 100, 30);
        r.setLocation(300, 600);
        screen.add(r);

        JButton p = new JButton("Paper");
        p.setBounds(50, 150, 100, 30);
        JButton s = new JButton("Scissors");
        s.setBounds(50, 150, 100, 30);



    }
    
}