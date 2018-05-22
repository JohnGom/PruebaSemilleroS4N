package test;

import static org.junit.Assert.*;
import org.junit.BeforeClass;
import org.junit.Test;

import program.Multiples;

public class TestMultiples {
	
	static Multiples multiples;
	static String[] listMultiples; 
	
	//Dentro del decorador BeforeClass iniciamos el objeto Multiples antes de hacer las pruebas y una única vez
	@BeforeClass
	public static void beforeTestClass() {
		multiples = new Multiples();
		//Se llama a multiplesNumbers ya que no es necesario hacerlo en cada prueba porque devolverá el mismo array
		listMultiples = multiples.multiplesNumbers(); 
	}

	//Prueba para verificar si el dato dentro de una posición específica del array es múltiplo de 3
	@Test
	public void multipleTree() {
		String info = listMultiples[23]; //La posición debe ser el número a verificar menos 1 y así en las demás pruebas
		String expected = "Fizz";
		assertEquals(expected, info);
	}
	
	//Prueba para verificar si el dato dentro de una posición específica del array es múltiplo de 5
	@Test
	public void multipleFive() {
		String info = listMultiples[84];
		String expected = "Buzz";
		assertEquals(expected, info);
	}
	
	//Prueba para verificar si el dato dentro de una posición específica del array es múltiplo de 3 y de 5
	@Test
	public void multipleBoth() {
		String info = listMultiples[29];
		String expected = "FizzBuzz";
		assertEquals(expected, info);
	}
	
	//Prueba para verificar si el dato dentro de una posición específica del array no es múltiplo de 3 y/o de 5
	@Test
	public void onlyNumber() {
		String info = listMultiples[42];
		String expected = "43";
		assertEquals(expected, info);
	}
	
	//Pruebas para corroborar el uso de los métodos de verificación de múltiplos 
	@Test
	public void checkMultipleTree() {
		boolean checked = multiples.isMultipleTree(18);
		assertEquals(true, checked);
	}
	
	@Test
	public void checkMultipleFive() {
		boolean checked = multiples.isMultipleFive(40);
		assertEquals(true, checked);
	}
	
	@Test
	public void checkMultipleFiveTree() {
		boolean checked = multiples.isMultipleFiveThree(75);
		assertEquals(true, checked);
	}
	
	@Test
	public void checkAnyMultiple() {
		boolean checked = multiples.isMultipleFive(44);
		assertEquals(false, checked);
	}

}
