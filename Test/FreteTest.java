import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class FreteTest {
    // arrange
    private final FreteCalculator freteCalculator = new FreteCalculator();

    @Test
    void testCalcularFrete() {
        assertEquals(15.0, freteCalculator.calcularFrete(10, 50));
    }

    @Test
    void testCalcularFreteValoresInvalidos() {
        assertThrows(IllegalArgumentException.class, () -> freteCalculator.calcularFrete(0, 50));
        assertThrows(IllegalArgumentException.class, () -> freteCalculator.calcularFrete(10, -10));
    }
}
