import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.*;
import java.util.*;

public class game extends frame {

    public game() {

    }

    private int pScore = 0;
    private int cScore = 0;

    JButton start = new JButton("Start");    //home button
    JButton quit = new JButton("Quit");       //home button

    JButton rock = new JButton("Rock");
    JButton paper = new JButton("Paper");
    JButton scissors = new JButton("Scissors");

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

    private char chooseChar() {

        Random rand = new Random();
        int index = rand.nextInt(3);
        char[] arr = {'r','p','s'};
        return arr[index];
    }

    public void play(){

        start.setVisible(false);
        quit.setVisible(false);

        text.setFont(new Font("Verdana", Font.PLAIN, 24));
        text.setVerticalAlignment(JLabel.TOP);
        text.setHorizontalAlignment(JLabel.CENTER);
        text.setText("Let's Play !!!");
        text.setVisible(true);

        char CompAns = chooseChar();
        char PlayerAns;

        rock.setBounds(400, 400, 80, 20);
        rock.setVisible(true);
        rock.addActionListener(e -> {

        });
        screen.add(rock);

        paper.setBounds(600, 400, 80, 20);
        paper.setVisible(true);
        screen.add(paper);

        scissors.setBounds(800, 400, 80, 20);
        scissors.setVisible(true);
        screen.add(scissors);

        
        screen.add(text);

        

        

        




    }


}