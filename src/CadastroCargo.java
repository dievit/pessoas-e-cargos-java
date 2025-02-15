import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CadastroCargo {
    List<Cargo> cargos = new ArrayList<Cargo>();


    public void cadastrarCargo() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o nome do cargo: ");
        String nome = scanner.nextLine();

        System.out.println("Digite a função do cargo: ");
        String funcao = scanner.nextLine();

        System.out.println("Digite o departamento do cargo: ");
        String departamento = scanner.nextLine();

        System.out.println("Digite o salário do cargo: ");
        double salario = scanner.nextDouble();
        scanner.nextLine();

        Cargo cargo = new Cargo(nome, funcao, departamento, true, salario);
        cargos.add(cargo);
    }
}
