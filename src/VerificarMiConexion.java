import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class VerificarMiConexion extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VerificarMiConexion frame = new VerificarMiConexion();
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
	public VerificarMiConexion() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JLabel lblVerificandoConexión = new JLabel("Verificando Conexion");
		lblVerificandoConexión.setBackground(new Color(0, 0, 255));
		
		JButton btnVerificarConexion = new JButton("Verificar Conexion");
		btnVerificarConexion.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				conexion conex=new conexion();
				conex.establecerconexion();
			}
		});
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(170)
					.addComponent(lblVerificandoConexión)
					.addContainerGap(185, Short.MAX_VALUE))
				.addGroup(Alignment.TRAILING, gl_contentPane.createSequentialGroup()
					.addContainerGap(159, Short.MAX_VALUE)
					.addComponent(btnVerificarConexion)
					.addGap(132))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblVerificandoConexión)
					.addGap(81)
					.addComponent(btnVerificarConexion)
					.addContainerGap(122, Short.MAX_VALUE))
		);
		contentPane.setLayout(gl_contentPane);
	}

}
