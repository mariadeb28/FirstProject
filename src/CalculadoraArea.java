import java.util.Scanner;

public class CalculadoraArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int escolha = 0;

        while(escolha !=3){
            System.out.println("-----Menu------");
            System.out.println("1 - Calcular Area do quadrado");
            System.out.println("2 - Calcular Area do circulo");
            System.out.println("3 - Sair");
            System.out.print("Escolha uma opçao: ");
            escolha = scanner.nextInt();

            if(escolha == 1){
                System.out.println("digite o lado do quadrado");
                double lado = scanner.nextDouble();
                double areaQuadrado = lado * lado;
                System.out.println("area do quadrado = " + areaQuadrado);
            }else if(escolha == 2){
                System.out.println("digite raio do circulo");
                double raio = scanner.nextDouble();
                double areaCirculo = 3.14 *raio * raio;
                System.out.println("area do circulo = " + areaCirculo);

            }else if(escolha == 3){
                System.out.println("Programa finalizado");
            }else{
                System.out.println("opção invalida");
            }

        }
    }
}
