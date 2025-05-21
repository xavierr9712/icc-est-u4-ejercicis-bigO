package main.ejercicio2;

import java.util.HashSet;
import java.util.Set;

public class RespuestasOptimizadas {
    // El estudiante debe escribir aquí las versiones optimizadas y las
    // complejidades

    // 1. Versión optimizada de tieneDuplicados (Complejidad anotada en la variable)
    public static String tieneDuplicadosComplejidad = "O(n)"; // Ej: "O(n)"

    public static boolean tieneDuplicadosOpt(int[] arr) {
        // TODO: implementar versión eficiente
        Set<Integer> seenNumbers = new HashSet<>();
        for (int num : arr) {
            if (seenNumbers.contains(num)) {
                return true;
            }
            seenNumbers.add(num);
        }
        return false;
    }

    // 2. Versión optimizada de contarMayores (Complejidad anotada en la variable)
    public static String contarMayoresComplejidad = "O(n)"; // Ej: "O(n)"

    public static int contarMayoresOpt(int[] arr, int x) {
        // TODO: implementar versión eficiente
        int count = 0;
        for (int num : arr) {
            if (num > x) {
                count++;
            }
        }
        return count;
    }

    // 3. Versión optimizada de encontrarMaximo (Complejidad anotada en la variable)
    public static String encontrarMaximoComplejidad = "O(n)"; // Ej: "O(n)"

    public static int encontrarMaximoOpt(int[] arr) {
        // TODO: implementar versión eficiente
        if (arr == null || arr.length == 0) {
            throw new IllegalArgumentException("El arreglo no puede ser nulo o vacío.");
        }
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }
}
