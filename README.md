
# Análisis de Complejidad de Algoritmos

## Getting Started

Este repositorio corresponde a una práctica de la asignatura **Estructura de Datos**, en la que se analiza la **complejidad algorítmica** (notación Big O) de funciones clásicas implementadas en Java. El objetivo es que los estudiantes asocien la notación de complejidad temporal adecuada a cada función, y luego validen sus respuestas mediante un test automático.

---

## Requirements

* **Java JDK 11** o superior.
* **Git 2.20** o superior.

---

## Definición del Proyecto

Un algoritmo puede ser analizado y clasificado según el crecimiento de su tiempo de ejecución respecto al tamaño de la entrada. En este proyecto se incluyen implementaciones de algoritmos iterativos, recursivos, de búsqueda y ordenamiento. Los estudiantes deben identificar la complejidad temporal de cada función.

---

## Ejercicio 1: **Análisis de Complejidad de Algoritmos**

### Algoritmos Incluidos

1. **Imprimir Arreglo**: Muestra todos los elementos de un arreglo.
2. **Búsqueda Lineal**: Busca un elemento recorriendo secuencialmente el arreglo.
3. **Búsqueda Binaria**: Busca un elemento en un arreglo ordenado, dividiendo el rango de búsqueda.
4. **Factorial Recursivo**: Calcula el factorial de un número de forma recursiva.
5. **Fibonacci Recursivo**: Calcula el n-ésimo término de la sucesión de Fibonacci usando recursividad.
6. **Bubble Sort**: Ordena un arreglo mediante el algoritmo de burbuja.
7. **Quick Sort**: Ordena un arreglo usando el algoritmo de ordenamiento rápido.
8. **Suma de Matriz**: Calcula la suma de todos los elementos de una matriz cuadrada.
9. **Encontrar Máximo**: Encuentra el valor máximo en un arreglo.
10. **Potencia Recursiva**: Calcula la potencia de un número mediante recursión.

---

### Instrucciones para Ejercicio 1

#### 1. Revisa los métodos en `AlgoritmosEjemplo.java`

En este archivo encontrarás 10 funciones representativas de diferentes paradigmas algorítmicos.

#### 2. Completa las respuestas en `RespuestasComplejidad.java`

En este archivo deberás **asociar cada función a su notación Big O**, por ejemplo:

```java
public static String imprimirArreglo = "O(n)";
```

Completa todas las variables siguiendo el mismo formato.
Recuerda usar mayúsculas y minúsculas de la siguiente manera: `"O(n)"`, `"O(n^2)"`, `"O(log n)"`, `"O(2^n)"`, etc.

#### 3. Ejecuta el test automático en `TestComplejidad.java`

Este archivo compara tus respuestas con las correctas y muestra un reporte indicando cuántas son correctas y cuáles incorrectas.

##### **Cómo ejecutar los tests automáticos:**


1. Compila primero el código fuente:

   ```bash
   javac -d out src/main/ejercicio1/AlgoritmosEjemplo.java src/main/ejercicio1/RespuestasComplejidad.java
   ```
2. Luego compila el test (indicando dónde buscar las clases compiladas):

   ```bash
   javac -d out -cp out src/test/TestComplejidad.java
   ```
3. Finalmente, ejecuta el test:

   ```bash
   java -cp out test.TestComplejidad
   ```

Verás un reporte como el siguiente:

```
==== Resultados de Complejidad ====
 1. imprimirArreglo    -> Tu respuesta: O(n)      | Correcta: O(n)    ✔️
 2. busquedaLineal     -> Tu respuesta: O(n)      | Correcta: O(n)    ✔️
 3. busquedaBinaria    -> Tu respuesta: O(log n)  | Correcta: O(log n)✔️
 4. factorial          -> Tu respuesta: O(n)      | Correcta: O(n)    ✔️
 ...
--------------------------------------
Correctas:   9
Incorrectas: 1
```

---

##### **Cómo ejecutar los tests automáticos con JUnit:**

