import java.util.Scanner;

public class Desafio {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        int operacao = 0;
        String nome, tipoConta;
        double saldo, transferencia;
        //Iniciando dados do cliente
        System.out.println("Qual o nome do cliente");
        nome = leitura.nextLine();
        System.out.println("Qual o tipo de conta do cliente");
        tipoConta = leitura.nextLine();
        System.out.println("Qual o saldo do cliente");
        saldo = leitura.nextInt();

        System.out.printf("""
                >>>>>>Dados do Cliente<<<<<<
                Nome: %s
                Tipo de Conta: %s
                Saldo: R$ %.2f
                """, nome, tipoConta, saldo);
        while(operacao != 4) {
            //Menu
            System.out.println("""
                1 - Consultar saldo
                2 - Receber valor
                3 - Transferir valor
                4 - Sair
                """);
            operacao = leitura.nextInt();
            switch (operacao) {
                case (1):
                    System.out.println("O cliente possui um saldo de " + saldo);
                    break;
                case(2):
                    System.out.println("Diga o valor que será recebido");
                    transferencia = leitura.nextDouble();
                    saldo += transferencia;
                    break;
                case(3):
                    System.out.println("Quanto deseja trasferir?");
                    transferencia = leitura.nextDouble();

                    if(transferencia > saldo)
                        System.out.println("O valor de transferência é maior que o saldo!!");

                    else {
                        saldo -= transferencia;
                        System.out.println("Transferência realizada com sucesso");
                    }
                    break;
                default:
                    System.out.println("Opção inválida");
            }
        }
    }
}
