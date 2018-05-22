package program;

public class Multiples {
	
	//Creamos el array numbers de tipo string
	public String[] numbers;
	
	public Multiples() {
		//Inicializamos en el constructor el array con un tamaño de 100
		numbers = new String[100];
	}
	
	
	public String[] multiplesNumbers() {
		
		//Recorremos un for de 100 iteraciones para llenar el array con la información requerida
		for (int i = 0; i < 100; i++) {
			//Llamamos los métodos de verificación dentro de las condiciones enviándole i+1  porque i empieza en cero
			if(isMultipleFiveThree(i + 1)) {
				numbers[i] = "FizzBuzz"; //Se guarda la información en la posición del número verificado menos 1
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
	
	//Método para imprimir en consola la información guardada en el array numbers
	public void print() {
		for (int i = 0; i < numbers.length; i++) {
			System.out.println(numbers[i]);
		}
	}
	
	//Método booleano para verificar si el numero recibido es múltiplo de 3
	public boolean isMultipleFiveThree(int i) {
		return i%3 == 0 && i%5 == 0;
	}
	
	//Método booleano para verificar si el numero recibido es múltiplo de 5
	public boolean isMultipleFive(int i) {
		return i%5 == 0;
	}
	
	//Método booleano para verificar si el numero recibido es múltiplo de 3 y de 5
	public boolean isMultipleTree(int i) {
		return i%3 == 0;
	}
	
}
