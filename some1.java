package hello;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.lang.Integer;



public class question1 {
	static void start() {
		JFrame jFrame = new JFrame();
		jFrame.setSize(600,600);
		jFrame.setVisible(true);
		jFrame.setLayout(null);
		JLabel jLabel = new JLabel("Counter");
		jLabel.setBounds(30,30,100,30);
		JTextField jTextField = new JTextField();
		jTextField.setText("0");
		jTextField.setBounds(130,30,200,30);
		JButton jButton = new JButton("Count");
		jButton.setBounds(330,30,60,30);
		jFrame.add(jButton);	
		jFrame.add(jLabel);
		jFrame.add(jTextField);
		jButton.addActionListener(e->{
			int num = Integer.parseInt(jTextField.getText());
			jTextField.setText(Integer.toString(num+1));
			
		});
		
	}
	public static void main(String[] args) {
		start();
	}
}
