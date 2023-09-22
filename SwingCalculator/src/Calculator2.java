import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class Calculator2 implements ActionListener {
	
	boolean isOperatorClicked=false;
	boolean operationCompleted=false;
	JLabel displayLabel;
	float oldValue,newValue;
	String operator="";
	
	JButton sevenButton;
	JButton eightButton;
	JButton nineButton;
	JButton fourButton;
	JButton fiveButton;
	JButton sixButton;
	JButton oneButton;
	JButton twoButton;
	JButton threeButton;
	JButton dotButton;
	JButton zeroButton;
	JButton equalButton;
	JButton plusButton;
	JButton minusButton;
	JButton intoButton;
	JButton divisionButton;
	JButton clearButton;
	
	public Calculator2() {
		JFrame jf=new JFrame("Calculator");
		jf.setLayout(null);
		jf.setSize(600,600);
		jf.setLocation(400,50);
		
		displayLabel=new JLabel();
		displayLabel.setBounds(30,30,540,60);
		displayLabel.setFont(new Font("Arial", Font.PLAIN, 40));
		displayLabel.setBackground(Color.lightGray);
		displayLabel.setOpaque(true);
		displayLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		displayLabel.setForeground(Color.black);
		jf.add(displayLabel);
		
		sevenButton=new JButton("7");
		sevenButton.setFont(new Font("Arial",Font.PLAIN,40));
		sevenButton.setBounds(30,120,80,80);
		sevenButton.addActionListener(this);
        jf.add(sevenButton);
        
        eightButton=new JButton("8");
        eightButton.setFont(new Font("Arial",Font.PLAIN,40));
		eightButton.setBounds(130,120,80,80);
		eightButton.addActionListener(this);
        jf.add(eightButton);
        
        nineButton=new JButton("9");
        nineButton.setFont(new Font("Arial",Font.PLAIN,40));
		nineButton.setBounds(230,120,80,80);
		nineButton.addActionListener(this);
        jf.add(nineButton);
        
        fourButton=new JButton("4");
        fourButton.setFont(new Font("Arial",Font.PLAIN,40));
		fourButton.setBounds(30,230,80,80);
		fourButton.addActionListener(this);
        jf.add(fourButton);
        
        fiveButton=new JButton("5");
        fiveButton.setFont(new Font("Arial",Font.PLAIN,40));
		fiveButton.setBounds(130,230,80,80);
		fiveButton.addActionListener(this);
        jf.add(fiveButton);
        
        sixButton=new JButton("6");
        sixButton.setFont(new Font("Arial",Font.PLAIN,40));
		sixButton.setBounds(230,230,80,80);
		sixButton.addActionListener(this);
        jf.add(sixButton);
        
        oneButton=new JButton("1");
        oneButton.setFont(new Font("Arial",Font.PLAIN,40));
        oneButton.addActionListener(this);
		oneButton.setBounds(30,340,80,80);
        jf.add(oneButton);
        
        twoButton=new JButton("2");
        twoButton.setFont(new Font("Arial",Font.PLAIN,40));
		twoButton.setBounds(130,340,80,80);
		twoButton.addActionListener(this);
        jf.add(twoButton);
        
        threeButton=new JButton("3");
        threeButton.setFont(new Font("Arial",Font.PLAIN,40));
		threeButton.setBounds(230,340,80,80);
		threeButton.addActionListener(this);
        jf.add(threeButton);
        
        dotButton=new JButton(".");
        dotButton.setFont(new Font("Arial",Font.PLAIN,40));
        dotButton.setBounds(30,450,80,80);
        dotButton.addActionListener(this);
        jf.add(dotButton);
        
        zeroButton=new JButton("0");
        zeroButton.setFont(new Font("Arial",Font.PLAIN,40));
        zeroButton.setBounds(130,450,80,80);
        zeroButton.addActionListener(this);
        jf.add(zeroButton);
        
        equalButton=new JButton("=");
        equalButton.setFont(new Font("Arial",Font.PLAIN,40));
        equalButton.setBounds(230,450,80,80);
        equalButton.addActionListener(this);
        jf.add(equalButton);
        
        plusButton=new JButton("+");
        plusButton.setFont(new Font("Arial",Font.PLAIN,40));
        plusButton.setBounds(340,450,80,80);
        plusButton.addActionListener(this);
        jf.add(plusButton);
        
        clearButton=new JButton("C");
        clearButton.setFont(new Font("Arial",Font.PLAIN,40));
        clearButton.setBounds(450,450,80,80);
        clearButton.addActionListener(this);
        jf.add(clearButton);
        
        minusButton=new JButton("-");
        minusButton.setFont(new Font("Arial",Font.PLAIN,40));
        minusButton.setBounds(340,340,80,80);
        minusButton.addActionListener(this);
        jf.add(minusButton);
        
        intoButton=new JButton("x");
        intoButton.setFont(new Font("Arial",Font.PLAIN,40));
        intoButton.setBounds(340,230,80,80);
        intoButton.addActionListener(this);
        jf.add(intoButton);
        
        divisionButton=new JButton("/");
        divisionButton.setFont(new Font("Arial",Font.PLAIN,40));
        divisionButton.setBounds(340,120,80,80);
        divisionButton.addActionListener(this);
        jf.add(divisionButton);
        
        
        jf.setVisible(true);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public static void main(String[] args) {
		new Calculator2();
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==clearButton) {
			displayLabel.setText("");
		}
		else if(e.getSource()==sevenButton) {
			if(isOperatorClicked) {
				displayLabel.setText("7");
				isOperatorClicked=false;
			}else {
			displayLabel.setText(displayLabel.getText()+"7");
			}if(operationCompleted) {
				displayLabel.setText("7");
				operationCompleted=false;
			}
		}else if(e.getSource()==eightButton) {
			if(isOperatorClicked) {
				displayLabel.setText("8");
				isOperatorClicked=false;
			}else {
			displayLabel.setText(displayLabel.getText()+"8");
				}
			if(operationCompleted) {
				displayLabel.setText("8");
				operationCompleted=false;
			}
		}else if(e.getSource()==nineButton) {
				if(isOperatorClicked) {
					displayLabel.setText("9");
					isOperatorClicked=false;
				}else {
			displayLabel.setText(displayLabel.getText()+"9");
				}
				if(operationCompleted) {
					displayLabel.setText("9");
					operationCompleted=false;
				}
		}else if(e.getSource()==fourButton) {
				if(isOperatorClicked) {
					displayLabel.setText("4");
					isOperatorClicked=false;
				}else {
			displayLabel.setText(displayLabel.getText()+"4");
				}
				if(operationCompleted) {
					displayLabel.setText("4");
					operationCompleted=false;
				}
		}else if(e.getSource()==fiveButton) {
				if(isOperatorClicked) {
					displayLabel.setText("5");
					isOperatorClicked=false;
				}else {
			displayLabel.setText(displayLabel.getText()+"5");
				}
				if(operationCompleted) {
					displayLabel.setText("5");
					operationCompleted=false;
				}
		}else if(e.getSource()==sixButton) {
				if(isOperatorClicked) {
					displayLabel.setText("6");
					isOperatorClicked=false;
				}else {
			displayLabel.setText(displayLabel.getText()+"6");
				}
				if(operationCompleted) {
					displayLabel.setText("6");
					operationCompleted=false;
				}
		}else if(e.getSource()==oneButton) {
				if(isOperatorClicked) {
					displayLabel.setText("1");
					isOperatorClicked=false;
				}else {
			displayLabel.setText(displayLabel.getText()+"1");
				}
				if(operationCompleted) {
					displayLabel.setText("1");
					operationCompleted=false;
				}
		}else if(e.getSource()==twoButton) {
				if(isOperatorClicked) {
					displayLabel.setText("2");
					isOperatorClicked=false;
				}else {
					displayLabel.setText(displayLabel.getText()+"2");
				}
				if(operationCompleted) {
					displayLabel.setText("2");
					operationCompleted=false;
				}
		}else if(e.getSource()==threeButton) {
			if(isOperatorClicked) {
				displayLabel.setText("3");
				isOperatorClicked=false;
			}else {
			displayLabel.setText(displayLabel.getText()+"3");
			}
			if(operationCompleted) {
				displayLabel.setText("3");
				operationCompleted=false;
			}
		}else if(e.getSource()==dotButton) {
			if(isOperatorClicked) {
				displayLabel.setText(".");
				isOperatorClicked=false;
			}
			else {
				displayLabel.setText(displayLabel.getText()+".");
				}
			if(operationCompleted) {
				displayLabel.setText(".");
				operationCompleted=false;
			}
		}else if(e.getSource()==zeroButton) {
			if(isOperatorClicked) {
				displayLabel.setText("0");
				isOperatorClicked=false;
			}else {
			displayLabel.setText(displayLabel.getText()+"0");
			}
			if(operationCompleted) {
				displayLabel.setText("0");
				operationCompleted=false;
			}
		}else if(e.getSource()==equalButton) {
			
			newValue=Float.parseFloat(displayLabel.getText());
		
			if(operator=="+") {
				oldValue+=newValue;
			}
			else if(operator=="-") {
				oldValue-=newValue;
			}
			else if(operator=="*") {
				oldValue*=newValue;
			}
			else if(operator=="/") {
				oldValue/=newValue;
			}
			displayLabel.setText(oldValue+"");
			operationCompleted=true;
			isOperatorClicked=false;
			operator="";
		}else if(e.getSource()==plusButton) {
			performCalculation();
			operator="+";
		}else if(e.getSource()==minusButton) {
			performCalculation();
			operator="-";
		}else if(e.getSource()==intoButton) {
			performCalculation();
			operator="*";
		}else if(e.getSource()==divisionButton) {
			performCalculation();
			operator="/";
		}
	}
		public void performCalculation() {
			if(operator=="") {
				oldValue=Float.parseFloat(displayLabel.getText());
			}else {
				newValue=Float.parseFloat(displayLabel.getText());
				if(operator=="+") {
					oldValue+=newValue;
				}
				else if(operator=="-") {
					oldValue-=newValue;
				}
				else if(operator=="*") {
					oldValue*=newValue;
				}
				else if(operator=="/") {
					oldValue/=newValue;
				}
				displayLabel.setText(oldValue+"");
			}
			
			isOperatorClicked=true;
	}
}

