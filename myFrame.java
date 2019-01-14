import java.awt.*;
import javax.swing.*;

public class myFrame{
public static void main(String args[]){

	//create Elements
	JFrame frame = new JFrame("My first Frame");

	JLabel label = new JLabel("Username");

	JLabel label1 = new JLabel("Password");

	JLabel label2 = new JLabel("CEU Portal",SwingConstants.CENTER);

	JLabel label3 = new JLabel("Code");

	JButton button = new JButton("Login");

	JTextField field = new JTextField("");

	JPasswordField field2 = new JPasswordField("");

	JTextField field3 = new JTextField("");

	JPanel panel = new JPanel(new BorderLayout());


	//create label object
	frame.getContentPane().add(label,BorderLayout.CENTER);
	frame.getContentPane().add(button,BorderLayout.CENTER);
	frame.getContentPane().add(field,BorderLayout.CENTER);
	frame.getContentPane().add(field2,BorderLayout.CENTER);
	frame.getContentPane().add(field3,BorderLayout.CENTER);
	frame.getContentPane().add(label1,BorderLayout.CENTER);
	frame.getContentPane().add(label2,BorderLayout.CENTER);
	frame.getContentPane().add(label3,BorderLayout.CENTER);
	frame.getContentPane().add(panel,BorderLayout.CENTER);

	//set frame Options
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frame.setVisible(true);
	frame.setSize(310,300);
	frame.setLayout(null);

	label.setLayout(null);
	label.setSize(100,100);
	label.setForeground(Color.GRAY);

	label1.setLayout(null);
	label1.setSize(200,200);
	label1.setForeground(Color.GRAY);

	label2.setLayout(null);
	label2.setSize(300,30);
	label2.setForeground(Color.GRAY);

	label3.setLayout(null);
	label3.setSize(300,300);
	label3.setForeground(Color.GRAY);

	field.setVisible(true);
	field.setSize(100,100);
	field.setBounds(70,35,180,30);

	field2.setVisible(true);
	field2.setSize(100,100);
	field2.setBounds(70,85,180,30);

	field3.setVisible(true);
	field3.setSize(100,100);
	field3.setBounds(70,135,180,30);

	button.setBounds(100,180,95,30);
	button.setBackground(Color.GRAY);
	button.setForeground(Color.WHITE);

	panel.setBounds(0,0,500,500);
	panel.setBackground(Color.PINK);
	}
}