package test;

import main.ejercicio1.RespuestasComplejidad;

public class TestComplejidad {
    // Respuestas correctas (puedes cambiarlas si modificas los algoritmos)
    static String[] respuestasCorrectas = {
            "O(n)", // imprimirArreglo
            "O(n)", // busquedaLineal
            "O(log n)", // busquedaBinaria
            "O(n)", // factorial
            "O(2^n)", // fibonacci
            "O(n^2)", // bubbleSort
            "O(n log n)", // quickSort
            "O(n^2)", // sumaMatriz (matriz cuadrada n x n)
            "O(n)", // encontrarMaximo
            "O(n)" // potencia recursiva
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

    public static void main(String[] args) {
        int correctas = 0;
        System.out.println("==== Resultados de Complejidad ====");
        for (int i = 0; i < respuestasCorrectas.length; i++) {
            boolean bien = normalizar(respuestasEstudiante[i]).equals(normalizar(respuestasCorrectas[i]));
            System.out.printf("%2d. %-18s -> Tu respuesta: %-10s | Correcta: %-7s %s\n",
                    i + 1, nombres[i], respuestasEstudiante[i], respuestasCorrectas[i], bien ? "✔️" : "❌");
            if (bien)
                correctas++;
        }
        System.out.println("--------------------------------------");
        System.out.println("Correctas:   " + correctas);
        System.out.println("Incorrectas: " + (respuestasCorrectas.length - correctas));
    }

    private static String normalizar(String s) {
        // Para permitir "O(n)" o "O(N)", etc.
        return s.replaceAll("\\s+", "").toUpperCase();
    }
}
