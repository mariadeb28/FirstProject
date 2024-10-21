import java.util.Scanner;

public class ProjBanco {
    public static void main(String[] args) {
        String nome = "Deborah";
        String tipoDeConta = "Corrente";
        double saldo = 4500.00;
        int opcao = 0;

        System.out.println("******************");
        System.out.println("\nNome do Cliente: " + nome);
        System.out.println("Tipo de Conta: " + tipoDeConta);
        System.out.println("Saldo: " + saldo);
        System.out.println("\n******************");

        String menu = """
                **Digite sua opcao**
                1 - Consultar saldo
                2 - Transferir saldo
                3 - Receber valor
                4 - Sair
                
                """;

        Scanner leitura = new Scanner(System.in);

        while(opcao != 4){
            System.out.println(menu);
            opcao = leitura.nextInt();

            if(opcao == 1){
                System.out.println("O saldo atualizado é: " + saldo);
            } else if (opcao == 2) {
                System.out.println("Qual o valor que deseja transferir?");
                double valor = leitura.nextDouble();
                if (valor > saldo){
                    System.out.println("Não há saldo para transferir!");
                } else {
                    saldo -= valor;
                    System.out.println("Novo saldo: " + saldo);
                }

            } else if (opcao == 3) {
                System.out.println("Valor recebido: ");
                double valor = leitura.nextDouble();
                saldo += valor;
                System.out.println("Novo saldo: " + saldo);
            } else if (opcao != 4){
                System.out.println("Opção inválida");
            }

        }

    }
}
