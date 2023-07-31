package miTest;

import miPrincipal.*;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;

class AppTest {
    static Areas c;

    @BeforeAll public static void setUp() {
        c = new Areas();
    }

    @Test public void testCuadrado() {
        assertTrue(c.Cuadrado(4)==16);
    }

    @Test public void testRectangulo() {
        assertTrue(c.Rectangulo(4,2)==8);
    }

    @Test public void testTriangulo() {
        assertTrue(c.Triangulo(4,6)==12);
    }

    @Test public void testRomboide() {
        assertTrue(c.Romboide(5,4)==20);
    }
}
