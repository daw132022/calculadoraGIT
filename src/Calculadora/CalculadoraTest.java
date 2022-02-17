package Calculadora;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Ignore;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CalculadoraTest {
	
	Calculadora miCalculadora = new Calculadora();
	
	@BeforeAll
	static void testBeforeAll() {
		System.out.println("Ejecutando TestBeforeAll");
	}
	
	@AfterAll
	static void testAfterAll() {
		System.out.println("Ejecutando TestAfterAll");
	}
	
	@BeforeEach//Se ejecuta antes de cada test, se ejecuta tantas veces como test haya
	void testBeforeEach() {
		System.out.println("Ejecutando TestBeforeEach");
	}
	
	@AfterEach
	void testAfterEach() {
		System.out.println("Ejecutando TestAfterEach");
	}
	
	@Ignore
	void testSuma() {
			
		int valorEsperado = 15;
		int valorObtenido = miCalculadora.suma(10, 5);

		assertEquals(valorEsperado,valorObtenido);//Nos dice si el test cumple lo establecido o no
		System.out.println("Ejecutando TestSuma");
	}
	
	/*@Test
	void testSuma() {
			
		int valorEsperado = 15;
		int valorObtenido = miCalculadora.suma(10, 5);

		assertEquals(valorEsperado,valorObtenido);//Nos dice si el test cumple lo establecido o no
		System.out.println("Ejecutando TestSuma");
	}*/
	
	@Test
	void testResta() {
		
		int valorEsperado = 5;
		int valorObtenido = miCalculadora.resta(10, 5);

		assertEquals(valorEsperado,valorObtenido);
		System.out.println("Ejecutando TestResta");
	}
	
	@Test
	void testMultiplicacion() {
		
		int valorEsperado = 50;
		int valorObtenido = miCalculadora.multiplicacion(10, 5);

		assertEquals(valorEsperado,valorObtenido);
		System.out.println("Ejecutando TestMultiplicación");
	}


	@Test
	void testDivision() {
		
		int valorEsperado = 2;
		int valorObtenido = miCalculadora.division(10, 5);

		assertEquals(valorEsperado,valorObtenido);
		System.out.println("Ejecutando TestDivisión");
	}

}
