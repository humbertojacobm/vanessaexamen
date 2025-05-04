package cibertec;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JComboBox;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JTextPane;

public class Calculo_imc extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	private JButton btnProcesar;
	private JScrollPane scrollPane;
	private JTextField tFpeso;
	private JTextField tFaltura;
	private JTextPane textArea;
	
	//DECLARACION DE VARIABLES LOCALES
			double PESO=0.0 , ALTURA=0.0 , IMC=0.0 ;
			private JButton btnBorrar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculo_imc frame = new Calculo_imc();
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
	public Calculo_imc() {
		setTitle("CALCULO_IMC-GAMARRAVANESSA");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 466, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lblNewLabel = new JLabel("PESO:");
		lblNewLabel.setBounds(31, 42, 83, 19);
		contentPane.add(lblNewLabel);
		
		lblNewLabel_1 = new JLabel("ALTURA:");
		lblNewLabel_1.setBounds(31, 103, 83, 13);
		contentPane.add(lblNewLabel_1);
		
		btnProcesar = new JButton("Procesar");
		btnProcesar.addActionListener(this);
		btnProcesar.setBounds(285, 41, 83, 19);
		contentPane.add(btnProcesar);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(35, 139, 373, 103);
		contentPane.add(scrollPane);
		
		textArea = new JTextPane();
		scrollPane.setViewportView(textArea);
		
		tFpeso = new JTextField();
		tFpeso.setToolTipText("");
		tFpeso.setBounds(95, 42, 108, 19);
		contentPane.add(tFpeso);
		tFpeso.setColumns(10);
		
		tFaltura = new JTextField();
		tFaltura.setBounds(95, 100, 108, 16);
		contentPane.add(tFaltura);
		tFaltura.setColumns(10);
		
		btnBorrar = new JButton("Borrar");
		btnBorrar.setBounds(283, 86, 85, 19);
		contentPane.add(btnBorrar);
	}
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnProcesar) {
			actionPerformedBtnNewButton_2(e);
		}
	}
	protected void actionPerformedBtnNewButton_2(ActionEvent e) {
		
		Entrada_Datos();
		Proceso(PESO,ALTURA);
		Resultados();
		
}
	void Entrada_Datos() {
		
		//ENTRADA DE DATOS 
				PESO=Double.parseDouble(tFpeso.getText());
				
			    ALTURA=Double.parseDouble(tFaltura.getText());
	
	}

	void Proceso( double prm_peso,double prm_altura){
		
		//PROCESO DE CALCULO 
	    IMC=prm_peso/(prm_altura*prm_altura);
		
	}
	
	void Resultados() {
	 
		  //SALIDA DE RESULTADOS 
	    textArea.setText("IMC="+IMC);
	}
	
}		
	
