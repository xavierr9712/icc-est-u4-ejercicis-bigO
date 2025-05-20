package main.ejercicio2;

import java.util.*;

public class AlgoritmosInoptimos {

    // 1. Buscar duplicados en un arreglo (ineficiente)
    public static boolean tieneDuplicados(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j])
                    return true;
            }
        }
        return false;
    }

    // 2. Contar elementos mayores que X usando dos bucles
    public static int contarMayores(int[] arr, int x) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            boolean esMayor = true;
            for (int j = 0; j < i; j++) {
                if (arr[j] > arr[i])
                    esMayor = false;
            }
            if (arr[i] > x && esMayor)
                count++;
        }
        return count;
    }

    // 3. Encontrar el valor máximo usando dos bucles
    public static int encontrarMaximo(int[] arr) {
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            boolean esMaximo = true;
            for (int j = 0; j < arr.length; j++) {
                if (arr[j] > arr[i])
                    esMaximo = false;
            }
            if (esMaximo)
                max = arr[i];
        }
        return max;
    }
}
