package hotel;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.printf("\n======== Orçamento Estadia ======== \n");
        System.out.println("Escolha o tipo de acomodação:\n");
        System.out.println("1 - Quarto Simples");
        System.out.println("2 - Quarto Duplo");
        System.out.println("3 - Quarto Suíte");
        int escolha = scanner.nextInt();

        System.out.printf("\n========================= \n");
        System.out.print("\nQuantos dias de hospedagem? ");
        int dias = scanner.nextInt();

        System.out.printf("\n========================= \n");
        System.out.print("\nQuantas pessoas? ");
        int numPessoas = scanner.nextInt();

        System.out.printf("\n========================= \n");
        System.out.print("\nDeseja limpeza extra? (true/false): ");
        boolean limpezaExtra = scanner.nextBoolean();

        BaseAcomodacao acomodacao;
        switch (escolha) {
            case 1:
                acomodacao = new QuartoSimples();
                break;
            case 2:
                acomodacao = new QuartoDuplo();
                break;
            case 3:
                acomodacao = new QuartoSuite();
                break;
            default:
                System.out.println("Opção inválida!");
                return;
        }

        acomodacao.exibirDetalhes(dias);
        double custoServicos = acomodacao.calcularServico(numPessoas, limpezaExtra, dias);
        System.out.printf("\nCusto dos serviços adicionais: R$%.2f%n", custoServicos);
        double custoTotal = (acomodacao.calcularDiaria() * dias) + custoServicos;
        System.out.printf("\nCusto total da estadia: R$%.2f%n", custoTotal);
        
        scanner.close();
    }
}
