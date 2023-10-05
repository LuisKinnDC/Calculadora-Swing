package miCalculadora;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Toolkit;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import java.awt.Color;
import javax.swing.border.EtchedBorder;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.SystemColor;

public class calculadora extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	
	//Mis variables
	double numero1;
	double numero2;
	double resultado;
	String operacion;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					calculadora frame = new calculadora();
					frame.setVisible(true);
					frame.setLocationRelativeTo(null);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public calculadora() {
		setForeground(SystemColor.textHighlight);
		setBackground(new Color(255, 255, 255));
		setIconImage(Toolkit.getDefaultToolkit().getImage(calculadora.class.getResource("/img/icon.jpeg")));
		setTitle("CALCULADORA");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 260, 330);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(51, 153, 102));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		


		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textField = new JTextField();
		textField.setEditable(false);
		textField.setForeground(SystemColor.textHighlight);
		textField.setFont(new Font("Comic Sans MS", Font.BOLD, 14));
		textField.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		textField.setHorizontalAlignment(SwingConstants.RIGHT);
		textField.setBounds(10, 11, 222, 30);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JButton btnNewButtonBorrar = new JButton("AC");
		btnNewButtonBorrar.setBackground(Color.RED);
		btnNewButtonBorrar.setForeground(Color.WHITE);
		btnNewButtonBorrar.setFont(new Font("Comic Sans MS", Font.BOLD, 10));
		btnNewButtonBorrar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnNewButtonBorrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText("");
			}
		});
		btnNewButtonBorrar.setBounds(184, 52, 48, 35);
		contentPane.add(btnNewButtonBorrar);
		
		JButton btnNewButtonSuma = new JButton("+");
		btnNewButtonSuma.setForeground(Color.BLUE);
		btnNewButtonSuma.setFont(new Font("Comic Sans MS", Font.BOLD, 11));
		btnNewButtonSuma.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnNewButtonSuma.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//suma
				numero1 = Double.parseDouble(textField.getText());
				textField.setText("");;
				operacion = "+";
			}
		});
		btnNewButtonSuma.setBounds(184, 98, 48, 35);
		contentPane.add(btnNewButtonSuma);
		
		JButton btnNewButton3 = new JButton("3");
		btnNewButton3.setFont(new Font("Comic Sans MS", Font.BOLD, 11));
		btnNewButton3.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnNewButton3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//num3
				String IngresarNumero = textField.getText()+ btnNewButton3.getText();
				textField.setText(IngresarNumero);
			}
		});
		btnNewButton3.setBounds(126, 98, 48, 35);
		contentPane.add(btnNewButton3);
		
		JButton btnNewButton2 = new JButton("2");
		btnNewButton2.setFont(new Font("Comic Sans MS", Font.BOLD, 11));
		btnNewButton2.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnNewButton2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//num2
				String IngresarNumero = textField.getText()+ btnNewButton2.getText();
				textField.setText(IngresarNumero);
			}
		});
		btnNewButton2.setBounds(68, 98, 48, 35);
		contentPane.add(btnNewButton2);
		
		JButton btnNewButton1 = new JButton("1");
		btnNewButton1.setFont(new Font("Comic Sans MS", Font.BOLD, 11));
		btnNewButton1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnNewButton1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Num1
				String IngresarNumero = textField.getText()+ btnNewButton1.getText();
				textField.setText(IngresarNumero);
			}
		});
		btnNewButton1.setBounds(10, 98, 48, 35);
		contentPane.add(btnNewButton1);
		
		JButton btnNewButtonResta = new JButton("-");
		btnNewButtonResta.setForeground(Color.BLUE);
		btnNewButtonResta.setFont(new Font("Comic Sans MS", Font.BOLD, 11));
		btnNewButtonResta.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnNewButtonResta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//resta
				numero1 = Double.parseDouble(textField.getText());
				textField.setText("");;
				operacion = "-";
			}
		});
		btnNewButtonResta.setBounds(184, 144, 48, 35);
		contentPane.add(btnNewButtonResta);
		
		JButton btnNewButton6 = new JButton("6");
		btnNewButton6.setFont(new Font("Comic Sans MS", Font.BOLD, 11));
		btnNewButton6.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnNewButton6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//num6
				String IngresarNumero = textField.getText()+ btnNewButton6.getText();
				textField.setText(IngresarNumero);
			}
		});
		btnNewButton6.setBounds(126, 144, 48, 35);
		contentPane.add(btnNewButton6);
		
		JButton btnNewButton5 = new JButton("5");
		btnNewButton5.setFont(new Font("Comic Sans MS", Font.BOLD, 11));
		btnNewButton5.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnNewButton5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//num5
				String IngresarNumero = textField.getText()+ btnNewButton5.getText();
				textField.setText(IngresarNumero);
			}
		});
		btnNewButton5.setBounds(68, 144, 48, 35);
		contentPane.add(btnNewButton5);
		
		JButton btnNewButton4 = new JButton("4");
		btnNewButton4.setFont(new Font("Comic Sans MS", Font.BOLD, 11));
		btnNewButton4.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnNewButton4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//num4
				String IngresarNumero = textField.getText()+ btnNewButton4.getText();
				textField.setText(IngresarNumero);
			}
		});
		btnNewButton4.setBounds(10, 144, 48, 35);
		contentPane.add(btnNewButton4);
		
		JButton btnNewButtonMultiplicacion = new JButton("x");
		btnNewButtonMultiplicacion.setForeground(Color.BLUE);
		btnNewButtonMultiplicacion.setFont(new Font("Comic Sans MS", Font.BOLD, 11));
		btnNewButtonMultiplicacion.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnNewButtonMultiplicacion.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//multiplicacion
				numero1 = Double.parseDouble(textField.getText());
				textField.setText("");;
				operacion = "x";
			}
		});
		btnNewButtonMultiplicacion.setBounds(184, 190, 48, 35);
		contentPane.add(btnNewButtonMultiplicacion);
		
		JButton btnNewButton9 = new JButton("9");
		btnNewButton9.setFont(new Font("Comic Sans MS", Font.BOLD, 11));
		btnNewButton9.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnNewButton9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//num9
				String IngresarNumero = textField.getText()+ btnNewButton9.getText();
				textField.setText(IngresarNumero);
			}
		});
		btnNewButton9.setBounds(126, 190, 48, 35);
		contentPane.add(btnNewButton9);
		
		JButton btnNewButton8 = new JButton("8");
		btnNewButton8.setFont(new Font("Comic Sans MS", Font.BOLD, 11));
		btnNewButton8.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnNewButton8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//num8
				String IngresarNumero = textField.getText()+ btnNewButton8.getText();
				textField.setText(IngresarNumero);
			}
		});
		btnNewButton8.setBounds(68, 190, 48, 35);
		contentPane.add(btnNewButton8);
		
		JButton btnNewButton7 = new JButton("7");
		btnNewButton7.setFont(new Font("Comic Sans MS", Font.BOLD, 11));
		btnNewButton7.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnNewButton7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//num7
				String IngresarNumero = textField.getText()+ btnNewButton7.getText();
				textField.setText(IngresarNumero);
			}
		});
		btnNewButton7.setBounds(10, 190, 48, 35);
		contentPane.add(btnNewButton7);
		
		JButton btnNewButtonDivicion = new JButton("÷");
		btnNewButtonDivicion.setForeground(Color.BLUE);
		btnNewButtonDivicion.setFont(new Font("Comic Sans MS", Font.BOLD, 11));
		btnNewButtonDivicion.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnNewButtonDivicion.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//division
				numero1 = Double.parseDouble(textField.getText());
				textField.setText("");;
				operacion = "÷";
			}
		});
		btnNewButtonDivicion.setBounds(184, 236, 48, 35);
		contentPane.add(btnNewButtonDivicion);
		
		JButton btnNewButtonIgual = new JButton("=");
		btnNewButtonIgual.setForeground(Color.MAGENTA);
		btnNewButtonIgual.setFont(new Font("Comic Sans MS", Font.BOLD, 11));
		btnNewButtonIgual.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnNewButtonIgual.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String seleccionar;
				numero2 = Double.parseDouble(textField.getText());
				
				if(operacion == "+") {
					resultado = numero1 + numero2;
					seleccionar = String.format("%.1f", resultado);
					textField.setText(seleccionar);
				}
				
				else if(operacion == "-") {
					resultado = numero1 - numero2;
					seleccionar = String.format("%.1f", resultado);
					textField.setText(seleccionar);
				}
				
				else if(operacion == "x") {
					resultado = numero1 * numero2;
					seleccionar = String.format("%.1f", resultado);
					textField.setText(seleccionar);
				}
				
				else if(operacion == "÷") {
					resultado = numero1 / numero2;
					seleccionar = String.format("%.1f", resultado);
					textField.setText(seleccionar);
				}
			}
		});
		btnNewButtonIgual.setBounds(126, 236, 48, 35);
		contentPane.add(btnNewButtonIgual);
		
		JButton btnNewButton0 = new JButton("0");
		btnNewButton0.setFont(new Font("Comic Sans MS", Font.BOLD, 11));
		btnNewButton0.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnNewButton0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//num0
				String IngresarNumero = textField.getText()+ btnNewButton0.getText();
				textField.setText(IngresarNumero); //LuisKinnDC  
			}
		});
		btnNewButton0.setBounds(68, 236, 48, 35);
		contentPane.add(btnNewButton0);
		
		JButton btnNewButtonPunto = new JButton(".");
		btnNewButtonPunto.setForeground(Color.BLUE);
		btnNewButtonPunto.setFont(new Font("Arial", Font.BOLD, 11));
		btnNewButtonPunto.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnNewButtonPunto.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//punto
				String IngresarNumero = textField.getText()+ btnNewButtonPunto.getText();
				textField.setText(IngresarNumero);
			}
		});
		btnNewButtonPunto.setBounds(10, 236, 48, 35);
		contentPane.add(btnNewButtonPunto);
		
		JButton btnNewButton = new JButton("DEL");
		btnNewButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnNewButton.setForeground(Color.WHITE);
		btnNewButton.setFont(new Font("Comic Sans MS", Font.BOLD, 11));
		btnNewButton.setBackground(Color.RED);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(textField.getText().length() !=0) {
					textField.setText(textField.getText().substring(0, textField.getText().length()-1));
				}else {
					//alerta
					
					//JOptionPane.showMessageDialog(null, " No puedo borrar mas!!" + "\n" 
							//+ " Asi como tu no puedes borrar " + "\n"
							//+ "lo que sientes por ella 😢💔 ");
				}
				
			}                                                                                   
		});
		btnNewButton.setBounds(115, 52, 59, 35);
		contentPane.add(btnNewButton);
	}
}
