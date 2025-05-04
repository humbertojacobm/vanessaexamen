package cibertec;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.DefaultComboBoxModel;

public class supermercado2 extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	private JButton btnprocesar;
	private JComboBox cbcodigo;
	private JTextField tFcantidad;
	private JScrollPane scrollPane;
	private JTextArea textArea;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					supermercado2 frame = new supermercado2();
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
	public supermercado2() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 673, 631);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lblNewLabel = new JLabel("Codigo de Botella:");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel.setBounds(58, 81, 193, 34);
		contentPane.add(lblNewLabel);
		
		lblNewLabel_1 = new JLabel("Cantidad:");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_1.setBounds(58, 152, 132, 28);
		contentPane.add(lblNewLabel_1);
		
		btnprocesar = new JButton("procesar");
		btnprocesar.addActionListener(this);
		btnprocesar.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnprocesar.setBounds(453, 81, 132, 34);
		contentPane.add(btnprocesar);
		
		cbcodigo = new JComboBox();
		cbcodigo.setModel(new DefaultComboBoxModel(new String[] {"0", "1", "2", "3"}));
		cbcodigo.setBounds(207, 81, 174, 28);
		contentPane.add(cbcodigo);
		
		tFcantidad = new JTextField();
		tFcantidad.setBounds(207, 159, 174, 34);
		contentPane.add(tFcantidad);
		tFcantidad.setColumns(10);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(68, 266, 546, 225);
		contentPane.add(scrollPane);
		
		textArea = new JTextArea();
		scrollPane.setViewportView(textArea);
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnprocesar) {
			actionPerformedBtnprocesar(e);
		}
	}
	protected void actionPerformedBtnprocesar(ActionEvent e) {
		

		//DECLARACION DE VARIABLES

		String CODIGO;

		double PRECIO= 0.0 ;
		double IMPORTE_COMPRA= 0.0 ;
		double IMPORTE_DESCUENTO= 0.0 ;
		double IMPORTE_PAGAR=0.0 ;
		int CANTIDAD ;

		//ENTRADA DE DATOS

		 CODIGO = cbcodigo.getSelectedItem().toString();
		 

		 CANTIDAD= Integer.parseInt(tFcantidad.getText());

		//PROCESO

		switch (CODIGO){

		case "0":

				PRECIO=6.0;

				break;

		case "1":

				PRECIO=5.5;

				break;

		case "2":

				PRECIO=4.5;

				break;

		case"3":

				PRECIO=4.7;

				break;

		}

		IMPORTE_COMPRA= PRECIO * CANTIDAD;



		if (CANTIDAD<4)

			IMPORTE_DESCUENTO=IMPORTE_COMPRA*0.05;

		else if (CANTIDAD>=4 && CANTIDAD<7)

				IMPORTE_DESCUENTO=IMPORTE_COMPRA*0.075;

		else if (CANTIDAD>=7 &&CANTIDAD<10)

					IMPORTE_DESCUENTO=IMPORTE_COMPRA*0.10;

		else if (CANTIDAD>=10)

							IMPORTE_DESCUENTO=IMPORTE_COMPRA*0.125;



		IMPORTE_PAGAR=IMPORTE_COMPRA- IMPORTE_DESCUENTO ;

		//MOSTRAR 

		textArea.setText("IMPORTE COMPRA:"+ IMPORTE_COMPRA + "\n");

		textArea.append("IMPORTE DESCUENTO:"+ IMPORTE_DESCUENTO + "\n"); 
		textArea.append("IMPORTE PAGAR :"+ IMPORTE_PAGAR + "\n");

		
	}
}
