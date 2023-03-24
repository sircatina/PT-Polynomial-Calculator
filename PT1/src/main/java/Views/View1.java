package Views;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class View1 extends JFrame {

    private JButton AdditionButton;
    private JButton SubstractionButton;
    private JButton  MultiplicationButton;
    private JButton DivisionButton;
    private JButton DerivativeButton;
    private JButton IntegrationButton;
	private JTextField SecondField;
	private JTextField FirstField;
	private JTextArea ResulttextArea ;
    public View1(){
    this.getContentPane().setBackground(new Color(240, 248, 255));
		this.getContentPane().setForeground(new Color(60, 179, 113));
		this.setBounds(100, 100, 475, 521);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.getContentPane().setLayout(null);

    FirstField = new JTextField();
		FirstField.setBounds(218, 103, 196, 29);
		this.getContentPane().add(FirstField);
		FirstField.setColumns(10);

    SecondField = new JTextField();
		SecondField.setBounds(218, 142, 196, 29);
		this.getContentPane().add(SecondField);
		SecondField.setColumns(10);

    JLabel FirstLabel = new JLabel("First Polynomial=");
		FirstLabel.setFont(new Font("Tahoma", Font.BOLD, 16));
		FirstLabel.setBounds(46, 90, 165, 50);
		this.getContentPane().add(FirstLabel);

    JLabel SecondLabel = new JLabel("Second Polynomial=");
		SecondLabel.setFont(new Font("Tahoma", Font.BOLD, 16));
		SecondLabel.setBounds(46, 140, 189, 29);
		this.getContentPane().add(FirstLabel);

    JLabel PolynLabel = new JLabel("Polynomial calculator");
		PolynLabel.setFont(new Font("Tahoma", Font.BOLD, 20));
		PolynLabel.setBounds(102, 43, 228, 37);
		this.getContentPane().add(PolynLabel);

     AdditionButton = new JButton("ADDITION");
		AdditionButton.setFont(new Font("Tahoma", Font.PLAIN, 16));
		AdditionButton.setBounds(36, 280, 157, 37);
		this.getContentPane().add(AdditionButton);

     SubstractionButton = new JButton("SUBSTRACTION");
		SubstractionButton.setFont(new Font("Tahoma", Font.PLAIN, 16));
		SubstractionButton.setBounds(36, 346, 157, 37);
		this.getContentPane().add(SubstractionButton);

    MultiplicationButton = new JButton("MULTIPLICATION");
		MultiplicationButton.setFont(new Font("Tahoma", Font.PLAIN, 14));
		MultiplicationButton.setBounds(259, 280, 157, 37);
		this.getContentPane().add(MultiplicationButton);

    DivisionButton = new JButton("DIVISION");
		DivisionButton.setFont(new Font("Tahoma", Font.PLAIN, 16));
		DivisionButton.setBounds(259, 346, 157, 37);
		this.getContentPane().add(DivisionButton);

    DerivativeButton = new JButton("DERIVATIVE");
		DerivativeButton.setFont(new Font("Tahoma", Font.PLAIN, 16));
		DerivativeButton.setBounds(257, 407, 157, 37);
		this.getContentPane().add(DerivativeButton);

    IntegrationButton = new JButton("INTEGRATION");
		IntegrationButton.setFont(new Font("Tahoma", Font.PLAIN, 16));
		IntegrationButton.setBounds(36, 407, 157, 37);
		this.getContentPane().add(IntegrationButton);

	JLabel ResultLabel = new JLabel("Result=");
		ResultLabel.setFont(new Font("Tahoma", Font.BOLD, 16));
		ResultLabel.setBounds(48, 190, 145, 21);
		this.getContentPane().add(ResultLabel);

	ResulttextArea = new JTextArea();
		ResulttextArea.setBounds(218, 190, 196, 29);
		this.getContentPane().add(ResulttextArea);
		this.setVisible(true);
}
	public void setFirstField(String firstField) {this.FirstField.setText(firstField);}
	public String getFirstField() {return FirstField.getText();}
	public void setSecondField(String secondField) {this.SecondField.setText(secondField);}
	public String getSecondField() {return SecondField.getText();}
	public String getResulttextArea() {return ResulttextArea.getText();}
	public void setResulttextArea(String resulttextArea) {
		this.ResulttextArea.setText(resulttextArea);
	}
	public void showErorrMessage(String message) {
		JOptionPane.showMessageDialog(this, message, "ERROR MESSAGE", JOptionPane.ERROR_MESSAGE);}
	public void addAdditionButtonListener(ActionListener ActionListener) {
		AdditionButton.addActionListener(ActionListener);
	}
	public void addSubstractionButtonListener(ActionListener ActionListener) {
		SubstractionButton.addActionListener(ActionListener);
	}
	public void addMultiplicationButtonListener(ActionListener ActionListener) {
		MultiplicationButton.addActionListener(ActionListener);
	}
	public void addDivisionButtonListener(ActionListener ActionListener) {
		DivisionButton.addActionListener(ActionListener);
	}
	public void addDerivativeButtonListener(ActionListener ActionListener) {
		DerivativeButton.addActionListener(ActionListener);
	}
	public void addIntegrationButtonListener(ActionListener ActionListener) {
		IntegrationButton.addActionListener(ActionListener);
	}
}