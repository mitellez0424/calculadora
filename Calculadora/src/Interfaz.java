import javax.swing.*;
import javax.swing.border.Border;
import java.awt.event.*;
import java.awt.*;


public class Interfaz extends JFrame implements ActionListener{
	private JLabel Num1;
	private JLabel Oper;
	private JLabel Num2;
	private JButton X;
	private JButton C;
	private JButton Igual;
	private JButton Suma;
	private JButton Rest;
	private JButton Mult;
	private JButton Divi;
	private JButton Uno;
	private JButton Dos;
	private JButton Tres;
	private JButton Cuat;
	private JButton Cinc;
	private JButton Seis;
	private JButton Siet;
	private JButton Ocho;
	private JButton Nuev;
	private JButton Cero;
	private JButton DobleCero;
	String Variable = "";
	String Variable2 = "";
	int Variable3 = 0;
	int Variable4 = 0;
	int Variable5 = 0;
	String Variable6 = "";
	
	public Interfaz() {
		setLayout(null);
		X = new JButton("X");
		X.setBounds(240, 10, 50, 30);
		add(X);
		X.addActionListener(this);
		
		Num1 = new JLabel("");
		Num1.setBounds(20, 60, 110, 50);
		add(Num1);
		
		Oper = new JLabel("");
		Oper.setBounds(140, 60, 20, 50);
		add(Oper);
		
		Num2 = new JLabel("");
		Num2.setBounds(170, 60, 110, 50);
		add(Num2);
		
		Divi = new JButton("/");
		Divi.setBounds(230, 130, 50, 25);
		add(Divi);
		Divi.addActionListener(this);
		
		C = new JButton("C");
		C.setBounds(20,130,50,25);
		add(C);
		C.addActionListener(this);
		
		Igual = new JButton("=");
		Igual.setBounds(160, 290, 50, 25);
		add(Igual);
		Igual.addActionListener(this);
		
		Siet = new JButton("7");
		Siet.setBounds(20, 170, 50, 25);
		add(Siet);
		Siet.addActionListener(this);
		
		Ocho = new JButton("8");
		Ocho.setBounds(90, 170, 50, 25);
		add(Ocho);
		Ocho.addActionListener(this);

		Nuev = new JButton("9");
		Nuev.setBounds(160, 170, 50, 25);
		add(Nuev);
		Nuev.addActionListener(this);
		
		Mult = new JButton("x");
		Mult.setBounds(230, 170, 50, 25);
		add(Mult);
		Mult.addActionListener(this);

		Cuat = new JButton("4");
		Cuat.setBounds(20, 210, 50, 25);
		add(Cuat);
		Cuat.addActionListener(this);
		
		Cinc = new JButton("5");
		Cinc.setBounds(90, 210, 50, 25);
		add(Cinc);
		Cinc.addActionListener(this);
		
		Seis = new JButton("6");
		Seis.setBounds(160, 210, 50, 25);
		add(Seis);
		Seis.addActionListener(this);
		
		Rest = new JButton("-");
		Rest.setBounds(230, 210, 50, 25);
		add(Rest);
		Rest.addActionListener(this);
		
		Uno = new JButton("1");
		Uno.setBounds(20, 250, 50, 25);
		add(Uno);
		Uno.addActionListener(this);
		
		Dos = new JButton("2");
		Dos.setBounds(90, 250, 50, 25);
		add(Dos);
		Dos.addActionListener(this);
		
		Tres = new JButton("3");
		Tres.setBounds(160, 250, 50, 25);
		add(Tres);
		Tres.addActionListener(this);
		
		Suma = new JButton("+");
		Suma.setBounds(230, 250, 50, 65);
		add(Suma);
		Suma.addActionListener(this);

		Cero = new JButton("0");
		Cero.setBounds(20, 290, 50, 25);
		add(Cero);
		Cero.addActionListener(this);
		
		DobleCero = new JButton("00");
		DobleCero.setBounds(90, 290, 50, 25);
		add(DobleCero);
		DobleCero.addActionListener(this);
		
		
	}

