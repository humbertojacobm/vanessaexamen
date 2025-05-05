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
import static cibertec.variables.Des1;
import static cibertec.variables.Des2;
import static cibertec.variables.Des3;
import static cibertec.variables.Des4;
import static cibertec.variables.Obs1;
import static cibertec.variables.Obs2;
import static cibertec.variables.Obs3;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.DefaultComboBoxModel;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;
import java.awt.event.ActionEvent;

public class VENTA_POLOS extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JLabel lblNewLabel;
	private JLabel lblPrecio;
	private JLabel lblCantidad;
	private JButton btnSell;
	private JButton btnCERRAR;
	private JTextField lblPrecioDisplay;
	private JTextField tfcantidad;
	private JComboBox cbmodelo;
	private JComboBox cbtalla;
	private JScrollPane scrollPane;
	private JTextArea txtVentaReporte;
	private JLabel lblMateriallabel;
	private JTextField lblMaterialDisplay;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VENTA_POLOS frame = new VENTA_POLOS();
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
	public VENTA_POLOS() {
		setTitle("VENDER_POLO");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 890, 589);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lblNewLabel = new JLabel("MODELO : ");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel.setBounds(64, 22, 161, 29);
		contentPane.add(lblNewLabel);
		
		lblPrecio = new JLabel("PRECIO :");
		lblPrecio.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblPrecio.setBounds(64, 155, 161, 29);
		contentPane.add(lblPrecio);
		
		lblCantidad = new JLabel("CANTIDAD : ");
		lblCantidad.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblCantidad.setBounds(64, 195, 161, 29);
		contentPane.add(lblCantidad);
		
		btnSell = new JButton("VENDER");
		btnSell.addActionListener(this);
		btnSell.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnSell.setBounds(653, 22, 149, 29);
		contentPane.add(btnSell);
		
		btnCERRAR = new JButton("CERRAR");
		btnCERRAR.addActionListener(this);
		btnCERRAR.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnCERRAR.setBounds(653, 63, 149, 29);
		contentPane.add(btnCERRAR);
		
		lblPrecioDisplay = new JTextField();
		lblPrecioDisplay.setEditable(false);
		lblPrecioDisplay.setBounds(189, 156, 200, 28);
		contentPane.add(lblPrecioDisplay);
		lblPrecioDisplay.setColumns(10);
		
		tfcantidad = new JTextField();
		tfcantidad.setBounds(189, 195, 200, 29);
		contentPane.add(tfcantidad);
		tfcantidad.setColumns(10);
		
		cbmodelo = new JComboBox();
		cbmodelo.setModel(new DefaultComboBoxModel(new String[] {"NIKE", "ADIDAS"}));
		cbmodelo.setBounds(189, 22, 200, 29);
		cbmodelo.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				modeloItemStateChanged(e);
			}
		});
		contentPane.add(cbmodelo);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(62, 235, 740, 288);
		contentPane.add(scrollPane);
		
		txtVentaReporte = new JTextArea();
		scrollPane.setViewportView(txtVentaReporte);
		
		JLabel lblNewLabel_1 = new JLabel("TALLA:");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_1.setBounds(64, 64, 83, 27);
		contentPane.add(lblNewLabel_1);
		
		cbtalla = new JComboBox();
		cbtalla.setModel(new DefaultComboBoxModel(new String[] {"S", "M", "L", "XL"}));
		cbtalla.setBounds(189, 62, 200, 29);
		cbtalla.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				tallaItemStateChanged(e);
			}
		});
		contentPane.add(cbtalla);
		
		lblMateriallabel = new JLabel("MATERIAL:");
		lblMateriallabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblMateriallabel.setBounds(64, 103, 161, 29);
		contentPane.add(lblMateriallabel);
		
		lblMaterialDisplay = new JTextField();
		lblMaterialDisplay.setEditable(false);
		lblMaterialDisplay.setColumns(10);
		lblMaterialDisplay.setBounds(189, 104, 200, 28);
		contentPane.add(lblMaterialDisplay);
		this.refreshPriceAndMaterial();
	}

	protected void modeloItemStateChanged(ItemEvent e) {
		if (e.getStateChange() == ItemEvent.SELECTED) {
			refreshPriceAndMaterial();
		}
	}
	
	protected void tallaItemStateChanged(ItemEvent e) {
		if (e.getStateChange() == ItemEvent.SELECTED) {
			refreshPriceAndMaterial();
		}
	}
	
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnCERRAR) {
			actionPerformedBtnCERRAR(e);
		}
		if (e.getSource() == btnSell) {
			actionPerformedBtnagregar(e);
		}
	}
	protected void actionPerformedBtnagregar(ActionEvent e) {
		
		
		double precioDelProceso= Double.parseDouble(lblPrecioDisplay.getText());
		int cantidadDelProceso= Integer.parseInt(this.tfcantidad.getText());
		double importeCompra = precioDelProceso*cantidadDelProceso;
		double importDescuento = 0;
		double descuento = 0;
		double importePagar = 0;
		String obsequio = "";
		
		if(cantidadDelProceso>=1 && cantidadDelProceso<=5) {
			descuento=Des1*0.01;
		}else if(cantidadDelProceso>=6 && cantidadDelProceso<=10) {
			descuento=Des2*0.01;
		}else if(cantidadDelProceso>=11 && cantidadDelProceso<=15) {
			descuento=Des3*0.01;
		}else {
			descuento=Des4*0.01;
		}
		
		importDescuento = importeCompra * descuento;
		
		importePagar = importeCompra - importDescuento;
		
		if(cantidadDelProceso==1) {
			obsequio = Obs1;
		}else if(cantidadDelProceso>1 && cantidadDelProceso<=5) {
			obsequio = Obs2;
		}else if(cantidadDelProceso>=6) {
			obsequio = Obs3;
		}
		
		txtVentaReporte.setText(""); 
		
		txtVentaReporte.append("BOLETA DE VENTA\n");
		txtVentaReporte.append("-----------------------------\n");
		
		txtVentaReporte.append("MODELO: " + cbmodelo.getSelectedItem().toString() + "\n");
		txtVentaReporte.append("TALLA: "+ cbtalla.getSelectedItem().toString() +"\n");
		txtVentaReporte.append("MATERIAL: " + lblMaterialDisplay.getText() + "\n");
		txtVentaReporte.append("PRECIO: S/. " + cantidadDelProceso + "\n");
		txtVentaReporte.append("CANTIDAD: S/. " + precioDelProceso + "\n");
		txtVentaReporte.append("IMPORTE COMPRA: S/. " + importeCompra + "\n");
		txtVentaReporte.append("IMPORTE DESCUENTO: S/. " + importDescuento + "\n");
		txtVentaReporte.append("IMPORTE A PAGAR: S/. " + importePagar + "\n");
		txtVentaReporte.append("OBSEQUIO: " + obsequio + "\n");
		txtVentaReporte.append("-----------------------------\n");
		
	}
	protected void actionPerformedBtnCERRAR(ActionEvent e) {
		this.dispose();
	}
	
	private void updatePriceAndMaterial(String modelo, String talla) {
		if (modelo==Modelo1 && talla=="S")
			lblPrecioDisplay.setText(String.valueOf(Precio1_S));
		else if (modelo==Modelo1 && talla=="M")
			lblPrecioDisplay.setText(String.valueOf(Precio1_M));
		else if (modelo==Modelo1 && talla=="L")
			lblPrecioDisplay.setText(String.valueOf(Precio1_L));
		else if (modelo==Modelo1 && talla=="XL")
			lblPrecioDisplay.setText(String.valueOf(Precio1_XL));
		else if(modelo==Modelo2 && talla=="S")
			lblPrecioDisplay.setText(String.valueOf(Precio2_S));
		else if(modelo==Modelo2 && talla=="M")
			lblPrecioDisplay.setText(String.valueOf(Precio2_M));
		else if(modelo==Modelo2 && talla=="L")
			lblPrecioDisplay.setText(String.valueOf(Precio2_L));
		else if(modelo==Modelo2 && talla=="XL")
			lblPrecioDisplay.setText(String.valueOf(Precio2_XL));
		
		if (modelo==Modelo1)
			this.lblMaterialDisplay.setText(Material_1);
		else
			this.lblMaterialDisplay.setText(Material_2);
	}

	private void refreshPriceAndMaterial() {
		String modelo = cbmodelo.getSelectedItem().toString();
		String talla = cbtalla.getSelectedItem().toString();
		updatePriceAndMaterial(modelo, talla);
	}
}
