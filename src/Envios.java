import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JTextField;
import javax.swing.JButton;

public class Envios extends JFrame {

	private JPanel contentPane;
	private JTextField textFNumeroEnvio;
	private JTextField textFIDUsuario;
	private JTextField textFNombreCompUsuario;
	private JTextField textFCiudadOrigen;
	private JTextField textFCiudadDestino;
	private JTextField textFDireccion;
	private JTextField textFFecha;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Envios frame = new Envios();
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
	public Envios() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 544, 392);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JLabel lblGestionEnvios = new JLabel("GESTION DE ENVIOS");
		
		JLabel lblIngresarDTEnvio = new JLabel("Ingrese los Datos de Envio");
		
		JLabel lblNumeroEnvio = new JLabel("Numero Envio");
		
		textFNumeroEnvio = new JTextField();
		textFNumeroEnvio.setColumns(10);
		
		JLabel lblIdentificacionUsuario = new JLabel("Identificacion Usuario");
		
		textFIDUsuario = new JTextField();
		textFIDUsuario.setColumns(10);
		
		JLabel lblNombreCompletoUsuario = new JLabel("Nombre Completo Usuario");
		
		textFNombreCompUsuario = new JTextField();
		textFNombreCompUsuario.setColumns(10);
		
		JLabel lblCiudadOrigen = new JLabel("Ciudad Origen");
		
		textFCiudadOrigen = new JTextField();
		textFCiudadOrigen.setColumns(10);
		
		JLabel lblCiudadDestino = new JLabel("Ciudad Destino");
		
		textFCiudadDestino = new JTextField();
		textFCiudadDestino.setColumns(10);
		
		JLabel lblDireccion = new JLabel("Direccion");
		
		textFDireccion = new JTextField();
		textFDireccion.setColumns(10);
		
		JLabel lblFecha = new JLabel("Fecha");
		
		textFFecha = new JTextField();
		textFFecha.setColumns(10);
		
		JLabel lblCosto = new JLabel("Costo");
		
		textField = new JTextField();
		textField.setColumns(10);
		
		JButton btnGenerarEnvio = new JButton("Generar Envio");
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(lblIdentificacionUsuario)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(15)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addComponent(lblCiudadDestino)
								.addComponent(lblCiudadOrigen)
								.addComponent(lblDireccion)
								.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
									.addComponent(lblCosto)
									.addComponent(lblFecha))))
						.addComponent(lblNumeroEnvio)
						.addComponent(lblNombreCompletoUsuario))
					.addGap(18)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(textFFecha, GroupLayout.DEFAULT_SIZE, 228, Short.MAX_VALUE)
						.addComponent(textFDireccion, GroupLayout.DEFAULT_SIZE, 228, Short.MAX_VALUE)
						.addComponent(textFCiudadDestino, GroupLayout.DEFAULT_SIZE, 228, Short.MAX_VALUE)
						.addComponent(textFIDUsuario, GroupLayout.DEFAULT_SIZE, 228, Short.MAX_VALUE)
						.addComponent(textField, GroupLayout.DEFAULT_SIZE, 228, Short.MAX_VALUE)
						.addComponent(textFNombreCompUsuario, GroupLayout.DEFAULT_SIZE, 228, Short.MAX_VALUE)
						.addComponent(textFCiudadOrigen, GroupLayout.DEFAULT_SIZE, 228, Short.MAX_VALUE)
						.addComponent(textFNumeroEnvio, GroupLayout.DEFAULT_SIZE, 228, Short.MAX_VALUE)
						.addComponent(lblIngresarDTEnvio))
					.addGap(245))
				.addGroup(Alignment.TRAILING, gl_contentPane.createSequentialGroup()
					.addContainerGap(210, Short.MAX_VALUE)
					.addComponent(btnGenerarEnvio)
					.addGap(207))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(204)
					.addComponent(lblGestionEnvios)
					.addContainerGap(214, Short.MAX_VALUE))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addComponent(lblGestionEnvios)
					.addGap(22)
					.addComponent(lblIngresarDTEnvio)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(6)
							.addComponent(textFNumeroEnvio, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addGap(37)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
								.addComponent(textFNombreCompUsuario, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblNombreCompletoUsuario))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
								.addComponent(textFCiudadOrigen, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblCiudadOrigen)))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(11)
							.addComponent(lblNumeroEnvio)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblIdentificacionUsuario)
								.addComponent(textFIDUsuario, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(textFCiudadDestino, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblCiudadDestino))
					.addGap(18)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(textFDireccion, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblDireccion))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(textFFecha, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblFecha))
					.addGap(9)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblCosto))
					.addGap(18)
					.addComponent(btnGenerarEnvio)
					.addContainerGap(35, Short.MAX_VALUE))
		);
		contentPane.setLayout(gl_contentPane);
	}

}
