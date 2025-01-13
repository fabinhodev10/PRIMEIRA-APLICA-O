import java.util.Scanner;

public class DesafioMaster {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        String nome = "Fabio Andrade";
        double saldoAtual = 2000;
        int menu = 0;

        System.out.println("************MENU CONTA***********");
        System.out.println("Nome:                  "+nome);
        System.out.println("Saldo atualizado       "+saldoAtual);

        System.out.println("OPÇÕES" +
                "" +
                "" +
                "" +
                "");

        while (menu != 4){
            System.out.println("1 - consultar saldo");
            System.out.println("2 - Receber valor");
            System.out.println("3 - transferir valor");
            System.out.println("4 - sair");
            System.out.println("Escolha uma opção");
            menu = leitura.nextInt();

            if (menu == 1){
                System.out.println("o saldo atualizado é de "+saldoAtual);
            } else if (menu ==2) {
                System.out.println("qual valor deseja depositar:");
                double recebeValor  = leitura.nextDouble();
                saldoAtual = saldoAtual + recebeValor;
                System.out.println("valor depositado, seu saldo atual é de "+saldoAtual);
            } else if (menu == 3) {
                System.out.println("qual valor deseja enviar:");
                double enviaValor  = leitura.nextDouble();

                if (enviaValor > saldoAtual){
                    System.out.println("Voce nao tem saldo suficiente :( VOCE PODE ENVIAR VALORES ABAIXO QUE "+saldoAtual);
                } else {
                    saldoAtual = saldoAtual - enviaValor;
                    System.out.println("valor enviado, seu saldo atual é de "+saldoAtual);
                }

            } else if (menu == 4) {
                System.out.println("saindo do sistema");
            } else {
                System.out.println("Opção invalida, digite uma opção de 1 a 4");
            }

        }


    }
}