```bash
# Compila las clases de main
javac -d out src/main/ejercicio1/AlgoritmosEjemplo.java src/main/ejercicio1/RespuestasComplejidad.java

# Compila el test, agregando todos los jars y el classpath de salida
javac -d out -cp "out:lib/*" src/test/TestComplejidadJUnit.java

# Ejecuta los tests con el runner de JUnit Console Standalone
java -jar lib/junit-platform-console-standalone-1.7.0.jar -cp out --scan-class-path
```

**Notas:**
La consola mostrará si el test fue exitoso y en qué casos falló.
Puedes tener varios métodos con `@Test` para distintos tipos de validación.

---

### Ejemplo de Respuesta

Supón que analizas el método de impresión de arreglo:

```java
public static void imprimirArreglo(int[] arr) { ... }
```

La respuesta correcta sería:

```java
public static String imprimirArreglo = "O(n)";
```

---

## Ejercicio 2: **Mejorar Algoritmos**

En este ejercicio se presentan **algoritmos ineficientes**. El objetivo es que los estudiantes:

1. **Analicen el código ineficiente** que se encuentra en `AlgoritmosInóptimos.java`.
2. **Implementen una versión optimizada** de cada algoritmo en el archivo `RespuestasOptimizadas.java`, usando mejores técnicas o estructuras de datos para mejorar la complejidad.
3. **Anoten la complejidad temporal** (notación Big O) para cada algoritmo optimizado en la variable correspondiente.
4. **Validen sus respuestas y la corrección de sus métodos ejecutando los tests automáticos** en `TestOptimizacion.java`.

---

### Algoritmos a Optimizar

1. **Buscar duplicados en un arreglo**: Versión original tiene dos bucles anidados (O(n²)). Optimiza usando una estructura eficiente.
2. **Contar elementos mayores que X**: Versión original usa dos bucles. Optimiza a un solo recorrido.
3. **Encontrar el valor máximo en un arreglo**: Versión original usa dos bucles. Optimiza con un solo recorrido.

---

### Instrucciones para Ejercicio 2

#### 1. Revisa los métodos ineficientes en `AlgoritmosInóptimos.java`.

#### 2. Implementa en `RespuestasOptimizadas.java` la **versión optimizada** para cada método.

* Utiliza estructuras de datos eficientes si es necesario (por ejemplo, HashSet).
* Puedes basarte en la siguiente plantilla para anotar la complejidad:

```java
public static String tieneDuplicadosComplejidad = "O(n)";
public static boolean tieneDuplicadosOpt(int[] arr) {
    // Implementación eficiente aquí
}
```

#### 3. Ejecuta el test automático en `TestOptimizacion.java`.

##### **Cómo ejecutar los tests automáticos:**

1. Compila primero el código fuente del ejercicio 2:

   ```bash
   javac -d out src/main/ejercicio2/AlgoritmosInoptimos.java src/main/ejercicio2/RespuestasOptimizadas.java
   ```
2. Luego compila el test (indicando el classpath de salida):

   ```bash
   javac -d out -cp "out;lib/*" src/test/TestOptimizacion.java
   ```
3. Ejecuta el test:

   ```bash
   java -jar lib/junit-platform-console-standalone-1.7.0.jar -cp out --scan-class-path
   ```

---

### Ejemplo de Respuesta Optimizada

Supón que optimizas el método para encontrar duplicados en un arreglo:

```java
public static String tieneDuplicadosComplejidad = "O(n)";
public static boolean tieneDuplicadosOpt(int[] arr) {
    Set<Integer> vistos = new HashSet<>();
    for (int n : arr) {
        if (vistos.contains(n)) {
            return true;
        }
        vistos.add(n);
    }
    return false;
}
```

---

## Conclusión

Este proyecto permite fortalecer la comprensión sobre el análisis y optimización de la complejidad temporal de algoritmos, asociando teoría y práctica. La retroalimentación automática facilita la identificación de errores y refuerza el aprendizaje activo.
