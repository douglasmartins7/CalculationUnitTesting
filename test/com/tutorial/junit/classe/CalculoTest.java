package com.tutorial.junit.classe;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalculoTest {

	@Test
	public void testSomar() {
		Calculo c = new Calculo();
		int a = 20;
		int b = 10;
		assertEquals("Teste Soma", 30, c.somar(a, b));
	}

	@Test
	public void testDividir() {
		Calculo c = new Calculo();
		int a = 20;
		int b = 10;
		assertEquals("Teste divisão", 2, c.dividir(a, b));
	}

	@Test
	public void testMultiplicar() {
		Calculo c = new Calculo();
		int a = 20;
		int b = 10;
		assertEquals("Teste Multiplicação", 200, c.multiplicar(a, b));
	}

	@Test
	public void testSubtrair() {
		Calculo c = new Calculo();
		int a = 20;
		int b = 10;
		assertEquals("Teste subtração", 10, c.subtrair(a, b));
	}

}
