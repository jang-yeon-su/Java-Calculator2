import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;


class ScientificCalculatorTest {

    @Test
    void pow() {
        ScientificCalculator calc = new ScientificCalculator();
        double num = 3;
        double exp = 3;
        double expected = 27.0;

        double result = Math.pow(num, exp);
        assertEquals(27.0, result);
    }
}