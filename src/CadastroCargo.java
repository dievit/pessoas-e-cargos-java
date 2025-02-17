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
            return;
        }
        System.out.println("Lista de Cargos:");
        for (Cargo c: cargos) {
            System.out.println("Nome: " + c.getNome() + ", Função: " + c.getFuncao() +
                    ", Departamento: " + c.getDepartamento() + ", Status: " + c.getStatusString() +
                    ", Salário: " + c.getSalario());
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
