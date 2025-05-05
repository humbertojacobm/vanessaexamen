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
import javax.swing.DefaultComboBoxModel;
import javax.swing.SwingConstants;

public class VENTA_POLOS extends JFrame {

	private JPanel contentPane;
	private JLabel lblNewLabel;
	private JLabel lblPrecio;
	private JLabel lblCantidad;
	private JButton btnagregar;
	private JButton btnCERRAR;
	private JTextField tfprecio;
	private JTextField tfcantidad;
	private JComboBox cbmodelo;
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
		lblPrecio.setBounds(64, 178, 161, 29);
		contentPane.add(lblPrecio);
		
		lblCantidad = new JLabel("CANTIDAD : ");
		lblCantidad.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblCantidad.setBounds(64, 218, 161, 29);
		contentPane.add(lblCantidad);
		
		btnagregar = new JButton("AGREGAR");
		btnagregar.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnagregar.setBounds(653, 139, 149, 29);
		contentPane.add(btnagregar);
		
		btnCERRAR = new JButton("CERRAR");
		btnCERRAR.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnCERRAR.setBounds(653, 218, 149, 29);
		contentPane.add(btnCERRAR);
		
		tfprecio = new JTextField();
		tfprecio.setEditable(false);
		tfprecio.setBounds(189, 179, 200, 28);
		contentPane.add(tfprecio);
		tfprecio.setColumns(10);
		
		tfcantidad = new JTextField();
		tfcantidad.setBounds(189, 220, 200, 29);
		contentPane.add(tfcantidad);
		tfcantidad.setColumns(10);
		
		cbmodelo = new JComboBox();
		cbmodelo.setModel(new DefaultComboBoxModel(new String[] {"NIKE ", "ADIDAS"}));
		cbmodelo.setBounds(189, 76, 200, 29);
		contentPane.add(cbmodelo);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(62, 289, 740, 175);
		contentPane.add(scrollPane);
		
		textArea = new JTextArea();
		scrollPane.setViewportView(textArea);
		
		JLabel lblNewLabel_1 = new JLabel("TALLA:");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_1.setBounds(64, 140, 83, 27);
		contentPane.add(lblNewLabel_1);
		
		JComboBox cbtalla = new JComboBox();
		cbtalla.setModel(new DefaultComboBoxModel(new String[] {"S", "M", "L", "XL"}));
		cbtalla.setBounds(189, 136, 200, 29);
		contentPane.add(cbtalla);
		
		JButton btnconsultar = new JButton("CONSULTAR");
		btnconsultar.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnconsultar.setBounds(653, 88, 149, 29);
		contentPane.add(btnconsultar);
		
		JButton btncalculartotal = new JButton("CALCULAR_TOTAL");
		btncalculartotal.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btncalculartotal.setBounds(653, 183, 149, 29);
		contentPane.add(btncalculartotal);
		
		JLabel lbltotal = new JLabel("TOTAL:");
		lbltotal.setFont(new Font("Tahoma", Font.BOLD, 15));
		lbltotal.setVerticalAlignment(SwingConstants.BOTTOM);
		lbltotal.setBounds(588, 475, 70, 25);
		contentPane.add(lbltotal);
		
		JLabel lblmostrartotal = new JLabel("New label");
		lblmostrartotal.setBounds(673, 475, 129, 28);
		contentPane.add(lblmostrartotal);
	}
}
