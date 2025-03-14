package calculadora;

import java.awt.EventQueue;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Font;

public class CALCULADORA {

    private JFrame frame;
    private JTextField textFieldNum1;
    private JTextField textFieldNum2;
    private JTextField textFieldSuma;
    private JTextField textFieldResta;

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    CALCULADORA window = new CALCULADORA();
                    window.frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public CALCULADORA() {
        initialize();
    }

    private void initialize() {
        frame = new JFrame();
        frame.setBounds(100, 100, 368, 281);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setLayout(null);

        JLabel labelNum1 = new JLabel("Número 1:");
        labelNum1.setHorizontalAlignment(SwingConstants.CENTER);
        labelNum1.setFont(new Font("Tahoma", Font.PLAIN, 20));
        labelNum1.setBounds(10, 10, 117, 25);
        frame.getContentPane().add(labelNum1);

        textFieldNum1 = new JTextField();
        textFieldNum1.setHorizontalAlignment(SwingConstants.CENTER);
        textFieldNum1.setFont(new Font("Tahoma", Font.PLAIN, 20));
        textFieldNum1.setBounds(150, 10, 160, 25);
        frame.getContentPane().add(textFieldNum1);
        textFieldNum1.setColumns(10);

        JLabel labelNum2 = new JLabel("Número 2:");
        labelNum2.setHorizontalAlignment(SwingConstants.CENTER);
        labelNum2.setFont(new Font("Tahoma", Font.PLAIN, 20));
        labelNum2.setBounds(10, 50, 117, 25);
        frame.getContentPane().add(labelNum2);

        textFieldNum2 = new JTextField();
        textFieldNum2.setHorizontalAlignment(SwingConstants.CENTER);
        textFieldNum2.setFont(new Font("Tahoma", Font.PLAIN, 20));
        textFieldNum2.setBounds(150, 50, 160, 25);
        frame.getContentPane().add(textFieldNum2);
        textFieldNum2.setColumns(10);

        JLabel lblSuma = new JLabel("Suma:");
        lblSuma.setHorizontalAlignment(SwingConstants.CENTER);
        lblSuma.setFont(new Font("Tahoma", Font.PLAIN, 20));
        lblSuma.setBounds(10, 85, 117, 25);
        frame.getContentPane().add(lblSuma);

        textFieldSuma = new JTextField();
        textFieldSuma.setHorizontalAlignment(SwingConstants.CENTER);
        textFieldSuma.setFont(new Font("Tahoma", Font.PLAIN, 20));
        textFieldSuma.setColumns(10);
        textFieldSuma.setBounds(150, 85, 160, 25);
        textFieldSuma.setEditable(false); // Campo solo lectura
        frame.getContentPane().add(textFieldSuma);

        JLabel lblResta = new JLabel("Resta:");
        lblResta.setHorizontalAlignment(SwingConstants.CENTER);
        lblResta.setFont(new Font("Tahoma", Font.PLAIN, 20));
        lblResta.setBounds(10, 120, 117, 25);
        frame.getContentPane().add(lblResta);

        textFieldResta = new JTextField();
        textFieldResta.setHorizontalAlignment(SwingConstants.CENTER);
        textFieldResta.setFont(new Font("Tahoma", Font.PLAIN, 20));
        textFieldResta.setColumns(10);
        textFieldResta.setBounds(150, 120, 160, 25);
        textFieldResta.setEditable(false); // Campo solo lectura
        frame.getContentPane().add(textFieldResta);

        JButton btnCalcular = new JButton("Calcular");
        btnCalcular.setFont(new Font("Tahoma", Font.PLAIN, 20));
        btnCalcular.addActionListener(new ActionListener() {
            
        	public void actionPerformed(ActionEvent e) {
                try {
                    // Obtener valores de los campos de texto
                    double num1 = Double.parseDouble(textFieldNum1.getText());
                    double num2 = Double.parseDouble(textFieldNum2.getText());

                    // Realizar operaciones
                    double suma = num1 + num2;
                    double resta = num1 - num2;

                    // Mostrar resultados
                    textFieldSuma.setText(String.valueOf(suma));
                    textFieldResta.setText(String.valueOf(resta));
                } catch (NumberFormatException ex) {
                    // Manejar errores de entrada inválida
                    JOptionPane.showMessageDialog(frame, "Por favor, ingresa números válidos.", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });
        btnCalcular.setBounds(150, 179, 131, 25);
        frame.getContentPane().add(btnCalcular);
    }
}
