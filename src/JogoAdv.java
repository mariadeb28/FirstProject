import java.util.Random;
import java.util.Scanner;

public class JogoAdv {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int numeroGerado = new Random().nextInt(100); // gerar um numero aleat entre 0 e 100;
        int tentativas = 0;
        int numeroDigitado = 0;

        while(tentativas < 5) {
            System.out.println("Digite um numero entre 0 e 100: ");
            numeroDigitado = leitor.nextInt();
            tentativas++;

            if(numeroDigitado == numeroGerado) {
                System.out.println("Parabéns, você acertou o número em " + tentativas + " tentativas.");
                break; // interrompe o loop;
            } else if (numeroDigitado < numeroGerado) {
                System.out.println("O número digitado é menor que o número gerado.");
            }else{
                System.out.println("O número digitado é maior que o número gerado.");
            }
        }

        if(tentativas == 5 && numeroDigitado != numeroGerado) {
            System.out.println("Você não conseguiu acertar o número em 05 tentativas. O número era: " + numeroGerado);
        }
    }


}
