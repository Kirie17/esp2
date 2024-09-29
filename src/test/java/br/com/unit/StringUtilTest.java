package br.com.unit;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;
import org.junit.jupiter.api.Test;

public class StringUtilTest {

    @Test
    public void testPalindromoTrue() {
        assertTrue(StringUtil.Validador.ehPalindromo("arara"), "A palavra 'arara' é um palíndromo.");
    }

    @Test
    public void testPalindromoFalse() {
        assertFalse(StringUtil.Validador.ehPalindromo("teste"), "A palavra 'teste' não é um palíndromo.");
    }
}

class StringUtil {

    public static class Validador {
        public static boolean ehPalindromo(String palavra) {
            String invertida = new StringBuilder(palavra).reverse().toString();
            return palavra.equals(invertida);
        }
    }
}
