package cibertec;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class PRESTAMO_2 extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JLabel lblNewLabel;
	private JButton btnNewButton;
	private JScrollPane scrollPane;
	private JTextArea textArea;
	private JTextField tFprestamo;
	int num_cuotas ;
	double INTERES_MENSUAL ;
	double CUOTA_MENSUAL ;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PRESTAMO_2 frame = new PRESTAMO_2();
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
	public PRESTAMO_2() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 487, 314);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lblNewLabel = new JLabel("MONTO PRESTAMO:");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel.setBounds(31, 45, 143, 31);
		contentPane.add(lblNewLabel);
		
		btnNewButton = new JButton("PROCESAR");
		btnNewButton.addActionListener(this);
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton.setBounds(327, 45, 99, 31);
		contentPane.add(btnNewButton);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(43, 134, 383, 119);
		contentPane.add(scrollPane);
		
		textArea = new JTextArea();
		scrollPane.setViewportView(textArea);
		
		tFprestamo = new JTextField();
		tFprestamo.setBounds(160, 45, 129, 31);
		contentPane.add(tFprestamo);
		tFprestamo.setColumns(10);
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnNewButton) {
			actionPerformedBtnNewButton(e);
		}
	}
	protected void actionPerformedBtnNewButton(ActionEvent e) {
		
		//DECLARAR VARIABLE LOCAL
		double prestamo ;
		
		//ENTRADA DE DATOS
		prestamo=Double.parseDouble(tFprestamo.getText());
	    calcular_cuotas(prestamo);
	    calcular_interes_mensual (prestamo);
	    calcular_cuota_mensual(prestamo, num_cuotas,INTERES_MENSUAL);
	    resultados();
	}
	
	void calcular_cuotas(double prm_monto) {
		if (prm_monto<=5000)
			num_cuotas=2;
		else if (prm_monto>5000 && prm_monto <=10000)
		    num_cuotas=4 ;
		else if (prm_monto>10000 && prm_monto <=15000)
		    num_cuotas=6 ;
		else
			num_cuotas=10 ;
	}
	
	void calcular_interes_mensual(double prm_monto) {
		if (prm_monto>=10000)
			INTERES_MENSUAL =0.03*prm_monto;
		else 
			INTERES_MENSUAL =0.05*prm_monto;
		}
	
	void calcular_cuota_mensual(double prm_monto , int prm_cuotas, double prm_interes) {
		
		CUOTA_MENSUAL = (prm_monto/prm_cuotas)+ prm_interes;
		
	}
	void resultados() {
		textArea.setText("CUOTA MENSUAL : "+ CUOTA_MENSUAL+ "\n");
		textArea.append ("INTERES MENSUAL : "+ INTERES_MENSUAL + "\n");
		textArea.append ("CUOTAs : "+ num_cuotas + "\n");
	}
}


