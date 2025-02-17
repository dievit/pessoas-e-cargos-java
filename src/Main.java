import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CadastroCargo cadastroCargo = new CadastroCargo();
        CadastroPessoas cadastroPessoas = new CadastroPessoas();

        cadastroCargo.cadastrarCargo();

        cadastroPessoas.cadastrarPessoa();

       for (Pessoa pessoa: cadastroPessoas.getPessoas()) {
           pessoa.exibirPessoa();
       }

        cadastroCargo.listarCargos();
        cadastroPessoas.listarPessoas();

        System.out.println("Digite o CPF da pessoa que deseja atribuir um cargo: ");
        String cpf = scanner.nextLine();

        System.out.println("Digite o nome do cargo que deseja atribuir: ");
        String nomeCargo = scanner.nextLine();

        Cargo cargo = null;
        for (Cargo c: cadastroCargo.getCargos()) {
            if (c.getNome().equals(nomeCargo)) {
                cargo = c;
                break;
            }
        }

        if (cargo == null) {
            System.out.println("Cargo não encontrado!");
        } else {
            cadastroPessoas.atribuirCargo(cpf, cargo);
        }

        cadastroPessoas.listarPessoas();
    }
}