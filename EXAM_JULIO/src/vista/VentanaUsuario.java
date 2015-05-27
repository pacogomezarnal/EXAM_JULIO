package vista;

import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.SwingConstants;

import java.awt.Color;
import java.net.URL;
import java.sql.Connection;
import java.util.ArrayList;

import javax.swing.JButton;

import Modelo.Cadete;
import Modelo.ConexionDB;
import Modelo.modeloCadetes;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class VentanaUsuario extends JPanel {

	private String path;
	private URL url;
	private ImageIcon icon;
	private modeloCadetes modC;
	private TheLaby principal;
	private ConexionDB con;
	private Cadete cad;
	private boolean a=false;
	

	/**
	 * Create the panel.
	 */
	public VentanaUsuario(TheLaby prin,ConexionDB connec) {
		
		principal = prin;
		con=connec;
		if(con.connectDB()==true){
		modC =new modeloCadetes(con.getConexion(),this);
		modC.Consulta();
		}
		
		setLayout(null);
		
		/*JLabel foto = new JLabel("New label");
		
		foto.setBounds(10, 40, 127, 124);
		add(foto);
		path = "/julio.jpg";
		url = this.getClass().getResource(path);  
		icon = new ImageIcon(url); 
		foto.setIcon(icon);
		add(foto);
		foto.setHorizontalAlignment(SwingConstants.CENTER);
		*/
		JLabel etiquetaNom = new JLabel("Nombre");
		etiquetaNom.setBounds(168, 32, 46, 14);
		add(etiquetaNom);
		
		JTextArea areaNom = new JTextArea();
		areaNom.setEditable(false);
		areaNom.setBounds(168, 57, 120, 22);
		areaNom.setText(modC.getNom());
		add(areaNom);
		
		
		JLabel etiquetaApe = new JLabel("Apellidos");
		etiquetaApe.setBounds(168, 90, 46, 14);
		add(etiquetaApe);
		
		JTextArea areaApe = new JTextArea();
		areaApe.setEditable(false);
		areaApe.setBounds(168, 115, 120, 22);
		areaApe.setText(modC.getApel());
		add(areaApe);
		
		JLabel etiquetaEda = new JLabel("Edad");
		etiquetaEda.setBounds(168, 148, 46, 14);
		add(etiquetaEda);
		
		JTextArea areaEda = new JTextArea();
		areaEda.setEditable(false);
		areaEda.setBounds(168, 173, 120, 22);
		areaEda.setText(String.valueOf(modC.getEdad()));
		add(areaEda);
		
		JLabel etiquetaNac = new JLabel("Nacionalidad");
		etiquetaNac.setBounds(168, 206, 46, 14);
		
		add(etiquetaNac);
		
		JTextArea areaNac = new JTextArea();
		areaNac.setEditable(false);
		areaNac.setBounds(168, 231, 120, 22);
		areaNac.setText(modC.getNac());
		
		add(areaNac);
		
		JLabel etiquetaId = new JLabel("Id");
		etiquetaId.setBounds(319, 32, 46, 14);
		add(etiquetaId);
		
		JTextArea areaId = new JTextArea();
		areaId.setEditable(false);
		areaId.setBounds(319, 57, 120, 22);
		areaId.setText(String.valueOf(modC.getId()));
		add(areaId);
		
		JButton btnSiguiente = new JButton("Siguiente >>");
		btnSiguiente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				prin.cambiar("equipo");
			}
		});
		btnSiguiente.setBounds(319, 266, 120, 23);
		add(btnSiguiente);

	}
	
	public boolean getA(){
		return a;
	}
	
	public void setA(){
		a=false;
	}
	
	public ArrayList<Integer> getEquipo(){
		return modC.getEquipos();
		
	}
}
