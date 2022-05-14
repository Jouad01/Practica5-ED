package edu.poniperro;

import static org.junit.Assert.*;
import org.junit.BeforeClass;
import org.junit.Test;


public class CalculadoraTest {

    static Calculadora calculadora;

    @BeforeClass
    public static void setup() {
        calculadora = new Calculadora();
    }

    @Test
    public void sumarTest() {
        assertEquals(10.0, calculadora.suma(4.0, 6.0), 0.01);
        assertEquals(15.0, calculadora.suma(9.0, 6.0), 0.01);
        assertEquals(20.0, calculadora.suma(14.0, 6.0), 0.01);
    }

    @Test
    public void restarTest() {
        assertEquals(-6.0, calculadora.resta(4.0, 10.0), 0.01);
        assertEquals(-16.0, calculadora.resta(2.0, 18.0), 0.01);
        assertEquals(-5.0, calculadora.resta(5.0, 10.0), 0.01);

    }

    @Test
    public void multiplicarTest() {
        assertEquals(20.0, calculadora.multiplica(4.0, 5.0), 0.01);
        assertEquals(18.0, calculadora.multiplica(9.0, 2.0), 0.01);
        assertEquals(49.0, calculadora.multiplica(7.0, 7.0), 0.01);
    }

    @Test
    public void dividirTest() {
        assertEquals(2.0, calculadora.divide(10.0, 5.0), 0.01);
        assertEquals(3.0, calculadora.divide(18.0, 6.0), 0.01);
        assertEquals(10.0, calculadora.divide(40.0, 4.0), 0.01);

    }
}
