package tudelft.mirror;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
//se implemento la clase de test
public class MirrorTest {
    @Test
    void testMirrorEnds() {
        Mirror mirror = new Mirror();
        assertEquals("ab", mirror.mirrorEnds("abXYZba"));
        assertEquals("a", mirror.mirrorEnds("abca"));
        assertEquals("aba", mirror.mirrorEnds("aba"));
    }
}