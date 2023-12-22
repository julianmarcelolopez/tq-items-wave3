public class MediaConVar {

    public static void main(String[] args) {
        double[] numeros = { 5.5, 7.2, 10.0, 3.8, 6.4 };

        // Calcular la media utilizando var
        var media = calcularMedia(numeros);
        System.out.println("La media es: " + media);
    }

    // Método para calcular la media de un conjunto de números
    private static double calcularMedia(double... valores) {
        // Uso de var para la declaración de variables locales
        var suma = 0.0;

        // Uso de for-each y var para iterar sobre los valores
        for (var valor : valores) {
            suma += valor;
        }

        // Uso de var para la declaración de la variable media
        var media = suma / valores.length;
        return media;
    }
}