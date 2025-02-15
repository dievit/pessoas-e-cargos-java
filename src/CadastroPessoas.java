import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CadastroPessoas {
    List<Pessoa> pessoas = new ArrayList<Pessoa>();


    public void cadastrarPessoa() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o nome da pessoa: ");
        String nome = scanner.nextLine();

        System.out.println("Digite a idade da pessoa: ");
        int idade = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Digite o CPF da pessoa: ");
        String cpf = scanner.nextLine();

        System.out.println("Digite o sexo da pessoa: ");
        char sexo = scanner.next().charAt(0);

        Pessoa pessoa = new Pessoa(nome, idade, cpf, sexo, null);
        pessoas.add(pessoa);
    }
}
