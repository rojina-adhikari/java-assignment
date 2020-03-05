import java.awt.*;
import javax.swing.*;


public class CustomLayout extends JFrame
{
    public CustomLayout(String title)
    {
        super(title);
        this.setSize(700, 300);
        this.setLocation(100, 100);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JButton button1 = new JButton("Button1");
        JButton button2 = new JButton("Button2");
        JButton button3 = new JButton("Button3");
        JButton button4 = new JButton("Button4");
        JButton button5 = new JButton("Button5");

        Container mainContainer = this.getContentPane();
        mainContainer.setLayout(new BorderLayout(8,6));
        mainContainer.setBackground(Color.YELLOW);
        this.getRootPane().setBorder(BorderFactory.createMatteBorder(4,4,4,4, Color.GREEN));

        //Panel Top
        JPanel topPanel = new JPanel();
        topPanel.setBackground(Color.ORANGE);
        topPanel.setLayout(new FlowLayout(5));
        topPanel.add(button1);
        topPanel.add(button2);
        topPanel.add(button3);
        topPanel.add(button4);
        topPanel.add(button5);
        mainContainer.add(topPanel, BorderLayout.NORTH);
    }

public static void main(String[] args)
 {
    
    CustomLayout mylayout = new CustomLayout("My Custom Layout");
    mylayout.setVisible(true);
}
}