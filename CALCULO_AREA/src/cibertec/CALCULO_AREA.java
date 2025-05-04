package cibertec;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class CALCULO_AREA extends JFrame {

	private JPanel contentPane;
	private JButton btnNewButton;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	private JTextField textFBase;
	private JTextField textFAltura;
	private JScrollPane scrollPane;
	private JTextArea textArea;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CALCULO_AREA frame = new CALCULO_AREA();
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
	public CALCULO_AREA() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 532, 416);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		btnNewButton = new JButton("calcular");
		btnNewButton.setBounds(360, 74, 125, 28);
		contentPane.add(btnNewButton);
		
		lblNewLabel = new JLabel("BASE:");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel.setBounds(41, 56, 125, 28);
		contentPane.add(lblNewLabel);
		
		lblNewLabel_1 = new JLabel("ALTURA:");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_1.setBounds(41, 115, 140, 38);
		contentPane.add(lblNewLabel_1);
		
		textFBase = new JTextField();
		textFBase.setBounds(118, 60, 191, 26);
		contentPane.add(textFBase);
		textFBase.setColumns(10);
		
		textFAltura = new JTextField();
		textFAltura.setBounds(118, 127, 191, 28);
		contentPane.add(textFAltura);
		textFAltura.setColumns(10);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(56, 198, 426, 134);
		contentPane.add(scrollPane);
		
		textArea = new JTextArea();
		scrollPane.setViewportView(textArea);
	}

}
