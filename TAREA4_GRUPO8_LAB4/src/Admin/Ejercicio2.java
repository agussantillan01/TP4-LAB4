package Admin;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Ejercicio2 extends JFrame {
	private static final long serialVersionUID = 1L;

	private JPanel contentPane;
	private JTextField txtNota1;
	private JTextField txtNota2;
	private JTextField txtNota3;
	private JTextField txtPromedio;
	private JTextField txtCondicion;

	public Ejercicio2() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 475, 409);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNota1 = new JLabel("Nota 1:");
		lblNota1.setBounds(12, 46, 56, 16);
		contentPane.add(lblNota1);
		
		JLabel lblNota2 = new JLabel("Nota 2:");
		lblNota2.setBounds(12, 82, 56, 16);
		contentPane.add(lblNota2);
		
		JLabel lblNota3 = new JLabel("Nota 3:");
		lblNota3.setBounds(12, 118, 56, 16);
		contentPane.add(lblNota3);
		
		JLabel lblTps = new JLabel("TPs:");
		lblTps.setBounds(12, 157, 56, 16);
		contentPane.add(lblTps);
		

		
		txtNota1 = new JTextField();
		txtNota1.setBounds(82, 43, 116, 22);
		contentPane.add(txtNota1);
		txtNota1.setColumns(10);
		
		txtNota2 = new JTextField();
		txtNota2.setBounds(80, 79, 116, 22);
		contentPane.add(txtNota2);
		txtNota2.setColumns(10);
		
		txtNota3 = new JTextField();
		txtNota3.setBounds(80, 115, 116, 22);
		contentPane.add(txtNota3);
		txtNota3.setColumns(10);
		
		JComboBox<String> cmbCalificacion = new JComboBox<String>();
		cmbCalificacion.setBounds(80, 154, 118, 22);
		cmbCalificacion.addItem("Aprobado");
		cmbCalificacion.addItem("Desaprobado");
		contentPane.add(cmbCalificacion);
		
		JLabel lblPromedio = new JLabel("Promedio:");
		lblPromedio.setBounds(12, 254, 70, 16);
		contentPane.add(lblPromedio);
		
		txtPromedio = new JTextField();
		txtPromedio.setBounds(105, 251, 116, 22);
		contentPane.add(txtPromedio);
		txtPromedio.setColumns(10);
		
		JLabel lblCondicion = new JLabel("Condición:");
		lblCondicion.setBounds(12, 301, 81, 16);
		contentPane.add(lblCondicion);
		
		txtCondicion = new JTextField();
		txtCondicion.setBounds(105, 298, 116, 22);
		contentPane.add(txtCondicion);
		txtCondicion.setColumns(10);
		
		JButton btnCalcular = new JButton("Calcular");
		btnCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (txtNota1.getText()!= "" && txtNota2.getText()!= "" && txtNota3.getText()!= "") {
					int v1 = Integer.parseInt(txtNota1.getText()); 
					int v2 = Integer.parseInt(txtNota2.getText()); 
					int v3 = Integer.parseInt(txtNota3.getText()); 
					
					float promedio = (v1+v2+v3)/3;
					String promedioString = Float.toString(promedio);
					txtPromedio.setText(promedioString);
					String valorSeleccionado = (String) cmbCalificacion.getSelectedItem();
					if (valorSeleccionado == "Desaprobado") txtCondicion.setText("LIBRE");
					if(v1<6 || v2<6 || v3<6) txtCondicion.setText("LIBRE");
					if(v1>=8 && v2>=8 && v3>=8 && valorSeleccionado == "Aprobado") txtCondicion.setText("PROMOCIONADO");
					if (v1>5 && v1<9 && v2>5 && v2<9  && v3>5 && v3<9 && valorSeleccionado == "Aprobado") txtCondicion.setText("REGULAR");
				}
			}
		});
		btnCalcular.setBounds(321, 96, 124, 38);
		contentPane.add(btnCalcular);
		
		JButton btnLimpiar = new JButton("Limpiar");
		btnLimpiar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtNota1.setText("");
				txtNota2.setText("");
				txtNota3.setText("");
				txtPromedio.setText("");
				txtCondicion.setText("");
			}
		});
		btnLimpiar.setBounds(321, 157, 124, 38);
		contentPane.add(btnLimpiar);
		
		JButton btnSalir = new JButton("Salir");
		btnSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//EVENTO CLICK DEL BOTON SALIR
			}
		});
		btnSalir.setBounds(321, 221, 124, 38);
		contentPane.add(btnSalir);
	}
}
