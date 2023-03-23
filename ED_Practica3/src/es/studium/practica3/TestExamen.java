package es.studium.practica3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestExamen
{

	@Test
	void testCamino1()
	{
		String resultadoEsperado = "Ya eres mayor de edad";
		String resultadoReal = Examen.mensaje(18);
		assertEquals(resultadoEsperado, resultadoReal);
	}
	
	@Test
	void testCamino2()
	{
		String resultadoEsperado = "Ya puedes jubilarte";
		String resultadoReal = Examen.mensaje(67);
		assertEquals(resultadoEsperado, resultadoReal);
	}
	
	@Test
	void testCamino3()
	{
		String resultadoEsperado = "No pasa nada";
		String resultadoReal = Examen.mensaje(7);
		assertEquals(resultadoEsperado, resultadoReal);
	}
	
	@Test
	void testCamino4()
	{
		boolean resultadoEsperado = true;
		boolean resultadoReal = Examen.validar("77818612K");
		assertEquals(resultadoEsperado, resultadoReal);
	}
	
	@Test
	void testCamino5()
	{
		boolean resultadoEsperado = false;
		boolean resultadoReal = Examen.validar("629M");
		assertEquals(resultadoEsperado, resultadoReal);
	}

}
