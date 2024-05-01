import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JButton;

public class RegistroEmpleados extends JFrame {

	private JPanel contentPane;
	private JTextField textFIdentificacion;
	private JTextField textFNombres;
	private JTextField textFApellidos;
	private JTextField textField;
	private JTextField textFTelefono;
	private JTextField textFContraseña;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RegistroEmpleados frame = new RegistroEmpleados();
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
	public RegistroEmpleados() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 439);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JLabel lblRegistroEmpleados = new JLabel("REGISTRO EMPLEADOS");
		
		JLabel lblIngreseDatos = new JLabel("Ingrese sus Datos:");
		
		JLabel lblIdentificación = new JLabel("Identificaci\u00F3n:");
		
		textFIdentificacion = new JTextField();
		textFIdentificacion.setColumns(10);
		
		JLabel lblNombre = new JLabel("Nombres:");
		
		textFNombres = new JTextField();
		textFNombres.setColumns(10);
		
		JLabel lblApellidos = new JLabel("Apellidos:");
		lblApellidos.setHorizontalAlignment(SwingConstants.LEFT);
		
		textFApellidos = new JTextField();
		textFApellidos.setColumns(10);
		
		JLabel lblFechaN = new JLabel("Fecha Nacimiento:");
		
		textField = new JTextField();
		textField.setColumns(10);
		
		JLabel lblTelefono = new JLabel("Telefono:");
		
		textFTelefono = new JTextField();
		textFTelefono.setColumns(10);
		
		JLabel lblContraseña = new JLabel("Contrase\u00F1a:");
		
		textFContraseña = new JTextField();
		textFContraseña.setColumns(10);
		
		JLabel lblRol = new JLabel("Rol:");
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		
		JButton btnRegistrar = new JButton("Registrar");
		
		JButton btnNewButton = new JButton("Iniciar Sesion");
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(154)
							.addComponent(lblRegistroEmpleados))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_contentPane.createSequentialGroup()
									.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
										.addGroup(gl_contentPane.createSequentialGroup()
											.addGap(36)
											.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
												.addComponent(lblIdentificación)
												.addComponent(lblNombre)
												.addComponent(lblApellidos)
												.addComponent(lblFechaN)
												.addComponent(lblTelefono)
												.addComponent(lblContraseña)))
										.addGroup(gl_contentPane.createSequentialGroup()
											.addGap(63)
											.addComponent(lblRol)))
									.addGap(16))
								.addGroup(Alignment.TRAILING, gl_contentPane.createSequentialGroup()
									.addContainerGap(119, Short.MAX_VALUE)
									.addComponent(btnRegistrar)
									.addPreferredGap(ComponentPlacement.RELATED)))
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING, false)
								.addGroup(gl_contentPane.createSequentialGroup()
									.addGap(39)
									.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING, false)
										.addComponent(textField_1)
										.addComponent(textFContraseña)
										.addComponent(textFTelefono)
										.addComponent(textField)
										.addComponent(textFApellidos)
										.addComponent(textFNombres)
										.addComponent(textFIdentificacion, GroupLayout.DEFAULT_SIZE, 168, Short.MAX_VALUE)
										.addComponent(lblIngreseDatos)))
								.addGroup(Alignment.TRAILING, gl_contentPane.createSequentialGroup()
									.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
									.addComponent(btnNewButton)
									.addGap(14)))))
					.addContainerGap(65, Short.MAX_VALUE))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblRegistroEmpleados)
					.addGap(30)
					.addComponent(lblIngreseDatos)
					.addGap(30)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblIdentificación)
						.addComponent(textFIdentificacion, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNombre)
						.addComponent(textFNombres, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblApellidos)
						.addComponent(textFApellidos, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblFechaN)
						.addComponent(textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblTelefono)
						.addComponent(textFTelefono, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblContraseña)
						.addComponent(textFContraseña, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblRol)
						.addComponent(textField_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnNewButton)
						.addComponent(btnRegistrar))
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		contentPane.setLayout(gl_contentPane);
	}

}
