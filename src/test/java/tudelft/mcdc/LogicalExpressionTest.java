package tudelft.mcdc;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class LogicalExpressionTest {
    @Test
    public void testCase2_TTF() {
        assertTrue(LogicalExpression.evaluate(true, true, false),
                "Caso 2: A=true, B=true, C=false → (T&&T)||F = T");
    }

    @Test
    public void testCase3_TFT() {
        assertTrue(LogicalExpression.evaluate(true, false, true),
                "Caso 3: A=true, B=false, C=true → (T&&F)||T = T");
    }

    @Test
    public void testCase4_TFF() {
        assertFalse(LogicalExpression.evaluate(true, false, false),
                "Caso 4: A=true, B=false, C=false → (T&&F)||F = F");
    }

    @Test
    public void testCase6_FTF() {
        assertFalse(LogicalExpression.evaluate(false, true, false),
                "Caso 6: A=false, B=true, C=false → (F&&T)||F = F");
    }

    // Pruebas adicionales para cobertura completa (opcional)
    @Test
    public void testCase1_TTT() {
        assertTrue(LogicalExpression.evaluate(true, true, true));
    }

    @Test
    public void testCase5_FTT() {
        assertTrue(LogicalExpression.evaluate(false, true, true));
    }

    @Test
    public void testCase7_FFT() {
        assertTrue(LogicalExpression.evaluate(false, false, true));
    }

    @Test
    public void testCase8_FFF() {
        assertFalse(LogicalExpression.evaluate(false, false, false));
    }
}
