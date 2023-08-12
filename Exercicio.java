import java.util.Scanner;

public class Exercicio {
    public static void main(String[] args) {
        System.out.println("MENU DE OPÇÕES: ");
        int opcao;

        do {
            System.out.println("1 - Opção 1");
            System.out.println("2 - Opção 2");
            System.out.println("3 - Para Sair");


            System.out.println("Escolha uma opção: ");
            Scanner scanner = new Scanner(System.in);
            opcao = scanner.nextInt();
            processar(opcao);

        } while (opcao != 3);
    }

    public static void processar(int opcao) {
        switch(opcao) {
            case 1: {
                System.out.println("Você escolheu a primeira opção");
                break;
            }
            case 2: {
                System.out.println("Você escolheu a segunda opção");
                break;
            }
            case 3: {
                if (opcao == 3) {
                    System.out.println("O programa foi encerrado.");
                }
                break;
            }
        }
    }
}