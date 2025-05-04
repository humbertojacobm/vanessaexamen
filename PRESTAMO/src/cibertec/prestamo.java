package cibertec;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class prestamo extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JTextField tFprestamo;
	private JLabel lblNewLabel;
	private JButton btnNewButton;
	private JScrollPane scrollPane;
	private JTextArea textArea;

	//DECLARACIÓN DE VARIABLES GLOBALES

	double MONTO_PRESTAMO=0.0 , MONTO_CUOTA_MENSUAL= 0.0 , MONTO_INTERES_MENSUAL= 0.0 ;

	double MONTO_INTERES_TOTAL=0.0 ;

	int NUMERO_CUOTAS=0 ;
	
	
	
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					prestamo frame = new prestamo();
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
	public prestamo() {
		setTitle("PRESTAMO-VANESSA GAMARRA");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 576, 454);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		tFprestamo = new JTextField();
		tFprestamo.setBounds(169, 49, 190, 26);
		contentPane.add(tFprestamo);
		tFprestamo.setColumns(10);
		
		lblNewLabel = new JLabel("MONTO DE PRESTAMO:");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel.setBounds(10, 49, 174, 28);
		contentPane.add(lblNewLabel);
		
		btnNewButton = new JButton("PROCESAR");
		btnNewButton.addActionListener(this);
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnNewButton.setBounds(401, 55, 113, 20);
		contentPane.add(btnNewButton);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(60, 180, 431, 158);
		contentPane.add(scrollPane);
		
		textArea = new JTextArea();
		scrollPane.setViewportView(textArea);
	}
	
	void entrada_datos() {
		
		//ENTRADA DE DATOS

		 MONTO_PRESTAMO=Double.parseDouble(tFprestamo.getText()); 
		
	}	
	
	void Obtener_cuotas() {
		
		//OBTENIENDO EL NUMERO DE CUOTAS A PAGAR

		if (MONTO_PRESTAMO<=5000)

			NUMERO_CUOTAS=2;

		else if (MONTO_PRESTAMO>5000 && MONTO_PRESTAMO<=10000)

				NUMERO_CUOTAS=4;

		else if (MONTO_PRESTAMO>10000 && MONTO_PRESTAMO<=15000)

					NUMERO_CUOTAS=6;

		else if  (MONTO_PRESTAMO>15000)

						NUMERO_CUOTAS=10;
	}
	
	void obtener_interes_mensual () {
		
		//OBTENIENDO EL MONTO DE INTERES MENSUAL
		if (MONTO_PRESTAMO>10000)

		MONTO_INTERES_MENSUAL=0.03*MONTO_PRESTAMO;

		else

		MONTO_INTERES_MENSUAL=0.05*MONTO_PRESTAMO;
		
	}
	 
	void obtener_cuota_mensual() {
		
		//OBTENIENDO EL MONTO DE LA CUOTA MENSUAL
		MONTO_CUOTA_MENSUAL=MONTO_PRESTAMO/NUMERO_CUOTAS + MONTO_INTERES_MENSUAL;
	}
	
	void obtener_monto_interes_total () {
		
		//OBTENIENDO EL MONTO DEL INTERES TOTAL
		if (MONTO_PRESTAMO>10000)

		MONTO_INTERES_TOTAL=0.03*MONTO_PRESTAMO*NUMERO_CUOTAS;

		else 

		MONTO_INTERES_TOTAL=0.05*MONTO_PRESTAMO*NUMERO_CUOTAS;

	}
	
	void resultados() {
		//MOSTRAR RESULTADOS
		
		textArea.setText("numero de cuotas:"+ NUMERO_CUOTAS + "\n");

		textArea.append("numero de cuota mensual:"+ MONTO_CUOTA_MENSUAL + "\n");

		textArea.append("numero de interes total :"+ MONTO_INTERES_TOTAL + "\n") ;

		
	}
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnNewButton) {
			actionPerformedBtnNewButton(e);
		}
	}
	protected void actionPerformedBtnNewButton(ActionEvent e) {
		
		entrada_datos();
		Obtener_cuotas();
		obtener_interes_mensual();
		obtener_cuota_mensual();
		obtener_monto_interes_total ();
		resultados();
	}
}


