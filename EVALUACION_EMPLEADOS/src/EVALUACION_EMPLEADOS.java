import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class EVALUACION_EMPLEADOS extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	private JButton btncalcular;
	private JTextField textField;
	private JTextField textField_1;
	private JScrollPane scrollPane;
	private JTextArea textArea;
	
	
	
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					EVALUACION_EMPLEADOS frame = new EVALUACION_EMPLEADOS();
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
	public EVALUACION_EMPLEADOS() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 603, 483);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lblNewLabel = new JLabel("TARDANZA");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel.setBounds(39, 45, 119, 28);
		contentPane.add(lblNewLabel);
		
		lblNewLabel_1 = new JLabel("OBSERVACIONES");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_1.setBounds(31, 106, 134, 33);
		contentPane.add(lblNewLabel_1);
		
		btncalcular = new JButton("CALCULAR");
		btncalcular.addActionListener(this);
		btncalcular.setBounds(457, 51, 110, 22);
		contentPane.add(btncalcular);
		
		textField = new JTextField();
		textField.setBounds(135, 52, 251, 28);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(187, 115, 199, 28);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(51, 206, 496, 201);
		contentPane.add(scrollPane);
		
		textArea = new JTextArea();
		scrollPane.setViewportView(textArea);
	}
	void entrada_datos() {
		//ENTRADA DE DATOS 
		
	MINUTO_TARDANZA =Integer.parseInt(tftardanza.getText());
	NUM_OBSERVACIONES=Integer.parseInt(tfobservaciones.getText());
	
		
	}
	
	void PUNTAJE_PUNTUALIDAD () {
		
		//OBTENER PUNTAJE DE PUNTUALIDAD
		
		if (MINUTO_TARDANZA == 0)
		   PUNTAJE_PUNTUALIDAD =10 ;
		else if (MINUTO_TARDANZA >=1 &&  MINUTO_TARDANZA<=2)
		         PUNTAJE_PUNTUALIDAD=8 ;
		else if (MINUTO_TARDANZA>=3 && MINUTO_TARDANZA<=5)
				   PUNTAJE_PUNTUALIDAD=6 ;
		else if (MINUTO_TARDANZA>=6 && MINUTO_TARDANZA<=9)
					 PUNTAJE_PUNTUALIDAD=4 ;
		else if (MINUTO_TARDANZA>9)
					    PUNTAJE_PUNTUALIDAD=0;
	
	
	}
	
	
	void PUNTUAJE_RENDIMIENTO () {
		//OBTENER PUNTAJE DE RENDIMIENTO 

		switch (NUMERO_OBSERVACIONES){	
		case 0: 
		   PUNTAJE_RENDIMIENTO=10 
		   break ;
		case 1:
		   PUNTAJE_RENDIMIENTO= 8 
		   break;
		case 2:
		   PUNTAJE_RENDIMIENTO= 5
		   break;
		case 3:
		   PUNTAJE_RENDIMIENTO=1 
		   break;
		   default :
		   PUNTAJE_RENDIMIENTO=0
		   break ;
		 }	
	}
	
	void PUNTUAJE_TOTAL() {
		
		 PUNTAJE_TOTAL=(PUNTAJE_PUNTUALIDAD + PUNTAJE_RENDIMIENTO);
	}
	
	void BONIFICACION () {
		
		 if (PUNTAJE_TOTAL<11)
		   BONIFICACION=2.5* PUNTAJE_TOTAL ;
		 else if (PUNTAJE_TOTAL>=11 && PUNTAJE_TOTAL<=13) 
			  BONIFICACION=5.0* PUNTAJE_TOTAL ;
		 else if (PUNTAJE_TOTAL>=14 && PUNTAJE_TOTAL<=16) 
			    BONIFICACION=7.5* PUNTAJE_TOTAL ;
		 else if (PUNTAJE_TOTAL>=17 && PUNTAJE_TOTAL<=19) 
				    BONIFICACION= 10.0* PUNTAJE_TOTAL ;
		 else if (PUNTAJE_TOTAL= 20) 
					   BONIFICACION= 12.5* PUNTAJE_TOTAL ;
	}
	
	void Mostrar_resultados() {
		
		textArea.setText("puntaje puntualidad"+ PUNTAJE_PUNTUALIDAD +"\n");
		textArea.append("puntaje de rendimiento "+ PUNTAJE_RENDIMIENTO +"\n");
		textArea.append("puntaje total "+ PUNTAJE_TOTAL +"\n");
		textArea.append("bonificacion "+ BONIFICACION +"\n");
	}
	
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btncalcular) {
			actionPerformedBtncalcular(e);
		}
	}
	protected void actionPerformedBtncalcular(ActionEvent e) {
		
		ENTRAD_DATOS();
		PUNTAJE_PUNTUALIDAD( );
		PUNTAJE_RENDIMIENTO();
		PONTAJE_BONIFICACION();
		RESULTADOS ();
	
		
	}
}
