package vista;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JLabel;

public class VentanaComprobacion extends JPanel {
	private JTextField areaError;

	/**
	 * Create the panel.
	 */
	public VentanaComprobacion() {
		setLayout(null);

		JButton btnAtras = new JButton("<< Atras");
		btnAtras.setBounds(10, 266, 120, 23);
		add(btnAtras);
		
		areaError = new JTextField();
		areaError.setEditable(false);
		areaError.setBounds(44, 164, 345, 20);
		add(areaError);
		areaError.setColumns(10);
		
		JButton btnComprobar = new JButton("Comprobar");
		btnComprobar.setBounds(44, 116, 345, 23);
		add(btnComprobar);
		
		JTextArea areaId = new JTextArea();
		areaId.setBounds(44, 56, 86, 22);
		add(areaId);
		
		JTextArea areaApellido = new JTextArea();
		areaApellido.setBounds(152, 56, 137, 22);
		add(areaApellido);
		
		JLabel etiquetaId = new JLabel("Id");
		etiquetaId.setBounds(44, 31, 46, 14);
		add(etiquetaId);
		
		JLabel etiquetaApellido = new JLabel("1er Apellido");
		etiquetaApellido.setBounds(152, 31, 46, 14);
		add(etiquetaApellido);
	}
}
