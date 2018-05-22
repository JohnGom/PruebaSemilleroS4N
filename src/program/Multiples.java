package program;

public class Multiples {
	
	//Creamos el array numbers de tipo string
	public String[] numbers;
	
	public Multiples() {
		//Inicializamos en el constructor el array con un tama�o de 100
		numbers = new String[100];
	}
	
	
	public String[] multiplesNumbers() {
		
		//Recorremos un for de 100 iteraciones para llenar el array con la informaci�n requerida
		for (int i = 0; i < 100; i++) {
			//Llamamos los m�todos de verificaci�n dentro de las condiciones envi�ndole i+1  porque i empieza en cero
			if(isMultipleFiveThree(i + 1)) {
				numbers[i] = "FizzBuzz"; //Se guarda la informaci�n en la posici�n del n�mero verificado menos 1
			} else if(isMultipleTree(i + 1)){
				numbers[i] = "Fizz"; 
			} else if(isMultipleFive(i + 1)) {
				numbers[i] = "Buzz";
			} else {
				numbers[i] = Integer.toString(i + 1);
			}
		}
		return numbers;
	}
	
	//M�todo para imprimir en consola la informaci�n guardada en el array numbers
	public void print() {
		for (int i = 0; i < numbers.length; i++) {
			System.out.println(numbers[i]);
		}
	}
	
	//M�todo booleano para verificar si el numero recibido es m�ltiplo de 3
	public boolean isMultipleFiveThree(int i) {
		return i%3 == 0 && i%5 == 0;
	}
	
	//M�todo booleano para verificar si el numero recibido es m�ltiplo de 5
	public boolean isMultipleFive(int i) {
		return i%5 == 0;
	}
	
	//M�todo booleano para verificar si el numero recibido es m�ltiplo de 3 y de 5
	public boolean isMultipleTree(int i) {
		return i%3 == 0;
	}
	
}
