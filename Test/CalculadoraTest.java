import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculadoraTest {
    // arrange
    private final Calculadora calculadora = new Calculadora();
    private final FreteCalculator freteCalculator = new FreteCalculator();

    @Test
    void testSomar() {
        assertEquals(4, calculadora.somar(2, 2));
    }

    @Test
    void testSubtrair() {
        assertEquals(1, calculadora.subtrair(3, 2));
    }

    @Test
    void testMultiplicar() {
        assertEquals(6, calculadora.multiplicar(2, 3));
    }

    @Test
    void testDividir() {
        assertEquals(2.0, calculadora.dividir(6, 3));
    }

    @Test
    void testDivisaoPorZero() {
        assertThrows(IllegalArgumentException.class, () -> calculadora.dividir(5, 0));
    }


}
