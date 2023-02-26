package Control;

import modelo.Coordenada;
import modelo.GestionDatos;
import modelo.ParaFrameCompuesto;
import modelo.Tablero;

public class PartidaController {
	private GestionDatos gestionDatos;
	private Tablero tablero;
	private String caracter;
	
	



	public PartidaController() {
		super();
		this.gestionDatos = new GestionDatos();
		this.tablero = new Tablero();
	}

	public int getTurno() {

		return this.gestionDatos.verTurno();

	}

	public String getCaracter() {

		return this.caracter;

	}
	
	

	public void jugarPartida(Coordenada coordenada) {
		// System.out.println(gestionDatos.verTurno() +" turno ");
		// logica de la partida
		
		
		

		if (tablero.mirarCasillaLibre(coordenada)) {
			
			
			tablero.setValorPosicion(coordenada, getTurno());

			System.out.println("Hemos puesto ficha");

			
			
			this.caracter = this.gestionDatos.cambiarTurno();
			if(gestionDatos.contadorX ==3|| gestionDatos.getContadorCirculo()==3) {
				
				System.out.println("eeeee ya hemos puesto 3");
				boolean tres=tablero.comprobarTresEnRaya();
				System.out.println(tres);
				if(tres) {
					
				System.out.println("Ha ganado el jugador" + getTurno());
					
					
				}else {
					// En esta parte que no hemos sido capaz de controlar nos faltaria comprobar 
					//las casillas contiguas y cambiar los movimientos por los nuevos
					
					
					
					boolean mipropiedad=tablero.comprobarPropiedad(coordenada, getTurno());
					System.out.println( "Esta casilla es "+ mipropiedad);
					
					
					
					
					
				}
				
			}
			
			

		} else {
			System.out.println("OCUPADO");
		}

		System.out.println(gestionDatos.verTurno() + " turno ");

	}

}
