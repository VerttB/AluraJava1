public class Condicional {
    public static void main(String[] args) {
        int ano = 2021;
        double notaDoFilme = 8.1;
        boolean incluidoPlano = true;
        String plano = "plus";
        if (ano >= 2022) {
            System.out.println("Lançamentos recentes");
        }
        else {
            System.out.println("Lançamentos antigos");
        }

        if (incluidoPlano || plano.equals("plus")){
            System.out.println("Liberado");
        }
        else{
            System.out.println("Plano inválido");
        }


    }
}
