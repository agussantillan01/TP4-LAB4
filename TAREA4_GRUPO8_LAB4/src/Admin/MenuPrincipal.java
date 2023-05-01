package Admin;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MenuPrincipal extends JFrame {

	private JPanel contentPane;
	Ejercicio1 ej1 = new Ejercicio1();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MenuPrincipal frame = new MenuPrincipal();
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
	public MenuPrincipal() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 279, 322);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnEjercicio1 = new JButton("Ejercicio 1");
		btnEjercicio1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				ej1.setVisible(true);
				
			}
		});
		btnEjercicio1.setBounds(87, 70, 97, 25);
		contentPane.add(btnEjercicio1);
		
		JButton btnEjercicio2 = new JButton("Ejercicio 2");
		btnEjercicio2.setBounds(87, 122, 97, 25);
		contentPane.add(btnEjercicio2);
		
		JButton btnEjercicio3 = new JButton("Ejercicio 3");
		btnEjercicio3.setBounds(87, 175, 97, 25);
		contentPane.add(btnEjercicio3);
		
		JLabel lblGrupo = new JLabel("GRUPO 8");
		lblGrupo.setBounds(22, 29, 56, 16);
		contentPane.add(lblGrupo);
	}
}
