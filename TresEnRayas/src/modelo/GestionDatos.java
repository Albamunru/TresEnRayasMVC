package modelo;

public class GestionDatos {
	private Tablero tablero=new Tablero();
	public int numerojugada = 1;
	public String caracter;
	public int contadorO=0;
	public int contadorX=1;
	/**
	 * Informa de quien es el turno actual
	 * 
	 * @return 1 o 0 dependiendo de quien sea el propietario del turno
	 */
	public int verTurno() {
		if (numerojugada % 2 == 0)
			return 1;
		return 2;

	}
	public String cambiarTurno() {
		
		if(numerojugada==2) {
		this.numerojugada=1;
		this.caracter="X";
		contadorX++;
		System.out.println("Tenemos" + contadorX+ " fichas turno X");
		}else {
			this.numerojugada=2;
			this.caracter="O";
			contadorO++;
			System.out.println("tenemos " + contadorO+ " fichas turno O");
		}
		return this.caracter;
	}
	
	public int getContadorCirculo() {
		return this.contadorO;
		
	}
	
	public int getContadorEquis() {
		return this.contadorX;
		
	}
}
