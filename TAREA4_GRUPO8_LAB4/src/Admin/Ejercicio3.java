package Admin;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;

public class Ejercicio3 extends JFrame {
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JRadioButton rdbtnWindows;
	private JRadioButton rdbtnMac;
	private JRadioButton rdbtnLinux;
	private JCheckBox chckbxAdminitracion;
	private JCheckBox chckbxProgramacion;
	private JCheckBox chckbxDiseoGrafico;
	private String sistemaOp;
	private String Especialidad;
	private String Horas;

	public Ejercicio3() {
		setTitle("Selección Múltiple");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 555, 486);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		GridBagLayout gbl_contentPane = new GridBagLayout();
		gbl_contentPane.columnWidths = new int[]{249, 0};
		gbl_contentPane.rowHeights = new int[]{79, 0, 0, 0, 0};
		gbl_contentPane.columnWeights = new double[]{1.0, Double.MIN_VALUE};
		gbl_contentPane.rowWeights = new double[]{0.0, 0.0, 0.0, 1.0, Double.MIN_VALUE};
		contentPane.setLayout(gbl_contentPane);

		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(0, 0, 0), 3));
		GridBagConstraints gbc_panel = new GridBagConstraints();
		gbc_panel.fill = GridBagConstraints.HORIZONTAL;
		gbc_panel.insets = new Insets(0, 0, 5, 0);
		gbc_panel.gridx = 0;
		gbc_panel.gridy = 0;
		contentPane.add(panel, gbc_panel);
		
		JLabel lblNewLabel = new JLabel("Elija un Sistema Operativo:");
		panel.add(lblNewLabel);
		
		rdbtnWindows = new JRadioButton("Windows");
		panel.add(rdbtnWindows);
		
		rdbtnMac = new JRadioButton("Mac");
		panel.add(rdbtnMac);
		
		rdbtnLinux = new JRadioButton("Linux");
		panel.add(rdbtnLinux);

		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new LineBorder(new Color(0, 0, 0), 3));
		GridBagConstraints gbc_panel_1 = new GridBagConstraints();
		gbc_panel_1.insets = new Insets(0, 0, 5, 0);
		gbc_panel_1.fill = GridBagConstraints.BOTH;
		gbc_panel_1.gridx = 0;
		gbc_panel_1.gridy = 1;
		contentPane.add(panel_1, gbc_panel_1);
		GridBagLayout gbl_panel_1 = new GridBagLayout();
		gbl_panel_1.columnWidths = new int[]{0, 0, 0, 0, 0, 0};
		gbl_panel_1.rowHeights = new int[]{0, 0, 0, 0};
		gbl_panel_1.columnWeights = new double[]{1.0, 0.0, 0.0, 0.0, 1.0, Double.MIN_VALUE};
		gbl_panel_1.rowWeights = new double[]{0.0, 0.0, 0.0, Double.MIN_VALUE};
		panel_1.setLayout(gbl_panel_1);

		chckbxProgramacion = new JCheckBox("Programación");
		GridBagConstraints gbc_chckbxProgramacion = new GridBagConstraints();
		gbc_chckbxProgramacion.insets = new Insets(0, 0, 5, 0);
		gbc_chckbxProgramacion.gridx = 4;
		gbc_chckbxProgramacion.gridy = 0;
		panel_1.add(chckbxProgramacion, gbc_chckbxProgramacion);
		
		JLabel lblEijeUnaEspecialidad = new JLabel("Elija una Especialidad:");
		GridBagConstraints gbc_lblEijeUnaEspecialidad = new GridBagConstraints();
		gbc_lblEijeUnaEspecialidad.insets = new Insets(0, 0, 5, 5);
		gbc_lblEijeUnaEspecialidad.gridx = 0;
		gbc_lblEijeUnaEspecialidad.gridy = 1;
		panel_1.add(lblEijeUnaEspecialidad, gbc_lblEijeUnaEspecialidad);
		
		chckbxAdminitracion = new JCheckBox("Administración");
		GridBagConstraints gbc_chckbxAdminitracion = new GridBagConstraints();
		gbc_chckbxAdminitracion.insets = new Insets(0, 0, 5, 0);
		gbc_chckbxAdminitracion.gridx = 4;
		gbc_chckbxAdminitracion.gridy = 1;
		panel_1.add(chckbxAdminitracion, gbc_chckbxAdminitracion);
		
		chckbxDiseoGrafico = new JCheckBox("Diseño Gráfico");
		GridBagConstraints gbc_chckbxDiseoGrafico = new GridBagConstraints();
		gbc_chckbxDiseoGrafico.gridx = 4;
		gbc_chckbxDiseoGrafico.gridy = 2;
		panel_1.add(chckbxDiseoGrafico, gbc_chckbxDiseoGrafico);

		JPanel panel_2 = new JPanel();
		GridBagConstraints gbc_panel_2 = new GridBagConstraints();
		gbc_panel_2.insets = new Insets(0, 0, 5, 0);
		gbc_panel_2.fill = GridBagConstraints.BOTH;
		gbc_panel_2.gridx = 0;
		gbc_panel_2.gridy = 2;
		contentPane.add(panel_2, gbc_panel_2);
		GridBagLayout gbl_panel_2 = new GridBagLayout();
		gbl_panel_2.columnWidths = new int[]{0, 0, 0, 0};
		gbl_panel_2.rowHeights = new int[]{0, 0, 0};
		gbl_panel_2.columnWeights = new double[]{0.0, 0.0, 1.0, Double.MIN_VALUE};
		gbl_panel_2.rowWeights = new double[]{0.0, 0.0, Double.MIN_VALUE};
		panel_2.setLayout(gbl_panel_2);
		
		JLabel lblCantidadDeHoras = new JLabel("Cantidad de horas en el computador ");
		GridBagConstraints gbc_lblCantidadDeHoras = new GridBagConstraints();
		gbc_lblCantidadDeHoras.insets = new Insets(0, 0, 0, 5);
		gbc_lblCantidadDeHoras.anchor = GridBagConstraints.EAST;
		gbc_lblCantidadDeHoras.gridx = 1;
		gbc_lblCantidadDeHoras.gridy = 1;
		panel_2.add(lblCantidadDeHoras, gbc_lblCantidadDeHoras);
		
		textField = new JTextField();
		GridBagConstraints gbc_textField = new GridBagConstraints();
		gbc_textField.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField.gridx = 2;
		gbc_textField.gridy = 1;
		panel_2.add(textField, gbc_textField);
		textField.setColumns(10);

		JPanel panel_3 = new JPanel();
		GridBagConstraints gbc_panel_3 = new GridBagConstraints();
		gbc_panel_3.fill = GridBagConstraints.BOTH;
		gbc_panel_3.gridx = 0;
		gbc_panel_3.gridy = 3;
		contentPane.add(panel_3, gbc_panel_3);
		GridBagLayout gbl_panel_3 = new GridBagLayout();
		gbl_panel_3.columnWidths = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_panel_3.rowHeights = new int[]{0, 0, 0};
		gbl_panel_3.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, 1.0, Double.MIN_VALUE};
		gbl_panel_3.rowWeights = new double[]{0.0, 0.0, Double.MIN_VALUE};
		panel_3.setLayout(gbl_panel_3);
		
		JButton btnAceptar = new JButton("Aceptar");
		btnAceptar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (rdbtnWindows.isSelected()== true) {
					sistemaOp = rdbtnWindows.getText();
				}else if( rdbtnMac.isSelected()==true) {
					sistemaOp = rdbtnLinux.getText();
				}else if( rdbtnLinux.isSelected()==true) {
					sistemaOp = rdbtnLinux.getText();
				}else {
					sistemaOp = "INGRESE UN SISTEMA";
				}
				if(chckbxProgramacion.isSelected()==true) {
					Especialidad = chckbxProgramacion.getText();					
				}else if(chckbxDiseoGrafico.isSelected()==true) {
					Especialidad =chckbxDiseoGrafico.getText();
				}else if(chckbxAdminitracion.isSelected()==true) {
					Especialidad = chckbxAdminitracion.getText();
				}else {
					Especialidad ="INGRESE UNA ESPECIALIDAD";
				}
				
				Horas = textField.getText();
				DialogueBoxPopUp(sistemaOp, Especialidad, Horas); 
			}
		});
		GridBagConstraints gbc_btnAceptar = new GridBagConstraints();
		gbc_btnAceptar.anchor = GridBagConstraints.EAST;
		gbc_btnAceptar.gridx = 12;
		gbc_btnAceptar.gridy = 1;
		panel_3.add(btnAceptar, gbc_btnAceptar);

		
	}
	
	public void DialogueBoxPopUp(String sistemaOp, String Especialidad, String Horas) {
	//public static void main(String[] args) {
	JOptionPane.showMessageDialog(null,
			" " + sistemaOp +" - "+ Especialidad + " - " + Horas + " hs.",
			"PopUp Dialog",
			JOptionPane.INFORMATION_MESSAGE);

}

}
