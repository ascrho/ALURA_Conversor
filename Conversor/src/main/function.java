package main;

import javax.swing.JOptionPane;

public class function {
	
	//Crea el objeto monedas del tipo ConvertirMonedas
	ConvertirMonedas monedas = new ConvertirMonedas();
	ConvertirTiempo tiempo = new ConvertirTiempo();
	ConvertirPeso peso = new ConvertirPeso();
	
	//Este metodo, pregunta al afiliado sobre el tipo de cambio que desea realizar
	public void ConvertirMonedas(Double Minput) {
		String opcion = (JOptionPane.showInputDialog(null,"Elije la moneda a la que deseas convertir tu dinero","Monedas",JOptionPane.QUESTION_MESSAGE,null
			   ,new Object[] {"De Pesos Chilenos a Dolar","De Pesos Chilenos a Euro","De Pesos Chilenos a Libras Esterlinas","De Pesos Chilenos a Yen Japonés","De Pesos Chilenos a Won sur-coreano"
					         ,"De Dolar a Pesos Chilenos","De Euro a Pesos Chilenos","De Libras Esterlinas a Pesos Chilenos","De Yen Japonés a Pesos Chilenos","De Won sur-coreano a Pesos Chilenos"}
		       ,"De Pesos Chilenos a Dolar")).toString();
		
		//De acuerdo con lo seleccionado, switch se encargara de ejecutar el meetodo correspondiente
		switch(opcion) {
		case "De Pesos Chilenos a Dolar":
			monedas.ConvertirPesosChilenosADolares(Minput);
			break;
		
		case "De Pesos Chilenos a Euro":
			monedas.ConvertirPesosChilenosAEuros(Minput);
			break;
			
		case "De Pesos Chilenos a Libras Esterlinas":
			monedas.ConvertirPesosChilenosALibrasEsterlinas(Minput);
			break;
		
		case "De Pesos Chilenos a Yen Japonés":
			monedas.ConvertirPesosChilenosAYenJapones(Minput);
			break;
			
		case "De Pesos Chilenos a Won sur-coreano":
			monedas.ConvertirPesosChilenosAWonSurCoreano(Minput);
			break;
		
		case "De Dolar a Pesos Chilenos":
			monedas.ConvertirDolaresAPesosChilenos(Minput);
			break;
			
		case "De Euro a Pesos Chilenos":
			monedas.ConvertirEurosAPesosChilenos(Minput);
			break;
		
		case "De Libras Esterlinas a Pesos Chilenos":
			monedas.ConvertirLibrasEsterlinasAPesosChilenos(Minput);
			break;
		
		case "De Yen Japonés a Pesos Chilenos":
			monedas.ConvertirYenJaponesAPesosChilenos(Minput);
			break;
			
		case "De Won sur-coreano a Pesos Chilenos":
			monedas.ConvertirWonSurCoreanoAPesosChilenos(Minput);
			break;
			
		}
	}
	
	public void ConvertirTiempo(int Tinput) {
		
		String opcion = (JOptionPane.showInputDialog(null,"Elije la moneda a la que deseas convertir tu dinero","Monedas",JOptionPane.QUESTION_MESSAGE,null
				   ,new Object[] {"De Meses a Horas","De Años a Horas","De Dias a Minutos"},"De Meses a Horas")).toString();
			
			//De acuerdo con lo seleccionado, switch se encargara de ejecutar el metodo correspondiente
			switch(opcion) {
			case "De Meses a Horas":
				tiempo.ConvertirMesesAHoras(Tinput);
				break;
				
			case "De Años a Horas":
				tiempo.ConvertirAñosAHoras(Tinput);
				break;
				
			case "De Dias a Minutos":
				tiempo.ConvertirDiasAHoras(Tinput);
				break;
			}
			
	}
	
	public void ConvertirPeso(double Pinput) {
		
		String opcion = (JOptionPane.showInputDialog(null,"Elije la moneda a la que deseas convertir tu dinero","Monedas",JOptionPane.QUESTION_MESSAGE,null
				   ,new Object[] {"De Kilos a Gramos","De Libras a Gramos","De Onzas a Gramos"},"De Kilos a Gramos")).toString();
			
			//De acuerdo con lo seleccionado, switch se encargara de ejecutar el metodo correspondiente
			switch(opcion) {
			case "De Kilos a Gramos":
				peso.ConvertirKilosAGramos(Pinput);
				break;
				
			case "De Libras a Gramos":
				peso.ConvertirLibrasAGramos(Pinput);
				break;
				
			case "De Onzas a Gramos":
				peso.ConvertirOnzasAGramos(Pinput);
				break;
			}
			
	}

}
