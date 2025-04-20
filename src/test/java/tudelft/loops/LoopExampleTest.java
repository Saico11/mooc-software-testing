package tudelft.loops;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class LoopExampleTest {

    // Pruebas para sumEvenNumbers (criterio de bucle)
    @Test
    public void sumEvenNumbers_zeroIterations() {
        int[] emptyArray = {};
        assertEquals(0, LoopExample.sumEvenNumbers(emptyArray),
                "Debería retornar 0 para arreglo vacío (0 iteraciones)");
    }

    @Test
    public void sumEvenNumbers_oneIteration() {
        int[] singleElement = {2};
        assertEquals(2, LoopExample.sumEvenNumbers(singleElement),
                "Debería sumar el único elemento (1 iteración)");
    }

    @Test
    public void sumEvenNumbers_multipleIterations() {
        int[] multipleElements = {1, 2, 3, 4, 5, 6};
        assertEquals(12, LoopExample.sumEvenNumbers(multipleElements),
                "Debería sumar solo los pares (2+4+6=12)");
    }

    @Test
    public void sumEvenNumbers_noEvens() {
        int[] allOdds = {1, 3, 5, 7};
        assertEquals(0, LoopExample.sumEvenNumbers(allOdds),
                "Debería retornar 0 si no hay pares");
    }

    // Pruebas para findFirstAboveLimit (criterio de bucle + condiciones)

    @Test
    public void findFirstAboveLimit_zeroIterations() {
        int[] emptyArray = {};
        assertEquals(-1, LoopExample.findFirstAboveLimit(emptyArray, 10),
                "Arreglo vacío debería retornar -1");
    }

    @Test
    public void findFirstAboveLimit_oneIterationMatch() {
        int[] singleElement = {15};
        assertEquals(15, LoopExample.findFirstAboveLimit(singleElement, 10),
                "Debería retornar el único elemento si es mayor al límite");
    }

    @Test
    public void findFirstAboveLimit_oneIterationNoMatch() {
        int[] singleElement = {5};
        assertEquals(-1, LoopExample.findFirstAboveLimit(singleElement, 10),
                "Debería retornar -1 si el único elemento no supera el límite");
    }

    @Test
    public void findFirstAboveLimit_multipleIterationsFirstMatch() {
        int[] elements = {5, 15, 20, 25};
        assertEquals(15, LoopExample.findFirstAboveLimit(elements, 10),
                "Debería retornar el primer elemento que supera el límite");
    }

    @Test
    public void findFirstAboveLimit_multipleIterationsLastMatch() {
        int[] elements = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11};
        assertEquals(11, LoopExample.findFirstAboveLimit(elements, 10),
                "Debería retornar el último elemento si es el único que supera el límite");
    }

    @Test
    public void findFirstAboveLimit_multipleIterationsNoMatch() {
        int[] elements = {1, 2, 3, 4, 5};
        assertEquals(-1, LoopExample.findFirstAboveLimit(elements, 10),
                "Debería retornar -1 si ningún elemento supera el límite");
    }
}
