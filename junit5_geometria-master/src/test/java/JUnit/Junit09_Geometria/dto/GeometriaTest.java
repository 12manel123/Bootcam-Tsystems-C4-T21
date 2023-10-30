package JUnit.Junit09_Geometria.dto;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class GeometriaTest {
    private Geometria geometria;

    @BeforeEach
    public void setUpNull() {
        geometria = new Geometria();
    }
    
    @BeforeEach
    public void setUp() {
        geometria = new Geometria(2);
    }

    @Test
    public void testAreaCuadrado() {
        int area = geometria.areacuadrado(4);
        assertEquals(16, area);
    }

    @Test
    public void testAreaCirculo() {
        double area = geometria.areaCirculo(3);
        assertEquals(28.2744, area, 0.001);
    }

    @Test
    public void testFigura() {
        String figura = geometria.figura(1);
        assertEquals("cuadrado", figura);
    }

    @Test
    public void testAreaTriangulo() {
        int area = geometria.areatriangulo(4, 6);
        assertEquals(12, area);
    }

    @Test
    public void testAreaRectangulo() {
        int area = geometria.arearectangulo(4, 6);
        assertEquals(24, area);
    }

    @Test
    public void testAreaPentagono() {
        int area = geometria.areapentagono(5, 10);
        assertEquals(25, area);
    }

    @Test
    public void testAreaRombo() {
        int area = geometria.arearombo(8, 6);
        assertEquals(24, area);
    }

    @Test
    public void testAreaRomboide() {
        int area = geometria.arearomboide(8, 6);
        assertEquals(48, area);
    }

    @Test
    public void testAreaTrapecio() {
        int area = geometria.areatrapecio(10, 8, 6);
        assertEquals(54, area);
    }

    public void testGetId() {
        Geometria geometria = new Geometria(2);
        assertEquals(2, geometria.getId());
    }

    @Test
    public void testGetNom() {
        Geometria geometria = new Geometria(2);
        assertEquals("Circulo", geometria.getNom());
    }

    @Test
    public void testSetId() {
        geometria.setId(3);
        assertEquals(3, geometria.getId());
    }

    @Test
    public void testSetNom() {
        geometria.setNom("Triangulo");
        assertEquals("Triangulo", geometria.getNom());
    }

    @Test
    public void testGetArea() {
        double area = geometria.getArea();
        assertEquals(0.0, area);
    }

    @Test
    public void testSetArea() {
        geometria.setArea(10.5);
        assertEquals(10.5, geometria.getArea(), 0.001);
    }
    
    public void testToString() {
        String expectedString = "Geometria [id=2, nom=Circulo, area=0.0]";
        assertEquals(expectedString, geometria.toString());
    }

    @Test
    public void testDefaultConstructor() {
        Geometria defaultGeometria = new Geometria();
        assertEquals(9, defaultGeometria.getId());
        assertEquals("Default", defaultGeometria.getNom());
        assertEquals(0.0, defaultGeometria.getArea());
    }
}

