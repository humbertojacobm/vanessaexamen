package cibertec;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class AREA_VOLUMEN_ESFERA extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JLabel lblNewLabel;
	private JScrollPane scrollPane;
	private JTextArea textArea;
	private JButton btnPROCESAR;
	private JTextField tFRadio;
	private JButton btnNewButton_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AREA_VOLUMEN_ESFERA frame = new AREA_VOLUMEN_ESFERA();
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
	public AREA_VOLUMEN_ESFERA() {
		setTitle("AREA Y VOLUMEN DE UNA ESFERA -GAMARRA");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 452, 310);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lblNewLabel = new JLabel("INGRESE RADIO :");
		lblNewLabel.setBounds(32, 39, 96, 30);
		contentPane.add(lblNewLabel);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(32, 135, 374, 118);
		contentPane.add(scrollPane);
		
		textArea = new JTextArea();
		scrollPane.setViewportView(textArea);
		
		btnPROCESAR = new JButton("PROCESAR");
		btnPROCESAR.addActionListener(this);
		btnPROCESAR.setBounds(301, 44, 105, 21);
		contentPane.add(btnPROCESAR);
		
		tFRadio = new JTextField();
		tFRadio.setBounds(138, 45, 111, 19);
		contentPane.add(tFRadio);
		tFRadio.setColumns(10);
		
		btnNewButton_1 = new JButton("BORRAR");
		btnNewButton_1.setBounds(301, 75, 105, 21);
		contentPane.add(btnNewButton_1);
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnPROCESAR) {
			actionPerformedBtnNewButton(e);
		}
	}
	protected void actionPerformedBtnNewButton(ActionEvent e) {
		
	//DECLARACION VARIABLES 
		double radio,area,volumen ;
		
	//PROCESO CALCULO 
		radio=Double.parseDouble(tFRadio.getText()) ;
		area=12.57*(radio*2);
		volumen=(12.57*(radio*3))/3;
		
	//SALIDA DE RESULTADO
		textArea.setText("RESULTADOS DE OPERACION"+ "\n"+"\n"+
	         "AREA DE LA ESFERA :" + area + " \n" +
			 "VOLUMEN DE LA ESFERA:" + volumen+ " \n " +
	         "RADIO INGRESADO : " + radio + "\n ") ;
		
	         
		
		 
		
		
		
	}
}
