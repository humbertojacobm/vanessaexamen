package cibertec;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class LISTADO_POLOS extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JScrollPane scrollPane;
	private JTextArea textArea;
	private JButton btnNewButton;
	private JButton btnNewButton_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LISTADO_POLOS frame = new LISTADO_POLOS();
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
	public LISTADO_POLOS() {
		setTitle("LISTADO DE POLOS");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 577, 381);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(45, 36, 486, 240);
		contentPane.add(scrollPane);
		
		textArea = new JTextArea();
		scrollPane.setViewportView(textArea);
		
		btnNewButton = new JButton("CERRAR");
		btnNewButton.addActionListener(this);
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnNewButton.setBounds(137, 302, 125, 32);
		contentPane.add(btnNewButton);
		
		btnNewButton_1 = new JButton("LISTAR");
		btnNewButton_1.addActionListener(this);
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnNewButton_1.setBounds(292, 302, 125, 32);
		contentPane.add(btnNewButton_1);
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnNewButton) {
			actionPerformedBtnNewButton(e);
		}
		if (e.getSource() == btnNewButton_1) {
			actionPerformedBtnNewButton_1(e);
		}
	}
	protected void actionPerformedBtnNewButton_1(ActionEvent e) {
		//Displaying polo information
		textArea.setText(""); 
		
		textArea.append("LISTA DE PRENDAS\n");
		textArea.append("-----------------------------\n");
		
		// Polo 1
		textArea.append("MODELO: " + variables.Modelo1 + "\n");
		textArea.append("TALLA: S\n");
		textArea.append("MATERIAL: " + variables.Material_1 + "\n");
		textArea.append("PRECIO: S/. " + variables.Precio1_S + "\n");
		textArea.append("-----------------------------\n");
		
		// Polo 1 - Size M
		textArea.append("MODELO: " + variables.Modelo1 + "\n");
		textArea.append("TALLA: M\n");
		textArea.append("MATERIAL: " + variables.Material_1 + "\n");
		textArea.append("PRECIO: S/. " + variables.Precio1_M + "\n");
		textArea.append("-----------------------------\n");
		
		// Polo 1 - Size L
		textArea.append("MODELO: " + variables.Modelo1 + "\n");
		textArea.append("TALLA: L\n");
		textArea.append("MATERIAL: " + variables.Material_1 + "\n");
		textArea.append("PRECIO: S/. " + variables.Precio1_L + "\n");
		textArea.append("-----------------------------\n");
		
		// Polo 1 - Size XL
		textArea.append("MODELO: " + variables.Modelo1 + "\n");
		textArea.append("TALLA: XL\n");
		textArea.append("MATERIAL: " + variables.Material_1 + "\n");
		textArea.append("PRECIO: S/. " + variables.Precio1_XL + "\n");
		textArea.append("-----------------------------\n");
		
		// Polo 2
		textArea.append("MODELO: " + variables.Modelo2 + "\n");
		textArea.append("TALLA: S\n");
		textArea.append("MATERIAL: " + variables.Material_2 + "\n");
		textArea.append("PRECIO: S/. " + variables.Precio2_S + "\n");
		textArea.append("-----------------------------\n");
		
		// Polo 2 - Size M
		textArea.append("MODELO: " + variables.Modelo2 + "\n");
		textArea.append("TALLA: M\n");
		textArea.append("MATERIAL: " + variables.Material_2 + "\n");
		textArea.append("PRECIO: S/. " + variables.Precio2_M + "\n");
		textArea.append("-----------------------------\n");
		
		// Polo 2 - Size L
		textArea.append("MODELO: " + variables.Modelo2 + "\n");
		textArea.append("TALLA: L\n");
		textArea.append("MATERIAL: " + variables.Material_2 + "\n");
		textArea.append("PRECIO: S/. " + variables.Precio2_L + "\n");
		textArea.append("-----------------------------\n");
		
		// Polo 2 - Size XL
		textArea.append("MODELO: " + variables.Modelo2 + "\n");
		textArea.append("TALLA: XL\n");
		textArea.append("MATERIAL: " + variables.Material_2 + "\n");
		textArea.append("PRECIO: S/. " + variables.Precio2_XL + "\n");
	}
	protected void actionPerformedBtnNewButton(ActionEvent e) {
		this.dispose();
	}
}
