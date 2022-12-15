import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestCalculator {
    Calculator cal = new Calculator();

    @Test
    void additional(){
        assertEquals(2, cal.plus(1, 1));
    }

    @Test
    void difference(){
        assertEquals(0, cal.minus(1, 1));
    }

    @Test
    void multiplication(){
        assertEquals(1, cal.point(1, 1));
    }

    @Test
    void division(){
        assertEquals(1, cal.cherta(1, 1));
    }
}
