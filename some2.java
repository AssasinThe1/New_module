package hello;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class question2 {
	static void start() {
		JFrame jFrame = new JFrame();
		jFrame.setSize(200,200);
		jFrame.setVisible(true);
		jFrame.setLayout(null);
		JButton jButton1 = new JButton("7");
		JButton jButton2 = new JButton("8");
		JButton jButton3 = new JButton("9");
		JButton jButton4 = new JButton("+");
		JButton jButton5 = new JButton("4");
		JButton jButton6 = new JButton("5");
		JButton jButton7 = new JButton("6");
		JButton jButton8 = new JButton("-");
		JButton jButton9 = new JButton("1");
		JButton jButton10 = new JButton("2");
		JButton jButton11 = new JButton("3");
		JButton jButton12 = new JButton("*");
		JButton jButton13 = new JButton("C");
		JButton jButton14 = new JButton("0");
		JButton jButton15 = new JButton("=");
		JButton jButton16 = new JButton("/");
		jButton1.setBounds(30, 30, 50, 20);
		jButton2.setBounds(80, 30, 50, 20);
		jButton3.setBounds(130, 30, 50, 20);
		jButton4.setBounds(180, 30, 50, 20);
		jButton5.setBounds(30, 50, 50, 20);
		jButton6.setBounds(80, 50, 50, 20);
		jButton7.setBounds(130, 50, 50, 20);
		jButton8.setBounds(180, 50, 50, 20);
		jButton9.setBounds(30, 70, 50, 20);
		jButton10.setBounds(80, 70, 50, 20);
		jButton11.setBounds(130, 70, 50, 20);
		jButton12.setBounds(180, 70, 50, 20);
		jButton13.setBounds(30, 90, 50, 20);
		jButton14.setBounds(80, 90, 50, 20);
		jButton15.setBounds(130, 90, 50, 20);
		jButton16.setBounds(180, 90, 50, 20);
		JTextField jTextField = new JTextField();
		jTextField.setBounds(0,0,200,20);
		jFrame.add(jTextField);
		jFrame.add(jButton1);
		jFrame.add(jButton2);
		jFrame.add(jButton3);
		jFrame.add(jButton4);
		jFrame.add(jButton5);
		jFrame.add(jButton6);
		jFrame.add(jButton7);
		jFrame.add(jButton8);
		jFrame.add(jButton9);
		jFrame.add(jButton10);
		jFrame.add(jButton11);
		jFrame.add(jButton12);
		jFrame.add(jButton13);
		jFrame.add(jButton14);
		jFrame.add(jButton15);
		jFrame.add(jButton16);
		jButton1.addActionListener(e->{
			jTextField.setText(jTextField.getText()+"7");
		});
		jButton2.addActionListener(e->{
			jTextField.setText(jTextField.getText()+"8");
		});
		jButton3.addActionListener(e->{
			jTextField.setText(jTextField.getText()+"9");
		});
		jButton4.addActionListener(e->{
			jTextField.setText(jTextField.getText()+"+");
		});
		jButton5.addActionListener(e->{
			jTextField.setText(jTextField.getText()+"4");
		});
		jButton6.addActionListener(e->{
			jTextField.setText(jTextField.getText()+"5");
		});
		jButton7.addActionListener(e->{
			jTextField.setText(jTextField.getText()+"6");
		});
		jButton8.addActionListener(e->{
			jTextField.setText(jTextField.getText()+"-");
		});
		jButton9.addActionListener(e->{
			jTextField.setText(jTextField.getText()+"1");
		});
		jButton10.addActionListener(e->{
			jTextField.setText(jTextField.getText()+"2");
		});
		jButton11.addActionListener(e->{
			jTextField.setText(jTextField.getText()+"3");
		});
		jButton12.addActionListener(e->{
			jTextField.setText(jTextField.getText()+"*");
		});
		jButton13.addActionListener(e->{
			jTextField.setText(null);
		});
		jButton14.addActionListener(e->{
			jTextField.setText(jTextField.getText()+"0");
		});
		jButton15.addActionListener(e->{
			jTextField.setText(eval(jTextField.getText()));
		});
		jButton16.addActionListener(e->{
			jTextField.setText(jTextField.getText()+"/");
		});
	}
	static String eval(String expression) {
		      char[] arr = expression.toCharArray();
		      String operand1 = "";String operand2 = "";String operator = "";
		      double result = 0;

		      for (int i = 0; i < arr.length; i++) {
		         if (arr[i] >= '0' && arr[i] <= '9' || arr[i] == '.') {
		            if(operator.isEmpty()){
		               operand1 += arr[i];
		            }else{
		               operand2 += arr[i];
		            }
		         }  

		         if(arr[i] == '+' || arr[i] == '-' || arr[i] == '/' || arr[i] == '*') {
		            operator += arr[i];
		         }
		      }

		      if (operator.equals("+"))
		         result = (Double.parseDouble(operand1) + Double.parseDouble(operand2));
		      else if (operator.equals("-"))
		         result = (Double.parseDouble(operand1) - Double.parseDouble(operand2));
		      else if (operator.equals("/"))
		         result = (Double.parseDouble(operand1) / Double.parseDouble(operand2));
		      else
		         result = (Double.parseDouble(operand1) * Double.parseDouble(operand2));          
		      return Double.toString(result);
		   
	}
	public static void main(String[] args) {
		start();
	}
}
