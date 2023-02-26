package modelo;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import Control.PartidaController;
import boceto.MyButton;
import javax.swing.JLabel;

public class ParaFrameCompuesto extends FrameCompuesto {
private PartidaController partidaController=new PartidaController();

	public ParaFrameCompuesto() {
		super();
		
		
		MyButton[][] matrizBoton=getBotones();
		for (int fil = 0; fil < matrizBoton.length; fil++) {
			for (int col = 0; col < matrizBoton[fil].length; col++) {
				matrizBoton[fil][col].addActionListener(new ActionListener() {
					@Override
					
					public void actionPerformed(ActionEvent e) {
					MyButton botonPulsado=(MyButton)e.getSource();
					Coordenada coordenada=botonPulsado.getCoordenada();
					System.out.println("hola soy "+ coordenada.toString());
					
					partidaController.jugarPartida(coordenada);
					botonPulsado.cambiarTexto(partidaController.getCaracter());
					}
				});
			}
		}
		
		
	
	}
	public void mensajeGanador() {
		JLabel lblMensajeGanador = new JLabel("New label");
		lblMensajeGanador.setBounds(89, 53, 233, 14);
		getContentPane().add(lblMensajeGanador);
		lblMensajeGanador.setText("HAS GANADO");
	}
}
