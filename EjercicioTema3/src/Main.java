public class Main {
    public static void main(String[] args) {
        int resultado;
        resultado = suma(3,5 ,7 );
        System.out.println("El resultado de la suma es " + resultado);
        Coche micoche = new Coche();
        micoche.SumarPuertas();
        System.out.println("El numero de puertas es " + micoche.puertas);
    }

    public static int suma (int a, int b, int c){
        return a + b + c;
    }
}

class Coche{

    public int puertas =4;

    public void SumarPuertas(){
        this.puertas++;
    }
}