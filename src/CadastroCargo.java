import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CadastroCargo {
    private List<Cargo> cargos = new ArrayList<Cargo>();


    public void cadastrarCargo() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o nome do cargo: ");
        String nome = scanner.nextLine();

        System.out.println("Digite a função do cargo: ");
        String funcao = scanner.nextLine();

        System.out.println("Digite o departamento do cargo: ");
        String departamento = scanner.nextLine();

        System.out.println("Digite o salário do cargcadastroo: ");
        double salario = scanner.nextDouble();
        scanner.nextLine();

        Cargo cargo = new Cargo(nome, funcao, departamento, true, salario);
        cargos.add(cargo);
    }

    public List<Cargo> getCargos() {
        return cargos;
    }

    public void listarCargos() {
        if (cargos.isEmpty()) {
            System.out.println("Nenhum cargo encontrado!");
        } else {
            System.out.println("Lista de Cargos:");
            System.out.println("\n");
            for (Cargo c : cargos) {
                System.out.println("Nome: " + c.getNome());
                System.out.println("Função: " + c.getFuncao());
                System.out.println("Departamento: " + c.getDepartamento());
                System.out.println("Status: " + c.getStatusString());
                System.out.println("Salário: " + c.getSalario());
                System.out.println("\n");
            }
        }
    }

    public Cargo findCargoByName(String nomeCargo) {
        for (Cargo cargo: cargos) {
            if (cargo.getNome().equals(nomeCargo)) {
                return cargo;
            }
        }
        return null;
    }
}
