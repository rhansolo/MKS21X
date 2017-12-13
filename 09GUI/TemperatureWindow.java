import javax.swing.*;
import java.awt.*;
public class TemperatureWindow extends JFrame {
 private Container pane;

 private JButton b;
 private JLabel l;
 private JTextField t;
 private JCheckBox c;
 
  //CONSTRUCTOR SETS EVERYTHING UP
  public Window2() {
     this.setTitle("Temperature Converter!");
     this.setSize(600,400);
     this.setLocation(100,100);
     this.setDefaultCloseOperation(EXIT_ON_CLOSE);
    
     pane = this.getContentPane();
     pane.setLayout(new FlowLayout());  //NOTE!! THIS CAN BE CHANGED (see below)
    
     b = new JButton("Convert!");
     t = new JTextField(12);
     c = new JCheckBox("Cel to Far");
     f = new jCheckBox("Far to cel");
     pane.add(l);
     pane.add(t);
     pane.add(c);
     pane.add(f);
 }

  //MAIN JUST INSTANTIATES + MAKE VISIBLE
  public static void main(String[] args) {
     Window2 g = new Window2();
     g.setVisible(true);
  }
}
