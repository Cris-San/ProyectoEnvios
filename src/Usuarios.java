import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import javax.swing.JInternalFrame;
import javax.swing.JMenu;
import java.awt.TextArea;
import java.awt.TextField;
import javax.swing.JToggleButton;
import javax.swing.JTable;

public class Usuarios extends JFrame {

	private JPanel contentPane;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Usuarios frame = new Usuarios();
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
	public Usuarios() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 618, 397);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JLabel lblGestionU = new JLabel("GESTION DE USUARIOS");
		
		JLabel lblUsuarios = new JLabel("Usuarios");
		
		JPanel panel = new JPanel();
		
		JPanel panel_1 = new JPanel();
		
		JLabel lblEnvios = new JLabel("Envios");
		
		table = new JTable();
		
		JLabel lblUsuariosRegistrados = new JLabel("USUARIOS REGISTRADOS EN BASE DE DATOS");
		
		JButton btnSalir = new JButton("Salir");
		
		JButton Atras = new JButton("Atras");
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap(299, Short.MAX_VALUE)
					.addComponent(lblGestionU)
					.addGap(256))
				.addGroup(Alignment.LEADING, gl_contentPane.createSequentialGroup()
					.addGap(171)
					.addComponent(lblUsuariosRegistrados)
					.addContainerGap(215, Short.MAX_VALUE))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(27)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addComponent(panel, GroupLayout.PREFERRED_SIZE, 287, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblUsuarios))
							.addGap(50)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addComponent(panel_1, GroupLayout.DEFAULT_SIZE, 209, Short.MAX_VALUE)
								.addComponent(lblEnvios)))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addContainerGap()
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING, false)
								.addGroup(Alignment.TRAILING, gl_contentPane.createSequentialGroup()
									.addComponent(Atras)
									.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
									.addComponent(btnSalir))
								.addComponent(table, Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 546, GroupLayout.PREFERRED_SIZE))))
					.addGap(97))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblGestionU)
					.addGap(18)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblUsuarios)
						.addComponent(lblEnvios))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(panel_1, GroupLayout.DEFAULT_SIZE, 75, Short.MAX_VALUE)
						.addComponent(panel, GroupLayout.PREFERRED_SIZE, 75, GroupLayout.PREFERRED_SIZE))
					.addGap(46)
					.addComponent(lblUsuariosRegistrados)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(table, GroupLayout.PREFERRED_SIZE, 88, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnSalir)
						.addComponent(Atras))
					.addGap(5))
		);
		
		JButton btnNuevoEnvio = new JButton("Nuevo Envio");
		btnNuevoEnvio.setHorizontalAlignment(SwingConstants.RIGHT);
		panel_1.add(btnNuevoEnvio);
		
		JButton btnNuevoUsuario = new JButton("Nuevo Usuario");
		panel.add(btnNuevoUsuario);
		
		JButton btnEliminarUsuario = new JButton("Eliminar Usuario");
		panel.add(btnEliminarUsuario);
		
		JButton btnActualizarUsuario = new JButton("Actualizar Usuario");
		panel.add(btnActualizarUsuario);
		contentPane.setLayout(gl_contentPane);
	}
}
