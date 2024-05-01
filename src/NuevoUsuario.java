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

public class NuevoUsuario extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textFNombres;
	private JTextField textField_1;
	private JTextField textFFechaNacimiento;
	private JTextField textField_2;
	private JTextField textFDireccion;
	private JTextField textFCiudad;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					NuevoUsuario frame = new NuevoUsuario();
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
	public NuevoUsuario() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 583, 371);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JLabel lblNuevoUsuario = new JLabel("NUEVO USUARIO");
		
		JLabel lblIdentificacion = new JLabel("Identificacion:");
		
		textField = new JTextField();
		textField.setColumns(10);
		
		JLabel lblNombres = new JLabel("Nombres:");
		
		textFNombres = new JTextField();
		textFNombres.setColumns(10);
		
		JLabel lblApellidos = new JLabel("Apellidos:");
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		
		JLabel lblFechaNacimiento = new JLabel("Fecha Nacimiento:");
		
		textFFechaNacimiento = new JTextField();
		textFFechaNacimiento.setColumns(10);
		
		JLabel lblTelefono = new JLabel("Telefono:");
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		
		JLabel lblDireccion = new JLabel("Direccion:");
		
		textFDireccion = new JTextField();
		textFDireccion.setColumns(10);
		
		JLabel lblCiudad = new JLabel("Ciudad:");
		
		textFCiudad = new JTextField();
		textFCiudad.setColumns(10);
		
		JButton btnREGISTRAR = new JButton("REGISTRAR");
		
		JButton btnATRAS = new JButton("ATRAS");
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING, false)
							.addGroup(gl_contentPane.createSequentialGroup()
								.addGap(251)
								.addComponent(lblNuevoUsuario))
							.addGroup(gl_contentPane.createSequentialGroup()
								.addGap(52)
								.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
									.addComponent(lblIdentificacion)
									.addComponent(lblNombres)
									.addComponent(lblApellidos)
									.addComponent(lblFechaNacimiento)
									.addGroup(gl_contentPane.createSequentialGroup()
										.addGap(10)
										.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
											.addComponent(lblDireccion)
											.addComponent(lblTelefono)
											.addComponent(lblCiudad))))
								.addGap(76)
								.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
									.addComponent(textFCiudad, GroupLayout.DEFAULT_SIZE, 138, Short.MAX_VALUE)
									.addComponent(textFDireccion, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 138, Short.MAX_VALUE)
									.addComponent(textField_2, GroupLayout.DEFAULT_SIZE, 138, Short.MAX_VALUE)
									.addGroup(gl_contentPane.createSequentialGroup()
										.addComponent(textFFechaNacimiento, GroupLayout.DEFAULT_SIZE, 138, Short.MAX_VALUE)
										.addPreferredGap(ComponentPlacement.RELATED))
									.addComponent(textField_1, GroupLayout.DEFAULT_SIZE, 138, Short.MAX_VALUE)
									.addComponent(textFNombres, GroupLayout.DEFAULT_SIZE, 138, Short.MAX_VALUE)
									.addComponent(textField))))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addContainerGap()
							.addComponent(btnATRAS)
							.addGap(160)
							.addComponent(btnREGISTRAR)))
					.addContainerGap(203, Short.MAX_VALUE))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblNuevoUsuario)
					.addGap(18)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblIdentificacion)
						.addComponent(textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNombres)
						.addComponent(textFNombres, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblApellidos)
						.addComponent(textField_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblFechaNacimiento)
						.addComponent(textFFechaNacimiento, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(lblTelefono)
							.addGap(18)
							.addComponent(lblDireccion))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(textField_2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(textFDireccion, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(lblCiudad)
						.addComponent(textFCiudad, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addPreferredGap(ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
							.addComponent(btnATRAS, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(18)
							.addComponent(btnREGISTRAR, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap())
		);
		contentPane.setLayout(gl_contentPane);
	}

}
