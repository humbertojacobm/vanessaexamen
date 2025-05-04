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

public class AREA_TRIANGULO extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	private JTextField tFBASE;
	private JTextField tFALTURA;
	private JButton btnCALCULAR;
	private JScrollPane scrollPane;
	private JTextArea textArea;
	private JLabel lblNewLabel_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AREA_TRIANGULO frame = new AREA_TRIANGULO();
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
	public AREA_TRIANGULO() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 507, 462);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lblNewLabel = new JLabel("BASE:");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel.setBounds(30, 63, 102, 25);
		contentPane.add(lblNewLabel);
		
		lblNewLabel_1 = new JLabel("ALTURA:");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_1.setBounds(30, 133, 109, 25);
		contentPane.add(lblNewLabel_1);
		
		tFBASE = new JTextField();
		tFBASE.setBounds(100, 68, 144, 25);
		contentPane.add(tFBASE);
		tFBASE.setColumns(10);
		
		tFALTURA = new JTextField();
		tFALTURA.setBounds(100, 138, 144, 25);
		contentPane.add(tFALTURA);
		tFALTURA.setColumns(10);
		
		btnCALCULAR = new JButton("CALCULAR");
		btnCALCULAR.addActionListener(this);
		btnCALCULAR.setBounds(320, 102, 123, 31);
		contentPane.add(btnCALCULAR);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(35, 216, 431, 181);
		contentPane.add(scrollPane);
		
		textArea = new JTextArea();
		scrollPane.setViewportView(textArea);
		
		lblNewLabel_2 = new JLabel("AREA DEL TRIANGULO");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_2.setBounds(144, 10, 272, 25);
		contentPane.add(lblNewLabel_2);
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnCALCULAR) {
			actionPerformedBtnCALCULAR(e);
		}
	}
	protected void actionPerformedBtnCALCULAR(ActionEvent e) {
		
		//DECLARACION DE VARIABLES LOCALES
		double BASE, ALTURA, AREA ;
		//ENTRADA DE DATOS
		BASE= obtener_Base();
		ALTURA= obtener_Altura() ;
		AREA= obtener_Area(BASE, ALTURA);
		resultados(AREA);
	}
	double obtener_Base() {
		return Double.parseDouble(tFBASE.getText()); 
	}
	
	double obtener_Altura() {
		return Double.parseDouble(tFALTURA.getText()); 
		
	}
	
	double obtener_Area(double prm_base, double prm_altura) {
		return (prm_base*prm_altura)/2; 
	}
	void resultados(double prm_area) {
		textArea.setText("AREA:"+ prm_area);
	}
	
}
