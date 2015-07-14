import javax.swing.*;

/**
 * Created by edgar971 on 7/13/15.
 */
public class Dots {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Dots");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(new DotsPanel());
        frame.pack();
        frame.setVisible(true);
    }

}
