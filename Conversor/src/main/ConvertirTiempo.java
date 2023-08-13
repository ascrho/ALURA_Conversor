package main;

import javax.swing.JOptionPane;

public class ConvertirTiempo {

	public void ConvertirMesesAHoras(int valor) {
		//Realiza la conversion
		int mesesHora = valor*720;
		//Redondea a traves de la clase Math
		mesesHora = (int) Math.round(mesesHora*100d)/100;
		//Muestra un mensaje con el resultado
		JOptionPane.showMessageDialog(null, valor+" Meses equivalen a "+mesesHora+" Horas.");
	}
	
	public void ConvertirAñosAHoras(int valor) {
		//Realiza la conversion
		int añoHora = valor*8760;
		//Redondea a traves de la clase Math
		añoHora = (int) Math.round(añoHora*100d)/100;
		//Muestra un mensaje con el resultado
		JOptionPane.showMessageDialog(null, valor+" Años equivalen a "+añoHora+" Horas.");
	}
	
	public void ConvertirDiasAHoras(int valor) {
		//Realiza la conversion
		int diasHoras = valor*24;
		//Redondea a traves de la clase Math
		diasHoras = (int) Math.round(diasHoras*100d)/100;
		//Muestra un mensaje con el resultado
		JOptionPane.showMessageDialog(null, valor+" Dias equivalen a "+diasHoras+" Minutos.");
	}
	
}
