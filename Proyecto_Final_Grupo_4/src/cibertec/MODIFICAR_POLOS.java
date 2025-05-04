package cibertec;

import static cibertec.variables.Material_1;
import static cibertec.variables.Material_2;
import static cibertec.variables.Modelo1;
import static cibertec.variables.Modelo2;
import static cibertec.variables.Precio1_L;
import static cibertec.variables.Precio1_M;
import static cibertec.variables.Precio1_S;
import static cibertec.variables.Precio1_XL;
import static cibertec.variables.Precio2_L;
import static cibertec.variables.Precio2_M;
import static cibertec.variables.Precio2_S;
import static cibertec.variables.Precio2_XL;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import static cibertec.variables.*;

public class MODIFICAR_POLOS extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JLabel lblNewLabel;
	private JLabel lblTalla;
	private JLabel lblMaterial;
	private JLabel lblPrecio;
	private JComboBox cbmodelo;
	private JTextField tfmaterial;
	private JTextField tfprecio;
	private JButton btncerrar;
	private JButton btnGuardar;
	private JComboBox cbtalla;
	private JButton btconsultar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MODIFICAR_POLOS frame = new MODIFICAR_POLOS();
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
	public MODIFICAR_POLOS() {
		setTitle("MODIFICAR_POLO");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 605, 295);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lblNewLabel = new JLabel("MODELO :");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel.setBounds(42, 39, 154, 29);
		contentPane.add(lblNewLabel);
		
		lblTalla = new JLabel("TALLA :");
		lblTalla.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblTalla.setBounds(42, 100, 154, 29);
		contentPane.add(lblTalla);
		
		lblMaterial = new JLabel("MATERIAL :");
		lblMaterial.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblMaterial.setBounds(42, 154, 154, 29);
		contentPane.add(lblMaterial);
		
		lblPrecio = new JLabel("PRECIO :");
		lblPrecio.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblPrecio.setBounds(42, 210, 154, 29);
		contentPane.add(lblPrecio);
		
		cbmodelo = new JComboBox();
		cbmodelo.setModel(new DefaultComboBoxModel(new String[] {"NIKE ", "ADIDAS"}));
		cbmodelo.setBounds(148, 44, 253, 23);
		contentPane.add(cbmodelo);
		
		tfmaterial = new JTextField();
		tfmaterial.setColumns(10);
		tfmaterial.setBounds(148, 160, 256, 22);
		contentPane.add(tfmaterial);
		
		tfprecio = new JTextField();
		tfprecio.setColumns(10);
		tfprecio.setBounds(145, 216, 256, 22);
		contentPane.add(tfprecio);
		
		btncerrar = new JButton("CERRAR");
		btncerrar.setFont(new Font("Tahoma", Font.BOLD, 13));
		btncerrar.setBounds(455, 45, 114, 29);
		contentPane.add(btncerrar);
		
		btnGuardar = new JButton("GUARDAR");
		btnGuardar.addActionListener(this);
		btnGuardar.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnGuardar.setBounds(455, 165, 114, 29);
		contentPane.add(btnGuardar);
		
		cbtalla = new JComboBox();
		cbtalla.setModel(new DefaultComboBoxModel(new String[] {"S", "M", "L", "XL"}));
		cbtalla.setBounds(150, 106, 251, 23);
		contentPane.add(cbtalla);
		
		btconsultar = new JButton("CONSULTAR");
		btconsultar.addActionListener(this);
		btconsultar.setFont(new Font("Tahoma", Font.BOLD, 12));
		btconsultar.setBounds(455, 106, 114, 23);
		contentPane.add(btconsultar);
	}
	
	
	
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btconsultar) {
			actionPerformedBtnNewButton(e);
		}
		if (e.getSource() == btnGuardar) {
			actionPerformedBtnGuardar(e);
		}
	}
	protected void actionPerformedBtnGuardar(ActionEvent e) {
		
		String modelo, talla;
		modelo=cbmodelo.getSelectedItem().toString();
		talla=cbtalla.getSelectedItem().toString();
		
		if (modelo==Modelo1 && talla=="S")
			Precio1_S=Double.parseDouble(tfprecio.getText());
		

	}
	protected void actionPerformedBtnNewButton(ActionEvent e) 
		
		
		{
			String modelo, talla;
			modelo=cbmodelo.getSelectedItem().toString();
			talla=cbtalla.getSelectedItem().toString();
			
		if (modelo==Modelo1 && talla=="S")
			tfprecio.setText(String.valueOf(Precio1_S));
		else if (modelo==Modelo1 && talla=="M")
			tfprecio.setText(String.valueOf(Precio1_M));
		else if (modelo==Modelo1 && talla=="L")
			tfprecio.setText(String.valueOf(Precio1_L));
		else if (modelo==Modelo1 && talla=="XL")
			tfprecio.setText(String.valueOf(Precio1_XL));
		else if(modelo==Modelo2 && talla=="S")
			tfprecio.setText(String.valueOf(Precio2_S));
		else if(modelo==Modelo2 && talla=="M")
			tfprecio.setText(String.valueOf(Precio2_M));
		else if(modelo==Modelo2 && talla=="L")
			tfprecio.setText(String.valueOf(Precio2_L));
		else if(modelo==Modelo2 && talla=="XL")
			tfprecio.setText(String.valueOf(Precio2_XL));
		if (modelo==Modelo1)
			tfmaterial.setText(Material_1);
		else
			tfmaterial.setText(Material_2);
			
		}
	}
		
	
	

