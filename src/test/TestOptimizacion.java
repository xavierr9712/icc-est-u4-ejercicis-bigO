package test;

import main.ejercicio2.RespuestasOptimizadas;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TestOptimizacion {

    @Test
    public void testTieneDuplicadosOpt() {
        int[] a = { 1, 2, 3, 4 };
        int[] b = { 1, 2, 2, 4 };
        assertFalse(RespuestasOptimizadas.tieneDuplicadosOpt(a));
        assertTrue(RespuestasOptimizadas.tieneDuplicadosOpt(b));
        assertEquals("O(N)", normalizar(RespuestasOptimizadas.tieneDuplicadosComplejidad),
                "Complejidad incorrecta para tieneDuplicadosOpt");
    }

    @Test
    public void testContarMayoresOpt() {
        int[] arr = { 1, 3, 5, 7, 2 };
        assertEquals(3, RespuestasOptimizadas.contarMayoresOpt(arr, 2)); // 3,5,7 son > 2
        assertEquals(2, RespuestasOptimizadas.contarMayoresOpt(arr, 5)); // 7 es > 5
        assertEquals("O(N)", normalizar(RespuestasOptimizadas.contarMayoresComplejidad),
                "Complejidad incorrecta para contarMayoresOpt");
    }

    @Test
    public void testEncontrarMaximoOpt() {
        int[] arr = { 1, 99, 50, 13 };
        assertEquals(99, RespuestasOptimizadas.encontrarMaximoOpt(arr));
        assertEquals("O(N)", normalizar(RespuestasOptimizadas.encontrarMaximoComplejidad),
                "Complejidad incorrecta para encontrarMaximoOpt");
    }

    private String normalizar(String s) {
        return s.replaceAll("\\s+", "").toUpperCase();
    }
}
