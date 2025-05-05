package cibertec;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import static cibertec.variables.*;

public class CONFIGURAR_OBSEQUIOS_POLOS extends JFrame {

	private JPanel contentPane;
	private JButton btnconsultar;
	private JButton btnCancelar;
	private JLabel lblNewLabel;
	private JLabel lblA;
	private JLabel lblAMas;
	private JTextField tfobs1;
	private JTextField tfobs2;
	private JTextField tfobs3;
	private JButton btnGrabar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CONFIGURAR_OBSEQUIOS_POLOS frame = new CONFIGURAR_OBSEQUIOS_POLOS();
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
	public CONFIGURAR_OBSEQUIOS_POLOS() {
		setTitle("CONFIGURAR_OBSEQUIOS_POLOS");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 654, 215);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		btnconsultar = new JButton("CONSULTAR");
		btnconsultar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				tfobs1.setText(String.valueOf(Obs1));
				tfobs2.setText(String.valueOf(Obs2));
				tfobs3.setText(String.valueOf(Obs3));
			
			}
		});
		btnconsultar.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnconsultar.setBounds(482, 38, 127, 29);
		contentPane.add(btnconsultar);
		
		btnCancelar = new JButton("CANCELAR");
		btnCancelar.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnCancelar.setBounds(482, 121, 127, 29);
		contentPane.add(btnCancelar);
		
		lblNewLabel = new JLabel("1 UNIDAD :");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel.setBounds(31, 38, 137, 29);
		contentPane.add(lblNewLabel);
		
		lblA = new JLabel("2 A 5 UNIDADES :");
		lblA.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblA.setBounds(31, 82, 137, 29);
		contentPane.add(lblA);
		
		lblAMas = new JLabel("6 A MAS UNIDADES :");
		lblAMas.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblAMas.setBounds(31, 121, 161, 29);
		contentPane.add(lblAMas);
		
		tfobs1 = new JTextField();
		tfobs1.setBounds(193, 40, 236, 29);
		contentPane.add(tfobs1);
		tfobs1.setColumns(10);
		
		tfobs2 = new JTextField();
		tfobs2.setColumns(10);
		tfobs2.setBounds(193, 84, 236, 29);
		contentPane.add(tfobs2);
		
		tfobs3 = new JTextField();
		tfobs3.setColumns(10);
		tfobs3.setBounds(193, 123, 236, 29);
		contentPane.add(tfobs3);
		
		btnGrabar = new JButton("GRABAR");
		btnGrabar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Obs1=tfobs1.getText();
				Obs2=tfobs2.getText();
				Obs3=tfobs3.getText();
				
			}
		});
		btnGrabar.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnGrabar.setBounds(482, 81, 127, 29);
		contentPane.add(btnGrabar);
	}

}
