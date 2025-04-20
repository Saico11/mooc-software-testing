package tudelft.Calculadora;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculadoraTest {

    private final Calculadora calc = new Calculadora();

    @Test
    public void testSumarPositivos() {
        assertEquals(5, calc.sumar(2, 3));
    }

    @Test
    public void testSumarNegativos() {
        assertEquals(-5, calc.sumar(-2, -3));
    }

    @Test
    public void testSumarMezclados() {
        assertEquals(1, calc.sumar(4, -3));
    }

    @Test
    public void testEvaluarNumeroPositivo() {
        assertEquals("Positivo", calc.evaluarNumero(10));
    }

    @Test  
    public void testEvaluarNumeroNegativo() {
        assertEquals("Negativo", calc.evaluarNumero(-5));
    }

    @Test
    public void testEvaluarNumeroCero() {
        assertEquals("Cero", calc.evaluarNumero(0));
    }

    @Test
    public void testEsParVerdadero() {
        assertTrue(calc.esPar(4));
    }

    @Test
    public void testEsParFalso() {
        assertFalse(calc.esPar(5));
    }

    @Test
    public void testEsParCero() {
        assertTrue(calc.esPar(0)); // 0 se considera par
    }
}