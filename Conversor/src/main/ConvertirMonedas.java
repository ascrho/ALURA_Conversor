package main;
import javax.swing.JOptionPane;

//Esta es la clase que se cncarga de realziar las conversiones de moneda, cada metodo realzia una conversion distinta
public class ConvertirMonedas {
	
	//DOLARES
	public void ConvertirPesosChilenosADolares(double valor) {
		//Realiza la conversion
		double monedaDolar = valor*0.0012;
		//Redondea a traves de la clase Math
		monedaDolar = (double) Math.round(monedaDolar*100d)/100;
		//Muestra un mensaje con el resultado
		JOptionPane.showMessageDialog(null, "Tienes $ "+monedaDolar+" Dolares.");
	}
	
	//EUROS
	public void ConvertirPesosChilenosAEuros(double valor) {
		//Realiza la conversion
		double monedaEuro = valor/0.0011;
		//Redondea a traves de la clase Math
		monedaEuro = (double) Math.round(monedaEuro*100d)/100;
		
		JOptionPane.showMessageDialog(null, "Tienes $ "+monedaEuro+" Euros.");
	}

	//LIBRAS ESTERLINA
	public void ConvertirPesosChilenosALibrasEsterlinas(double valor) {
		//Realiza la conversion
		double monedaLibraEsterlina = valor*0.00092;
		//Redondea a traves de la clase Math
		monedaLibraEsterlina = (double) Math.round(monedaLibraEsterlina*100d)/100;
		
		JOptionPane.showMessageDialog(null, "Tienes $ "+monedaLibraEsterlina+" Libras Esterlinas.");
	}
	
	//YEN JAPONES
	public void ConvertirPesosChilenosAYenJapones(double valor) {
		//Realiza la conversion
		double monedaYenJapones = valor*0.17;
		//Redondea a traves de la clase Math
		monedaYenJapones = (double) Math.round(monedaYenJapones*100d)/100;
		
		JOptionPane.showMessageDialog(null, "Tienes $ "+monedaYenJapones+" Yen Japone.s");
	}
	
	//WON SUR COREANO
	public void ConvertirPesosChilenosAWonSurCoreano(double valor) {
		//Realiza la conversion
		double monedaWonSurCoreano = valor*1.55;
		//Redondea a traves de la clase Math
		monedaWonSurCoreano = (double) Math.round(monedaWonSurCoreano*100d)/100;
		
		JOptionPane.showMessageDialog(null, "Tienes $ "+monedaWonSurCoreano+" Won Surcoreano.");
	}
	
	/////////////////////////////
	//PESOS CHILENOS
	/////////////////////////////
	
	//DOLARES
	public void ConvertirDolaresAPesosChilenos(double valor) {
		//Realiza la conversion
		double monedaPesoChileno = valor*859.20;
		//Redondea a traves de la clase Math
		monedaPesoChileno = (double) Math.round(monedaPesoChileno*100d)/100;
		
		JOptionPane.showMessageDialog(null, "Tienes $ "+monedaPesoChileno+" Pesos Chilenos.");
	}
	
	//EUROS
	public void ConvertirEurosAPesosChilenos(double valor) {
		//Realiza la conversion
		double monedaPesoChileno = valor*940.31;
		//Redondea a traves de la clase Math
		monedaPesoChileno = (double) Math.round(monedaPesoChileno*100d)/100;
		
		JOptionPane.showMessageDialog(null, "Tienes $ "+monedaPesoChileno+" Pesos Chilenos.");
	}

	//LIBRAS ESTERLINA
	public void ConvertirLibrasEsterlinasAPesosChilenos(double valor) {
		//Realiza la conversion
		double monedaPesoChileno = valor*1089.81;
		//Redondea a traves de la clase Math
		monedaPesoChileno = (double) Math.round(monedaPesoChileno*100d)/100;
		
		JOptionPane.showMessageDialog(null, "Tienes $ "+monedaPesoChileno+" Pesos Chilenos.");
	}
	
	//YEN JAPONES
	public void ConvertirYenJaponesAPesosChilenos(double valor) {
		//Realiza la conversion
		double monedaPesoChileno = valor*5.92;
		//Redondea a traves de la clase Math
		monedaPesoChileno = (double) Math.round(monedaPesoChileno*100d)/100;
		
		JOptionPane.showMessageDialog(null, "Tienes $ "+monedaPesoChileno+" Pesos Chilenos.");
	}
	
	//WON SUR COREANO
	public void ConvertirWonSurCoreanoAPesosChilenos(double valor) {
		//Realiza la conversion
		double monedaPesoChileno = valor*0.65;
		//Redondea a traves de la clase Math
		monedaPesoChileno = (double) Math.round(monedaPesoChileno*100d)/100;
		
		JOptionPane.showMessageDialog(null, "Tienes $ "+monedaPesoChileno+" Pesos Chilenos.");
	}
}
