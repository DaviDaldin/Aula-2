import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("\n===== CALCULADORA DONA GABRIELINHA =====");
            System.out.println("[1] - Calcular Preço Total");
            System.out.println("[2] - Calcular Troco");
            System.out.println("[3] - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.print("Quantidade de plantas: ");
                    int quantidade = scanner.nextInt();
                    System.out.print("Preço unitário: ");
                    double preco = scanner.nextDouble();
                    System.out.println("Total: R$ " + (quantidade * preco));
                    break;
                case 2:
                    System.out.print("Valor recebido: ");
                    double recebido = scanner.nextDouble();
                    System.out.print("Valor da compra: ");
                    double compra = scanner.nextDouble();
                    System.out.println("Troco: R$ " + (recebido - compra));
                    break;
                case 3:
                    System.out.println("Saindo... Obrigado!");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        } while (opcao != 3);

        scanner.close();
    }
}
