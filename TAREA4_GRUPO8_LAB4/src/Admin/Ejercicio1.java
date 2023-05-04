package Admin;

import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Ejercicio1 extends JFrame {
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtFechaNacimiento;
	private JTextField txtTelefono;
	private JTextField txtApellido;
	private JTextField txtNombre;

	public Ejercicio1() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 481);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNombre = new JLabel("Nombre:");
		lblNombre.setBounds(25, 40, 56, 16);
		contentPane.add(lblNombre);
		
		JLabel lblApellido = new JLabel("Apellido:");
		lblApellido.setBounds(25, 86, 56, 16);
		contentPane.add(lblApellido);
		
		JLabel lblTelefono = new JLabel("Teléfono:");
		lblTelefono.setBounds(25, 142, 56, 16);
		contentPane.add(lblTelefono);
		
		JLabel lblFecNacimiento = new JLabel("Fecha de Nacimiento:");
		lblFecNacimiento.setBounds(12, 189, 101, 16);
		contentPane.add(lblFecNacimiento);
		
		txtFechaNacimiento = new JTextField();
		txtFechaNacimiento.setBounds(125, 186, 116, 22);
		contentPane.add(txtFechaNacimiento);
		txtFechaNacimiento.setColumns(10);
		
		txtTelefono = new JTextField();
		txtTelefono.setBounds(125, 139, 116, 22);
		contentPane.add(txtTelefono);
		txtTelefono.setColumns(10);
		
		txtApellido = new JTextField();
		txtApellido.setBounds(125, 83, 116, 22);
		contentPane.add(txtApellido);
		txtApellido.setColumns(10);
		
		txtNombre = new JTextField();
		txtNombre.setBounds(125, 37, 116, 22);
		contentPane.add(txtNombre);
		txtNombre.setColumns(10);
		
		JLabel lblLosDatosIngresados = new JLabel("Los datos ingresados fueron: ");
		lblLosDatosIngresados.setBounds(12, 267, 192, 16);
		contentPane.add(lblLosDatosIngresados);
		
		JTextArea lblDatosIngresados = new JTextArea();
		lblDatosIngresados.setEditable(false);
		lblDatosIngresados.setBounds(37, 306, 345, 100);
		contentPane.add(lblDatosIngresados);
		
		JButton btnMostrar = new JButton("Mostrar");
		btnMostrar.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				boolean volver = false;
				
				if (txtNombre.getText().length() == 0) {
					txtNombre.setBackground(Color.red);
					volver = true;
				}
				if (txtApellido.getText().length() == 0) {
					txtApellido.setBackground(Color.red);
					volver = true;
				}
				if (txtFechaNacimiento.getText().length() == 0) {
					txtFechaNacimiento.setBackground(Color.red);
					volver = true;
				}
				if (txtTelefono.getText().length() == 0) {
					txtTelefono.setBackground(Color.red);
					volver = true;
				}
				
				if (volver)
					return;
				
				txtNombre.setBackground(Color.white);
				txtApellido.setBackground(Color.white);
				txtFechaNacimiento.setBackground(Color.white);
				txtTelefono.setBackground(Color.white);
				
				lblDatosIngresados.setText(
								"Nombre: " + txtNombre.getText() + "\n" +
								"Apellido: " + txtApellido.getText() + "\n" +
								"Teléfono: " + txtTelefono.getText() + "\n" +
								"Fecha de Nacimiento: " + txtFechaNacimiento.getText() + "\n"
						);
				
				txtNombre.setText("");
				txtApellido.setText("");
				txtFechaNacimiento.setText("");
				txtTelefono.setText("");
			}
		});
		btnMostrar.setBounds(276, 232, 97, 25);
		contentPane.add(btnMostrar);
	}
}
