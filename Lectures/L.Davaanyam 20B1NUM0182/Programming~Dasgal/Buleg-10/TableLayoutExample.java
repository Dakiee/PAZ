import acm.gui.*;
import acm.program.*;
import javax.swing.*;
public class TableLayoutExample extends Program {

	public void init() {
		setLayout(new TableLayout(2, 3));
		add(new JButton("Button 1"));
		add(new JButton("Button 2"));
		add(new JButton("Button 3"));
		add(new JButton("Button 4"));
		add(new JButton("Button 5"));
		add(new JButton("Button 6"));
	}
	public static final int APPLICATION_WIDTH = 300;
	public static final int APPLICATION_HEIGHT = 100;

}
