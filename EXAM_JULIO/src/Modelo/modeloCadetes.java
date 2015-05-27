package Modelo;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import vista.VentanaUsuario;

public class modeloCadetes {
private Connection conexion;
	
	
	
	Statement instruccion = null;
	ResultSet conjuntoInstrucciones = null;



	private Cadete cadete;



	private VentanaUsuario venU;
	
	private static String CONSULTA = "select * from cadetes";
	
	private static String ID="Id";
	private static String NOMBRE="Nombre";
	private static String APELLIDOS="Apellidos";
	private static String EDAD="Edad";
	private static String NACIONALIDAD="Nacionalidad";
	private static String EQUIPOS="Equipo";
	private static  ArrayList <String>  datosString=null;
	private static  ArrayList <Integer>  datosInt=null;
	private ArrayList<Integer> equipo=null;

	private  static String DATOS[]={ID,NOMBRE ,APELLIDOS,EDAD,NACIONALIDAD,EQUIPOS};
	
	public modeloCadetes(Connection con,VentanaUsuario venu){
		this.conexion=con;
		datosString=new ArrayList<String>();
		datosInt=new ArrayList<Integer>();
		equipo=new ArrayList<Integer>();
		venU=venu;
			
		
		
	}
	
	public void Consulta(){
		try{
			instruccion = conexion.createStatement();
			conjuntoInstrucciones =instruccion.executeQuery(CONSULTA);
			
			while(conjuntoInstrucciones.next()){
				equipo.add(conjuntoInstrucciones.getInt(EQUIPOS));
				 if(conjuntoInstrucciones.getInt(ID)==35){	
					 
					 datosInt.add(conjuntoInstrucciones.getInt(ID));
					 datosString.add(conjuntoInstrucciones.getString(NOMBRE));
					 datosString.add(conjuntoInstrucciones.getString(APELLIDOS));
					 datosInt.add(conjuntoInstrucciones.getInt(EDAD));
					 datosString.add(conjuntoInstrucciones.getString(NACIONALIDAD));
					 datosInt.add(conjuntoInstrucciones.getInt(EQUIPOS));
				
				 }
				
				
			}
			System.out.println(datosString);	
			
			
			
			
			cadete = new Cadete(venU,datosInt.get(0), datosString.get(0).toString(), datosString.get(1).toString(),datosInt.get(1), datosString.get(2).toString(), datosInt.get(2));
			
			
			
		}catch(SQLException e){
			e.printStackTrace();
		
		}
		
		finally{
			try{
				instruccion.close();
				conjuntoInstrucciones.close();
				
			}catch(SQLException f){
				f.printStackTrace();
			}
		}
		
		
		
	}
	
	public ArrayList<Integer> getEquipos(){
		return equipo;
	}
	
	public String getApel(){
		return cadete.getApellidos();
	}
	
	public String getNom(){
		return cadete.getNombre();
		
		
	}
	
	public String getNac(){
		return cadete.getNacionalidad();
	}

	public int getEdad(){
		return cadete.getEdad();
	}
	
	public int getEqui(){
		return cadete.getEquipo();
	}
	
	public int getId(){
		return cadete.getId();
	}
	

}
