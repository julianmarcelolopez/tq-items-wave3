
public class OperatorsSample {
    public static void main(String[] args) {
        // Operadores aritméticos
        int a = 10;
        int b = 5;
        int suma = a + b;
        int resta = a - b;
        int multiplicacion = a * b;
        int division = a / b;
        int modulo = a % b;

        System.out.println("Operadores Aritméticos:");
        System.out.println("Suma: " + suma);
        System.out.println("Resta: " + resta);
        System.out.println("Multiplicación: " + multiplicacion);
        System.out.println("División: " + division);
        System.out.println("Módulo: " + modulo);

        // Operadores de asignación
        int x = 5;
        x += 3; // Equivalente a x = x + 3;

        System.out.println("\nOperadores de Asignación:");
        System.out.println("x después de +=: " + x);

        // Operadores de comparación
        int numero1 = 10;
        int numero2 = 20;
        boolean igual = (numero1 == numero2);
        boolean diferente = (numero1 != numero2);
        boolean mayorQue = (numero1 > numero2);
        boolean menorQue = (numero1 < numero2);

        System.out.println("\nOperadores de Comparación:");
        System.out.println("Igual: " + igual);
        System.out.println("Diferente: " + diferente);
        System.out.println("Mayor que: " + mayorQue);
        System.out.println("Menor que: " + menorQue);

        // Operadores lógicos
        boolean esVerdadero = true;
        boolean esFalso = false;
        boolean yLogico = (esVerdadero && esFalso);
        boolean oLogico = (esVerdadero || esFalso);
        boolean negacion = !esVerdadero;

        System.out.println("\nOperadores Lógicos:");
        System.out.println("AND Lógico: " + yLogico);
        System.out.println("OR Lógico: " + oLogico);
        System.out.println("Negación: " + negacion);
    }
}