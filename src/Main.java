import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        System.out.println("Bem Vindo ao Screen Match");
        System.out.println("Filme: Top Gun: Maverick");

        int ano = 2022;
        System.out.println("Ano = " + ano);
        System.out.println("Ano de lançamento " + ano);
        double notaDoFilme = 8.1;

        double media = (9.8 + 6.3 + 8.0) / 3;
        System.out.println(media);
        // Média calculadas por 3 notas ^^

        String sinopse = """
                Filme Top Gun
                Filme de Aventura com galã dos anos 80
                Muito bom!
                Ano de lançamento
                """ + ano;
        System.out.println(sinopse);

        int pontuacao = (int) (media / 2);
        System.out.println(pontuacao);
    }
}

