import java.util.Scanner;

public class TerminalMenu {
    private Scanner scanner;
    private int choice;

    public TerminalMenu() {
        this.scanner = new Scanner(System.in);
        this.choice = 0;
    }

    public void displayMenu() {
        CadastroPessoas cadastroPessoas = new CadastroPessoas();
        CadastroCargo cadastroCargo = new CadastroCargo();
        while (choice != 5) {
            printMenu();
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.println("Cadastrar Pessoa");
                    cadastroPessoas.cadastrarPessoa();
                    break;
                case 2:
                    System.out.println("Listar Pessoas");
                    cadastroPessoas.listarPessoas();
                    break;
                case 3:
                    System.out.println("Cadastrar Cargo");
                    cadastroCargo.cadastrarCargo();
                    break;
                case 4:
                    System.out.println("Listar Cargos");
                    cadastroCargo.listarCargos();
                    break;
                case 5:
                    System.out.println("Saindo...");
                    break;

                default:
                    System.out.println("Opção inválida");
                    break;
            }
        }
        scanner.close();
    }

    private void printMenu() {
        System.out.println("1 - Cadastrar Pessoa");
        System.out.println("2 - Listar Pessoas");
        System.out.println("3 - Cadastrar Cargo");
        System.out.println("4 - Listar Cargos");
        System.out.println("5 - Sair");
        System.out.println("Digite a opção desejada: ");
    }
}
