package DesafiosIniciante;

import java.util.Scanner;

public class Desafio02 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int numMax = 3;
        String[] ninjas = new String[numMax];

        int ninjasCadastrados = 0;
        int opcao = 0;

        while (opcao != 3) {

        System.out.println("\n===== Menu Ninja =====");
        System.out.println("1. Cadastrar Ninja");
        System.out.println("2. Listar Ninjas");
        System.out.println("3. Sair");
        System.out.print("Escolha uma opção: ");
        opcao = scanner.nextInt();
        scanner.nextLine();

            switch (opcao) {
                case 1:
                    if (ninjasCadastrados < numMax) {
                    System.out.println("Digite o nome do novo ninja para cadastro: ");
                    String nomeNinja = scanner.nextLine();
                    ninjas[ninjasCadastrados] = nomeNinja;
                    ninjasCadastrados++;
                        System.out.println("Cadastro concluido!");
                    } else {
                        System.out.println("Lista de ninjas esta cheia!");
                    }
                    break;

                case 2:
                    System.out.println("Aqui esta a lista de ninjas cadastrados:");
                    if (ninjasCadastrados == 0) {
                        System.out.println("Nenhum ninja encontrado");
                    } else {
                        System.out.println("Lista: ");
                        for (int i = 0; i < ninjas.length; i++) {
                            System.out.println(ninjas[i]);
                        }
                    }
                    break;

                case 3:
                    System.out.println("Ok, tchau!");
                    break;

                default:
                    System.out.println("Esta opção invalida, tente novamente!");
                    break;
            }

        }
        scanner.close();
    }
}