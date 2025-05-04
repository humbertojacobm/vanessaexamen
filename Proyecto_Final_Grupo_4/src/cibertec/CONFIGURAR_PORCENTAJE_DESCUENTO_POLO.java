package cibertec;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;

public class CONFIGURAR_PORCENTAJE_DESCUENTO_POLO extends JFrame {

	private JPanel contentPane;
	private JLabel lblNewLabel;
	private JLabel lblA;
	private JLabel lblNewLabel_2;
	private JLabel lblNewLabel_3;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_4;
	private JLabel lblNewLabel_5;
	private JLabel lblNewLabel_6;
	private JButton btnaceptar;
	private JButton btnCancelar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CONFIGURAR_PORCENTAJE_DESCUENTO_POLO frame = new CONFIGURAR_PORCENTAJE_DESCUENTO_POLO();
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
	public CONFIGURAR_PORCENTAJE_DESCUENTO_POLO() {
		setTitle("CONFIGURAR_PORCENTAJES_DE_DESCUENTO_POLO");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 653, 286);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lblNewLabel = new JLabel("1 A 5 UNIDADES :");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel.setBounds(35, 51, 173, 29);
		contentPane.add(lblNewLabel);
		
		lblA = new JLabel("6 A 10 UNIDADES :");
		lblA.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblA.setBounds(35, 100, 173, 29);
		contentPane.add(lblA);
		
		lblNewLabel_2 = new JLabel("11 A 15 UNIDADES :");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_2.setBounds(35, 142, 173, 29);
		contentPane.add(lblNewLabel_2);
		
		lblNewLabel_3 = new JLabel("MAS DE 15 UNIDADES :");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_3.setBounds(35, 194, 192, 29);
		contentPane.add(lblNewLabel_3);
		
		textField = new JTextField();
		textField.setBounds(236, 53, 148, 29);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(236, 100, 148, 29);
		contentPane.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(236, 149, 148, 29);
		contentPane.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(236, 194, 148, 29);
		contentPane.add(textField_3);
		
		lblNewLabel_1 = new JLabel("%");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_1.setBounds(394, 56, 45, 19);
		contentPane.add(lblNewLabel_1);
		
		lblNewLabel_4 = new JLabel("%");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_4.setBounds(394, 110, 45, 19);
		contentPane.add(lblNewLabel_4);
		
		lblNewLabel_5 = new JLabel("%");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_5.setBounds(394, 157, 45, 19);
		contentPane.add(lblNewLabel_5);
		
		lblNewLabel_6 = new JLabel("%");
		lblNewLabel_6.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_6.setBounds(394, 204, 45, 19);
		contentPane.add(lblNewLabel_6);
		
		btnaceptar = new JButton("ACEPTAR");
		btnaceptar.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnaceptar.setBounds(465, 57, 148, 29);
		contentPane.add(btnaceptar);
		
		btnCancelar = new JButton("CANCELAR");
		btnCancelar.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnCancelar.setBounds(465, 106, 148, 29);
		contentPane.add(btnCancelar);
	}

}
