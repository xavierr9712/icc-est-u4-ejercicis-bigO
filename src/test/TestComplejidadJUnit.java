package test;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import main.ejercico1.RespuestasComplejidad;

public class TestComplejidadJUnit {

    static String[] respuestasCorrectas = {
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
    };

    static String[] nombres = {
            "imprimirArreglo",
            "busquedaLineal",
            "busquedaBinaria",
            "factorial",
            "fibonacci",
            "bubbleSort",
            "quickSort",
            "sumaMatriz",
            "encontrarMaximo",
            "potencia"
    };

    static String[] respuestasEstudiante = {
            RespuestasComplejidad.imprimirArreglo.trim(),
            RespuestasComplejidad.busquedaLineal.trim(),
            RespuestasComplejidad.busquedaBinaria.trim(),
            RespuestasComplejidad.factorial.trim(),
            RespuestasComplejidad.fibonacci.trim(),
            RespuestasComplejidad.bubbleSort.trim(),
            RespuestasComplejidad.quickSort.trim(),
            RespuestasComplejidad.sumaMatriz.trim(),
            RespuestasComplejidad.encontrarMaximo.trim(),
            RespuestasComplejidad.potencia.trim()
    };

    @Test
    public void testComplejidadRespuestas() {
        int correctas = 0;
        for (int i = 0; i < respuestasCorrectas.length; i++) {
            String esperado = normalizar(respuestasCorrectas[i]);
            String actual = normalizar(respuestasEstudiante[i]);
            assertEquals(esperado, actual,
                    String.format("Error en '%s': Esperado %s, pero recibí %s",
                            nombres[i], respuestasCorrectas[i], respuestasEstudiante[i]));
            if (esperado.equals(actual))
                correctas++;
        }
        System.out.println("Respuestas correctas: " + correctas + "/" + respuestasCorrectas.length);
    }

    private String normalizar(String s) {
        return s.replaceAll("\\s+", "").toUpperCase();
    }
}
