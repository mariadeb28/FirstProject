public class Desafio1 {
    public static void main(String[] args) {
        double nota1 = 8.9;
        double nota2 = 7.5;
        double media = (nota1 + nota2) / 2;

        System.out.println("Media: " + media);

        double nota = 3.02;
        int notaInteiro = (int) nota;
        System.out.println("Casting de double para int: " + notaInteiro);

        char myChar = 'D';
        String myWord = "Dont Blame";
        String msg = "A letra é " + myChar + " e a palavra é " + myWord;
        System.out.println(msg);

        double precoProduto = 250.00;
        int qtd = 3;
        double total = precoProduto * qtd;
        String resposta = "O valor total da compra é R$" + total;
        System.out.println(resposta);

        double valorEmDolares = 5200.00;
        double taxaDeConversao = 4.94;
        double valorEmReais = valorEmDolares * taxaDeConversao;
        System.out.println("O valor em reais é: " + valorEmReais);

        double precoOriginal = 670.00;
        double percentualDesconto = 10.0;
        double valorDesconto = (percentualDesconto / 100) * precoOriginal;
        double novoPreco = precoOriginal - valorDesconto;

        System.out.println("Preco original: R$" + precoOriginal);
        System.out.println("Desconto: R$" + valorDesconto);
        System.out.println("Novo preco com desconto: R$" + novoPreco);


    }
}
