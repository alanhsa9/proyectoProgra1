//*Sebastian Igancio Fajardo Casillas A01336550 
//*Alan Augusto Herrera Sanchez A01338336 
//*Daniel ALejandro Osorio Rodriguez A01331173
import javax.swing.JOptionPane;
	public class ProyectoIntegrador {
	public static void main (String[] args){
		int x = 0;
		int partidos=0;
		int equipos=0;
			
		for (String rep= "0"; rep != "S"; rep=JOptionPane.showInputDialog("Para volver a correr el programa escriba S")){
		int opcion = Integer.parseInt(JOptionPane.showInputDialog("1.-Dar de alta los equipos" + " 2.- Registrar los resultados de un Juego" + " 3.- Reporte" + " 4.- Salir del programa"));
		
		switch (opcion){
		
		case 1:
			partidos = Integer.parseInt(JOptionPane.showInputDialog("Dime cuantos partido habra"));
			equipos = Integer.parseInt(JOptionPane.showInputDialog("Dime cuantos equipos habra"));
			String [][] equipo = new String[equipos][12]; 
			
			for (int i = 0 ; i<equipo.length; i++){ 
				for(int j = 0 ; j< equipo[i].length; j++){ 
					if ( j == 0 ){ 
					equipo [i] [j] = JOptionPane.showInputDialog("ingrese el nombre del pais.");
					}
					else{
					equipo [i] [j] = JOptionPane.showInputDialog("Ingrese el nombre del jugador.");
					}
				}
			}
			
			for(int i = 0; i< equipo.length; i++){ 
				for (int j = 0; j< equipo[i].length; j++){ 
				if (j>0) 
				System.out.print(equipo[i][j] + " "); 
				else
					System.out.print (" ");
				
				}
			}
			
			int [][] edades = new int [equipos][12]; 
			int R = 0; int C = 0; 
			for (int i = 1; i!=0; i =Integer.parseInt(JOptionPane.showInputDialog("ingrese un numero diferente de cero para continuar.") )){
			R =Integer.parseInt(JOptionPane.showInputDialog ("Ingrese el numero de renglo.")); 
			C = Integer.parseInt(JOptionPane.showInputDialog ("Ingrese el numero de columna")); 
			edades [R][C] = Integer.parseInt(JOptionPane.showInputDialog ("Edad del jugador")); 
				}
			
			R=0; 
			C=0; 
			boolean [][] extranjerosTF =new boolean [equipos][12]; 
			String [][] equiposExtranjeros = new String [equipos] [12];
			for (int i = 1; i!=0 ; i = Integer.parseInt(JOptionPane.showInputDialog("ingrese un numero diferente de cero para continuar.") )){
			
			R = Integer.parseInt(JOptionPane.showInputDialog ("Ingrese el numero de renglon")); 
			C = Integer.parseInt(JOptionPane.showInputDialog ("Ingrese el numero de columna")); 
			equiposExtranjeros [0][C] = equipo [0][C];
			equiposExtranjeros [R][C] = JOptionPane.showInputDialog("Ingrese el nombre del equipo donde juega el jugador cuando no esta en su seleccion"); 
			extranjerosTF [R][C] = JOptionPane.showInputDialog("ingrese un true, si el equipo en el que juega el jugador es extranjero ó un nfalse.") != null; 
			}
			
			String [][] dt = new String [equipos][2]; 
				
				for(int j = 0; j<dt [1].length; j++){ 
				dt[0][j] = equipo[0][j]; 
				dt [1][j] = JOptionPane.showInputDialog("Ingrese el nombre del director tecnico de la seleccion"); 
				}
				x = 1; 
				break; 
				
		case 2: if (x!=0){ 
			int [][] goles = new int [partidos][2]; 
				for(int i = 0; i<goles.length; i++){ 
					for(int j = 0; j<goles [i].length; j++){ 
					goles [i][j] = Integer.parseInt(JOptionPane.showInputDialog("Ingrese los goles del partido" + i+1 + " del equipo " + j+1));
					} 
				} 
			}
			
			String [] equiposPorPartido = new String [partidos]; 
			for (int i = 0; i<partidos; partidos--){ 
				equiposPorPartido [i] = JOptionPane.showInputDialog("Escribe los equipos de este partido"); 
				System.out.println(equiposPorPartido[i]); 
				} 
				
				break; 
				} 
			} 
	} 
}