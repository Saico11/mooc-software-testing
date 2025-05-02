package tudelft.sum;

// añadimos las librerias necsarias para hacer el test

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.Arrays;


// hacemos la clase de test para el respectivo ejercicios
public class TwoNumbersSumTest {
    @Test
    void testAddTwoNumbers() {
        TwoNumbersSum adder = new TwoNumbersSum();
        ArrayList<Integer> a = new ArrayList<>(Arrays.asList(1, 2));
        ArrayList<Integer> b = new ArrayList<>(Arrays.asList(3, 4));
        ArrayList<Integer> expected = new ArrayList<>(Arrays.asList(4, 6));
        assertEquals(expected, adder.addTwoNumbers(a, b));
    }
}
