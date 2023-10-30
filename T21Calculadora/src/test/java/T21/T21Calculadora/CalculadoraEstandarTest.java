package T21.T21Calculadora;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class CalculadoraEstandarTest {
    private CalculadoraEstandar calculadora;
    
	@Before
    public void setUp() {
        calculadora = new CalculadoraEstandar();
    }

    @Test
    public void testSuma() {
        calculadora.setOperacionActual("5 + 3");
        calculadora.calcular();
        assertEquals("8.0", calculadora.getLabelResultadoText());
    }

    @Test
    public void testResta() {
        calculadora.setOperacionActual("10 - 2");
        calculadora.calcular();
        assertEquals("8.0", calculadora.getLabelResultadoText());
    }

    @Test
    public void testMultiplicacion() {
        calculadora.setOperacionActual("4 * 5");
        calculadora.calcular();
        assertEquals("20.0", calculadora.getLabelResultadoText());
    }

    @Test
    public void testDivision() {
        calculadora.setOperacionActual("9 / 3");
        calculadora.calcular();
        assertEquals("3.0", calculadora.getLabelResultadoText());
    }

    @Test
    public void testDivisionPorCero() {
        calculadora.setOperacionActual("5 / 0");
        calculadora.calcular();
        // Es un error aposta para testear que no se puede dividir entre 0
        assertEquals("No se puede dividir por cero.", calculadora.getLabelResultadoText());
    }

    @Test
    public void testOperacionInvalida() {
        calculadora.setOperacionActual("5 + + 3");
        calculadora.calcular();
        // Verifica si uan introduccion inválida de calculo testea
        assertEquals("Operación inválida.", calculadora.getLabelResultadoText());
    }

}
