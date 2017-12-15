import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
public class TemperatureWindow extends JFrame implements ActionListener {
 private Container pane;

 private JButton b;
 private JRadioButton f;
 private JTextField t;
 private JRadioButton c;
 
  //CONSTRUCTOR SETS EVERYTHING UP
  public TemperatureWindow() {
     this.setTitle("Temperature Converter!");
     this.setSize(700,200);
     this.setLocation(100,100);
     this.setDefaultCloseOperation(EXIT_ON_CLOSE);
    
     pane = this.getContentPane();
     pane.setLayout(new FlowLayout());  //NOTE!! THIS CAN BE CHANGED (see below)
    
     b = new JButton("Convert!");
     b.addActionListener(this);
     t = new JTextField(12);
     c = new JRadioButton("Celsius to Fahrenheit");
     c.addActionListener(this);
     f = new JRadioButton("Fahrenheit to Celsius");
     c.addActionListener(this);
     ButtonGroup group = new ButtonGroup();
     group.add(c);
     group.add(f);
     pane.add(b);
     pane.add(t);
     pane.add(c);
     pane.add(f);
 }

    public void actionPerformed(ActionEvent e){
	String s = e.getActionCommand();
	if (s.equals("Convert!")){
		if (c.isSelected()){
		    t.setText(Double.toString(CtoF(Double.parseDouble(t.getText()))));
		}
		else if (f.isSelected()){
		    t.setText(Double.toString(FtoC(Double.parseDouble(t.getText()))));
		}
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
