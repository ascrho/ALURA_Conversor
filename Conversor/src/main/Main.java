package main;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		
		function convertir = new function();
		boolean flag = true;
		
		//Este while permite que el programa se ejecute hasta que el usuario introduzca en la ventana de dialogo, que no quiere realziar ninguna otra operacion
		while(flag) {
			//JOptionPane.showInputDialog, crear un cuadro de dialogo, almacena la opcion en la variable opciones
			//Requiere (ComponentePadre, se dejo en null)(Texto dentro de la caja)(JOptionPane.QUESTION_MESSAGE, clase estatica que retorna un int, agrega la opcion cancel)(icono quedo en null) 
			//(Arreglo Object con las opciones) (Conversor 1, como primera seleccion), por ultimo toString(), para convertir la opcion seleccionada en una cadena de texto que se almacena en la variable
			String opciones = (JOptionPane.showInputDialog(null,"Seleccione un opción de conversión:","Menu",JOptionPane.QUESTION_MESSAGE,null
					,new Object[] {"Conversor de moneda","Conversor de tiempo","Conversor de peso"},"Conversor de moneda")).toString();
			//Introduce la opcion seleccionada al bucle swicth
			switch(opciones) {
			
			//Si opciones = Conversor de moneda, ingresa al if
			case "Conversor de moneda":
				//Muestra un mensaje al usuario, y solicita ingresar en pesos chilenos, el monto que desea convertir
				String input = JOptionPane.showInputDialog("Ingrese la cantidad de pesos chilenos que desea convertir:");
				//Valida si lo ingresado por el usuario es un numero
				if (ValidarNumero(input)) {
					//Si es un numero, castea el string a un double, y lo almacena en la variable Minput, para ser usado por la clase function
					double Minput = Double.parseDouble(input);
					//Llama a la clase function, que recibe el parametro Minput
					//Esta clase incia con la instancia de la clase ConvertirMonedas, esta clase preguntara al usuario el tipo de cambio que desea realizar
					//De acuerdo con la seleccion entrara al bucle switch
					//switch ejecutara el metodo correspondiende a la seleccion realizada por el usuario, los cuales se encuentran en la clase ConvertirMonedas
					convertir.ConvertirMonedas(Minput);
					
					//Cuando finaliza el metodo ConvertirMonedas, rpegunta si se desea realizar otra operacion
					//Almacena el valor en respuesta
					int respuesta = JOptionPane.showConfirmDialog(null, "Desea realizar otra operación?");
					// El metodo OK_OPTION, retorna un booleano de acuerdo con la seleccion del usuario
					//Si es ok, el while, mediante la flag = true, pregunrara de nuevo por el tipo de operacion que se desea realziar
					if (JOptionPane.OK_OPTION == respuesta) {
						System.out.println("Selecciona opción Afirmativa");
					} else {
						//Si escoge no, o cancelar, el valor de flag pasara a false, y el siclo while terminara la ejecucion del programa
						flag = false;
						JOptionPane.showMessageDialog(null, "Programa terminado.");
					}
				} else {
					System.out.println("Valor invalido");
				}
				break;
				
			case "Conversor de tiempo":
				String inputTiempo = JOptionPane.showInputDialog("Ingrese la cantidad de Años, Meses o Dias que desea convertir a Horas:");

				if (ValidarNumeroInt(inputTiempo)) {
					int Tinput = Integer.parseInt(inputTiempo);
					convertir.ConvertirTiempo(Tinput);
					
					int respuesta = JOptionPane.showConfirmDialog(null, "Desea realizar otra operación?");
					if (JOptionPane.OK_OPTION == respuesta) {
						System.out.println("Selecciona opción Afirmativa");
					} else {
						flag = false;
						JOptionPane.showMessageDialog(null, "Programa terminado.");
					}
				} else {
					System.out.println("Valor invalido");
				}
				break;
				
			case "Conversor de peso":
				String inputPeso = JOptionPane.showInputDialog("Ingrese la cantidad de Kilos, Libras u Onzas que desea convertir a Gramos:");

				if (ValidarNumero(inputPeso)) {
					double Pinput = Double.parseDouble(inputPeso);
					convertir.ConvertirPeso(Pinput);
					
					int respuesta = JOptionPane.showConfirmDialog(null, "Desea realizar otra operación?");
					if (JOptionPane.OK_OPTION == respuesta) {
						System.out.println("Selecciona opción Afirmativa");
					} else {
						flag = false;
						JOptionPane.showMessageDialog(null, "Programa terminado.");
					}
				} else {
					System.out.println("Valor invalido");
				}
				break;
				
			}

		}
			
		
	}

	///////////////////////////////////////
	//METODOS
	///////////////////////////////////////
	
	//Este metodo permite valdiar que el caracter ingresado no es un letra
	public static boolean ValidarNumero(String input) {
		
		try {
			double x = Double.parseDouble(input);
			//El doble pipe indica que, si la condicion 1 es cierta, no pasa a la segunda
			//Admite positvos o negativos, pero solo numeros
			if(x >= 0 || x < 0);
			return true;
		} catch (NumberFormatException e) {
			return false;
		}
		
		
	}
	
	//Este metodo permite valdiar que el caracter ingresado no es un letra
	public static boolean ValidarNumeroInt(String input) {
		
		try {
			int x = Integer.parseInt(input);
			//El doble pipe indica que, si la condicion 1 es cierta, no pasa a la segunda
			//Admite positvos o negativos, pero solo numeros
			if(x >= 0 || x < 0);
			return true;
		} catch (NumberFormatException e) {
			return false;
		}
		
		
	}

	
}
