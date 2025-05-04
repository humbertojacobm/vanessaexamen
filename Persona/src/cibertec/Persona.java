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
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Persona extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;
	private JTextField tFNombres;
	private JTextField tFNacimiento;
	private JTextField tFPeso;
	private JButton btnprocesar;
	private JButton btnBorrar;
	private JScrollPane scrollPane;
	private JTextArea textArea;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Persona frame = new Persona();
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
	public Persona() {
		setTitle("PERSONA_GAMARRA VANESSA");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 547, 392);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lblNewLabel = new JLabel("Nombres y apellidos");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel.setBounds(10, 32, 126, 24);
		contentPane.add(lblNewLabel);
		
		lblNewLabel_1 = new JLabel("A\u00F1o de nacimiento");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_1.setBounds(10, 100, 126, 13);
		contentPane.add(lblNewLabel_1);
		
		lblNewLabel_2 = new JLabel("Peso en kilogramos");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_2.setBounds(10, 168, 126, 13);
		contentPane.add(lblNewLabel_2);
		
		tFNombres = new JTextField();
		tFNombres.setBounds(150, 36, 220, 19);
		contentPane.add(tFNombres);
		tFNombres.setColumns(10);
		
		tFNacimiento = new JTextField();
		tFNacimiento.setBounds(146, 98, 120, 19);
		contentPane.add(tFNacimiento);
		tFNacimiento.setColumns(10);
		
		tFPeso = new JTextField();
		tFPeso.setBounds(148, 166, 118, 19);
		contentPane.add(tFPeso);
		tFPeso.setColumns(10);
		
		btnprocesar = new JButton("procesar");
		btnprocesar.addActionListener(this);
		btnprocesar.setBounds(410, 35, 85, 21);
		contentPane.add(btnprocesar);
		
		btnBorrar = new JButton("Borrar");
		btnBorrar.addActionListener(this);
		btnBorrar.setBounds(410, 97, 85, 21);
		contentPane.add(btnBorrar);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(29, 208, 481, 125);
		contentPane.add(scrollPane);
		
		textArea = new JTextArea();
		scrollPane.setViewportView(textArea);
	}
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnBorrar) {
			actionPerformedBtnBorrar(e);
		}
		if (e.getSource() == btnprocesar) {
			actionPerformedBtnprocesar(e);
		}
	}
	protected void actionPerformedBtnprocesar(ActionEvent e) {
		
		//DECLARACION DE VARIABLES
		String Nombre_apellido;
		int Ano_Nacimiento;
		double peso;
		
		//ENTRADA DE DATOS
		Nombre_apellido=tFNombres.getText();
		
		Ano_Nacimiento=Integer.parseInt(tFNacimiento.getText());
		
		peso=Double.parseDouble(tFPeso.getText());
		
		//PROCESO DE CALCULO
		
		//MOSTRAR RESULTADOS
		textArea.setText("DATOS INGRESADOS"+"\n");
		textArea.append("Nombre y Apellidos:"+Nombre_apellido+"\n");
		textArea.append("Año de nacimiento:"+Ano_Nacimiento+"\n");
		textArea.append("Peso en kilogramos:"+peso);
		
		
		
		
	}
	protected void actionPerformedBtnBorrar(ActionEvent e) {
		tFNombres.setText("");
		tFNacimiento.setText("");
		tFPeso.setText("");
		textArea.setText("");
		
	}
}
