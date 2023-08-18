import java.util.Scanner;

public class While {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        double mediaAvaliacao = 0;
        double nota = 0;
        int qtdNotas = 0;
        while(nota != -1){
            System.out.println("Diga a nota do filme");
            nota = leitura.nextDouble();
            if(nota> -1) {
                mediaAvaliacao += nota;
                qtdNotas++;
            }
        }
        System.out.printf("A média de avaliações foi %.2f%n", mediaAvaliacao/qtdNotas);
    }
}
