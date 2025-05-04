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

public class BANCO extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JLabel lblNewLabel;
	private JTextField tfbilletes;
	private JButton btnprocesar;
	private JScrollPane scrollPane;
	private JTextArea textArea;
	private JLabel lblNewLabel_1;

	
	int CONTADOR_BILLETES=0 ;
	double ACUMULADOR_BILLETES=0.00 ;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BANCO frame = new BANCO();
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
	public BANCO() {
		setTitle("CONTADOR BILLETES VANESSA GAMARRA");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 553, 487);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lblNewLabel = new JLabel("BILLETES:");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel.setBounds(26, 131, 111, 27);
		contentPane.add(lblNewLabel);
		
		tfbilletes = new JTextField();
		tfbilletes.setBounds(147, 137, 170, 19);
		contentPane.add(tfbilletes);
		tfbilletes.setColumns(10);
		
		btnprocesar = new JButton("PROCESAR");
		btnprocesar.addActionListener(this);
		btnprocesar.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnprocesar.setBounds(368, 132, 132, 27);
		contentPane.add(btnprocesar);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(70, 201, 417, 201);
		contentPane.add(scrollPane);
		
		textArea = new JTextArea();
		scrollPane.setViewportView(textArea);
		
		lblNewLabel_1 = new JLabel("DEPOSITO DE DINERO");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_1.setBounds(155, 51, 248, 13);
		contentPane.add(lblNewLabel_1);
	}
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnprocesar) {
			actionPerformedBtnprocesar(e);
		}
	}
	protected void actionPerformedBtnprocesar(ActionEvent e) {
		//DECLARACION DE VARIABLES
		double BILLETE ;
		//ENTRADA DE DATOS 
		BILLETE=Double.parseDouble(tfbilletes.getText());
		
		CONTADOR_BILLETES++;
		
		ACUMULADOR_BILLETES+=BILLETE;
		
		textArea.setText("CONTADOR DE BILLETES:" +CONTADOR_BILLETES + "\n");
		textArea.append("MONTO ACUMULADO :" + ACUMULADOR_BILLETES + "\n");
	}
}
