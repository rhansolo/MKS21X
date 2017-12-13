import javax.swing.*;
import java.awt.*;
import java.awt.events.*;
public class TemperatureWindow extends JFrame {
 private Container pane;

 private JButton b;
 private JRadioButton f;
 private JTextField t;
 private JRadioButton c;
 
  //CONSTRUCTOR SETS EVERYTHING UP
  public TemperatureWindow() {
     this.setTitle("Temperature Converter!");
     this.setSize(600,400);
     this.setLocation(100,100);
     this.setDefaultCloseOperation(EXIT_ON_CLOSE);
    
     pane = this.getContentPane();
     pane.setLayout(new FlowLayout());  //NOTE!! THIS CAN BE CHANGED (see below)
    
     b = new JButton("Convert!");
     b.addActionListerner(this);
     t = new JTextField(12);
     c = new JRadioButton("Cel to Far");
     c.addActionListerner(this);
     f = new JRadioButton("Far to cel");
     c.addActionListerner(this);
     pane.add(b);
     pane.add(t);
     pane.add(c);
     pane.add(f);
 }

    public void actionPerformed(ActionEvent e){
	String temp = e.getActionCommand();
        if (c.isSelected()){
	    t.setText(cToF(Double.parseDouble(temp)));
	}
	
    }
    public static double CtoF(double cel){
	return (9.0/5 * cel) + 32;
    }
    public static double FtoC(double far){
	return (far-32.0) * 5.0 / 9;
    }

  //MAIN JUST INSTANTIATES + MAKE VISIBLE
  public static void main(String[] args) {
     TemperatureWindow g = new TemperatureWindow();
     g.setVisible(true);
  }
}
