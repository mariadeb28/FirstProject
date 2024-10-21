public class Main {
    public static void main(String[] args) {
        System.out.println("Esse é o Screen Match");
        System.out.println("Filme: Top Gun: Maverick");

        int anoDeLancamento = 2022;
        System.out.println("Ano de lançmento: " + anoDeLancamento);
        boolean includoNoPlano = false;
        double notaFilme = 8.1;


        //Media calculada pelas 3 notas da Maria, X, A

        double media = (9.8 + 6.3 + 8.0) / 3;
        System.out.println("Media: " + media);
        String sinopse;
        sinopse = """
                Filme Top Gun
                Filme de aventura com galã dos anos 80
                Muito bom!
                Ano de lançamento
                """ + anoDeLancamento;
        System.out.println(sinopse);
    }
}
