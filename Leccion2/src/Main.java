public class Main {
    public static void main(String[] args) {
        int resultado;
        resultado = suma(5, 3);
        resta(20,10);

        System.out.println(resultado);

    }

    public static int suma (int a, int b) {
        return a + b;
    }

    public static void resta (int a, int b) {
        int deduccion;
        deduccion = a - b;

        System.out.println(deduccion);

    }

}