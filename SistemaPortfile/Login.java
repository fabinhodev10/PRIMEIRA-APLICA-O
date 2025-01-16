package SistemaPortfile;

import java.util.Scanner;

        public class Login extends Usuario {
            public static void main(String[] args) {
                Scanner leitura = new Scanner(System.in);

                int menu = 0;
                Usuario usuario = new Usuario();

                System.out.println("************MENU CONTA***********");

                String nomeDigitado = "";
                while (nomeDigitado.isEmpty()) {
                    System.out.println("\nDigite seu nome");
                    nomeDigitado = leitura.nextLine();
                    if (nomeDigitado.isEmpty()){
                        System.out.println("Por favor digite um nome valido");
                    }
                }
                usuario.setNome(nomeDigitado);

                System.out.println("ola " +usuario.getNome()+ " escolha uma das opções abaixo");
                System.out.println("Saldo atualizado:" +usuario.getSaldo());

                System.out.println("\nOPÇÕES" +
                        "" +
                        "" +
                        "" +
                        "");

                while (menu != 4){
                    System.out.println("\n1 - Consultar o saldo atual");
                    System.out.println("2 - Receber valor");
                    System.out.println("3 - transferir valor");
                    System.out.println("4 - sair");
                    System.out.println("\nEscolha uma opção");
                    menu = leitura.nextInt();

                    if (menu == 1){
                        System.out.println("Seu saldo atual é de: "+usuario.getSaldo());

                    } else if (menu == 2) {
                        System.out.println("qual valor deseja depositar:");
                        double recebeValor  = leitura.nextDouble();
                        usuario.setSaldo(recebeValor);
                        System.out.println("\nvalor depositado, seu saldo atual é de "+usuario.getSaldo());
                    } else if (menu == 3) {
                        System.out.println("qual valor deseja enviar:");
                        double enviaValor  = leitura.nextDouble();
                        if (enviaValor > usuario.getSaldo()){
                            System.out.println("\nVoce nao tem saldo suficiente :( VOCE PODE ENVIAR VALORES ABAIXO QUE "+usuario.getSaldo());
                        } else {
                            usuario.setSaldo(enviaValor);
                            System.out.println("\nvalor enviado, seu saldo atual é de "+usuario.getSaldo());
                        }

                    } else if (menu == 4) {
                        System.out.println("saindo do sistema");
                    } else {
                        System.out.println("\nOpção invalida, digite uma opção de 1 a 4");
                    }

                }


            }
        }


