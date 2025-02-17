import java.util.Scanner;

public class TerminalMenu {
    private Scanner scanner;
    private int choice;

    public TerminalMenu() {
        this.scanner = new Scanner(System.in);
        this.choice = 0;
    }

    public void displayMenu() {
        while (choice != 4) {
            printMenu();
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.println("Cadastrar Pessoa");
                    break;
                case 2:
                    System.out.println("Listar Pessoas");
                    break;
                case 3:
                    System.out.println("Cadastrar Cargo");
                    break;
                case 4:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida");
                    break;
            }
        }
    }

    private void printMenu() {
        System.out.println("1 - Cadastrar Pessoa");
        System.out.println("2 - Listar Pessoas");
        System.out.println("3 - Cadastrar Cargo");
        System.out.println("4 - Sair");
        System.out.println("Digite a opção desejada: ");
    }
}
