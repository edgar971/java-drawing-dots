import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

/**
 * Created by edgar971 on 7/13/15.
 */
public class DotsPanel extends JPanel{
    //radious of each dot
    private final int SIZE = 8;
    //array to hold dot coordinates
    private ArrayList<Point> pointList;
    //constructor
    public DotsPanel() {
        pointList = new ArrayList<Point>();

        addMouseListener(new DotsListener());
        //set background
        setBackground(Color.black);
        //size of window
        setPreferredSize(new Dimension(350,200));

    }

    public void paintComponent(Graphics page) {
        //call the extended class method
        super.paintComponent(page);
        //set the color to green
        page.setColor(Color.red);
        //for each point
        for(Point spot : pointList) {
            //draw the shape
            page.fillOval(spot.x-SIZE, spot.y-SIZE, SIZE*2, SIZE*2);
        }
        //draw the string counter
        page.drawString("Count: " + pointList.size(), 5, 15);
    }

    private class DotsListener implements MouseListener {
        //add the current point to the list and redraw the page
        public void mousePressed(MouseEvent event) {
            pointList.add(event.getPoint());
            repaint();
        }
        //empty unused events
        public void mouseClicked(MouseEvent event) {};
        public void mouseReleased(MouseEvent event) {};
        public void mouseEntered(MouseEvent event) {};
        public void mouseExited(MouseEvent event) {};

    }
}
