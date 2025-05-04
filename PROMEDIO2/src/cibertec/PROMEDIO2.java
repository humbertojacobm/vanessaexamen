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

public class PROMEDIO2 extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JLabel lblNewLabel;
	private JTextField tFpromedio;
	private JButton btnprocesar;
	private JScrollPane scrollPane;
	private JTextArea textArea;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PROMEDIO2 frame = new PROMEDIO2();
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
	public PROMEDIO2() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 585, 458);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lblNewLabel = new JLabel("PROMEDIO");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel.setBounds(48, 54, 116, 26);
		contentPane.add(lblNewLabel);
		
		tFpromedio = new JTextField();
		tFpromedio.setBounds(159, 60, 116, 20);
		contentPane.add(tFpromedio);
		tFpromedio.setColumns(10);
		
		btnprocesar = new JButton("PROCESAR");
		btnprocesar.addActionListener(this);
		btnprocesar.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnprocesar.setBounds(375, 59, 124, 26);
		contentPane.add(btnprocesar);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(73, 154, 426, 139);
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
		int PROMEDIO;
		String CATEGORIA;
		//ENTRADA DE DATOS
		CATEGORIA= "";
		PROMEDIO= Integer .parseInt( tFpromedio . getText()) ;
		//PROCESO 
		if (PROMEDIO>=17)
			CATEGORIA="A";
		else if (PROMEDIO>=14&& PROMEDIO<17)
			CATEGORIA="B";
		else if (PROMEDIO>=12 && PROMEDIO<14)
			CATEGORIA="C";
		else if (PROMEDIO<=12)
			CATEGORIA="D";
		//MOSTRAR RESULTADOS 
		textArea.setText("categoria:"+CATEGORIA); 
		
	}
}
