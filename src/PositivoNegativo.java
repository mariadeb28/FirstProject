import java.util.Scanner;

public class PositivoNegativo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um numero: ");
        int numero = scanner.nextInt();

        if(numero > 0){
            System.out.println("Numero positivo");

        }else{
            System.out.println("Numero negativo");
        }
    }

}