	public void actionPerformed(ActionEvent e) {
		 Variable2 = Oper.getText();
		if(e.getSource() == X) {
			this.dispose();
		}
		if(e.getSource() == C) {
			if(Variable2 == "") {
				Num1.setText("");
			} else {
				Num2.setText("");
			}
		}
		if(e.getSource() == Uno) {
			if(Variable2 == "") {
				 Num1.setText(Variable + 1);
				 Variable = Num1.getText();
			} else {
				 Num2.setText(Variable + 1);
				 Variable = Num2.getText();
			}
		}
		if(e.getSource() == Dos) {
			if(Variable2 == "") {
				 Num1.setText(Variable + 2);
				 Variable = Num1.getText();
			} else {
				 Num2.setText(Variable + 2);
				 Variable = Num2.getText();
			}
		}
		if(e.getSource() == Tres) {
			if(Variable2 == "") {
				 Num1.setText(Variable + 3);
				 Variable = Num1.getText();
			} else {
				 Num2.setText(Variable + 3);
				 Variable = Num2.getText();
			}
		}
		if(e.getSource() == Cuat) {
			if(Variable2 == "") {
				 Num1.setText(Variable + 4);
				 Variable = Num1.getText();
			} else {
				 Num2.setText(Variable + 4);
				 Variable = Num2.getText();
			}
		}
		if(e.getSource() == Cinc) {
			if(Variable2 == "") {
				 Num1.setText(Variable + 5);
				 Variable = Num1.getText();
			} else {
				 Num2.setText(Variable + 5);
				 Variable = Num2.getText();
			}
		}
		if(e.getSource() == Seis) {
			if(Variable2 == "") {
				 Num1.setText(Variable + 6);
				 Variable = Num1.getText();
			} else {
				 Num2.setText(Variable + 6);
				 Variable = Num2.getText();
			}
		}
		if(e.getSource() == Siet) {
			if(Variable2 == "") {
				 Num1.setText(Variable + 7);
				 Variable = Num1.getText();
			} else {
				 Num2.setText(Variable + 7);
				 Variable = Num2.getText();
			}
		}
		if(e.getSource() == Ocho) {
			if(Variable2 == "") {
				 Num1.setText(Variable + 8);
				 Variable = Num1.getText();
			} else {
				 Num2.setText(Variable + 8);
				 Variable = Num2.getText();
			}
		}
		if(e.getSource() == Nuev) {
			if(Variable2 == "") {
				 Num1.setText(Variable + 9);
				 Variable = Num1.getText();
			} else {
				 Num2.setText(Variable + 9);
				 Variable = Num2.getText();
			}
		}
		if(e.getSource() == Cero) {
			if(Variable2 == "") {
				if(Variable2 == "") {
					Num1.setText("");
				} else {
					Num2.setText("");
				}
			}else {
				if(Variable2 == "") {
					 Num1.setText(Variable + 0);
					 Variable = Num1.getText();
				} else {
					 Num2.setText(Variable + 0);
					 Variable = Num2.getText();
				}
			}
		}
		if(e.getSource() == DobleCero) {

			if(Variable2 == "") {
				Variable = Num1.getText();
			} else {
				Variable = Num2.getText();
			}
			if(Variable6 == "") {
				if(Variable2 == "") {
					Num1.setText("");
				} else {
					Num2.setText("");
				}
			}else {
				if(Variable2 == "") {
					 Num1.setText(Variable + 0 + 0);
					 Variable = Num1.getText();
				} else {
					 Num2.setText(Variable + 0 + 0);
					 Variable = Num2.getText();
				}
			}
		}
		if(e.getSource() == Suma) {
			if(Variable2 == "") {
				Oper.setText("+");
				Variable = "";
			} else {
				
			}
		}
		if(e.getSource() == Rest) {
			if(Variable2 == "") {
				Oper.setText("-");
				Variable = "";
			} else {
				
			}
		}
		if(e.getSource() == Mult) {
			if(Variable2 == "") {
				Oper.setText("*");
				Variable = "";
			} else {
				
			}
		}
		if(e.getSource() == Divi) {
			if(Variable2 == "") {
				Oper.setText("/");
				Variable = "";
			} else {
				
			}
		}

		if(e.getSource() == Igual) {
			Variable2 = Oper.getText();
			Variable3 = Integer.parseInt(Num1.getText());
			Variable4 = Integer.parseInt(Num2.getText());
			if(Variable2 == "+") {
				Variable5 = Variable3 + Variable4;
				Igual.setText(Variable5 + "");
			} else if (Variable2 == "-") {
				Variable5 = Variable3 - Variable4;
				Igual.setText(Variable5 + "");
			} else if (Variable2 == "*") {
				Variable5 = Variable3 * Variable4;
				Igual.setText(Variable5 + "");
			} else if (Variable2 == "/") {
				Variable5 = Variable3 / Variable4;
				Igual.setText(Variable5 + "");
			}
		}
	}
	
	public static void main(String args[]) {			//este es el metodo main este metodo es el que arranca mi programa y solo lo tiene una sola ventana en mi programa que es la principal o la que me dice cual me va a arrancar le programa
		Interfaz Ventana = new Interfaz();	
		Ventana.setUndecorated(true);
		Ventana.setBackground(new Color(100,200,100));
		Ventana.setBounds(0,0,300,400);					//aqui le digo a mi programa el tamaño de la ventana que voy a crear y la ubicacion (ubicacion en X, ubicacion en Y, Tamaño en X, Tamaño en Y
		Ventana.setVisible(true); 						//esto me ayuda a que mi ventana sea visible por eso el true
		Ventana.setLocationRelativeTo(null);			//esto me ayuda a que la localizacion de mi programa sea nula (null)y aparezca en el centro de la pantalla
		Ventana.setResizable(false);
	}
}
