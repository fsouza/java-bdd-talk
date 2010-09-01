package net.franciscosouza.selenium;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class CalculadoraTest {

    @Test
    public void testSoma() {
        Calculadora calculadora = new Calculadora();
        assertEquals(calculadora.somar(8, 2), 10);
    }
    
}
