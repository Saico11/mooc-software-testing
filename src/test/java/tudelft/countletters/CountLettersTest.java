package tudelft.countletters;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CountLettersTest {

    // En este ejercicio2 solo debemos configurar el codeCoverage y ver la clase counteLettersTest y analizar


    // Y en esta funcion tneemos que cambiar el count para que nos debuguee bien
    @Test
    public void multipleMatchingWords() {
        int words = new CountLetters().count("catr dogr");
        Assertions.assertEquals(2, words);
    }

    @Test
    public void lastWordDoesNotMatch() {
        int words = new CountLetters().count("cats|dog");
        Assertions.assertEquals(1, words);
    }

}