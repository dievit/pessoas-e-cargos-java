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
        scanner.nextLine();

        System.out.println("Deseja atribuir um cargo à pessoa? (s/n): ");
        String resposta = scanner.nextLine();
        Cargo cargo = null;
        if (resposta.equalsIgnoreCase("s")) {
            CadastroCargo cadastroCargo = new CadastroCargo();
            while (cargo == null) {
                System.out.println("Digite o nome do cargo, ou digite 'sair' para cancelar: ");
                String nomeCargo = scanner.nextLine();
                if (nomeCargo.equalsIgnoreCase("sair")) {
                    System.out.println("Operação cancelada.");
                    break;
                }
                cargo = cadastroCargo.findCargoByName(nomeCargo);
                if (cargo == null) {
                    System.out.println("Cargo não encontrado!");
                }
            }
            if(cargo !=null) {
                atribuirCargo(cpf, cargo);
            }
        }

        Pessoa pessoa = new Pessoa(nome, idade, cpf, sexo, cargo);
        pessoas.add(pessoa);
    }

    public List<Pessoa> getPessoas() {
        return pessoas;
    }

    public void listarPessoas() {
        if (pessoas.isEmpty()) {
            System.out.println("Nenhuma pessoa cadastrada");
        } else {
            System.out.println("Lista de Pessoas:");
            for (Pessoa p : pessoas) {
                System.out.println("Nome: " + p.getNome());
                System.out.println("Idade: " + p.getIdade());
                System.out.println("CPF: " + p.getCpf());
                System.out.println("Sexo: " + p.getSexo());
                System.out.println("Cargo: " + (p.getCargo() != null ? p.getCargo().getNome() : "Sem cargo"));
            }
        }
    }
    public void atribuirCargo(String cpf, Cargo cargo) {
        for (Pessoa p : pessoas) {
            if (p.getCpf().equals(cpf)) {
                p.setCargo(cargo);
                System.out.println("Cargo atribuído com sucesso!");
                return;
            }
        }
        System.out.println("Pessoa não encontrada!");
    }


}
