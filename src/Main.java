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

    }
}