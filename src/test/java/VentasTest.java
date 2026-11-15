import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class VentasTest {

    @Test
    void ventaNormal() {
        assertEquals(100, Ventas.calcularTotal(50, 2));
    }

    @Test
    void ventaDecimal() {
        assertEquals(21, Ventas.calcularTotal(10.5, 2));
    }

    @Test
    void precioNegativo() {
        assertThrows(IllegalArgumentException.class,
                () -> Ventas.calcularTotal(-10, 2));
    }
}