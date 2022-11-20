public class Main {
    public static void main(String[] args) {
        int contador = 10;

        do {           //Primero se ejecuta la accion y luego se evalua, en el while solo, primero se evalua la expresion y
            contador++;     // luego se ejectua la accion.
            System.out.println("El contador vale " + contador);
        }
        while (contador < 20);
    }
}