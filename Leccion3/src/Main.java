public class Main {
    public static void main(String[] args) {
        Potato mipotato = new Potato();  //Esto en definitiva es un puntero...
        mipotato.QuitarBrazo();
        mipotato.QuitarBrazo();
        mipotato.QuitarBrazo();
        System.out.println(mipotato.brazos);
    }
}
            //Jodete, aqui tienes tu primer objeto (Java te esconde los punterooooooos :D
class Potato {
    public int brazos = 0;

    public void QuitarBrazo(){
        this.brazos--;
    }
}