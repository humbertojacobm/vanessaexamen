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
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;



public class CADENA_NUMEROS extends JFrame {

	private JPanel contentPane;
int suma= 0 ;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CADENA_NUMEROS frame = new CADENA_NUMEROS();
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
	public CADENA_NUMEROS() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 517, 393);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("CADENA DE NUMEROS 1 AL 100");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel.setBounds(105, 23, 283, 29);
		contentPane.add(lblNewLabel);
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(48, 153, 412, 165);
		contentPane.add(scrollPane);
		
		JTextArea textArea = new JTextArea();
		scrollPane.setViewportView(textArea);
		
		JButton btnprocesar = new JButton("PROCESAR");
		btnprocesar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				//DECLARAR VARIABLE LOCAL
				int numero=1;
				
				//PROCESO
				
				
				while (numero<=100) {
					textArea.append(numero +"\n");
					numero++;
					suma+=numero;
					
				}
				
				textArea.append("SUMA TOTAL: "+suma +"\n");
				
				
				
			}
		});
		btnprocesar.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnprocesar.setBounds(169, 74, 128, 29);
		contentPane.add(btnprocesar);
		
		
	}
}
