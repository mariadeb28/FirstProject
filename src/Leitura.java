import java.util.Scanner;

public class Leitura {
        public static void main(String[] args) {
            Scanner leitura = new Scanner(System.in);
            System.out.print("Digite o seu filme favorito");
            String filme = leitura.nextLine();
            System.out.println("Qual o ano de lançamento?");
            int anoDeLancamento = leitura.nextInt();
            System.out.println("Diga sua avaliação para o filme ");
            double avalicao = leitura.nextDouble();


            System.out.println(filme);
            System.out.println(anoDeLancamento);
            System.out.println(avalicao);


        }
}
