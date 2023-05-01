package Admin;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Ejercicio1 extends JFrame {

	private JPanel contentPane;
	private JTextField txtFechaNacimiento;
	private JTextField txtTelefono;
	private JTextField txtApellido;
	private JTextField txtNombre;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ejercicio1 frame = new Ejercicio1();
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
	public Ejercicio1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
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
		
		JLabel lblTelefono = new JLabel("Telefono:");
		lblTelefono.setBounds(25, 142, 56, 16);
		contentPane.add(lblTelefono);
		
		JLabel lblFecNacimiento = new JLabel("Fec. Nacimiento:");
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
		
		JLabel lblDatosIngresados = new JLabel("");
		lblDatosIngresados.setBounds(37, 306, 274, 115);
		contentPane.add(lblDatosIngresados);
		
		JButton btnMostrar = new JButton("Mostrar");
		btnMostrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (txtNombre.getText() != "" && txtApellido.getText() != "" && txtTelefono.getText() != "" && txtFechaNacimiento.getText()!= "") {
					lblDatosIngresados.setText( txtNombre.getText() +","+ txtApellido.getText() + ", " + txtTelefono.getText() + " y "+ txtFechaNacimiento.getText());
				}
			}
		});
		btnMostrar.setBounds(276, 232, 97, 25);
		contentPane.add(btnMostrar);
	}
}
