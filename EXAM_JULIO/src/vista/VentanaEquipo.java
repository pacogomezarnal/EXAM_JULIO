package vista;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JComboBox;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class VentanaEquipo extends JPanel {

	private TheLaby prin;
	private boolean b=false;
	private VentanaUsuario venU;

	/**
	 * Create the panel.
	 */
	public VentanaEquipo(TheLaby princ,VentanaUsuario usu) {
		prin=princ;
		venU=usu;
		setLayout(null);

		JLabel etiquetaNom = new JLabel("Nombre");
		etiquetaNom.setBounds(168, 32, 46, 14);
		add(etiquetaNom);
		
		JTextArea areaNom = new JTextArea();
		areaNom.setEditable(false);
		areaNom.setBounds(168, 57, 120, 22);
		add(areaNom);
		
		JLabel etiquetaApe = new JLabel("Apellidos");
		etiquetaApe.setBounds(168, 90, 46, 14);
		add(etiquetaApe);
		
		JTextArea areaApe = new JTextArea();
		areaApe.setEditable(false);
		areaApe.setBounds(168, 115, 120, 22);
		add(areaApe);
		
		JLabel etiquetaEda = new JLabel("Edad");
		etiquetaEda.setBounds(168, 148, 46, 14);
		add(etiquetaEda);
		
		JTextArea areaEda = new JTextArea();
		areaEda.setEditable(false);
		areaEda.setBounds(168, 173, 120, 22);
		add(areaEda);
		
		JLabel etiquetaNac = new JLabel("Nacionalidad");
		etiquetaNac.setBounds(168, 206, 46, 14);
		add(etiquetaNac);
		
		JTextArea areaNac = new JTextArea();
		areaNac.setEditable(false);
		areaNac.setBounds(168, 231, 120, 22);
		add(areaNac);
		
		JLabel etiquetaId = new JLabel("Id");
		etiquetaId.setBounds(319, 32, 46, 14);
		add(etiquetaId);
		
		JTextArea areaId = new JTextArea();
		areaId.setEditable(false);
		areaId.setBounds(319, 57, 120, 22);
		add(areaId);
		
		JLabel label = new JLabel("Nombre");
		label.setBounds(10, 32, 46, 14);
		add(label);
		
		/*JComboBox equipo = new JComboBox();
		equipo.setBounds(10, 59, 120, 20);
		for(int i=0;i<venU.getEquipo().size();i++){
		equipo.addItem((Integer) venU.getEquipo().get(i));
		
		}
		add(equipo);*/
		
		JButton btnSiguiente = new JButton("Siguiente >>");
		btnSiguiente.setBounds(319, 266, 120, 23);
		add(btnSiguiente);
		
		JButton btnAtras = new JButton("<< Atras");
		btnAtras.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				prin.cambiar("usuario");
			}
		});
		btnAtras.setBounds(10, 266, 120, 23);
		add(btnAtras);
		
		

	}
	
	public boolean getB(){
		return b;
	}
	
	public void setB(){
		b=false;
	}
}
