package vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Modelo.ConexionDB;

import java.awt.CardLayout;

public class TheLaby extends JFrame {

	private JPanel contentPane;
	private VentanaEquipo venE;
	private VentanaComprobacion venC;
	private VentanaUsuario venU;
	private ConexionDB con;
	private CardLayout card;
	private String palabra;
	private JPanel panel;

	
	public TheLaby() {
		
		con = new ConexionDB("localhost", "thelaby", "root", "tonphp");
		
		venC= new VentanaComprobacion(this);
		venE = new VentanaEquipo(this,venU);
		venU = new VentanaUsuario(this,con);
		venC.setBounds(0, 0, 430, 300);
		venE.setBounds(0, 0, 430, 300);
		venU.setBounds(0, 0, 430, 300);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 628, 373);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		 panel = new JPanel(new CardLayout());
		panel.setBounds(0, 0, 430, 300);
		panel.setLayout(panel.getLayout());
		
		
		
		
			
	

		
		panel.add(venU,"usuario");
		panel.add(venE,"equipo");
		panel.add(venC,"comprobacion");
		
		contentPane.add(panel, BorderLayout.CENTER);
			
	}

	public void cambiar(String pal){
		palabra= pal;
		card();
	}
	
	public void card(){
		card = (CardLayout)(panel.getLayout());
		card.show(panel, palabra);
	}
}
