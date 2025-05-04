package cibertec;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.DefaultComboBoxModel;

public class supermercado extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JLabel lblNewLabel;
	private JComboBox CBcodigo;
	private JLabel lblNewLabel_1;
	private JTextField txFcantidad;
	private JButton btnNew;
	private JScrollPane scrollPane;
	private JTextArea textArea;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					supermercado frame = new supermercado();
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
	public supermercado() {
		setTitle("SUPERMERCADO_GAMARRA VANESSA");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 543, 397);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lblNewLabel = new JLabel("Codigo Botella:");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel.setBounds(25, 66, 163, 35);
		contentPane.add(lblNewLabel);
		
		CBcodigo = new JComboBox();
		CBcodigo.setModel(new DefaultComboBoxModel(new String[] {"0", "1", "2", "3"}));
		CBcodigo.setBounds(147, 72, 149, 26);
		contentPane.add(CBcodigo);
		
		lblNewLabel_1 = new JLabel("Cantidad :");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_1.setBounds(36, 147, 101, 18);
		contentPane.add(lblNewLabel_1);
		
		txFcantidad = new JTextField();
		txFcantidad.setBounds(147, 146, 149, 26);
		contentPane.add(txFcantidad);
		txFcantidad.setColumns(10);
		
		btnNew = new JButton("PROCESAR");
		btnNew.addActionListener(this);
		btnNew.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnNew.setBounds(367, 78, 128, 26);
		contentPane.add(btnNew);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(49, 201, 456, 121);
		contentPane.add(scrollPane);
		
		textArea = new JTextArea();
		scrollPane.setViewportView(textArea);
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnNew) {
			actionPerformedBtnNew(e);
		}
	}
	protected void actionPerformedBtnNew(ActionEvent e) {
		
		//DECLARACION DE VARIABLES 
		double DSCT,PRECIO=0.0, IMPORCOMPRA=0.0, IMPORDSCT=0.0,IMPORPAGAR=0.0 ;
		String CODIGO ;
		int CANTIDAD ;
		
		

		//ENTRADA DE DATOS 
		
		CANTIDAD= Integer.parseInt(txFcantidad.getText());
		CODIGO = CBcodigo.getSelectedItem().toString();

		//PROCESO DE CALCULO 
		if (CODIGO == "0")
		     PRECIO=  6;
		 else if  (CODIGO=="1")
			   PRECIO =5.5;
		 else if (CODIGO=="2")
			     PRECIO=4.5;
		 else if (CODIGO== "3")
				     PRECIO=4.7 ;
					 
		IMPORCOMPRA =CANTIDAD*PRECIO ;
		if (CANTIDAD<4)
		    IMPORDSCT =IMPORCOMPRA* 0.05;
		    else if (CANTIDAD >= 4 && CANTIDAD<7)
			    IMPORDSCT =IMPORCOMPRA* 0.75;
			    else if (CANTIDAD >= 7&&CANTIDAD<10)
					    IMPORDSCT =IMPORCOMPRA* 0.10 ;
					    else if  (CANTIDAD>=10)
						   IMPORDSCT =IMPORCOMPRA* 0.125 ;
		
		IMPORPAGAR=IMPORCOMPRA	- IMPORDSCT;
		
		//SALIDA RESULTADO
		textArea.setText( "IMPORTE DE COMPRA " + IMPORCOMPRA +"\n");
		textArea.append( "IMPORTE DE DESCUENTO" + IMPORDSCT+"\n");
		textArea.append( "IMPORTE DE PAGO " + IMPORPAGAR ) ;
	}
}
