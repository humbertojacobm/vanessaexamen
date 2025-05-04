package cibertec;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class PROMEDIO_FINAL extends JFrame {

	private JPanel contentPane;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;
	private JLabel lblNewLabel_3;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JButton btnNewButton;
	private JScrollPane scrollPane;
	private JTextArea textArea;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PROMEDIO_FINAL frame = new PROMEDIO_FINAL();
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
	public PROMEDIO_FINAL() {
		setTitle("PROMEDIO FINAL-GAMARRA VANESSA");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 718, 636);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lblNewLabel = new JLabel("Evaluacion 1:");
		lblNewLabel.setBounds(10, 36, 96, 55);
		contentPane.add(lblNewLabel);
		
		lblNewLabel_1 = new JLabel("Evaluacion 2:");
		lblNewLabel_1.setBounds(10, 101, 107, 47);
		contentPane.add(lblNewLabel_1);
		
		lblNewLabel_2 = new JLabel("Evaluacion final:");
		lblNewLabel_2.setBounds(10, 173, 90, 39);
		contentPane.add(lblNewLabel_2);
		
		lblNewLabel_3 = new JLabel("PROMEDIO FINAL DEL CURSO");
		lblNewLabel_3.setBounds(227, 10, 228, 31);
		contentPane.add(lblNewLabel_3);
		
		textField = new JTextField();
		textField.setBounds(150, 54, 96, 19);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(150, 115, 96, 19);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(150, 183, 96, 19);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		btnNewButton = new JButton("Procesar");
		btnNewButton.setBounds(401, 53, 107, 19);
		contentPane.add(btnNewButton);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(53, 260, 619, 216);
		contentPane.add(scrollPane);
		
		textArea = new JTextArea();
		scrollPane.setViewportView(textArea);
	}
}
