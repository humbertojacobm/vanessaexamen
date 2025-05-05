package cibertec;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class CADENA_NUMERO1 extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CADENA_NUMERO1 frame = new CADENA_NUMERO1();
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
	public CADENA_NUMERO1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 527, 496);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("CADENA DE NUMERO DEL 1 AL 100");
		lblNewLabel.setBounds(162, 38, 202, 39);
		contentPane.add(lblNewLabel);
		
		JButton btnagregar = new JButton("agregar");
		btnagregar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//DECLARAR VARIABLE LOCAL 
				int numero=1 ;
				
				//PROCESO
				
				
				
				
				
			}
		});
		btnagregar.setBounds(196, 88, 106, 23);
		contentPane.add(btnagregar);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(58, 188, 422, 243);
		contentPane.add(scrollPane);
		
		JTextArea textArea = new JTextArea();
		scrollPane.setViewportView(textArea);
	}

}
