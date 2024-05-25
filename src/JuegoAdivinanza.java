import java.util.Random;

public class JuegoAdivinanza {
    public static void main(String[] args) {
        int intentos = 0;

        for(int i = 0; i <5; i++){
            int numeroAleatorio = new Random().nextInt(100);
            System.out.println("Intentos realizados: "+intentos+" Numero aleatorio: "+numeroAleatorio);
        }
    }
}
