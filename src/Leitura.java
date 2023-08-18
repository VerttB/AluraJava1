import java.util.Scanner;

public class Leitura {
    public static void main(String[] args) {
        Scanner variavel = new Scanner(System.in);

        System.out.println("O que essa variável faz");
        String filme = variavel.nextLine();
        System.out.println(filme);
        System.out.println("Diga um número");
        int num = variavel.nextInt();

    }
}
