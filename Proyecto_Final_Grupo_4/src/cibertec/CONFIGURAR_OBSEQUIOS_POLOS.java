package cibertec;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class CONFIGURAR_OBSEQUIOS_POLOS extends JFrame {

	private JPanel contentPane;
	private JButton btnaceptar;
	private JButton btnCancelar;
	private JLabel lblNewLabel;
	private JLabel lblA;
	private JLabel lblAMas;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CONFIGURAR_OBSEQUIOS_POLOS frame = new CONFIGURAR_OBSEQUIOS_POLOS();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public CONFIGURAR_OBSEQUIOS_POLOS() {
		setTitle("CONFIGURAR_OBSEQUIOS_POLOS");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 654, 215);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		btnaceptar = new JButton("ACEPTAR");
		btnaceptar.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnaceptar.setBounds(482, 38, 127, 29);
		contentPane.add(btnaceptar);
		
		btnCancelar = new JButton("CANCELAR");
		btnCancelar.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnCancelar.setBounds(482, 77, 127, 29);
		contentPane.add(btnCancelar);
		
		lblNewLabel = new JLabel("1 UNIDAD :");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel.setBounds(31, 38, 137, 29);
		contentPane.add(lblNewLabel);
		
		lblA = new JLabel("2 A 5 UNIDADES :");
		lblA.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblA.setBounds(31, 82, 137, 29);
		contentPane.add(lblA);
		
		lblAMas = new JLabel("6 A MAS UNIDADES :");
		lblAMas.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblAMas.setBounds(31, 121, 161, 29);
		contentPane.add(lblAMas);
		
		textField = new JTextField();
		textField.setBounds(193, 40, 236, 29);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(193, 84, 236, 29);
		contentPane.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(193, 123, 236, 29);
		contentPane.add(textField_2);
	}

}
