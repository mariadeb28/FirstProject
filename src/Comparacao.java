import java.util.Scanner;

public class Comparacao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o primeiro numero: ");
        int num1 = scanner.nextInt();
        System.out.println("Digite o segundo numero: ");
        int num2 = scanner.nextInt();

        if(num1 == num2){
            System.out.println("Os numeros são iguais");

        }else if (num1 > num2){
            System.out.println("O primeiro é maior");
        }else{
            System.out.println("O segundo é maior");
        }
    }
}
