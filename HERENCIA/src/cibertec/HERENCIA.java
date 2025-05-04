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
import java.awt.Color;

public class HERENCIA extends JFrame {

	private JPanel contentPane;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	private JTextField textField;
	private JButton btnCALCULAR;
	private JButton btnBORRAR;
	private JLabel lblNewLabel_2;
	private JLabel lblNewLabel_3;
	private JLabel lblNewLabel_4;
	private JLabel lblNewLabel_5;
	private JLabel lblNewLabel_6;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					HERENCIA frame = new HERENCIA();
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
	public HERENCIA() {
		setTitle("HERENCIA GAMARRA VANESSA");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 578, 389);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lblNewLabel = new JLabel("CALCULAR HERENCIA");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel.setBounds(169, 75, 189, 27);
		contentPane.add(lblNewLabel);
		
		lblNewLabel_1 = new JLabel("DINERO OBTENIDO");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_1.setBounds(99, 156, 144, 27);
		contentPane.add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setBounds(64, 198, 189, 27);
		contentPane.add(textField);
		textField.setColumns(10);
		
		btnCALCULAR = new JButton("CALCULAR");
		btnCALCULAR.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnCALCULAR.setBounds(387, 133, 112, 38);
		contentPane.add(btnCALCULAR);
		
		btnBORRAR = new JButton("BORRAR");
		btnBORRAR.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnBORRAR.setBounds(387, 191, 112, 38);
		contentPane.add(btnBORRAR);
		
		lblNewLabel_2 = new JLabel("PRIMER HIJO");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_2.setBounds(21, 264, 87, 27);
		contentPane.add(lblNewLabel_2);
		
		lblNewLabel_3 = new JLabel("SEGUNDO HIJO");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_3.setBounds(116, 267, 96, 20);
		contentPane.add(lblNewLabel_3);
		
		lblNewLabel_4 = new JLabel("TERCER HIJO");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_4.setBounds(232, 269, 87, 16);
		contentPane.add(lblNewLabel_4);
		
		lblNewLabel_5 = new JLabel("CUARTO HIJO");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_5.setBounds(335, 269, 96, 16);
		contentPane.add(lblNewLabel_5);
		
		lblNewLabel_6 = new JLabel("QUINTO HIJO");
		lblNewLabel_6.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_6.setBounds(441, 267, 87, 20);
		contentPane.add(lblNewLabel_6);
		
		textField_1 = new JTextField();
		textField_1.setBounds(12, 301, 96, 27);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(116, 301, 96, 27);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(222, 301, 96, 27);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setBounds(327, 301, 96, 27);
		contentPane.add(textField_4);
		textField_4.setColumns(10);
		
		textField_5 = new JTextField();
		textField_5.setBounds(432, 301, 96, 27);
		contentPane.add(textField_5);
		textField_5.setColumns(10);
	}
}
