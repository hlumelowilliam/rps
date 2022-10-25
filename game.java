import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.*;
import java.util.*;

public class game extends frame {

    public game() {

    }

    JButton start = new JButton("Start");    //home button
    JButton quit = new JButton("Quit");       //home button
    JButton back = new JButton("Back");

    JButton rock = new JButton("Rock");
    JButton paper = new JButton("Paper");
    JButton scissors = new JButton("Scissors");
    
    JLabel text = new JLabel();
    
    public void home(){
        
        start.setBounds(400, 400, 100, 40);
        start.setVisible(true);
        start.addActionListener(e -> {
            play(0, 0);
        });
        
        screen.add(start);

        quit.setBounds(700, 400, 100, 40);
        quit.addActionListener(e -> {
            quit();
        });
        quit.setVisible(true);
        screen.add(quit);
    }

    private void quit(){       // if player chooses to quit.
        screen.dispose();
    }

    
    private int compareAns(char player, char comp) {

        int res = 0;

        if (player == 'r' && comp == 'r') {
            res = 2;
        }
        else if (player == 'r' && comp == 'p') {
            res = 0;
        }
        else if (player == 'r' && comp == 's'){
            res = 1;
        }
        else if (player == 'p' && comp == 'r') {
            res = 1;
        }
        else if (player == 'p' && comp == 'p') {
            res = 2;
        }
        else if (player == 'p' && comp == 's') {
            res = 0;
        }
        else if (player == 's' && comp == 'r') {
            res = 0;
        }
        else if (player == 's' && comp == 'p') {
            res = 1;
        }
        else if (player == 's' && comp == 's') {
            res = 2;
        }

        return res;
    }

    private void play(int a , int b){

        int pS = a;
        int cS = b;

        Random rand = new Random();
        int index = rand.nextInt(3);
        char[] arr = {'r','p','s'};
        
        char cAns = arr[index];

        start.setVisible(false);
        quit.setBounds(600, 500, 100, 40);

        quit.setVisible(true);

        text.setFont(new Font("Verdana", Font.PLAIN, 24));
        text.setVerticalAlignment(JLabel.TOP);
        text.setHorizontalAlignment(JLabel.CENTER);
        text.setText("Let's Play !!!");
        text.setVisible(true);

        // rock button
        
        rock.setBounds(400, 400, 100, 40);
        rock.addActionListener(e -> {

            int res; 
            res = compareAns('r', cAns);
            if (res == 0) {
                System.out.println("Computer won"); 
            }
            else if (res == 1) {
                System.out.println("Human won");
            }
            else {
                System.out.println("Both chose the same");
            }

            
        });
        rock.setVisible(true);
        screen.add(rock);


        // paper button !!!

        paper.setBounds(600, 400, 100, 40);
        paper.setVisible(true);
        paper.addActionListener(e -> {

            int res; 
            res = compareAns('r', cAns);

            if (res == 0) {
                System.out.println("Computer won");
            }
            else if (res == 1) {
                System.out.println("Human won");
            }
            else {
                System.out.println("Both chose the same");
                
            }
        });
        screen.add(paper);

        // scissors button !!!

        scissors.setBounds(800, 400, 100, 40);
        scissors.setVisible(true);
        scissors.addActionListener(e -> {

            int res; 
            res = compareAns('r', cAns);

            if (res == 0) {
                System.out.println("Computer won");
            }
            else if (res == 1) {
                System.out.println("Human won");
            }
            else {
                System.out.println("Both chose the same");
                
            }
   
        });
        screen.add(scissors);

        screen.add(text);

        
        
    }
}