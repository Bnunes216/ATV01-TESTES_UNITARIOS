
package main.java.com.newbies;

import static org.testng.Assert.assertEquals;
import org.testng.annotations.Test;

public class CalculatorTest{

    @Test
    public void testSoma() {
        int resultado = 2 + 2;
        assertEquals(resultado, 4, "A soma deve ser 4");
    }

    @Test
    public void testMultiplicacao() {
        int resultado = 2 * 3;
        assertEquals(resultado, 6, "A multiplicação deve ser 6");
    }
}