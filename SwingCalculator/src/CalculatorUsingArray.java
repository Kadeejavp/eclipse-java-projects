import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class CalculatorUsingArray implements ActionListener {
	
	StringBuilder input;
	boolean resultDisplayed=false;
	JButton numberButtons[],operatorButton[];
	JButton clearButton,equalButton,dotButton;
	JTextField field;
	float result=0;

	public CalculatorUsingArray() {
		
	input=new StringBuilder();
	JFrame frame=new JFrame("calculator");
	frame.setLayout(null);
	frame.setSize(560,600);
	frame.setLocation(400,50);
	
	field=new JTextField("");
	field.setBounds(30, 30, 480, 50);
	field.setBackground(Color.lightGray);
	field.setOpaque(true);
	field.setFont(new Font("Ariel",Font.PLAIN,40));
	field.setHorizontalAlignment(SwingConstants.RIGHT);
	field.setForeground(Color.black);
	frame.add(field);
	
	numberButtons=new JButton[10];
	for(int i=0;i<10;i++) {
		numberButtons[i] = new JButton(String.valueOf(i));
		numberButtons[i].setBounds(30+(i%3)*100, 120+(i/3)*100, 80, 80);
		numberButtons[i].setFont(new Font("Ariel",Font.PLAIN,40));
		numberButtons[i].addActionListener(this);
		frame.add(numberButtons[i]);
	}
	
	equalButton=new JButton("=");
	equalButton.setBounds(130, 420, 80, 80);
	equalButton.setFont(new Font("Ariel",Font.PLAIN,40));
	equalButton.addActionListener(this);
	frame.add(equalButton);
	
	dotButton=new JButton(".");
	dotButton.setBounds(230, 420, 80, 80);
	dotButton.setFont(new Font("Ariel",Font.PLAIN,40));
	dotButton.addActionListener(this);
	frame.add(dotButton);
	
	clearButton=new JButton("C");
	clearButton.setBounds(430, 120, 80, 80);
	clearButton.setFont(new Font("Ariel",Font.PLAIN,40));
	clearButton.addActionListener(this);
	frame.add(clearButton);
	
	operatorButton=new JButton[4];
	operatorButton[0]=new JButton("+");
	operatorButton[1]=new JButton("-");
	operatorButton[2]=new JButton("*");
	operatorButton[3]=new JButton("/");
	for(int i=0;i<4;i++) {
		operatorButton[i].setBounds(330, 120+i*100, 80, 80);
		operatorButton[i].setFont(new Font("Ariel",Font.PLAIN,40));
		operatorButton[i].addActionListener(this);
		frame.add(operatorButton[i]);
	}
	
	frame.setVisible(true);
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		new CalculatorUsingArray();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		JButton source=(JButton)e.getSource();
		String buttonText=source.getText();
		
		if(buttonText.equals("C")) {
			clearCalculator();
		}else if(buttonText.equals(".")){
			field.setText(field.getText()+".");
		}else if(buttonText.equals("=")) {
			performCalculations();
		}else if(isNumeric(buttonText)) {
			handleNumeric(buttonText);
		}else if(isOperator(buttonText)) {
			handleOperator(buttonText);
		}
		}
		
	public void clearCalculator() {
		field.setText("");
		resultDisplayed=false;
		input.setLength(0);
		result=0;
	}
	
	public void performCalculations() {
		if(resultDisplayed) {
			return;
		}
		evaluateInput();
		
		field.setText(String.valueOf(result));
		resultDisplayed=true;
	}
	
	public void evaluateInput() {
		String[] parts=input.toString().split("(?>=\\D)(?=\\d)|(?=\\d)(?>=\\D)");
		if(parts.length==1) {
			result=Float.parseFloat(parts[0]);
		}else {
		float num1=Float.parseFloat(parts[0]);
		float num2=Float.parseFloat(parts[2]);
		String operator=parts[1];
		
		switch(operator) {
		case"+":
			result=num1+num2;
			break;
		case"-":
			result=num1-num2;
			break;
		case"*":
			result=num1*num2;
			break;
		case"/":
			result=num1/num2;
			break;
		}
		}
		input.setLength(0);
	}

	
	public boolean isNumeric(String entry) {
		return entry.matches("-?\\d+(\\.\\d+)?");
	}
	
	public void handleNumeric(String number) {
		if(resultDisplayed) {
			clearCalculator();
		}
		input.append(number);
		field.setText(input.toString());
	}
	public boolean isOperator(String entry) {
		return entry.equals("+")|entry.equals("-")|entry.equals("*")|entry.equals("/");
		
	}
	
	public void handleOperator(String operator) {
		if(input.length()==0) {
			return;
		}
		evaluateInput();
		
		input.append(operator);
		field.setText(input.toString());
	}
}
