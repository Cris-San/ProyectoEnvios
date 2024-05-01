import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JButton;

public class Empleados extends JFrame {

	private JPanel contentPane;
	private JTextField textFUsuario;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Empleados frame = new Empleados();
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
	public Empleados() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 402, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JLabel lblInicioSesionEmpleados = new JLabel("INICIO SESION EMPLEADOS");
		
		JLabel lblIngresoCredenciales = new JLabel("Ingrese Credenciales");
		
		JLabel lblUsuario = new JLabel("Usuario");
		
		textFUsuario = new JTextField();
		textFUsuario.setColumns(10);
		
		JLabel lblContraseña = new JLabel("Contrase\u00F1a");
		
		textField = new JTextField();
		textField.setColumns(10);
		
		JButton btnIniciarSesion = new JButton("Iniciar Sesion");
		
		JButton btnRegistrarse = new JButton("Registrarse");
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(42)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING, false)
								.addComponent(lblIngresoCredenciales)
								.addGroup(gl_contentPane.createSequentialGroup()
									.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
										.addComponent(lblContraseña)
										.addComponent(lblUsuario))
									.addPreferredGap(ComponentPlacement.UNRELATED)
									.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
										.addComponent(textFUsuario, GroupLayout.PREFERRED_SIZE, 132, GroupLayout.PREFERRED_SIZE)
										.addComponent(textField)))))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(138)
							.addComponent(lblInicioSesionEmpleados))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(90)
							.addComponent(btnIniciarSesion)
							.addGap(35)
							.addComponent(btnRegistrarse)))
					.addContainerGap(69, Short.MAX_VALUE))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblInicioSesionEmpleados)
					.addGap(32)
					.addComponent(lblIngresoCredenciales)
					.addGap(28)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblUsuario)
						.addComponent(textFUsuario, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(29)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblContraseña)
						.addComponent(textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnIniciarSesion)
						.addComponent(btnRegistrarse))
					.addGap(23))
		);
		contentPane.setLayout(gl_contentPane);
	}

}
