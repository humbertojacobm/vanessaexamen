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

public class cadena_numeros3 extends JFrame {

	private JPanel contentPane;
	
int suma=0;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					cadena_numeros3 frame = new cadena_numeros3();
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
	public cadena_numeros3() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 552);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("SUMA DE 50 TERMINOS");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel.setBounds(134, 47, 186, 35);
		contentPane.add(lblNewLabel);
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(64, 161, 318, 306);
		contentPane.add(scrollPane);
		
		JTextArea textArea = new JTextArea();
		scrollPane.setViewportView(textArea);
		
		JButton btnprocesar = new JButton("PROCESAR");
		btnprocesar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int numero=5;
				
				for(int termino=1;termino<=50;termino++) {
					
					textArea.append(numero+"\n");
					
					suma+=numero;
					
					numero+=6;
					
					
				}
				
				textArea.append("SUMA TOTAL: " + suma);
				
			}
		});
		btnprocesar.setBounds(176, 93, 89, 23);
		contentPane.add(btnprocesar);
		
		
	}

}
