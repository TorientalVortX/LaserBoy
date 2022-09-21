package Laserman;

import javax.swing.JFrame;
import java.awt.Toolkit;
import java.awt.Dimension;


public class Main extends JFrame{
    public static int SCREEN_WIDTH = 1000;
    public static int SCREEN_HEIGHT = 600;

    public Main(){
        super("Laserman the Video Game");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Toolkit toolKit = this.getToolkit();
        Dimension desktopSolution = toolKit.getScreenSize();

        this.setBounds((desktopSolution.width - SCREEN_WIDTH) / 2,
                        (desktopSolution.height - SCREEN_HEIGHT) / 2, SCREEN_WIDTH, SCREEN_HEIGHT);

    }
     
    public static void main(String[] args) throws Exception {
        Main gameFrame = new Main();
        gameFrame.setVisible(true);
    }
    
}
