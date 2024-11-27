package letras;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextArea;
import java.awt.BorderLayout;
import javax.swing.JFormattedTextField;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JLayeredPane;
import javax.swing.JTextPane;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.TextArea;

public class letras {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					letras window = new letras();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public letras() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(192, 192, 192));
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("GUI para el examen de entornos de desarrollo.Me llamo ...");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel.setBounds(10, 20, 416, 26);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1_1 = new JLabel("Número de caracteres:");
		lblNewLabel_1_1.setFont(new Font("Arial", Font.PLAIN, 13));
		lblNewLabel_1_1.setBounds(10, 105, 142, 26);
		frame.getContentPane().add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Escribe aquí tu nombre");
		lblNewLabel_1_1_1.setFont(new Font("Arial", Font.PLAIN, 13));
		lblNewLabel_1_1_1.setBounds(10, 69, 142, 26);
		frame.getContentPane().add(lblNewLabel_1_1_1);
		
		JButton btnNewButton = new JButton("Calcular");
		btnNewButton.setFont(new Font("Arial", Font.PLAIN, 11));
		btnNewButton.setBackground(new Color(192, 192, 192));
		btnNewButton.setBounds(284, 90, 85, 21);
		frame.getContentPane().add(btnNewButton);
		
		textField = new JTextField();
		textField.setBounds(162, 73, 96, 19);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(162, 109, 96, 19);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		JTextPane txtpnElZaragozaVa = new JTextPane();
		txtpnElZaragozaVa.setBackground(new Color(192, 192, 192));
		txtpnElZaragozaVa.setFont(new Font("Tahoma", Font.PLAIN, 12));
		txtpnElZaragozaVa.setText("El Zaragoza va a jugar El Zaragoza va a vencer El Zaragoza va a luchar por su afición.Aúpa Zaragoza Arriba y a vencer Palmadas al viento que gritan ganareis. La raza en el juego Nobleza y valor Bandera y orgullo de nuestro Aragón La Romareda vibrará y el cachirulo se alzará como un gigante es el equipo aragoné.\r\n\r\nAntonio Hernández Cavero");
		txtpnElZaragozaVa.setBounds(10, 141, 416, 112);
		frame.getContentPane().add(txtpnElZaragozaVa);
	}
}
