package cibertec;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class VENTA_POLOS extends JFrame {

	private JPanel contentPane;
	private JLabel lblNewLabel;
	private JLabel lblPrecio;
	private JLabel lblCantidad;
	private JButton btnVENDER;
	private JButton btnCERRAR;
	private JTextField textField;
	private JTextField textField_1;
	private JComboBox comboBox;
	private JScrollPane scrollPane;
	private JTextArea textArea;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VENTA_POLOS frame = new VENTA_POLOS();
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
	public VENTA_POLOS() {
		setTitle("VENDER_POLO");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 890, 548);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lblNewLabel = new JLabel("MODELO : ");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel.setBounds(64, 76, 161, 29);
		contentPane.add(lblNewLabel);
		
		lblPrecio = new JLabel("PRECIO :");
		lblPrecio.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblPrecio.setBounds(64, 126, 161, 29);
		contentPane.add(lblPrecio);
		
		lblCantidad = new JLabel("CANTIDAD : ");
		lblCantidad.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblCantidad.setBounds(64, 178, 161, 29);
		contentPane.add(lblCantidad);
		
		btnVENDER = new JButton("VENDER");
		btnVENDER.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnVENDER.setBounds(653, 92, 149, 29);
		contentPane.add(btnVENDER);
		
		btnCERRAR = new JButton("CERRAR");
		btnCERRAR.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnCERRAR.setBounds(653, 131, 149, 29);
		contentPane.add(btnCERRAR);
		
		textField = new JTextField();
		textField.setEditable(false);
		textField.setBounds(189, 126, 200, 28);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(189, 175, 200, 29);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		comboBox = new JComboBox();
		comboBox.setBounds(189, 76, 200, 29);
		contentPane.add(comboBox);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(62, 289, 740, 175);
		contentPane.add(scrollPane);
		
		textArea = new JTextArea();
		scrollPane.setViewportView(textArea);
	}

}
