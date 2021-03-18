package MainPackage;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

class frame extends JFrame
{
    private JRadioButton black,white,red,blue,green;
    private ButtonGroup buttonGroup;
    private ItemListener listener;
public frame(int width,int height,String title)
{
    this.setSize(width,height);
    this.setTitle(title);
    this.setLayout(null);
    this.setVisible(true);
    buttonGroup = new ButtonGroup();
    black = new JRadioButton("Black");
    black.setBounds(50,50,100,20);
    this.add(black);
    buttonGroup.add(black);
    white = new JRadioButton("White");
    white.setBounds(50,90,100,20);
    this.add(white);
    buttonGroup.add(white);
    red = new JRadioButton("Red");
    red.setBounds(50,130,100,20);
    this.add(red);
    buttonGroup.add(red);
    blue = new JRadioButton("Blue");
    blue.setBounds(50,170,100,20);
    this.add(blue );
    buttonGroup.add(blue);
    green = new JRadioButton("Green");
    green.setBounds(50,210,100,20);
    this.add(green);
    buttonGroup.add(green);
    addItemListener();


}
private void setColor(Color color)
{
    this.getContentPane().setBackground(color);
}
private void addItemListener()
{
    listener = new ItemListener() {
        @Override
        public void itemStateChanged(ItemEvent e) {
            JRadioButton source = (JRadioButton) e.getSource();
            if (black.equals(source)) {
                setColor(Color.BLACK);
            } else if (white.equals(source)) {
                setColor(Color.WHITE);
            } else if (red.equals(source)) {
                setColor(Color.RED);
            } else if (blue.equals(source)) {
                setColor(Color.BLUE);
            } else if (green.equals(source)) {
                setColor(Color.green);
            }
        }
    };
    black.addItemListener(listener);
    white.addItemListener(listener);
    red.addItemListener(listener);
    blue.addItemListener(listener);
    green.addItemListener(listener);
}
}
public class MainClass {
    public static void main(String[] args) {

    frame fr = new frame(500,500,"Color shifter");
    }
}
