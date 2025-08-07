import java.util.Scanner;

public class Banco {
    public static void main(String[] args) {
        double saldo = 0;
        String conta = "Corrente";
        Scanner leitor = new Scanner(System.in);
        double acao = 0;


        System.out.println("********************************");
        System.out.println("Dados do cliente:\n");
        System.out.println("Nome:             Pedro Lamin");
        System.out.println("Tipo da conta:    " + conta);
        System.out.println("Saldo:            " + saldo);
        System.out.println("********************************\n");

        while (acao != 5) {
            System.out.println("Operações: \n");

            System.out.println("1 - Consultar valores");
            System.out.println("2 - Receber valor");
            System.out.println("3 - Transferir valor");
            System.out.println("4 - Exibir informações");
            System.out.println("5 - Sair");

            acao = leitor.nextDouble();

            if (acao == 1) {
                System.out.println("O saldo disponível é de " + saldo);
                System.out.println();
            } else if (acao == 2) {
                System.out.println("Qual o valor? ");
                acao = leitor.nextDouble();
                saldo += acao;
                System.out.println("O novo saldo é " + saldo);
                System.out.println();
            } else if (acao == 3){
                System.out.println("Qual o valor? ");
                acao = leitor.nextDouble();
                saldo -= acao;
                System.out.println("O novo saldo é " + saldo);
                System.out.println();
            } else if (acao == 4) {
                System.out.println("********************************");
                System.out.println("Dados do cliente:\n");
                System.out.println("Nome:             Pedro Lamin");
                System.out.println("Tipo da conta:    " + conta);
                System.out.println("Saldo:            " + saldo);
                System.out.println("********************************\n");
            } else if (acao > 5){
                System.out.println("Operação inválida");
                System.out.println();
            }
        }
    }
}
