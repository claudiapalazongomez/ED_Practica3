package es.studium.practica3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestProducto
{

	@Test
    public void testaplicarDescuento1() 
	{
        Producto p = new Producto();
        p.setPrecio(40);
        p.aplicarDescuento(20);
        int resultadoEsperado = 32;
        double resultadoReal = p.getPrecio();
        assertEquals(resultadoEsperado, resultadoReal);
    }
    
    @Test
    public void testaplicarDescuento2() 
    {
    	Producto p = new Producto();
        p.setPrecio(40);
        p.aplicarDescuento(0);
        /*Esta línea no se ejecuta, porque según indica el
        enunciado, si se ejecuta cualquier método con valores incorrectos,
        no cambian los atributos del objeto.*/
        int resultadoEsperado = 40;
        double resultadoReal = p.getPrecio();
        assertEquals(resultadoEsperado, resultadoReal);
    }
    
    @Test
    public void testaplicarDescuento3() 
    {
        Producto p = new Producto();
        p.setPrecio(40);
        p.aplicarDescuento(150);
        /*Esta línea no se ejecuta, porque según indica el
        enunciado, si se ejecuta cualquier método con valores incorrectos,
        no cambian los atributos del objeto.*/
        int resultadoEsperado = 40;
        double resultadoReal = p.getPrecio();
        assertEquals(resultadoEsperado, resultadoReal);
    }
    
    @Test
    public void testsetIVA1() 
    {
        Producto p = new Producto();
        p.setIVA(21);
        int resultadoEsperado = 21;
        int resultadoReal = p.getIVA();
        assertEquals(resultadoEsperado, resultadoReal);
    }
    
    @Test
    public void testsetIVA2() 
    {
        Producto p = new Producto();
        p.setIVA(10);
        int resultadoEsperado = 10;
        int resultadoReal = p.getIVA();
        assertEquals(resultadoEsperado, resultadoReal);
    }
    
    @Test
    public void testsetIVA3() 
    {
        Producto p = new Producto();
        p.setIVA(4);
        int resultadoEsperado = 4;
        int resultadoReal = p.getIVA();
        assertEquals(resultadoEsperado, resultadoReal);
    }
    
    @Test
    public void testsetIVA4() 
    {
        Producto p = new Producto();
        p.setIVA(50);
        /*Esta línea no se ejecuta, porque según indica el
        enunciado, si se ejecuta cualquier método con valores incorrectos,
        no cambian los atributos del objeto.*/
        int resultadoEsperado = 21;
        int resultadoReal = p.getIVA();
        assertEquals(resultadoEsperado, resultadoReal);
    }

    @Test
    public void testsetPrecio1() 
    {
        Producto p = new Producto();
        p.setPrecio(50);
        double resultadoEsperado = 50;
        double resultadoReal = p.getPrecio();
        assertEquals(resultadoEsperado, resultadoReal);
    }
    
    @Test
    public void testsetPrecio2() 
    {
        Producto p = new Producto();
        p.setPrecio(-50);
        /*Esta línea no se ejecuta, porque según indica el
        enunciado, si se ejecuta cualquier método con valores incorrectos,
        no cambian los atributos del objeto.*/
        double resultadoEsperado = 0;
        double resultadoReal = p.getPrecio();
        assertEquals(resultadoEsperado, resultadoReal);
    }
    
}
